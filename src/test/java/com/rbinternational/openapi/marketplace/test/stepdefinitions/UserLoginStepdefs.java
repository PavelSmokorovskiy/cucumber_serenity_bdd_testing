package com.rbinternational.openapi.marketplace.test.stepdefinitions;

import com.rbinternational.openapi.marketplace.test.steps.MarketplacePortalHomeSteps;
import com.rbinternational.openapi.marketplace.test.steps.UserLoginSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UserLoginStepdefs {

    @Steps
    private MarketplacePortalHomeSteps marketplacePortalHomeSteps;

    @Steps
    private UserLoginSteps userLoginSteps;

    @Given("^John has opened the Marketplace Portal to log in$")
    public void johnHasOpenedTheMarketplacePortalToLogin() {
        marketplacePortalHomeSteps.openMarketplacePortalHome();
    }

    @When("^John requests to log in$")
    public void johnRequestsToLogIn() {
        marketplacePortalHomeSteps.waitForAngularRequestsToFinish();
        marketplacePortalHomeSteps.clickRegisterLoginButton();
    }
    @And("he enters Email as \"<email>\" and Password as \"<password>\"")
    public void test() {

    }

    @Then("^he should see his name and last name displayed confirming he is logged-in$")
    public void heShouldSeeHisFirstAndLastName() {
        //Temporary solution should be added with name and last name confirming
        userLoginSteps.isSignInButtonDisplayed();
    }
}
