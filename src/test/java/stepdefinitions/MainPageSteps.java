package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;

public class MainPageSteps {
    MainPage mainPage = new MainPage();

    @Given("Main Page is Open")
    public void mainPageIsOPen() {
        Assert.assertTrue(mainPage.state().waitForDisplayed(),"Main Page is not open");
    }

    @When("I click upload page")
    public void iClickUploadPage() {
        mainPage.clickFileUpload();
    }

}
