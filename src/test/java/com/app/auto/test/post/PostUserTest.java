package com.app.auto.test.post;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.JSONObject;

import java.util.HashMap;

public class PostUserTest {

    HashMap createuser = new HashMap();







    @Given("Post URN access endpoints")
    public void i_have_urn_for_the_application() {



        createuser.put("name","Ashish");
        createuser.put("job","SDET");

        JSONObject jsonObject = new JSONObject(createuser);
        String orgJsonData = jsonObject.toString();

      int id =   RestAssured.given()
                .contentType("application/json")
                .body(orgJsonData)
                .when()
                .post("https://reqres.in/api/users")
              .jsonPath().getInt("id");
                /*.then()
                .statusCode(201)
                .log().all();*/
        System.out.println(id);
    }
    @When("i send POST request using urn")
    public void i_send_post_request_using_urn() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("tst");
    }
    @Then("user success message  return")
    public void user_success_message_return() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("tst");
    }

}
