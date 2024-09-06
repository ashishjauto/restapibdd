package com.app.auto.test.delete;

import com.app.auto.endpoint.PetStoreUserEndPoint;
import com.app.auto.payload.PetStoreUser;
import com.app.auto.payload.PetStoreUserSimulate;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

public class PetStoreDeleteUserTest {

    private Response response;
    private PetStoreUserSimulate petStoreUserSimulateUser;

    String userName="";

    @Given("Delete URN access endpoints")
    public void delete_urn_access_endpoints() {
        PetStoreUser user = petStoreUserSimulateUser.userCreation();


       Response postResponse= PetStoreUserEndPoint.petUserCreation(user);

        response= PetStoreUserEndPoint.petUserDelete_byUsername(user.getUserName());

    }
    @Then("user deletion success message return with json format")
    public void user_deletion_success_message_return_with_json_format() {
        Assert.assertEquals(response.getStatusCode(),404);

    }
    @Then("delete user body data should be in json format data")
    public void delete_user_body_data_should_be_in_json_format_data() {
        System.out.println("test");
    }


}
