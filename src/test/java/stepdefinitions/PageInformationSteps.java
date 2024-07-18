package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.InformationPage;
import pages.MainPage;
import pages.SearchedPage;

public class PageInformationSteps {
    MainPage mainPage = new MainPage();
    SearchedPage searchedPage = new SearchedPage();
    InformationPage informationPage = new InformationPage();

    @Then("Main Page is displayed to check information of Bengal Tigers")
    public void mainPageIsOpen() {
        Assert.assertTrue(mainPage.state().waitForDisplayed(),"Main page is displayed");
    }

    @When("Input Bengal tiger text in the search field")
    public void searchForBengalTigers() {
        mainPage.search("Bengal Tigers");
    }

    @And("click submit button for Bengal Tiger article page")
    public void clickSubmitBtn() {
        mainPage.clickSubmitBtn();
    }

    @And("Click Tool menu button on Bengal Tiger article page")
    public void clickTools() {
        searchedPage.clickTools();
    }

    @And("Click Page information button on the Bengal Tiger article page")
    public void clickPageInformationBtn() {
        searchedPage.pageInformation();
    }

    @Then("Information page for Bengal tiger article is displayed")
    public void informationForBengalTigerIsDisplayed() {
        Assert.assertTrue(informationPage.state().waitForDisplayed(),"Information page for Bengal tiger article is not displayed");
    }
}
