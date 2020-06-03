package com.rbinternational.openapi.marketplace.test.steps;

import com.rbinternational.openapi.marketplace.test.pages.APICategoriesPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import java.util.List;
import java.util.stream.Collectors;

public class APICategoriesSteps extends UIInteractionSteps {

    private APICategoriesPage apiCategoriesPage;

    @Step("Get API Categories")
    public List<String> findAPICategories() {
        return findAll(apiCategoriesPage.apiCard)
                .stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toList());
    }
}
