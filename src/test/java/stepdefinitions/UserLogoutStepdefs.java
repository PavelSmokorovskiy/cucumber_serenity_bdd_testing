package stepdefinitions;

import steps.AuthorizationSteps;
import steps.MarketplacePortalHomeSteps;
import steps.UserLoginSteps;
import steps.UserLogoutSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.net.URL;
import java.util.List;

import static steps.Service.pause10Seconds;

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
    marketplacePortalHomeSteps.registerLoginButtonDisplayed();
    marketplacePortalHomeSteps.clickRegisterLoginButton();
    if(authorizationSteps.isGDPRCheckboxDisplayed()) {
      authorizationSteps.shouldNotBeClickableContinueButton();
      authorizationSteps.clickGDPRCheckbox();
      authorizationSteps.shouldBeClickableContinueButton();
      registerButtonUrl = authorizationSteps.getHrefOfContinueButton();
      authorizationSteps.clickContinueButton();
      pause10Seconds();
      authorizationSteps.isInfoDisplayed();
      userLoginSteps.writeEmail(email);
      userLoginSteps.writePassword(password);
      authorizationSteps.isSignInButtonDisplayed();
      userLoginSteps.clickSingInButton();
    }
    marketplacePortalHomeSteps.logoutButtonDisplayed();
  }

  @And("^his first name and last name are displayed confirming he is logged-in$")
  public void hisFirstNameAndLastNameAreDisplayed(DataTable table) {
    List<List<String>> rows = table.asLists(String.class);
    String firstName = rows.get(0).get(0);
    String lastName = rows.get(0).get(1);
    pause10Seconds();
    userLoginSteps.isLogInSuccessful(firstName, lastName);
  }

  @When("^Pavel's web session expires$")
  public void johnSWebSessionExpires() {
    logoutSteps.deleteCookies(registerButtonUrl);
  }

  @Then("^he should be prompted to re-login$")
  public void heShouldBePromptedToReLogin() {
    marketplacePortalHomeSteps.openMarketplacePortalHome();
    marketplacePortalHomeSteps.registerLoginButtonDisplayed();
  }

  @When("^Pavel requests to log out$")
  public void johnRequestsToLogOut() {
    marketplacePortalHomeSteps.clickLogoutButton();
  }

  @Then("^he should be sent to the landing page$")
  public void heShouldBeSentToTheLandingPage() {
    marketplacePortalHomeSteps.registerLoginButtonDisplayed();
  }
}
