package com.rbinternational.openapi.marketplace.test.steps;

import com.rbinternational.openapi.marketplace.test.pages.APISPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import java.util.List;
import java.util.stream.Collectors;

public class APICategoriesSteps extends UIInteractionSteps {

    private APISPage apisPage;

    @Step("Get API Categories")
    public List<String> findAPICategories() {
        return findAll(apisPage.categoryCard)
                .stream()
                .map(WebElementFacade::getText)
                .filter(item -> !item.isEmpty())
                .collect(Collectors.toList());
    }
}
