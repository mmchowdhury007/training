package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;

public class MainPageStep {
    MainPage mainPage = new MainPage();

    @Given("Main page is open")
    public void mainPageIsOpen() {
        Assert.assertTrue(mainPage.state().waitForDisplayed(),"not open");
    }

    @When("I click sortable data table")
    public void clickSortableTableLink() {
        mainPage.clickLink();
    }
}
