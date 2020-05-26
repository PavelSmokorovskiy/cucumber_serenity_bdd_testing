package com.rbinternational.openapi.marketplace.test.stepdefinitions.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://localhost:4200/")
public class SearchPage extends PageObject {

    private final WebDriver driver;
    private final By apiCategoriesButton = By.cssSelector("a.header__link#api-categories");
    private final By anotherButton = By.xpath("//a[@data-testid='api-categories']");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    boolean atPage() {
        return driver.getTitle().equals("API MARKETPLACE");
    }

    public SearchPage searchOnPage(){
        driver.findElement(anotherButton);
        return this;
    }

}
