package stepdefinitions;

import steps.APICategoriesSteps;
import steps.APIProvidersSteps;
import steps.MarketplacePortalHomeSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

import static steps.Service.clickTheButtonByName;
import static steps.Service.pause10Seconds;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class OverviewApiProvidersStepdefs {

    @Steps
    private MarketplacePortalHomeSteps marketplacePortalHomeSteps;

    @Steps
    private APIProvidersSteps apiProvidersSteps;

    @Steps
    private APICategoriesSteps apiCategoriesSteps;

    private String lastCheckedProvider;

    @Given("^John has requested a list of API-providers$")
    public void johnHasRequestedAListOfAPIProviders() {
        marketplacePortalHomeSteps.openMarketplacePortalHome();
        pause10Seconds();
        marketplacePortalHomeSteps.clickAPISButton();
        apiProvidersSteps.clickProviderPlusButton();
        pause10Seconds();
    }

    @And("^the following list of API<providers> is displayed$")
    public void heShouldSeeOnTheLeftPanelFollowingAPIProviders(List<String> providers) {
        List<String> providersLeftPanel = apiProvidersSteps.findAPIProviders();
        assertThat("Match left panel providers", providersLeftPanel, containsInAnyOrder(providers.toArray()));
    }

    @When("^he opens <provider>$")
    public void heOpensFirst(String provider) {
        lastCheckedProvider = provider;
        clickTheButtonByName(provider);
        pause10Seconds();
    }

    @Then("^he should see on overview of the following API<providers>$")
    public void heShouldSeeOnOverviewOfTheFollowingAPIProviders(List<String> providers) {
        List<String> apiCategories = apiCategoriesSteps.findAPICategories();
        assertThat("Match cards with " + lastCheckedProvider + " provider", apiCategories, containsInAnyOrder(providers.toArray()));
    }
}
