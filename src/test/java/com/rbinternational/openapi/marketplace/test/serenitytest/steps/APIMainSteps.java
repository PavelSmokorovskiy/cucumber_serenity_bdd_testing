package com.rbinternational.openapi.marketplace.test.serenitytest.steps;

import com.rbinternational.openapi.marketplace.test.serenitytest.pages.APIMainPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class APIMainSteps {

    private APIMainPage page;

    @Step("Open API Marketplace main page")
    public void openAPIMainPage() {
        page.open();
    }

    @Step("At page check")
    public void atPage() {
        assertThat(page.atPage()).isTrue();
    }

    @Step
    public void searchOnPage(String str) {
        page.find("");
    }
}
