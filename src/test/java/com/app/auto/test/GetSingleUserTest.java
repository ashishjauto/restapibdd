package com.app.auto.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetSingleUserTest {

    @Given("When i send request to the application to fetch one user which exist")
    public void tc1_GetSingleUserTest() {
        System.out.println("URN application");
    }
    @When("send get request using urn")
    public void tc2_GetSingleUserTest() {
        System.out.println("i send get request using urn");
    }
    @Then("one user is return")
    public void tc3_GetSingleUserTest() {
        System.out.println("one user  is return");
    }
    @Then("body data should be in json format")
    public void tc4_GetSingleUserTest() {

        System.out.println("data should be in json format");
    }
    @Then("validate that info code should be {int}")
    public void tc5_GetSingleUserTest(Integer int1) {
        System.out.println("Print the code "+ int1);
    }
}
