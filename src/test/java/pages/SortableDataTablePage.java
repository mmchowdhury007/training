package pages;

import aquality.selenium.elements.ElementType;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class SortableDataTablePage extends Form {
    private static final String NAME = "Data Tables";
    private final By DUE = By.xpath("//*[@id='table1']//td[4]");

    public SortableDataTablePage() {
        super(By.xpath("//div[@class='example']"),"Table page");
    }

    public List<String> getFirstDueList() {
        List<String> dueList = new ArrayList<>();

        for (ILabel label: getFirstDueLblList()) {
            dueList.add(label.getText());
        }
        return dueList;
    }

    private List<ILabel> getFirstDueLblList() {
        return getElementFactory().findElements(DUE, "due", ElementType.LABEL);
    }

}

