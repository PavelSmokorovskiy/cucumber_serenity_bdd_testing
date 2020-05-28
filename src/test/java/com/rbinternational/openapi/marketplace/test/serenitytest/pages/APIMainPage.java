package com.rbinternational.openapi.marketplace.test.serenitytest.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://localhost:4200/")
public class APIMainPage extends PageObject {

    private final By apiCategoriesLink = By.cssSelector("a.header__link");

    public boolean atPage(String title) {
        return getTitle().equals(title);
    }

    public String clickApiCategorieslink(){
        find(apiCategoriesLink).click();
        return getDriver().getCurrentUrl();
    }

}
