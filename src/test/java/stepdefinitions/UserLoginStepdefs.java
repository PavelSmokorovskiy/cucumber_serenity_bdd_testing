package stepdefinitions;

import steps.AuthorizationSteps;
import steps.MarketplacePortalHomeSteps;
import steps.UserLoginSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

import static steps.Service.pause10Seconds;

public class UserLoginStepdefs {

    @Steps
    private MarketplacePortalHomeSteps marketplacePortalHomeSteps;

    @Steps
    private AuthorizationSteps authorizationSteps;

    @Steps
    private UserLoginSteps userLoginSteps;

    @Given("^John has opened the Marketplace Portal to log in$")
    public void johnHasOpenedTheMarketplacePortalToLogin() {
        marketplacePortalHomeSteps.openMarketplacePortalHome();
    }

    @When("^John requests to log in$")
    public void johnRequestsToLogIn() {
        marketplacePortalHomeSteps.clickRegisterLoginButton();
        authorizationSteps.shouldNotBeClickableContinueButton();
        authorizationSteps.clickGDPRCheckbox();
        authorizationSteps.shouldBeClickableContinueButton();
        authorizationSteps.clickContinueButton();
        authorizationSteps.isInfoDisplayed();
    }

    @And("he enters Email as \"<email>\" and Password as \"<password>\"")
    public void heShouldWriteHisEmailAndPassword(DataTable table) {
        List<List<String>> rows = table.asLists(String.class);
        String email = rows.get(0).get(0);
        String password = rows.get(0).get(1);
        userLoginSteps.writeEmail(email);
        userLoginSteps.writePassword(password);
    }

    @Then("^he should see his name and last name displayed confirming he is logged-in$")
    public void heShouldSeeHisFirstAndLastName(DataTable table) {
        List<List<String>> rows = table.asLists(String.class);
        String firstName = rows.get(0).get(0);
        String lastName = rows.get(0).get(0);
        authorizationSteps.isSignInButtonDisplayed();
        userLoginSteps.clickSingInButton();
        pause10Seconds();
        userLoginSteps.isLogInSuccessful(firstName, lastName);
    }
}
