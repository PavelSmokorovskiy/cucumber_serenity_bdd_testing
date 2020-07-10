package com.rbinternational.openapi.marketplace.test.steps;

import com.rbinternational.openapi.marketplace.test.pages.MarketplacePortalHomePage;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class MarketplacePortalHomeSteps extends UIInteractionSteps {

    private MarketplacePortalHomePage marketplacePortalHomePage;

    @Step("Open the Marketplace Portal home page")
    public void openMarketplacePortalHome() {
        marketplacePortalHomePage.open();
        waitForAngularRequestsToFinish();
    }

    @Step("Click the APIS button")
    public void clickAPISButton() {
        $(marketplacePortalHomePage.apisLink).click();
    }

    @Step("Click the Register/Login button")
    public void clickRegisterLoginButton() {
        $(marketplacePortalHomePage.registerLoginButton).click();
    }

    @Step("Register/Login button is displayed")
    public void registerLoginButtonDisplayed() {
        $(marketplacePortalHomePage.registerLoginButton).isDisplayed();
    }
}
