package pages;

import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {
    private ILink framePageLink = getElementFactory().getLink(By.xpath("//a[@href='/frames']"),"Page link");
    public MainPage() {
        super(By.xpath("//h1[@class='heading']"),"Heading");
    }

    public void clickFramePageLink() {
        framePageLink.click();
    }
}
