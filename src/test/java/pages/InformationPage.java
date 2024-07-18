package pages;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class InformationPage extends Form {
    public InformationPage() {
        super(By.xpath("//h1[@id='firstHeading']"),"Heading");
    }
}
