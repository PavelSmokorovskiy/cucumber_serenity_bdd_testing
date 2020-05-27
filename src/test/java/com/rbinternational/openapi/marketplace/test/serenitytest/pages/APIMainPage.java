package com.rbinternational.openapi.marketplace.test.serenitytest.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://localhost:4200/")
public class APIMainPage extends PageObject {

    private final By apiCategoriesButtonCss = By.cssSelector("a.header__link#api-categories");
    private final By apiCategoriesButtonXPath = By.xpath("//a[@data-testid='api-categories']");

    public boolean atPage() {
        return getTitle().equals("API Marketplace");
    }

    public APIMainPage searchOnPage(By by){
        find(by);
        return this;
    }
}
