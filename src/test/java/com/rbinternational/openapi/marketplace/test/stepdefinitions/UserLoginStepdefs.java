package com.rbinternational.openapi.marketplace.test.stepdefinitions;

import com.rbinternational.openapi.marketplace.test.steps.MarketplacePortalHomeSteps;
import com.rbinternational.openapi.marketplace.test.steps.UserLoginSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

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
        userLoginSteps.isInfoDisplayed();
    }

    @And("he enters Email as \"<email>\" and Password as \"<password>\"")
    public void test(DataTable table) {
        List<List<String>> rows = table.asLists(String.class);
        userLoginSteps.writeEmail(rows.get(0).get(0));
        userLoginSteps.writePassword(rows.get(0).get(1));
    }

    @Then("^he should see his name and last name displayed confirming he is logged-in$")
    public void heShouldSeeHisFirstAndLastName() {
        userLoginSteps.isSignInButtonDisplayed();
        userLoginSteps.clickSingInButton();
        userLoginSteps.isLogInSuccessful();
    }
}
