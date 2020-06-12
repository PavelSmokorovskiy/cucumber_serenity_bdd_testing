package com.rbinternational.openapi.marketplace.test.steps;

import com.rbinternational.openapi.marketplace.test.pages.MarketplacePortalHomePage;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class CreateAccountSteps extends UIInteractionSteps {

    private MarketplacePortalHomePage marketplacePortalHomePage;

    @Step("Open the Marketplace Portal home page")
    public void openMarketplacePortalHome() {
        marketplacePortalHomePage.open();
    }

    @Step("Click to the API Categories button")
    public void clickRegisterLoginButton() {
        $(marketplacePortalHomePage.registerLoginButton).click();
    }
}
