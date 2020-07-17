package com.rbinternational.openapi.marketplace.test.steps;

import org.openqa.selenium.By;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Service {

    public static void pause10Seconds() {
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static boolean isPageContains(String text) {
        return getDriver().getPageSource().contains(text);
    }

    public static void clickTheButtonByName(String buttonName) {
        getDriver().findElement(By.linkText(buttonName)).click();
    }
}
