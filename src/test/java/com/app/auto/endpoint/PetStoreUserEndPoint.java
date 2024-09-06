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


        return RestAssured.given()
                                   .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(orgJsonData)
                .when().post(PetStoreUrlDomain.url_POST);


    }







    public static Response petUserGetDetails_byUsername(String username){


        return RestAssured.given()
                .pathParam("username",username)
                .when().get(PetStoreUrlDomain.url_GET);


    }



    public static Response petUserPutDetails_byUsername(String username,PetStoreUser userDetails ){


        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .pathParam("username",username)
                .body(userDetails)
                .when()
                        .put(PetStoreUrlDomain.url_PUT);


    }


    public static Response petUserDelete_byUsername(String username){


        return RestAssured.given()
                .pathParam("username",username)
                .when().delete(PetStoreUrlDomain.url_DELETE);


    }




}
