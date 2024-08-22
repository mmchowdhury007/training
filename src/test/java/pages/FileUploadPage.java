package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IComboBox;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class FileUploadPage extends Form {

    private final ITextBox chooseFile = getElementFactory().getTextBox(By.id("file-upload"),"File upload");
    private IButton submitBtn = getElementFactory().getButton(By.id("file-submit"),"Submit file");


    public FileUploadPage() {
        super(By.xpath("//div[@class='example']"),"Example");
    }

    public void chooseFile(String fileName) {
        chooseFile.clearAndType(fileName);
    }

    public void submit() {
        submitBtn.click();
    }
}
