package com.rbinternational.openapi.marketplace.test.stepdefinitions;

import com.rbinternational.openapi.marketplace.test.steps.AuthorizationSteps;
import com.rbinternational.openapi.marketplace.test.steps.MarketplacePortalHomeSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static com.rbinternational.openapi.marketplace.test.steps.Service.switchToTheSecondTab;

public class CreateAccountStepdefs {

    @Steps
    private MarketplacePortalHomeSteps marketplacePortalHomeSteps;

    @Steps
    private AuthorizationSteps authorizationSteps;

    @Given("^John has opened the Marketplace Portal to create an account$")
    public void johnHasOpenedTheMarketplacePortalToCreateAnAccount() {
        marketplacePortalHomeSteps.openMarketplacePortalHome();
    }

    @When("^John requests to sign up$")
    public void johnRequestsToSignUp() {
        marketplacePortalHomeSteps.clickRegisterLoginButton();
    }

    @And("^he should accept GDPR notice$")
    public void heShouldAcceptGDPRNotice() {
        authorizationSteps.shouldNotBeClickableContinueButton();
        authorizationSteps.clickGDPRCheckbox();
        authorizationSteps.shouldBeClickableContinueButton();
        authorizationSteps.clickContinueButton();
    }

    @Then("^he should be taken to a sign-up form view$")
    public void heShouldBeTakenToSignUpFormView() {
        switchToTheSecondTab();
        authorizationSteps.isInfoDisplayed();
        authorizationSteps.isSignUpLinkDisplayed();
    }
}
