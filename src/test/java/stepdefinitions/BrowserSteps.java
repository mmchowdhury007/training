package stepdefinitions;

import aquality.selenium.browser.AqualityServices;

public class BrowserSteps {
    public static void goBack() {
        AqualityServices.getBrowser().goBack();
    }

}
