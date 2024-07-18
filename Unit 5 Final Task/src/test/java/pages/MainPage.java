package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class MainPage extends Form {
    private final ITextBox searchBox = getElementFactory().getTextBox(By.id("searchInput"),"Search Box");
    private final IButton submitBtn = getElementFactory().getButton(By.xpath("//button[contains(@class, 'pure-button')]"),"Submit Button");
    private final IButton clickEs = getElementFactory().getButton(By.xpath("//option[@value='es']"),"Español");

    public MainPage() {
        super(By.xpath("//h1[contains(@class,'central')]"),"Header logo");
    }

    @Step("Search Anything")
    public void search(String name) {
        searchBox.clearAndTypeSecret(name);
    }

    @Step("Click submit button")
    public void clickSubmitBtn() {
        submitBtn.click();
    }

    @Step("Click Español")
    public void changeLanguage() {
        clickEs.click();
    }
}
