package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


@Log4j2
public class AddTestCasePage extends HomePage {
    public AddTestCasePage(WebDriver driver) {
        super(driver);
    }

    private final static By TITLE_LOCATOR = By.cssSelector("//input[@class='form-control form-control-full form-fields ']");
    private final static By SECTION_DROPDOWN_LOCATOR = By.cssSelector("//div[@id='section_id_chzn']");
    private final static By TEMPLATE_DROPDOWN_LOCATOR = By.cssSelector("//div[@id='template_id_chzn']");
    private final static By TYPE_DROPDOWN_LOCATOR = By.cssSelector("//div[@id='type_id_chzn']");
    private final static By PRIORITY_DROPDOWN_LOCATOR = By.cssSelector("//div[@id='priority_id_chzn']");
    private final static By ESTIMATE_LOCATOR = By.cssSelector("//input[@id='estimate']");
    private final static By REFERENCES_LOCATOR = By.cssSelector("//input[@id='refs']");
    private final static By AUTOMATION_DROPDOWN_LOCATOR = By.cssSelector("//div[@id='custom_automation_type_chzn']");
    private final static By PRECONDITION_LOCATOR = By.cssSelector("//div[@id='custom_preconds_display']");
    private final static By STEPS_LOCATOR = By.cssSelector("//div[@id='custom_steps_display']");
    private final static By EXPECTED_RESULT_LOCATOR = By.cssSelector("//div[@id='custom_expected_display']");
    private final static By ADD_TEST_CASE_BUTTON = By.cssSelector("//div//button[@id='accept']");
    private final static By ADD_AND_NEXT_BUTTON = By.cssSelector("//div//button[@id='accept_and_next']");
    private final static By CANCEL_BUTTON_LOCATOR = By.cssSelector("//div//a[@class='button button-left button-negative button-cancel leave case-form-cancel']");
    private final static By SUCCESS_MESSAGE = By.cssSelector("//div[@class='message message-success']");
    private final static By EDIT_BUTTON_LOCATOR = By.cssSelector("//a[@class='toolbar-button content-header-button button-responsive button-start toolbar-button-last']//span[@class='button-text']");
    private final static By DELETE_BUTTON_LOCATOR = By.cssSelector("//a[@id='deleteCasesDisabled']//span[@class='button-text']");
    private final static By MESSAGE_ERROR_LOCATOR = By.cssSelector("//div//div[@class='message message-error']");
    private final static By SAVE_TEST_CASE_BUTTON_LOCATOR = By.cssSelector("//div//button[@id='accept']");
    private final static By DELETE_THIS_TEST_CASE_BUTTON_LOCATOR = By.cssSelector("//a//span[@class='button button-negative button-delete']");
    private final static By MARK_AS_DELETED_BUTTON_LOCATOR = By.xpath("//*[@id='casesDeletionDialog']/div[3]/div/a[2]");
    private final static By SUCCESS_MESSAGE_DELETE_TEST_CASE_LOCATOR = By.cssSelector("//div//div[@class='message message-success']");


    @Step("Setting Title Locator")
    public void clickTitleLocator(String newTestCase) {
        //waitForElementClickable(TITLE_LOCATOR);
        log.info("Setting Title Locator");
        driver.findElement(TITLE_LOCATOR).click();
    }

    @Step("Click Section Dropdown Locator")
    public void clickSectionDropdownLocator(String testCases) {
        //waitForElementClickable(SECTION_DROPDOWN_LOCATOR);
        log.info("Click Section Dropdown Locator");
        driver.findElement(SECTION_DROPDOWN_LOCATOR).click();
    }

    @Step("Click Template Dropdown Locator")
    public void clickTemplateDropdownLocator(String s) {
        //waitForElementClickable(TEMPLATE_DROPDOWN_LOCATOR);
        log.info("Click Template Dropdown Locator");
        driver.findElement(TEMPLATE_DROPDOWN_LOCATOR).click();
    }

    @Step("Click Type Dropdown Locator")
    public void clickTypeDropdownLocator(String other) {
        //waitForElementClickable(TYPE_DROPDOWN_LOCATOR);
        log.info("Click Type Dropdown Locator");
        driver.findElement(TYPE_DROPDOWN_LOCATOR).click();
    }

    @Step("Click Priority Dropdown Locator")
    public void clickPriorityDropdownLocator(String medium) {
        //waitForElementClickable(PRIORITY_DROPDOWN_LOCATOR);
        log.info("Click Priority Dropdown Locator");
        driver.findElement(PRIORITY_DROPDOWN_LOCATOR).click();
    }

    @Step("Click Estimate Locator")
    public void clickEstimateLocator(String aaa) {
        //waitForElementClickable(ESTIMATE_LOCATOR);
        log.info("Click Estimate Locator");
        driver.findElement(ESTIMATE_LOCATOR).click();
    }

