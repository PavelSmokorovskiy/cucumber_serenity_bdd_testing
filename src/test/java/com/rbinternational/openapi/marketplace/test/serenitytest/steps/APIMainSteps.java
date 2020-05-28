package com.rbinternational.openapi.marketplace.test.serenitytest.steps;

import com.rbinternational.openapi.marketplace.test.serenitytest.pages.APIMainPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class APIMainSteps {

    private APIMainPage page;

    @Step("Open API Marketplace main page")
    public void openPage() {
        page.open();
    }

    @Step("At page check")
    public void atPage(String title) {
        assertThat(page.atPage(title)).isTrue();
    }

    @Step
    public void clickLink() {
        page.clickApiCategorieslink();
    }

    @Step
    public String getCurrentUrl(){
        return page.getDriver().getCurrentUrl();
    }

    @Step
    public List<WebElementFacade> getAllAPIs() {
        return page.findAllAPIs();
    }
}
