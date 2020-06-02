package com.rbinternational.openapi.marketplace.test.stepdefinitions;

import com.rbinternational.openapi.marketplace.test.pages.MarketplacePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.ensure.web.ElementLocated;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="/Users/pavel/projects/cucumber_serenity_bdd_testing/src/test/resources/features/product_catalog/overview_api_categories.feature")
public class OverviewApiCategoriesStepdefs {

    @Managed(driver = "chrome")
    WebDriver driver;

    Actor john = Actor.named("John");
//            .can(BrowseTheWeb.with(driver));

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^John has opened the Marketplace Portal$")
    public void johnHasOpenedTheMarketplacePortal() throws Throwable {
        john.can(BrowseTheWeb.with(driver));
        john.attemptsTo(Open.url("http://localhost:4200/"));
//        john.attemptsTo(
//                Ensure.that(ElementLocated.by(By.cssSelector("a.header__link")))
//                        .silently()
//                        .isDisplayed()
//        );
//        john.attemptsTo(Open.browserOn().the(MarketplacePage.class));
//        TimeUnit.SECONDS.sleep(5);
//        Target SUBMIT_BUTTON = Target.the("Submit button").located(By.cssSelector("a.header__link"));
//        TimeUnit.SECONDS.sleep(5);
//        john.attemptsTo(Click.on(SUBMIT_BUTTON));
    }

    @When("^John requests a list of API-categories$")
    public void johnRequestsAListOfAPICategories() throws Throwable {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(ElementLocated.by(By.cssSelector("a.header__link")))
                        .silently()
                        .isDisplayed()
        );
//        Target SUBMIT_BUTTON = Target.the("Submit button").located(By.cssSelector("a.header__link"));
//        john.attemptsTo(Click.on(SUBMIT_BUTTON));

//        theActorInTheSpotlight().attemptsTo(RequestAPICategories.getAPICategories());
    }

    @Then("^he should see on overview of the following API-categories$")
    public void heShouldSeeOnOverviewOfTheFollowingAPICategories() throws Throwable {
//        theActorInTheSpotlight().should(GivenWhenThen.seeThat(null));

        // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
    }

    @Test
    public void runTest() {

//        givenThat(theActorInTheSpotlight()).wasAbleTo(Navigate.to(MarketplacePortal));
//
//        when(theActorInTheSpotlight()).attemptsTo(RequestAPICategories.getAPICategories());
//
//        then(theActorInTheSpotlight()).should(seeThat(null)); //TBD

    }
}
