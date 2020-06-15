package com.rbinternational.openapi.marketplace.test.steps;

import com.rbinternational.openapi.marketplace.test.pages.AuthorizationPage;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import java.util.ArrayList;

public class UserLoginSteps extends UIInteractionSteps {

    private AuthorizationPage authorizationPage;

    @Step("Is Sing Up link displayed")
    public void isSignInButtonDisplayed() {
        switchToTheSecondTab();
        $(authorizationPage.singInButton).isDisplayed();
    }

    @Step("Write email to the field")
    public void writeEmail(String text) {
        switchToTheSecondTab();
        $(authorizationPage.emailField).isDisplayed();
        //TBD text writing
    }

    @Step("Write password to the field")
    public void writePassword(String text) {
        switchToTheSecondTab();
        $(authorizationPage.passwordField).isDisplayed();
        //TBD text writing
    }

    private void switchToTheSecondTab() {
        getDriver().switchTo().window(new ArrayList<String>(getDriver().getWindowHandles()).get(1));
    }
}
