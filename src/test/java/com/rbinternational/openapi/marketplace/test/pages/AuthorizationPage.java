package com.rbinternational.openapi.marketplace.test.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AuthorizationPage extends PageObject {

    public final By singInButton = By.cssSelector("input.submitButton-customizable");

    public final By emailField = By.cssSelector("input#signInFormUsername");

    public final By passwordField = By.cssSelector("input#signInFormPassword");

    public final By singUpLink = By.linkText("Sign up");
}
