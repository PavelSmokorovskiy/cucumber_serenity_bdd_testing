package com.rbinternational.openapi.marketplace.test.steps;

import com.rbinternational.openapi.marketplace.test.pages.AuthorizationPage;

import java.net.MalformedURLException;
import java.net.URL;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import static com.rbinternational.openapi.marketplace.test.steps.Service.isPageContains;
import static org.junit.Assert.assertTrue;

public class AuthorizationSteps extends UIInteractionSteps {

    private AuthorizationPage authorizationPage;

    @Step("Continue button should not be clickable")
    public void shouldNotBeClickableContinueButton() {
        $(authorizationPage.continueButton).isDisabled();
    }

    @Step("Click the GDPR checkbox")
    public void clickGDPRCheckbox() {
        $(authorizationPage.gDPRCheckbox).click();
    }

    @Step("Continue button should be clickable")
    public void shouldBeClickableContinueButton() {
        $(authorizationPage.continueButton).isClickable();
    }

    @Step("Click the Continue button")
    public void clickContinueButton() {
        $(authorizationPage.continueButton).click();
    }

    @Step("Get Href of Continue button")
    public URL getHrefOfContinueButton() throws MalformedURLException {
        return new URL($(authorizationPage.continueButton).getAttribute("href"));
    }

    @Step("Is info displayed")
    public void isInfoDisplayed() {
        assertTrue(isPageContains(authorizationPage.info));
    }

    @Step("Is Sing Up link displayed")
    public void isSignUpLinkDisplayed() {
        $(authorizationPage.singUpLink).isDisplayed();
    }

    @Step("Is Sing In link displayed")
    public void isSignInButtonDisplayed() {
        $(authorizationPage.singInButton).isDisplayed();
    }
}
