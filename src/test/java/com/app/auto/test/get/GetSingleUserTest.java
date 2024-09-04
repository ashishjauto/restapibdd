package com.app.auto.test.get;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;


import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matcher.*;

public class GetSingleUserTest {

    RestAssured getSingleUserTest;

    @Given("When i send request to the application to fetch one user which exist")
    public void tc1_GetSingleUserTest() {

        getSingleUserTest.given()
                    .when()
                            .get("https://reqres.in/api/users?page=2")
                                    .then().statusCode(200)
                        .body("page",equalTo(2))
                                .log().all();

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
