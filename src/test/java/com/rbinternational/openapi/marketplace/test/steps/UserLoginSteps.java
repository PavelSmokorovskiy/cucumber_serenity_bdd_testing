package com.rbinternational.openapi.marketplace.test.steps;

import com.rbinternational.openapi.marketplace.test.pages.AuthorizationPage;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import static com.rbinternational.openapi.marketplace.test.steps.Service.isPageContains;
import static org.junit.Assert.assertTrue;

public class UserLoginSteps extends UIInteractionSteps {

    private AuthorizationPage authorizationPage;

    @Step("Write email to the field")
    public void writeEmail(String text) {
        $(authorizationPage.emailField).isDisplayed();
        $(authorizationPage.emailField).type(text);
    }

    @Step("Write password to the field")
    public void writePassword(String text) {
        $(authorizationPage.passwordField).isDisplayed();
        $(authorizationPage.passwordField).type(text);
    }

    @Step("Click Sing in button")
    public void clickSingInButton() {
        $(authorizationPage.singInButton).click();
    }

    @Step("Check username & password")
    public void isLogInSuccessful(String firstName, String lastName) {
        assertTrue(isPageContains(firstName) & isPageContains(lastName));
    }
}
