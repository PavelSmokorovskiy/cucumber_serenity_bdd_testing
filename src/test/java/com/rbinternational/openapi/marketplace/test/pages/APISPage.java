package com.rbinternational.openapi.marketplace.test.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class APISPage extends PageObject {

    public final By categoryCard = By.cssSelector("div.card__title");

    public final By providerCard = By.cssSelector("a.api-provider__filteritem__name");

    public final By providerPlusButton = By.xpath("/html/body/mapi-root/mapi-main/mapi-api-categories/mapi-api-categories-main/div/div[1]/mapi-api-categories-filter/ul/li[2]/a");
}
