package pages;

import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {
    private ILink sortableDataTable = getElementFactory().getLink(By.xpath("//a[@href='/tables']"),"link");
    public MainPage() {
        super(By.xpath("//a[@href='/tables']"),"Main page");
    }

    public void clickLink() {
        sortableDataTable.click();
    }
}
