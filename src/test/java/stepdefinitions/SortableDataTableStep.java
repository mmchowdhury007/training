package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.SortableDataTablePage;
import utils.StringUtils;

import static io.qameta.allure.Allure.step;

public class SortableDataTableStep {
    SortableDataTablePage sortableDataTablePage = new SortableDataTablePage();

    @Then("Sum of the column is {double}")
    public void checkSumOfColumns(Double sum) {
        step("Check that sum of the Due columns is " + sum);
        Double actualSum =  0.0;
        for(String due: sortableDataTablePage.getFirstDueList()) {
            actualSum += StringUtils.getDoubleFromString(due);
        }
        Assert.assertEquals(actualSum, sum,"Sum is not correct");


    }
}
