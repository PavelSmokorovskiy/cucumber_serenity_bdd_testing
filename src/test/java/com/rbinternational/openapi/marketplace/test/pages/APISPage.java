package com.rbinternational.openapi.marketplace.test.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class APISPage extends PageObject {

    public final By categoryCard = By.cssSelector("div.card__title");

    public final By providerCard = By.cssSelector("a.api-provider__filteritem__name");

    public final By providerPlusButton = By.xpath("/html/body/mapi-root/mapi-main/mapi-api-categories/mapi-api-categories-main/div/div[1]/mapi-api-categories-filter/ul/li[2]/a");

    public By choseTheMoreLink(String category) {
        switch (category) {
            case "Accounts":
                return By.xpath("/html/body/mapi-root/mapi-main/mapi-api-categories/mapi-api-categories-main/div/div[2]/mapi-api-categories-cards-list/section/div/div/div[1]/mapi-card/div/div[2]/div/a");
            case "Payments":
                return By.xpath("/html/body/mapi-root/mapi-main/mapi-api-categories/mapi-api-categories-main/div/div[2]/mapi-api-categories-cards-list/section/div/div/div[2]/mapi-card/div/div[2]/div/a");
            case "Confirmation of Funds":
                return By.xpath("/html/body/mapi-root/mapi-main/mapi-api-categories/mapi-api-categories-main/div/div[2]/mapi-api-categories-cards-list/section/div/div/div[3]/mapi-card/div/div[2]/div/a");
            case "Foreign exchange rates":
                return By.xpath("/html/body/mapi-root/mapi-main/mapi-api-categories/mapi-api-categories-main/div/div[2]/mapi-api-categories-cards-list/section/div/div/div[4]/mapi-card/div/div[2]/div/a");
            case "ATM & Branch locations":
                return By.xpath("/html/body/mapi-root/mapi-main/mapi-api-categories/mapi-api-categories-main/div/div[2]/mapi-api-categories-cards-list/section/div/div/div[5]/mapi-card/div/div[2]/div/a");
            case "Lead Generation":
                return By.xpath("/html/body/mapi-root/mapi-main/mapi-api-categories/mapi-api-categories-main/div/div[2]/mapi-api-categories-cards-list/section/div/div/div[6]/mapi-card/div/div[2]/div/a");
            case "Customer Identity":
                return By.xpath("/html/body/mapi-root/mapi-main/mapi-api-categories/mapi-api-categories-main/div/div[2]/mapi-api-categories-cards-list/section/div/div/div[7]/mapi-card/div/div[2]/div/a");
            case "ERP Integration":
                return By.xpath("/html/body/mapi-root/mapi-main/mapi-api-categories/mapi-api-categories-main/div/div[2]/mapi-api-categories-cards-list/section/div/div/div[8]/mapi-card/div/div[2]/div/a");
            default:
                return By.linkText("more");
        }
    }
}
