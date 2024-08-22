package pages;

import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class FramesPage extends Form {
    private ILink iframePage = getElementFactory().getLink(By.xpath("//a[@href='/iframe']"),"Iframe");
    public FramesPage() {
        super(By.xpath("//div[@class='example']"),"Frames page");
    }

    public void clickIframePage() {
        iframePage.click();
    }
}
