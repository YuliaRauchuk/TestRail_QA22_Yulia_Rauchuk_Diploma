package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePage;


@Log4j2
public class TestRunResultsPage extends HomePage {
    public TestRunResultsPage (WebDriver driver) {
        super(driver);
    }
    private final static By TEST_RUN_RESULTS_TAB_LOCATOR = By.cssSelector("//li//a[@id='navigation-runs']");
    @Override
    public byte[] waitForPageLoaded() {

        return new byte[0];
    }
    @Step("Click Test Run Results Tab Locator")
    public void clickTestRunResultsTabLocator() {
        waitForElementClickable(TEST_RUN_RESULTS_TAB_LOCATOR);
        log.info("Click Test Run Results Tab Locator");
        driver.findElement(TEST_RUN_RESULTS_TAB_LOCATOR).click();
    }

    public boolean isDisplayedMessageSuccessLocator() {
        return false;
    }
}