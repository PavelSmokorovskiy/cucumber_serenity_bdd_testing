package steps;

import pages.MarketplacePortalHomePage;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class MarketplacePortalHomeSteps extends UIInteractionSteps {

    private MarketplacePortalHomePage marketplacePortalHomePage;

    @Step("Open the Marketplace Portal home page")
    public void openMarketplacePortalHome() {
        marketplacePortalHomePage.open();
    }

    @Step("Click the APIS button")
    public void clickAPISButton() {
        $(marketplacePortalHomePage.apisLink).click();
    }

    @Step("Click the Register/Login button")
    public void clickRegisterLoginButton() {
        $(marketplacePortalHomePage.registerLoginButton).click();
    }

    @Step("Click the Logout button")
    public void clickLogoutButton() {
        $(marketplacePortalHomePage.logoutButton).click();
    }

    @Step("Register/Login button is displayed")
    public void registerLoginButtonDisplayed() {
        assertThat("Check if Register/Login button displayed", $(marketplacePortalHomePage.registerLoginButton).getText(), equalToIgnoringCase(marketplacePortalHomePage.registerLoginButtonName));
    }

    @Step("Logout button is displayed")
    public void logoutButtonDisplayed() {
        assertThat("Check if Logout button displayed", $(marketplacePortalHomePage.logoutButton).getText(), equalToIgnoringCase(marketplacePortalHomePage.logoutButtonName));
    }
}
