package com.rbinternational.openapi.marketplace.test.serenitytest;

import com.rbinternational.openapi.marketplace.test.serenitytest.steps.APIMainSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WhenAPIMain {

    @Steps
    APIMainSteps steps;

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void openPage(){
        steps.openPage();
    }

    @Test
    public void atPageTest() {
        steps.atPage("API Marketplace");
    }

    @Test
    public void clickLink(){
        steps.clickLink("http://localhost:4200/api-categories");
    }
}
