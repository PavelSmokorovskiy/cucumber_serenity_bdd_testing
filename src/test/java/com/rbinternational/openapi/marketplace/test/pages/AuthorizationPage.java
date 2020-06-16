package com.rbinternational.openapi.marketplace.test.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AuthorizationPage extends PageObject {

    public final By singInButton = By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//input[@name='signInSubmitButton']");

    public final By emailField = By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//form//div//input[@id='signInFormUsername']");

    public final By passwordField = By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//form//div//input[@id='signInFormPassword']");

    public final By singUpLink = By.linkText("Sign up");

    public final String info = "Sign in with your email and password";
}
