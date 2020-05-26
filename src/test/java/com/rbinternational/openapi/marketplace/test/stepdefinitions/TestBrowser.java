package com.rbinternational.openapi.marketplace.test.stepdefinitions;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrowser {

    @Test
    public void openChromeTest() throws Exception{

        System.setProperty("webdriver.chrome.driver", "../chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://localhost:4200/");
        driver.close();
        driver.quit();
    }
}
