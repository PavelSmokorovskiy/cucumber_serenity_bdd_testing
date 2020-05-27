package com.rbinternational.openapi.marketplace.test.serenitytest;

import com.rbinternational.openapi.marketplace.test.serenitytest.steps.APIMainSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WhenAPIMain {

    @Managed
    WebDriver driver;

    @Steps
    APIMainSteps steps;

    @Test
    public void openPage() {
        steps.openAPIMainPage();
    }

    @Test
    public void atPageTest() {
        steps.atPage();
    }
}
