package com.rbinternational.openapi.marketplace.test.steps;

import com.rbinternational.openapi.marketplace.test.pages.AuthorizationPage;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import java.util.ArrayList;

public class UserLoginSteps extends UIInteractionSteps {

    private AuthorizationPage authorizationPage;

    @Step("Is info displayed")
    public void isInfoDisplayed(){
        isPageContains(authorizationPage.info);
    }

    @Step("Is Sing Up link displayed")
    public void isSignInButtonDisplayed() {
        switchToTheSecondTab();
        $(authorizationPage.singInButton).isDisplayed();
    }

    @Step("Write email to the field")
    public void writeEmail(String text) {
        switchToTheSecondTab();
        $(authorizationPage.emailField).isDisplayed();
        $(authorizationPage.emailField).type(text);
    }

    @Step("Write password to the field")
    public void writePassword(String text) {
        switchToTheSecondTab();
        $(authorizationPage.passwordField).isDisplayed();
        $(authorizationPage.passwordField).type(text);
    }

    @Step("Click Sing in button")
    public void clickSingInButton() {
        switchToTheSecondTab();
        getDriver().getPageSource().contains("Sign in with your email and password");
        $(authorizationPage.singInButton).click();
    }

    @Step("Check username & password")
    public void isLogInSuccessful() {
        switchToTheSecondTab();
        isPageContains(authorizationPage.email);
        isPageContains(authorizationPage.firstName);
        isPageContains(authorizationPage.lastName);
    }

    private void switchToTheSecondTab() {
        getDriver().switchTo().window(new ArrayList<String>(getDriver().getWindowHandles()).get(1));
    }

    private boolean isPageContains(String text) {
        return getDriver().getPageSource().contains(text);
    }
}
