package com.rbinternational.openapi.marketplace.test.seleniumtest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

    @Test
    public void openChromeTest() throws Exception{

        System.setProperty("webdriver.chrome.driver", "../chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://localhost:4200/");
        driver.close();
        driver.quit();
    }
}