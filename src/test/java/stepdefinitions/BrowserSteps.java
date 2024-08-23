package stepdefinitions;

import aquality.selenium.browser.AqualityServices;
import utils.BrowserUtils;

public class BrowserSteps {
    public static void goBack() {
        AqualityServices.getBrowser().goBack();
    }

    public static void switchToIFrame() {
        BrowserUtils.switchToIframe("mce_0_ifr");
    }

}
