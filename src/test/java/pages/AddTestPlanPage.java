package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class AddTestPlanPage extends HomePage {
    public AddTestPlanPage(WebDriver driver) {
        super(driver);
    }
    private final static By TEST_PLAN_NAME_INPUT = By.cssSelector("//input[@class='form-control ']");
    private final static By REFERENCES_LOCATOR = By.cssSelector("//input[@id='refs']");
    private final static By MILESTONE_LOCATOR = By.cssSelector("//div[@id='milestone_id_chzn']");
    private final static By DESCRIPTION_LOCATOR = By.cssSelector("//div[@id='description_display']");
    private final static By ADD_TEST_PLAN_BUTTON_LOCATOR = By.cssSelector("//button[@class='button button-left button-positive button-ok']");
    private final static By CANCEL_BUTTON_LOCATOR = By.cssSelector("//a[@class='button button-left button-negative button-cancel plan-form-cancel']");
    private final static By MESSAGE_SUCCESS_LOCATOR = By.cssSelector("//div//div[@class='message message-success']");
    private final static By EDIT_BUTTON_LOCATOR = By.cssSelector("//div//a[@class='toolbar-button content-header-button button-responsive button-edit toolbar-button-last']");
    private final static By RERUN_BUTTON_LOCATOR = By.cssSelector("//a//span[@class='button-text']");


    @Step("Click Test Plan Name Input")
    public void clickTestPlanNameInput(String name) {
        //waitForElementClickable(TEST_PLAN_NAME_INPUT);
        log.info("Click Test Plan Name Input");
        driver.findElement(TEST_PLAN_NAME_INPUT).sendKeys(name);
    }
    @Step("Click References Locator")
    public void clickReferencesLocator(String name) {
       // waitForElementClickable(REFERENCES_LOCATOR);
        log.info("Click References Locator");
        driver.findElement(REFERENCES_LOCATOR).sendKeys(name);
    }

    @Step("Select Milestone Locator")
    public void setMilestoneLocator(String name) {
       // waitForElementClickable(MILESTONE_LOCATOR);
        log.info("Select Milestone Locator");
        driver.findElement(MILESTONE_LOCATOR).sendKeys(name);
    }

    @Step("Click Description Locator")
    public void clickDescriptionLocator(String name) {
       // waitForElementClickable(DESCRIPTION_LOCATOR);
        log.info("Click Description Locator");
        driver.findElement(DESCRIPTION_LOCATOR).sendKeys(name);
    }

    @Step("Click Add Test Plan Button Locator")
    public void clickAddTestPlanButtonLocator() {
        //waitForElementClickable(ADD_TEST_PLAN_BUTTON_LOCATOR);
        log.info("Click Add Test Plan Button Locator");
        driver.findElement(ADD_TEST_PLAN_BUTTON_LOCATOR).click();
    }

    @Step("Click Cancel Button Locator")
    public void clickCancelButtonLocator() {
        //waitForElementClickable(CANCEL_BUTTON_LOCATOR);
        log.info("Click Cancel Button Locator");
        driver.findElement(CANCEL_BUTTON_LOCATOR).click();
    }

    @Step("Displayed Message Success Locator")
    public void isDisplayedMessageSuccessLocator(String s) {
        //waitForElementClickable(MESSAGE_SUCCESS_LOCATOR);
        log.info("Displayed Message Success Locator");
        driver.findElement(MESSAGE_SUCCESS_LOCATOR).isDisplayed();
    }

    @Step("Click Edit Button Locator")
    public void clickEditButtonLocator() {
        //waitForElementClickable(EDIT_BUTTON_LOCATOR);
        log.info("Click Edit Button Locator");
        driver.findElement(EDIT_BUTTON_LOCATOR).click();

    }

    @Step("Click Rerun Button Locator")
    public void clickRerunButtonLocator() {
        //waitForElementClickable(RERUN_BUTTON_LOCATOR);
        log.info("Click Rerun Button Locator");
        driver.findElement(RERUN_BUTTON_LOCATOR).click();

    }
}