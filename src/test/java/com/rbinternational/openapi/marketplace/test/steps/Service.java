package com.rbinternational.openapi.marketplace.test.steps;

import java.util.ArrayList;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Service {

    public static void switchToTheSecondTab() {
        getDriver().switchTo().window(new ArrayList<>(getDriver().getWindowHandles()).get(1));
    }

    public static boolean isPageContains(String text) {
        return getDriver().getPageSource().contains(text);
    }
}
