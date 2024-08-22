package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.FramesPage;

public class FramesPageStep {
    FramesPage framesPage = new FramesPage();

    @Then("Frames page is open")
    public void framePageIsOpen() {
        Assert.assertTrue(framesPage.state().waitForDisplayed(),"Is not open");
    }

    @Then("I click iframe page")
    public void clickIframePage() {
        framesPage.clickIframePage();
    }
}
