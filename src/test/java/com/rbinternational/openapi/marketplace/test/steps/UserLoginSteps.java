package com.rbinternational.openapi.marketplace.test.steps;

import com.rbinternational.openapi.marketplace.test.pages.AuthorizationPage;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import java.util.ArrayList;

public class UserLoginSteps extends UIInteractionSteps {

    private AuthorizationPage authorizationPage;

    @Step("Is Sing Up link displayed")
    public void isSignInButtonDisplayed() {
        getDriver().switchTo().window(new ArrayList<String>(getDriver().getWindowHandles()).get(1));
        $(authorizationPage.singInButton).isDisplayed();
    }
}
