package com.rbinternational.openapi.marketplace.test.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://localhost:4200/api-categories")
public class APICategoriesPage extends PageObject {

    public final By apiCard = By.cssSelector("div.card__title");
}
