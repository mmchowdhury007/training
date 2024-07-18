package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;
import pages.SearchedPage;

public class SearchLanguageSteps {
    MainPage mainPage = new MainPage();
    SearchedPage searchedPage = new SearchedPage();

    @Then("Main Page is displayed for search language")
    public void mainPageIsOpen() {
        Assert.assertTrue(mainPage.state().waitForDisplayed(),"Main page is not open");
    }

    @When("I Input Gabriel García Márquez text in the search field")
    public void giveSearchInput() {
        mainPage.search("Gabriel García Márquez");
    }

    @And("change search language to Español")
    public void changeLanguage() {
        mainPage.changeLanguage();
    }

    @And("click submit button for changed language")
    public void clickSubmitBtn() {
        mainPage.clickSubmitBtn();
    }

    @Then("Article page for Gabriel García Márquez is open")
    public void articlePageIsOpen() {
        Assert.assertTrue(searchedPage.state().waitForDisplayed(),"Article page for Gabriel García Márquez is not open");
    }
}
