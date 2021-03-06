package stepdefinitions;

import steps.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

import static steps.Service.pause10Seconds;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class ShowAPICategoryDescriptionStepdefs {

    @Steps
    private MarketplacePortalHomeSteps marketplacePortalHomeSteps;

    @Steps
    private APICategoriesDescriptionsSteps apiCategoriesDescriptionsSteps;

    @Steps
    private APICategoriesSteps apiCategoriesSteps;

    @Given("^John has opened the API-category overview$")
    public void johnHasOpenedTheAPICategoryOverview() {
        marketplacePortalHomeSteps.openMarketplacePortalHome();
        pause10Seconds();
        marketplacePortalHomeSteps.clickAPISButton();
    }

    @When("^John selects the API<category>$")
    public void johnSelectsTheApiCategory(String category) {
        apiCategoriesDescriptionsSteps.clickTheCategoryButton(category);
    }

    @Then("^he should see on overview of the following API<category>$")
    public void heShouldSeeOnOverviewOfTheFollowingAPI(List<String> category) {
        pause10Seconds();
        List<String> categoriesOverview = apiCategoriesSteps.findAPICategories();
        assertThat("Match filtered category overview", categoriesOverview, containsInAnyOrder(category.toArray()));
        apiCategoriesDescriptionsSteps.clickTheMoreLink(category.get(0));
    }

    @And("^he should see the <details> of the API-category$")
    public void heShouldSeeTheDetailsOfTheApiCategory(String details) {
        String categoriesDescriptions = apiCategoriesDescriptionsSteps.getCategoriesDescriptions();
        assertThat("Match categories descriptions", categoriesDescriptions, equalToIgnoringCase(details));
    }
}
