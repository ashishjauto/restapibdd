package com.app.auto.test.post;

import com.app.auto.endpoint.PetStoreUserEndPoint;

import com.app.auto.payload.PetStoreUserSimulate;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;



public class PetStorePostUserTest {


    private Response response;
    private PetStoreUserSimulate petStoreUserSimulateUser;


    @Given("Post URN access endpoints")
    public void i_have_urn_for_the_application() {

      response= PetStoreUserEndPoint.petUserCreation(petStoreUserSimulateUser.userCreation());


    }
    @When("i send POST request using urn")
    public void i_send_post_request_using_urn() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(response.getBody());
    }
    @Then("user success message  return")
    public void user_success_message_return() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("tst");
    }

}
