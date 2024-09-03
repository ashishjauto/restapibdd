package com.app.auto.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetUserListTest {



    @Given("When i request for list of users through urn")
    public void tc1_GetUserListTest() {
        System.out.println("URN application");
    }
    @When("request for user list request using urn")
    public void tc2_GetUserListTest() {
        System.out.println("Send Request");
    }
    @Then("user list is return")
    public void tc3_GetUserListTest() {
        System.out.println("Response");
    }
    @Then("data should be in json format")
    public void data_should_be_in_json_format() {
        System.out.println("Json Data Validation");
    }

    @Then("info code should be 201")
    public void tc4_GetUserListTest() {
        System.out.println("Json Data Validation");
    }

}
