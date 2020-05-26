package com.rbinternational.openapi.marketplace.test.stepdefinitions;

import com.rbinternational.openapi.marketplace.test.stepdefinitions.pages.APIMarketplaceMainPage;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class APIMarketplaceMainTest {

    private static WebDriver driver;
    private static final String URL = "http://localhost:4200/";
    private APIMarketplaceMainPage page;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "../chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get(URL);
    }

    @Before
    public void pageSetUp(){
        page = new APIMarketplaceMainPage(driver);
    }

    @Test
    public void atPageTest(){
        assertTrue(page.atPage());
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }


}
