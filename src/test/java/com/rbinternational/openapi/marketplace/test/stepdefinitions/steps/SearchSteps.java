package com.rbinternational.openapi.marketplace.test.stepdefinitions.steps;

import com.rbinternational.openapi.marketplace.test.stepdefinitions.pages.SearchPage;
import net.thucydides.core.annotations.Step;

public class SearchSteps {

    SearchPage page;

    @Step
    public void openPage(){
        page.open();
    }

    @Step
    public void searchOnPage(String str){
        page.find("");
    }
}
