package com.rbinternational.openapi.marketplace.test.serenitytest;

import com.rbinternational.openapi.marketplace.test.serenitytest.steps.APIMainSteps;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static org.junit.Assert.assertEquals;

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
        steps.clickLink();
        assertEquals(steps.getCurrentUrl(), "http://localhost:4200/api-categories");
    }

    @Test
    public void checkAllAPIs(){
        steps.clickLink();
        List<WebElementFacade> apis = steps.getAllAPIs();
//        assertEquals(apis.get(0).getElement().getText(), "Customer Information");
//        assertEquals(apis.get(1).getElement().getText(), "ERP Integration");
//        assertEquals(apis.get(2).getElement().getText(), "Payments");
//        assertEquals(apis.get(3).getElement().getText(), "Confirmation of Funds");
//        assertEquals(apis.get(4).getElement().getText(), "Currency");
//        assertEquals(apis.get(5).getElement().getText(), "General Information Service");
//        assertEquals(apis.get(6).getElement().getText(), "Authorization");
//        assertEquals(apis.get(7).getElement().getText(), "Lead Generation");
    }
}
