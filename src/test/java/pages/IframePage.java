package pages;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class IframePage extends Form {

    public IframePage() {
        super(By.xpath("//div[@id='content']"),"Iframe page");
    }
}
