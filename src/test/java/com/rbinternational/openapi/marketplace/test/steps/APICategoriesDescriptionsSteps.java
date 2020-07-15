package com.rbinternational.openapi.marketplace.test.steps;

import com.rbinternational.openapi.marketplace.test.pages.APISPage;
import com.rbinternational.openapi.marketplace.test.pages.CategoryDetailsPage;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import static com.rbinternational.openapi.marketplace.test.steps.Service.clickTheButtonByName;

public class APICategoriesDescriptionsSteps extends UIInteractionSteps {

    private APISPage apisPage;

    private CategoryDetailsPage categoryDetailsPage;

    @Step("Click the left panel category button")
    public void clickTheCategoryButton(String category) {
        clickTheButtonByName(category);
    }

    @Step("Click the more link")
    public void clickTheMoreLink(String category) {
        $(apisPage.choseTheMoreLink(category)).click();
    }

    @Step("Get categories descriptions")
    public String getCategoriesDescriptions() {
        return $(categoryDetailsPage.categoryDescriptions).getText();
    }
}
