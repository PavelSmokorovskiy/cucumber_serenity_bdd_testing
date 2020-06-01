package com.rbinternational.openapi.marketplace.test.serenitytest.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

@DefaultUrl("http://localhost:4200/")
public class APIMainPage extends PageObject {

    private final By apiCategoriesLink = By.cssSelector("a.header__link");
    private final By apiCard = By.cssSelector("div.card__title");

    public boolean atPage(String title) {
        return getTitle().equals(title);
    }

    public void clickApiCategorieslink(){
        find(apiCategoriesLink).click();
    }

    public List<WebElementFacade> findAllAPIs(){
        clickApiCategorieslink();
        return findAll(apiCard);
    }

}
