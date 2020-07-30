package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class MarketplacePortalHomePage extends PageObject {

    public final By apisLink = By.cssSelector("a.header__link");

    public final By registerLoginButton = By.cssSelector("mapi-button.header__button--authorize");

    public final String registerLoginButtonName = "REGISTER/LOGIN";

    public final By logoutButton = By.cssSelector("mapi-button.header__button--logout");

    public final String logoutButtonName = "LOGOUT";

}
