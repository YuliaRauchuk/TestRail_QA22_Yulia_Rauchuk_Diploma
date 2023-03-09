package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

@Log4j2
public class TestPlanPage extends HomePage {
    public TestPlanPage(WebDriver driver) {
        super(driver);
    }
    private final static By ADD_TEST_PLAN_TAB_LOCATOR = By.cssSelector("//div[@class='content-header-title page_title']");
    @Override
    public byte[] waitForPageLoaded() {

        return new byte[0];
    }
    @Step("Click Add Test Plan Tab Locator")
    public void clickAddTestPlanTabLocator() {
        waitForElementClickable(ADD_TEST_PLAN_TAB_LOCATOR);
        log.info("Click Add Test Plan Tab Locator");
        driver.findElement(ADD_TEST_PLAN_TAB_LOCATOR).click();
    }

}