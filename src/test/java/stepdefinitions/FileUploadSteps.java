package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.FileUploadPage;

import java.io.File;

public class FileUploadSteps {
    FileUploadPage fileUploadPage = new FileUploadPage();
    String fileName = "Sample.txt";
    private final String FILE_PATH = "download" + "/" + fileName;

    @Then("I Click choose file")
    public void iClickChooseFile() {
        fileUploadPage.chooseFile(new File(FILE_PATH).getAbsolutePath());
    }

    @Then("I click submit btn")
    public void iClickSubmitBtn() {
        fileUploadPage.submit();
    }
}
