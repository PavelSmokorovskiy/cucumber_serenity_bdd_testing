package com.rbinternational.openapi.marketplace.test.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Service {

    private static Set<Cookie> cookies = new HashSet<>();

    public static void pause10Seconds() {
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void switchToTheSecondTab() {
        pause10Seconds();
        new WebDriverWait(getDriver(), 10) {
        }.until((ExpectedCondition<Boolean>) driver ->
                (Objects.requireNonNull(driver).getWindowHandles().size() > 1));
        getDriver().switchTo().window(new ArrayList<>(getDriver().getWindowHandles()).get(1));
    }

    public static boolean isPageContains(String text) {
        return getDriver().getPageSource().contains(text);
    }

    public static void saveCookies() {
        cookies = getDriver().manage().getCookies();
    }

    public static void restoreCookies() {
        cookies.forEach(cookie -> getDriver().manage().addCookie(cookie));
    }

    public static void clickTheButtonByName(String buttonName) {
        getDriver().findElement(By.linkText(buttonName)).click();
    }
}
