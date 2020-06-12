package com.rbinternational.openapi.marketplace.test.stepdefinitions;

import com.rbinternational.openapi.marketplace.test.steps.CreateAccountSteps;
//import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;

public class CreateAccountStepdefs {

    @Steps
    private CreateAccountSteps createAccountSteps;

    @Given("^John has opened the Marketplace Portal to create an account$")
    public void johnHasOpenedTheMarketplacePortalToCreateAnAccount() {
        createAccountSteps.openMarketplacePortalHome();
    }

    @When("^John requests to sign up$")
    public void johnRequestsToSignUp() {
        createAccountSteps.waitForAngularRequestsToFinish();
        createAccountSteps.clickRegisterLoginButton();
    }

    @Then("^he should be taken to a sign-up form view$")
    public void heShouldBeTakenToSignUpFormView() {
//        assertThat();
    }
}
