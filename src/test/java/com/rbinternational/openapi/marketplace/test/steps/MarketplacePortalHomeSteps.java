package com.rbinternational.openapi.marketplace.test.steps;

import com.rbinternational.openapi.marketplace.test.pages.MarketplacePortalHomePage;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import java.net.MalformedURLException;
import java.net.URL;

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

    public URL getHrefOfRegisterLoginButton() throws MalformedURLException {
        return new URL($(marketplacePortalHomePage.registerLoginButton).getAttribute("href"));
    }

    @Step("Register/Login button is displayed")
    public void registerLoginButtonDisplayed() {
        $(marketplacePortalHomePage.registerLoginButton).isDisplayed();
    }
}
