package utils;

import aquality.selenium.browser.AqualityServices;

public class BrowserUtils {
    public static void switchToIframe(String frameId) {
        AqualityServices.getBrowser().getDriver().switchTo().frame(frameId);
    }

    public static void switchToDefault() {
        AqualityServices.getBrowser().getDriver().switchTo().defaultContent();
    }

    static String originalWindowHandle = AqualityServices.getBrowser().getDriver().getWindowHandle();


    public static void getNewTabHandle() {
        String Tab1 = AqualityServices.getBrowser().getDriver().getWindowHandle();
        for (String windowHandle : AqualityServices.getBrowser().getDriver().getWindowHandles()) {
            if (!Tab1.contentEquals(windowHandle)) {
                AqualityServices.getBrowser().getDriver().switchTo().window(windowHandle);
                break;
            }
        }
    }

    public static void getNewWindowHandle() {
        String mainWindowHandle = AqualityServices.getBrowser().getDriver().getWindowHandle();
        for (String windowHandle : AqualityServices.getBrowser().getDriver().getWindowHandles()) {
            if (!mainWindowHandle.equals(windowHandle)) {
                AqualityServices.getBrowser().getDriver().switchTo().window(windowHandle);
                break;
            }
        }
    }

    public static void getBackToOrginalTab() {
        AqualityServices.getBrowser().getDriver().switchTo().window(originalWindowHandle);

    }

    public static void refresh() {
        AqualityServices.getBrowser().refresh();
    }

    public static void scroll() {
        AqualityServices.getBrowser().executeScript("window.scrollBy(0,document.body.scrollHeight)");

    }
}
