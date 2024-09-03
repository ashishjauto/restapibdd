package com.app.auto.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetUserListTest {



    @Given("i have urn for the application")
    public void i_have_urn_for_the_application() {
        System.out.println("URN application");
    }
    @When("i send get request using urn")
    public void i_send_get_request_using_urn() {
        System.out.println("Send Request");
    }
    @Then("user list is return")
    public void user_list_is_return() {
        System.out.println("Response");
    }
    @Then("data should be in json format")
    public void data_should_be_in_json_format() {
        System.out.println("Json Data Validation");
    }

}
