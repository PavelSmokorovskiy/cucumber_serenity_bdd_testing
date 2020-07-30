package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AuthorizationPage extends PageObject {

    public final By gDPRCheckbox = By.cssSelector("input.uk-checkbox");

    public final By continueButton = By.cssSelector("a.uk-button-default");

    public final By continueButtonHidden = By.cssSelector("mapi-button.ng-star-inserted");

    public final By singInButton = By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//input[@name='signInSubmitButton']");

    public final By emailField = By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//form//div//input[@id='signInFormUsername']");

    public final By passwordField = By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//form//div//input[@id='signInFormPassword']");

    public final By singUpLink = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div/form/div[3]/p/a");

    public final String info = "Sign in with your email and password";
}
