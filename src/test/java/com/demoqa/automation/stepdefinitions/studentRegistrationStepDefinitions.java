package com.demoqa.automation.stepdefinitions;

import com.demoqa.automation.steps.HomePageSteps;
import com.demoqa.automation.steps.PracticeFormsSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class studentRegistrationStepDefinitions {

    @Steps
    HomePageSteps homePage;
    @Steps
    PracticeFormsSteps practiceForms;

    @Given("^that a web user wants to register in demoqa$")
    public void thatAWebUserWantsToRegisterInDemoqa() {
        homePage.openBrowser();
        homePage.selectFormsOption();
    }

    @When("^he fills all the requested fields$")
    public void heFillsAllTheRequestedFields() throws IOException, InterruptedException {
        practiceForms.registerStudentWithExcel();
    }

    @Then("^he should see your registration data$")
    public void heShouldSeeYourRegistrationData() {
        practiceForms.validateSubmitForm();
    }
}
