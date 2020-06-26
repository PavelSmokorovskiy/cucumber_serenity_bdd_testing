package com.rbinternational.openapi.marketplace.test.steps;

import com.rbinternational.openapi.marketplace.test.pages.MarketplacePortalHomePage;

import java.net.MalformedURLException;
import java.net.URL;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MarketplacePortalHomeSteps extends UIInteractionSteps {

    private MarketplacePortalHomePage marketplacePortalHomePage;

    @Step("Open the Marketplace Portal home page")
    public void openMarketplacePortalHome() {
        marketplacePortalHomePage.open();
        waitForAngularRequestsToFinish();
    }

    @Step("Click the API Categories button")
    public void clickAPICategoriesButton() {
        $(marketplacePortalHomePage.apiCategoriesLink).click();
    }

    @Step("Click the Register/Login button")
    public void clickRegisterLoginButton() {
        $(marketplacePortalHomePage.registerLoginButton).click();
    }

    @Step("Continue button should not be clickable")
    public void shouldNotBeClickableContinueButton() {
        $(marketplacePortalHomePage.continueButton).isDisabled();
    }

    @Step("Click the GDPR checkbox")
    public void clickGDPRCheckbox() {
        $(marketplacePortalHomePage.gDPRCheckbox).click();
    }

    @Step("Continue button should be clickable")
    public void shouldBeClickableContinueButton() {
        $(marketplacePortalHomePage.continueButton).isClickable();
    }

    @Step("Click the Continue button")
    public void clickContinueButton() {
        $(marketplacePortalHomePage.continueButton).click();
    }

    public URL getHrefOfRegisterLoginButton() throws MalformedURLException {
        return new URL($(marketplacePortalHomePage.registerLoginButton).getAttribute("href"));
    }

    @Step("Register/Login button is displayed")
    public void registerLoginButtonDisplayed() {
        $(marketplacePortalHomePage.registerLoginButton).isDisplayed();
    }
}
