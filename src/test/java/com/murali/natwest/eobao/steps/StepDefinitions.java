package com.murali.natwest.eobao.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import lombok.extern.slf4j.Slf4j;

@CucumberContextConfiguration
@Slf4j
public class StepDefinitions {
    @Given("the service is up")
    public void serviceIsUp() {
        log.info("serviceIsUp");
    }

    @When("I ask for all available accounts")
    public void getAllAccounts() {
        log.info("getAllAccounts");
    }

    @Then("then I should get A, B, C")
    public void getResults() {
        log.info("getResults");
    }

}
