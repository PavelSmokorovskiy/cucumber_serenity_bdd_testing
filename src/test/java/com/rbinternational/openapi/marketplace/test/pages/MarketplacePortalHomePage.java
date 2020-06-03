package com.rbinternational.openapi.marketplace.test.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://localhost:4200/")
public class MarketplacePortalHomePage extends PageObject {

    public final By apiCategoriesLink = By.cssSelector("a.header__link");
}
