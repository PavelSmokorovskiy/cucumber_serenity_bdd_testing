package com.rbinternational.openapi.marketplace.test.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class MarketplacePortalHomePage extends PageObject {

    public final By apiCategoriesLink = By.cssSelector("a.header__link");

    public final By registerLoginButton = By.cssSelector("a.uk-button-default");

    public final By registerLoginButtonHref = By.cssSelector("a[href*='https://testapi-rbi-merlin.apiconnect.ibmcloud.com/merlin/sit01/membership/me']");
}
