package com.rbinternational.openapi.marketplace.test.seleniumtest;

import com.rbinternational.openapi.marketplace.test.seleniumtest.pages.APIMainPage;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class APIMainTest {

    private static WebDriver driver;
    private static final String URL = "http://localhost:4200/";
    private APIMainPage page;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "../chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get(URL);
    }

    @Before
    public void pageSetUp(){
        page = new APIMainPage(driver);
    }

    @Test
    public void atPageTest(){
        assertTrue(page.atPage("API Marketplace"));
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
