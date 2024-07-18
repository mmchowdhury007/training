package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class DownloadPage extends Form {
    private final IButton downloadBtn = getElementFactory().getButton(By.xpath("//button[contains(@class, 'oo-ui-inputWidget-input')]"),"Download button");
    private final ILabel fileName = getElementFactory().getLabel(By.xpath("//div[contains(@class, 'selection-label-desc')]"),"File name");

    public DownloadPage() {
        super(By.xpath("//h1[@id='firstHeading']"),"Heading");
    }

    @Step("Click download button")
    public void clickDownloadBtn() {
        downloadBtn.click();
    }

    @Step("Get the file name")
    public String getFileName() {
        return fileName.getText();
    }
}
