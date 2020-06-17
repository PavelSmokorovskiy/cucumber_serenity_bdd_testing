package com.rbinternational.openapi.marketplace.test.steps;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Objects;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Service {

    public static void switchToTheSecondTab() {
        new WebDriverWait(getDriver(), 3) {
        }.until((ExpectedCondition<Boolean>) driver ->
                (Objects.requireNonNull(driver).getWindowHandles().size() > 1));
        getDriver().switchTo().window(new ArrayList<>(getDriver().getWindowHandles()).get(1));
    }

    public static boolean isPageContains(String text) {
        return getDriver().getPageSource().contains(text);
    }
}
