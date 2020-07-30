package steps;

import pages.AuthorizationPage;

import java.net.MalformedURLException;
import java.net.URL;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import static steps.Service.isPageContains;
import static org.junit.Assert.assertTrue;

public class AuthorizationSteps extends UIInteractionSteps {

    private AuthorizationPage authorizationPage;

    @Step("Continue button should not be clickable")
    public void shouldNotBeClickableContinueButton() {
        $(authorizationPage.continueButtonHidden).isDisabled();
    }

    @Step("is GDPR checkbox displayed")
    public boolean isGDPRCheckboxDisplayed() {
        return $(authorizationPage.gDPRCheckbox).isDisplayed();
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
