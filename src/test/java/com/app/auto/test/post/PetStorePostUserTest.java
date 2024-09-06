package com.app.auto.test.post;

import com.app.auto.endpoint.PetStoreUserEndPoint;

import com.app.auto.payload.PetStoreUserSimulate;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;


public class PetStorePostUserTest {


    private Response response;
    private PetStoreUserSimulate petStoreUserSimulateUser;


    @Given("Post URN access endpoints")
    public void tc1_PostUser() {
      response= PetStoreUserEndPoint.petUserCreation(petStoreUserSimulateUser.userCreation());


    }
    @Then("user success message  return")
    public void tc2_validateStatusCode() {
        Assert.assertEquals(response.getStatusCode(),200);

    }
    @Then("data should be in json format")
    public void tc3_validate_Body() {
    Assert.assertTrue(response.getContentType().contains("application/json"));


    }

}
