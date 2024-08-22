package pages;

import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class MainPage extends Form {
    private final ILink fileUpload = getElementFactory().getLink(By.xpath("//a[@href='/upload']"),"Upload page");

    public MainPage() {
        super(By.xpath("//h1[@class='heading']"),"Heading");
    }

    @Step("Click the upload page link")
    public void clickFileUpload() {
        fileUpload.click();
    }

}
