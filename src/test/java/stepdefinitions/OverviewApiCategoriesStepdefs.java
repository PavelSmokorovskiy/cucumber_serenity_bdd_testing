package stepdefinitions;

import steps.APICategoriesSteps;
import steps.MarketplacePortalHomeSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class OverviewApiCategoriesStepdefs {

    @Steps
    private MarketplacePortalHomeSteps marketplacePortalHomeSteps;

    @Steps
    private APICategoriesSteps apiCategoriesSteps;

    @Given("^John has opened the Marketplace Portal$")
    public void johnHasOpenedTheMarketplacePortal() {
        marketplacePortalHomeSteps.openMarketplacePortalHome();
    }

    @When("^John requests a list of API-categories$")
    public void johnRequestsAListOfAPICategories() {
        marketplacePortalHomeSteps.clickAPISButton();
    }

    @Then("he should see on overview of the following API<categories>")
    public void heShouldSeeOnOverviewOfTheFollowingAPICategories(List<String> categories) {
        List<String> categoryCards = apiCategoriesSteps.findAPICategories();
        assertThat("Match categories", categoryCards, containsInAnyOrder(categories.toArray()));
    }
}
