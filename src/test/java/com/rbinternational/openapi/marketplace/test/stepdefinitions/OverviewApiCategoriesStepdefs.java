package com.rbinternational.openapi.marketplace.test.stepdefinitions;

import com.rbinternational.openapi.marketplace.test.steps.APICategoriesSteps;
import com.rbinternational.openapi.marketplace.test.steps.MarketplacePortalHomeSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class OverviewApiCategoriesStepdefs {

    @Steps
    MarketplacePortalHomeSteps marketplacePortalHomeSteps;

    @Steps
    APICategoriesSteps apiCategoriesSteps;

    List<String> apiCards;

    @Given("^John has opened the Marketplace Portal$")
    public void johnHasOpenedTheMarketplacePortal() {
        marketplacePortalHomeSteps.openMarketplacePortalHome();
    }

    @When("^John requests a list of API-categories$")
    public void johnRequestsAListOfAPICategories() {
        marketplacePortalHomeSteps.waitForAngularRequestsToFinish();
        marketplacePortalHomeSteps.clickAPICategoriesButton();
        apiCards = apiCategoriesSteps.findAPICategories();
    }

    @Then("he should see on overview of the following API<categories>")
    public void heShouldSeeOnOverviewOfTheFollowingAPICategories(List<String> categories) {
        assertThat("Match categories", apiCards, containsInAnyOrder(categories.toArray()));
    }
}