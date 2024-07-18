package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.DownloadPage;
import pages.MainPage;
import pages.SearchedPage;
import utils.FileUtils;

import java.io.File;

public class DownloadPdfSteps {
    MainPage mainPage = new MainPage();
    SearchedPage searchedPage = new SearchedPage();
    DownloadPage downloadPage = new DownloadPage();

    @Then("Main Page is displayed")
    public void mainPageIsDisplayed() {
        Assert.assertTrue(mainPage.state().waitForDisplayed(),"Main page is not displayed");
    }

    @When("Input Albert Einstein text in the search field")
    public void inputInSearchField() {
        mainPage.search("Albert Einstein");
    }

    @And("click submit button")
    public void clickSubmitBtn() {
        mainPage.clickSubmitBtn();
    }

    @And("Click Tool menu button")
    public void clickToolBtn() {
        searchedPage.clickTools();
    }

    @And("Download as PDF button on the Article page")
    public void clickDownloadAsPdf() {
        searchedPage.downloadAsPdf();
    }

    @And("Download file from Download as PDF page")
    public void downloadFileFromDownloadAsPdfPage() {
        downloadPage.clickDownloadBtn();
    }

    @Then("File (with the name provided on Download as PDF page) is downloaded")
    public void fileIsDownloaded() {
        String DOWNLOADED_RESOURCE_PATH = "downloads";
        String fileName = downloadPage.getFileName();
        File downloadedFile = new File(DOWNLOADED_RESOURCE_PATH + "/" + fileName);
        Assert.assertTrue(FileUtils.isFileExist(downloadedFile),"Is not exists");
    }

}
