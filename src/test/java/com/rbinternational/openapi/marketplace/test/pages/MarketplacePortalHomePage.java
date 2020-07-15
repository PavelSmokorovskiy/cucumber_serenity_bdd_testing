package com.rbinternational.openapi.marketplace.test.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class MarketplacePortalHomePage extends PageObject {

    public final By apisLink = By.cssSelector("a.header__link");

    public final By registerLoginButton = By.cssSelector("button.uk-button-primary");
}
