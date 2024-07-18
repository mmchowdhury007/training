package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class SearchedPage extends Form {
    private final By TOOLS = By.id("vector-page-tools-dropdown-checkbox");
    private final ILink downloadAsPdf = getElementFactory().getLink(By.id("coll-download-as-rl"),"Download link");
    private final ILink pageInfo = getElementFactory().getLink(By.id("t-info"),"Page information");

    public SearchedPage() {
        super(By.xpath("//h1[@id='firstHeading']"),"Heading");
    }

    @Step("Click tools")
    public void clickTools() {
        AqualityServices.getBrowser().getDriver().findElement(TOOLS).click();
    }

    @Step("Click download as pdf")
    public void downloadAsPdf() {
        downloadAsPdf.click();
    }

    @Step("Click page information")
    public void pageInformation() {
        pageInfo.click();
    }
}
