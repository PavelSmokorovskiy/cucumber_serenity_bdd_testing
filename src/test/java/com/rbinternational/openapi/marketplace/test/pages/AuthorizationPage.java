package com.rbinternational.openapi.marketplace.test.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AuthorizationPage extends PageObject {

    public final By singInButton = By.cssSelector("input.submitButton-customizable");

    public final By singUpLink = By.xpath("//div[3]//div[1]//div[1]//form[1]//div[3]//p[1]//a[1]");
}
