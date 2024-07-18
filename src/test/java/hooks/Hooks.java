package hooks;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.qameta.allure.Step;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.SettingsTestData;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static aquality.selenium.browser.AqualityServices.getBrowser;


public class Hooks {
    protected String DOWNLOADED_RESOURCE_PATH = "downloads";

    @Before()
    @Given("Open the Main page")
    @Step("Set up the browser")
    public void setup() {
        Map<String, Objects> prefs = new HashMap<>();
        new File(DOWNLOADED_RESOURCE_PATH).getAbsolutePath();
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs",prefs);
        getBrowser().maximize();
        getBrowser().goTo(SettingsTestData.getEnvData().getHost());
        getBrowser().waitForPageToLoad();
    }

    @After()
    public void teardown() {
        getBrowser().quit();
    }

}
