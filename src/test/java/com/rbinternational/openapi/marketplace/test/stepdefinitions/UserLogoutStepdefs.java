package com.rbinternational.openapi.marketplace.test.stepdefinitions;

import com.rbinternational.openapi.marketplace.test.steps.AuthorizationSteps;
import com.rbinternational.openapi.marketplace.test.steps.MarketplacePortalHomeSteps;
import com.rbinternational.openapi.marketplace.test.steps.UserLoginSteps;
import com.rbinternational.openapi.marketplace.test.steps.UserLogoutSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.net.URL;
import java.util.List;
import net.thucydides.core.annotations.Steps;

import static com.rbinternational.openapi.marketplace.test.steps.Service.switchToTheSecondTab;

public class UserLogoutStepdefs {

  @Steps
  private MarketplacePortalHomeSteps marketplacePortalHomeSteps;

  @Steps
  private AuthorizationSteps authorizationSteps;

  @Steps
  private UserLoginSteps userLoginSteps;

  @Steps
  private UserLogoutSteps logoutSteps;

  private URL registerButtonUrl;

  @Given("^Pavel is logged in on the portal with the following credentials$")
  public void johnIsLoggedInOnThePortal(DataTable table) throws Throwable {
    List<List<String>> rows = table.asLists(String.class);
    String email = rows.get(0).get(0);
    String password = rows.get(0).get(1);

    marketplacePortalHomeSteps.openMarketplacePortalHome();
    marketplacePortalHomeSteps.clickRegisterLoginButton();
    authorizationSteps.shouldNotBeClickableContinueButton();
    authorizationSteps.clickGDPRCheckbox();
    authorizationSteps.shouldBeClickableContinueButton();
    registerButtonUrl = authorizationSteps.getHrefOfContinueButton();
    authorizationSteps.clickContinueButton();
    switchToTheSecondTab();
    authorizationSteps.isInfoDisplayed();

    userLoginSteps.writeEmail(email);
    userLoginSteps.writePassword(password);
    authorizationSteps.isSignInButtonDisplayed();
    userLoginSteps.clickSingInButton();
    switchToTheSecondTab();
  }

  @And("^his first name and last name are displayed confirming he is logged-in$")
  public void hisFirstNameAndLastNameAreDisplayed(DataTable table) throws Throwable {
    List<List<String>> rows = table.asLists(String.class);
    String firstName = rows.get(0).get(0);
    String lastName = rows.get(0).get(1);
    userLoginSteps.isLogInSuccessful(firstName, lastName);
  }

  @When("^Pavel's web session expires$")
  public void johnSWebSessionExpires() throws Throwable {
    logoutSteps.deleteCookies(registerButtonUrl);
  }

  @Then("^he should be prompted to re-login$")
  public void heShouldBePromptedToReLogin() throws Throwable {
    marketplacePortalHomeSteps.openMarketplacePortalHome();
    marketplacePortalHomeSteps.registerLoginButtonDisplayed();
  }

  @When("^Pavel requests to log out$")
  public void johnRequestsToLogOut() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
  }

  @Then("^he should be sent to the landing page$")
  public void heShouldBeSentToTheLandingPage() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
  }

}
