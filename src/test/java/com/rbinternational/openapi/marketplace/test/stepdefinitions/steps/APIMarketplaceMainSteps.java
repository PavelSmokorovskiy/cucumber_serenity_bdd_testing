package com.rbinternational.openapi.marketplace.test.stepdefinitions.steps;

import com.rbinternational.openapi.marketplace.test.stepdefinitions.pages.APIMarketplaceMainPage;
import net.thucydides.core.annotations.Step;

public class APIMarketplaceMainSteps {

    APIMarketplaceMainPage page;

    @Step
    public void openPage(){
        page.open();
    }

    @Step
    public void searchOnPage(String str){
        page.find("");
    }
}
