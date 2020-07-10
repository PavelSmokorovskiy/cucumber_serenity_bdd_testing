package com.rbinternational.openapi.marketplace.test.stepdefinitions;

import com.rbinternational.openapi.marketplace.test.steps.APICategoriesSteps;
import com.rbinternational.openapi.marketplace.test.steps.APIProvidersSteps;
import com.rbinternational.openapi.marketplace.test.steps.MarketplacePortalHomeSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class OverviewApiProvidersStepdefs {

    @Steps
    private MarketplacePortalHomeSteps marketplacePortalHomeSteps;

    @Steps
    private APIProvidersSteps apiProvidersSteps;

    @Steps
    private APICategoriesSteps apiCategoriesSteps;

    private List<String> providersLeftPanel;

    private String lastCheckedProvider;

    @Given("^John has opened the Marketplace PortalP$")
    public void johnHasOpenedTheMarketplacePortal() {
        marketplacePortalHomeSteps.openMarketplacePortalHome();
    }

    @When("^John requests a list of API-Providers$")
    public void johnRequestsAListOfAPIProviders() {
        marketplacePortalHomeSteps.clickAPISButton();
        apiProvidersSteps.clickProviderPlusButton();
        providersLeftPanel = apiProvidersSteps.findAPIProviders();
    }

    @Then("he should see on the left panel following API<providers>")
    public void heShouldSeeOnTheLeftPanelFollowingAPIProviders(List<String> providers) {
        assertThat("Match left panel providers", providersLeftPanel, containsInAnyOrder(providers.toArray()));
    }

    @And("he opens <provider>")
    public void heOpensFirst(String provider) {
        lastCheckedProvider = provider;
        apiProvidersSteps.clickProviderButton(provider);
    }

    @Then("he should see on overview of the following API<providers>")
    public void heShouldSeeOnOverviewOfTheFollowingAPIProviders(List<String> providers) {
        List<String> apiCategories = apiCategoriesSteps.findAPICategories();
        assertThat("Match cards with " + lastCheckedProvider + " provider", apiCategories, containsInAnyOrder(providers.toArray()));
    }
}
