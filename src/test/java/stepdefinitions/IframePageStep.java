package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.IframePage;

public class IframePageStep {
    IframePage iframePage = new IframePage();

    @Then("Iframe page is open")
    public void iframePageIsOpen() {
        Assert.assertTrue(iframePage.state().waitForDisplayed(),"Is not open");
    }

    @Then("I switch to iframe")
    public void switchToIframe() {
        BrowserSteps.switchToIFrame();
    }
}
