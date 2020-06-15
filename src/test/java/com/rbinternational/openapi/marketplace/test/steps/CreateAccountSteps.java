package com.rbinternational.openapi.marketplace.test.steps;

import com.rbinternational.openapi.marketplace.test.pages.AuthorizationPage;
import com.rbinternational.openapi.marketplace.test.pages.MarketplacePortalHomePage;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import java.util.ArrayList;

public class CreateAccountSteps extends UIInteractionSteps {

    private MarketplacePortalHomePage marketplacePortalHomePage;
    private AuthorizationPage authorizationPage;

    @Step("Open the Marketplace Portal home page")
    public void openMarketplacePortalHome() {
        marketplacePortalHomePage.open();
    }

    @Step("Click to the API Categories button")
    public void clickRegisterLoginButton() {
        $(marketplacePortalHomePage.registerLoginButton).click();
    }

    @Step("Does button contain create account page link")
    public void isSignUpLinkDisplayed() {
        getDriver().switchTo().window(new ArrayList<>(getDriver().getWindowHandles()).get(1));
        $(authorizationPage.singUpLink).isDisplayed();
    }
}
