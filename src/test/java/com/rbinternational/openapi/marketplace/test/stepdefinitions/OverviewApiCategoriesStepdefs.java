package com.rbinternational.openapi.marketplace.test.stepdefinitions;

import com.rbinternational.openapi.marketplace.test.navigation.Navigate;
import com.rbinternational.openapi.marketplace.test.search.RequestAPICategories;
import com.rbinternational.openapi.marketplace.test.serenitytest.steps.APIMainSteps;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static com.rbinternational.openapi.marketplace.test.navigation.Section.MarketplacePortal;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OverviewApiCategoriesStepdefs {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) has opened the Marketplace Portal$")
    public void johnHasOpenedTheMarketplacePortal(String personName) throws Throwable {
        theActorCalled(personName).attemptsTo(
                Navigate.to(MarketplacePortal)
        );
    }

    @When("^he requests a list of API-categories$")
    public void johnRequestsAListOfAPICategories() throws Throwable {
        theActorInTheSpotlight().attemptsTo(RequestAPICategories.getAPICategories());
    }

    @Then("^he should see on overview of the following API-categories$")
    public void heShouldSeeOnOverviewOfTheFollowingAPICategories() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
    }

    @Test
    public void runTest() {

        givenThat(theActorInTheSpotlight()).wasAbleTo(Navigate.to(MarketplacePortal));

        when(theActorInTheSpotlight()).attemptsTo(RequestAPICategories.getAPICategories());

        then(theActorInTheSpotlight()).should(seeThat(null)); //TBD

    }
}
