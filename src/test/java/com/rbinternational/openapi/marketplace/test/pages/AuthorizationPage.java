package com.rbinternational.openapi.marketplace.test.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://pavvel.xyz/")
public class AuthorizationPage extends PageObject {

    public final By singInButton = By.cssSelector("input.submitButton-customizable");

    public final By emailField = By.cssSelector("input#signInFormUsername");

    public final By passwordField = By.cssSelector("input#signInFormPassword");

    public final By singUpLink = By.linkText("Sign up");

    public final String info = "Sign in with your email and password";

    public final String email = "pavlo.smokorovskiy-external@rbinternational.com";

    public final String firstName = "Pavel";

    public final String lastName = "Smokorovskiy";
}
