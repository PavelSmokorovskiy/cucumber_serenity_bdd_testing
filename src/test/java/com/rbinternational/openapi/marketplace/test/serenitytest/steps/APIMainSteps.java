package com.rbinternational.openapi.marketplace.test.serenitytest.steps;

import com.rbinternational.openapi.marketplace.test.serenitytest.pages.APIMainPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    public void clickLink(String link) {
        assertEquals(page.clickApiCategorieslink(), link);
    }
}
