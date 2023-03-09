package pages.testRuns;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePage;


@Log4j2
    public class AddTestRunPage extends HomePage {
    public AddTestRunPage(WebDriver driver) {
        super(driver);
    }

    private final static By TEST_RUN_NAME_INPUT = By.cssSelector("//input[@class='form-control ']");
    private final static By REFERENCES_LOCATOR = By.cssSelector("//input[@id='refs']");
    private final static By MILESTONE_LOCATOR = By.cssSelector("//div[@id='milestone_id_chzn']//a//span");
    private final static By ASSIGN_TO_LOCATOR = By.cssSelector("//div[@id='assignedto_id_chzn']//a//span");
    private final static By DESCRIPTION_LOCATOR = By.cssSelector("//div[@id='description_display']");
    private final static By INCLUDE_ALL_TEST_CASES_LOCATOR = By.cssSelector("//input[@id='includeAll']");
    private final static By ADD_TEST_RUN_BUTTON_LOCATOR = By.cssSelector("//div//button[@id='accept']");
    private final static By CANCEL_BUTTON = By.cssSelector("//a[@class='button button-left button-negative button-cancel run-form-cancel']");
    private final static By MESSAGE_SUCCESS_LOCATOR = By.cssSelector("//div//div[@class='message message-success']");
    private final static By EDIT_TEST_RUN_BUTTON = By.cssSelector("//div//a//span[@class='button-text']");
    private final static By CLOSE_TEST_RUN_BUTTON = By.cssSelector("//div[@class='icon-close']");
    private final static By CONFORMATION_BUTTON_YES = By.cssSelector("//div//div//div//a[@class='button button-ok button-left button-positive dialog-action-default']");
    private final static By CONFORMATION_BUTTON_NO = By.cssSelector("//div//div//div//a[@class='button button-cancel button-left button-negative dialog-action-close']");
    private final static By MESSAGE_CLOSE_SUCCESS_LOCATOR = By.cssSelector("//div//div[@class='message message-success']");
    private final static By ICON_SMALL_DELETE_LOCATOR = By.cssSelector("//a//div[@class='icon-small-delete']");
    private final static By DELETE_SELECTED_BUTTON_LOCATOR = By.cssSelector("//a//span[@class='button button-negative button-delete']");

    @Override
    public byte[] waitForPageLoaded() {

        return new byte[0];
    }
    @Step("Click Test Run Input")
    public void setTestRunNameInput(String name) {
        waitForElementClickable(TEST_RUN_NAME_INPUT);
        log.info("Click Test Run Input");
        driver.findElement(TEST_RUN_NAME_INPUT).sendKeys(name);
    }
    @Step("Setting References Locator")
    public void setReferencesLocator(String name) {
        waitForElementClickable(REFERENCES_LOCATOR);
        log.info("Setting References Locator");
        driver.findElement(REFERENCES_LOCATOR).sendKeys(name);
    }
    @Step("Click Milestones Locator")
    public void setMilestoneLocator() {
        waitForElementClickable(MILESTONE_LOCATOR);
        log.info("Click Milestones Locator");
        driver.findElement(MILESTONE_LOCATOR).click();
    }
    @Step("Click Assign To Locator")
    public void setAssignToLocator() {
        waitForElementClickable(ASSIGN_TO_LOCATOR);
        log.info("Click Assign To Locator");
        driver.findElement(ASSIGN_TO_LOCATOR).click();
    }
    @Step("Setting Description Locator")
    public void setDescriptionLocator(String name) {
        waitForElementClickable(DESCRIPTION_LOCATOR);
        log.info("Setting Description Locator");
        driver.findElement(DESCRIPTION_LOCATOR).sendKeys(name);
    }
    @Step("Click Include All Test Cases Locator")
    public void setIncludeAllTestCasesLocator() {
        waitForElementClickable(INCLUDE_ALL_TEST_CASES_LOCATOR);
        log.info("Click Include All Test Cases Locator");
        driver.findElement(INCLUDE_ALL_TEST_CASES_LOCATOR).click();
    }
    @Step("Click Add Test Run Button Locator")
    public void setAddTestRunButtonLocator(String name) {
        waitForElementClickable(ADD_TEST_RUN_BUTTON_LOCATOR);
        log.info("Click Add Test Run Button Locator");
        driver.findElement(ADD_TEST_RUN_BUTTON_LOCATOR).click();
    }
    @Step("Click Cancel Button")
    public void setCancelButton(String name) {
        waitForElementClickable(CANCEL_BUTTON );
        log.info("Click Cancel Button");
        driver.findElement(CANCEL_BUTTON ).click();
    }
    @Step("Displayed Message Success Locator")
    public void setMessageSuccessLocator(String name) {
        waitForElementClickable(MESSAGE_SUCCESS_LOCATOR);
        log.info("Displayed Message Success Locator");
        driver.findElement(MESSAGE_SUCCESS_LOCATOR).isDisplayed();
    }
    @Step("Click Edit Test Run Button")
    public void setEditTestRunButton(String name) {
        waitForElementClickable(EDIT_TEST_RUN_BUTTON);
        log.info("Click Edit Test Run Button");
        driver.findElement(EDIT_TEST_RUN_BUTTON).click();
    }
    @Step("Click Close Test Run Button")
    public void setCloseTestRunButton(String name) {
        waitForElementClickable(CLOSE_TEST_RUN_BUTTON);
        log.info("Click Close Test Run Button");
        driver.findElement(CLOSE_TEST_RUN_BUTTON).click();
    }
    @Step("Click Conformation Button Yes")
    public void setConformationButtonYes(String name) {
        waitForElementClickable(CONFORMATION_BUTTON_YES);
        log.info("Click Conformation Button Yes");
        driver.findElement(CONFORMATION_BUTTON_YES).click();
    }
    @Step("Click Conformation Button No")
    public void setConformationButtonNo(String name) {
        waitForElementClickable(CONFORMATION_BUTTON_NO);
        log.info("Click Conformation Button No");
        driver.findElement(CONFORMATION_BUTTON_NO).click();
    }
    @Step("Displayed Message Close Success Locator")
    public void setMessageCloseSuccessLocator(String name) {
        waitForElementClickable(MESSAGE_CLOSE_SUCCESS_LOCATOR);
        log.info("Displayed Message Close Success Locator");
        driver.findElement(MESSAGE_CLOSE_SUCCESS_LOCATOR).isDisplayed();
    }

    @Step("Click Icon Small Delete Locator")
    public void setIconSmallDeleteLocator(String name) {
        waitForElementClickable(ICON_SMALL_DELETE_LOCATOR);
        log.info("Click Icon Small Delete Locator");
        driver.findElement(ICON_SMALL_DELETE_LOCATOR).click();
    }
    @Step("Click Delete Selected Button Locator")
    public void setDeleteSelectedButtonLocator(String name) {
        waitForElementClickable(DELETE_SELECTED_BUTTON_LOCATOR);
        log.info("Click Delete Selected Button Locator");
        driver.findElement(DELETE_SELECTED_BUTTON_LOCATOR).click();
    }
}