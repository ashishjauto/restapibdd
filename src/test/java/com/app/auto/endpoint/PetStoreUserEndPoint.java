package com.app.auto.endpoint;

import com.app.auto.payload.PetStoreUser;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;

public class PetStoreUserEndPoint {

    public static Response petUserCreation(PetStoreUser userDetails){
        JSONObject jsonObject = new JSONObject(userDetails);
        String orgJsonData = jsonObject.toString();

        Response petStorePost_Response= RestAssured.given()
                                   .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(orgJsonData)
                .when().post(PetStoreUrlDomain.url_POST);


        return petStorePost_Response;


    }

    public static Response petUserGetDetails_byUsername(String username){


        Response petStoreGet_Response= RestAssured.given()
                .pathParam("username",username)
                .when().get(PetStoreUrlDomain.url_GET);


        return petStoreGet_Response;


    }



    public static Response petUserPutDetails_byUsername(String username,PetStoreUser userDetails ){


        Response petStorePut_Response= RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .pathParam("username",username)
                .body(userDetails)
                .when()
                        .put(PetStoreUrlDomain.url_PUT);


        return petStorePut_Response;


    }


    public static Response petUserDelete_byUsername(String username){


        Response petStoreDelete_Response= RestAssured.given()
                .pathParam("username",username)
                .when().delete(PetStoreUrlDomain.url_DELETE);


        return petStoreDelete_Response;


    }




}
