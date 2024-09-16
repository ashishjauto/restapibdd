package com.app.auto.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


//fetch path from resource folder ?
@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/Features ",
                   glue = "com.app.auto.test")
public class RestApiSuiteRunner {

}
