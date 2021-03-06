package steps;

import pages.APISPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import java.util.List;
import java.util.stream.Collectors;

public class APIProvidersSteps extends UIInteractionSteps {

    private APISPage apisPage;

    @Step("Click the provider plus button")
    public void clickProviderPlusButton() {
        $(apisPage.providerPlusButton).click();
    }

    @Step("Get API Providers")
    public List<String> findAPIProviders() {
        return findAll(apisPage.providerCard)
                .stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toList());
    }
}
