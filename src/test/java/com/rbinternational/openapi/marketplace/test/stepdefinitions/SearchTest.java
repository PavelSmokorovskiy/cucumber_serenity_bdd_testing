package com.rbinternational.openapi.marketplace.test.stepdefinitions;

import com.rbinternational.openapi.marketplace.test.stepdefinitions.pages.SearchPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SearchTest {

    private static WebDriver driver;
    private static final String URL = "http://localhost:4200/";
    private SearchPage page;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "../chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(URL);
    }

    @Test
    public void someTest(){

    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }


}
