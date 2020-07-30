package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CategoryDetailsPage extends PageObject {

    public final By categoryDescriptions = By.cssSelector("div.card__description");
}
