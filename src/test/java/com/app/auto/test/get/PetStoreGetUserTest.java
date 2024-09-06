package com.app.auto.test.get;

import com.app.auto.endpoint.PetStoreUserEndPoint;
import com.app.auto.payload.PetStoreUser;
import com.app.auto.payload.PetStoreUserSimulate;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;

public class PetStoreGetUserTest {

    RestAssured getSingleUserTest;

    private Response response;
    private PetStoreUserSimulate petStoreUserSimulateUser;

    String userName="";




    @Given("When i send request to the application to fetch  user")
    public void tc1_GetSingleUserTest() {

        PetStoreUser user = petStoreUserSimulateUser.userCreation();


        PetStoreUserEndPoint.petUserCreation(user);

        response= PetStoreUserEndPoint.petUserGetDetails_byUsername(user.getUserName());
 


    }
    @Then("User return in json format")
    public void tc3_GetSingleUserTest() {
        Assert.assertTrue(response.getContentType().contains("application/json"));
    }
    @And("body data should be in json format data")
    public void tc4_GetSingleUserTest() {


    }
    @And("validate that info code should be {int}")
    public void tc5_GetSingleUserTest(Integer int1) {
        System.out.println("Print the code "+ int1);
    }
}
