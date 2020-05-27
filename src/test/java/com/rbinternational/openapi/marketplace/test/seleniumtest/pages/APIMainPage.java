package com.rbinternational.openapi.marketplace.test.seleniumtest.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://localhost:4200/")
public class APIMainPage extends PageObject {

    private final WebDriver driver;
    private final By apiCategoriesButtonCss = By.cssSelector("a.header__link#api-categories");
    private final By apiCategoriesButtonXpath = By.xpath("//a[@data-testid='api-categories']");

    public APIMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean atPage(String title) {
        return driver.getTitle().equals(title);
    }

    public APIMainPage searchOnPage(By by){
        driver.findElement(by);
        return this;
    }
}
