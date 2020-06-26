package com.rbinternational.openapi.marketplace.test.steps;

import java.net.URL;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class UserLogoutSteps extends UIInteractionSteps {

  @Step("Delete session cookies")
  public void deleteCookies(URL loginUrl) {
    String meUrlStr = String.format("https://%s/membership/me", loginUrl.getHost());
    getDriver().navigate().to(meUrlStr);
    getDriver().manage().deleteCookieNamed("AWSELBAuthSessionCookie-0");
    getDriver().manage().deleteCookieNamed("AWSELBAuthSessionCookie-1");
  }
}
