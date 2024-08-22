package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;

public class MainPageStep {
    MainPage mainPage = new MainPage();

    @Given("Main Page is open")
    public void mainPageIsOpen() {
        Assert.assertTrue(mainPage.state().waitForDisplayed(),"Is not open");
    }

    @When("I click to the page link")
    public void clickFramePageLink() {
        mainPage.clickFramePageLink();
    }
}
