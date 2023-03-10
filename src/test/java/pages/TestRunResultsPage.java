package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



@Log4j2
public class TestRunResultsPage extends HomePage {
    public TestRunResultsPage (WebDriver driver) {
        super(driver);
    }
    private final static By TEST_RUN_RESULTS_TAB = By.cssSelector("//li//a[@id='navigation-runs']");


    @Step("Click Test Run Results Tab")
    public void clickTestRunResultsTab() {
        log.info("Click Test Run Results Tab");
        driver.findElement(TEST_RUN_RESULTS_TAB).click();
    }

    public boolean isDisplayedMessageSuccessLocator() {
        return false;
    }
}