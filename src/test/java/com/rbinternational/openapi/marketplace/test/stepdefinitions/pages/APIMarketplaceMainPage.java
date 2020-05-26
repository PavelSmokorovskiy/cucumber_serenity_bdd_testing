package com.rbinternational.openapi.marketplace.test.stepdefinitions.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://localhost:4200/")
public class APIMarketplaceMainPage extends PageObject {

    private final WebDriver driver;
    private final By apiCategoriesButton = By.cssSelector("a.header__link#api-categories");
    private final By anotherButton = By.xpath("//a[@data-testid='api-categories']");

    public APIMarketplaceMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean atPage() {
        return driver.getTitle().equals("API Marketplace");
    }

    public APIMarketplaceMainPage searchOnPage(){
        driver.findElement(anotherButton);
        return this;
    }

}
