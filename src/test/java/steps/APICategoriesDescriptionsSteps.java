package steps;

import pages.APISPage;
import pages.CategoryDetailsPage;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import static steps.Service.clickTheButtonByName;

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