    @Step("Click References Locator")
    public void clickReferencesLocator(String qwe) {
        //waitForElementClickable(REFERENCES_LOCATOR);
        log.info("Click References Locator");
        driver.findElement(REFERENCES_LOCATOR).click();
    }

    @Step("Click Automation Dropdown Locator")
    public void clickAutomationDropdownLocator(String none) {
        //waitForElementClickable(AUTOMATION_DROPDOWN_LOCATOR);
        log.info("Click Automation Dropdown Locator");
        driver.findElement(AUTOMATION_DROPDOWN_LOCATOR).click();
    }

    @Step("Click Precondition Locator")
    public void clickPreconditionLocator(String sdk) {
       // waitForElementClickable(PRECONDITION_LOCATOR);
        log.info("Click Precondition Locator");
        driver.findElement(PRECONDITION_LOCATOR).click();
    }

    @Step("Click Steps Locator")
    public void clickStepsLocator(String s) {
       // waitForElementClickable(STEPS_LOCATOR);
        log.info("Click Steps Locator");
        driver.findElement(STEPS_LOCATOR).click();
    }

    @Step("Click Expected Result Locator")
    public void clickExpectedResultLocator(String working) {
       // waitForElementClickable(EXPECTED_RESULT_LOCATOR);
        log.info("Click Expected Result Locator");
        driver.findElement(EXPECTED_RESULT_LOCATOR).click();
    }

    @Step("Click Add Test Case Button")
    public void clickAddTestCaseButton() {
       // waitForElementClickable(ADD_TEST_CASE_BUTTON);
        log.info("Click Add Test Case Button");
        driver.findElement(ADD_TEST_CASE_BUTTON).click();
    }

    @Step("Click Add And Next Button")
    public void clickAddAndNextButton() {
        //waitForElementClickable(ADD_AND_NEXT_BUTTON);
        log.info("Click Add And Next Button");
        driver.findElement(ADD_AND_NEXT_BUTTON).click();
    }

    @Step("Click Cancel Button")
    public void clickCancelButtonLocator() {
        //waitForElementClickable(CANCEL_BUTTON_LOCATOR);
        log.info("Click Cancel Button");
        driver.findElement(CANCEL_BUTTON_LOCATOR).click();
    }

    @Step("Displayed Success Message")
    public boolean[] isDisplayedSuccessMessage() {
       // waitForElementClickable(SUCCESS_MESSAGE);
        log.info("Displayed Success Message");
        driver.findElement(SUCCESS_MESSAGE).isDisplayed();
        return new boolean[0];
    }

    @Step("Click Edit Button Locator")
    public void clickEditButtonLocator() {
       // waitForElementClickable(EDIT_BUTTON_LOCATOR);
        log.info("Click Edit Button Locator");
        driver.findElement(EDIT_BUTTON_LOCATOR).click();
    }

    @Step("Click Delete Button Locator")
    public void clickDeleteButtonLocator() {
        //waitForElementClickable(DELETE_BUTTON_LOCATOR);
        log.info("Click Delete Button Locator");
        driver.findElement(DELETE_BUTTON_LOCATOR).click();
    }

    @Step("Displayed Message Error Locator")
    public boolean[] isDisplayedMessageErrorLocator() {
        //waitForElementClickable(MESSAGE_ERROR_LOCATOR);
        log.info("isDisplayedMessageErrorLocator");
        driver.findElement(MESSAGE_ERROR_LOCATOR).isDisplayed();
        return new boolean[0];
    }

    @Step("Click Save Test Case Button Locator")
    public void clickSaveTestCaseButtonLocator() {
       // waitForElementClickable(SAVE_TEST_CASE_BUTTON_LOCATOR);
        log.info("Click Save Test Case Button Locator");
        driver.findElement(SAVE_TEST_CASE_BUTTON_LOCATOR).click();
    }

    @Step("Click Delete This Test Case Button Locator")
    public void clickDeleteThisTestCaseButtonLocator() {
       // waitForElementClickable(DELETE_THIS_TEST_CASE_BUTTON_LOCATOR);
        log.info("Click Delete This Test Case Button Locator");
        driver.findElement(DELETE_THIS_TEST_CASE_BUTTON_LOCATOR).click();
    }

    @Step("Click Mark As Deleted Button Locator")
    public void clickMarkAsDeletedButtonLocator() {
        //waitForElementClickable(MARK_AS_DELETED_BUTTON_LOCATOR);
        log.info("Click Mark As Deleted Button Locator");
        driver.findElement(MARK_AS_DELETED_BUTTON_LOCATOR).click();
    }

    @Step("Displayed Success Message Delete Test Case Locator")
    public boolean idDisplayedSuccessMessageDeleteTestCaseLocator(String s) {
       // waitForElementClickable(SUCCESS_MESSAGE_DELETE_TEST_CASE_LOCATOR);
        log.info("Displayed Success Message Delete Test Case Locator");
        driver.findElement(SUCCESS_MESSAGE_DELETE_TEST_CASE_LOCATOR).isDisplayed();
        return false;
    }
}