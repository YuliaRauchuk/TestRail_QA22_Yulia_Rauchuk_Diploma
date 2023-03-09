package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

@Log4j2
public class TestCasePage extends HomePage {
    public TestCasePage(WebDriver driver) {
        super(driver);
    }
    private final static By TEST_CASES_TAB_LOCATOR = By.cssSelector("//li[@class='header-menu-item header-menu-item-selected']//a");
    @Override
    public byte[] waitForPageLoaded() {

        return new byte[0];
    }
    @Step("Click Test Cases Tab Locator")
    public void clickTestCasesTabLocator() {
        waitForElementClickable(TEST_CASES_TAB_LOCATOR);
        log.info("Click Test Cases Tab Locator");
        driver.findElement(TEST_CASES_TAB_LOCATOR).click();
    }

}
