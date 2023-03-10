package pages.milestones;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

@Log4j2
public class MilestonesPage extends HomePage {

    private final static By NAME_LOCATOR = By.cssSelector("//input[@id='name']");
    private final static By REFERENCES_LOCATOR = By.cssSelector("//input[@id='reference']");
    private final static By PARENT_LOCATOR = By.cssSelector("/div[@id='parent_id_chzn']");
    private final static By DESCRIPTION_LOCATOR = By.cssSelector("//div[@id='description_display']");
    private final static By START_DATE_LOCATOR = By.cssSelector("//input[@name='start_on']");
    private final static By END_DATA_LOCATOR = By.cssSelector("//input[@name='due_on']");
    private final static By PREV_BUTTON_LOCATOR = By.cssSelector("//div//a//span[@class='ui-icon ui-icon-circle-triangle-w']");  //StartData//кнопка переключения календаря назад
    private final static By NEXT_BUTTON_LOCATOR = By.cssSelector("//div//a//span[@class='ui-icon ui-icon-circle-triangle-e']");
    private final static By CLEAR_BUTTON_LOCATOR = By.cssSelector("//div//button[@class='button button-left button-negative button-cancel run-form-cancel']");
    private final static By DONE_BUTTON_LOCATOR = By.cssSelector("//div//button[@class='ui-datepicker-done ui-state-default ui-priority-primary ui-corner-all']");
    private final static By CHECKBOX_IS_COMPLETED_LOCATOR = By.cssSelector("//input[@id='is_completed']");
    private final static By ACCEPT_BUTTON_LOCATOR = By.cssSelector("//div//button[@id='accept']");
    private final static By MESSAGE_SUCCESS_LOCATOR = By.cssSelector("//div//div[@class='message message-success']");
    private final static By EDIT_MILESTONES_LOCATOR = By.cssSelector("//span[@class='hidden hoverAction']//a");
    private final static By SAVE_MILESTONES_BUTTON_LOCATOR = By.cssSelector("//div//button[@id='accept']");
    private final static By DISPLAYED_MESSAGE_UPDATED_MILESTONE_LOCATOR =  By.cssSelector("//div//div[@class='message message-success']");
    private final static By SELECT_CHECKBOX_LOCATOR = By.cssSelector("//span//input[@name='select_all']");
    private final static By DELETE_ICON_LOCATOR = By.cssSelector("//td//a//div[@class='icon-small-delete ']");
    private final static By DELETE_SELECTED_BUTTON_LOCATOR = By.cssSelector("//a//span[@class='button button-negative button-delete']");
    private final static By CONFIRMATION_LOCATOR = By.cssSelector("//div//span[@id='ui-dialog-title-bulkDeleteDialog']");
    private final static By CONFIRMATION_DELETE_BUTTON_LOCATOR = By.cssSelector("//div//div[@class='button-group dialog-buttons-highlighted']//a[@class='button button-black button-black-disabled button-left button-positive button-disabled dialog-action-default']");
    private final static By DELETE_CHECKBOX_LOCATOR = By.cssSelector("//input[@id='confirm-check']");
    private final static By CANCEL_BUTTON_LOCATOR = By.cssSelector("//div//a[3][@class='button button-cancel button-left button-negative dialog-action-close']");
    private final static By DELETE_BUTTON_LOCATOR = By.cssSelector("//div//a[1][@class='button button-black button-left button-positive dialog-action-default']");

    public MilestonesPage(WebDriver driver) {
        super(driver);
    }



    @Step("Enter Name Locator")
    public void clickNameLocator(String name) {
        log.info("Enter Name locator");
        driver.findElement(NAME_LOCATOR).sendKeys(name);
    }

    @Step("Enter References Locator")
    public void clickReferencesLocator(String name) {
        log.info("Enter References Locator");
        driver.findElement(REFERENCES_LOCATOR).sendKeys(name);
    }

    @Step("Enter Parent Locator")
    public void clickParentLocator(String name) {
        log.info("Enter Parent Locator");
        driver.findElement(PARENT_LOCATOR).sendKeys(name);
    }

    @Step("Click Description Locator")
    public void clickDescriptionLocator(String milestones) {
        log.info("Click Description Locator");
        driver.findElement(DESCRIPTION_LOCATOR).click();
    }

    @Step("Click Start Data")
    public void clickStartData(String s) {
        log.info("Click Start Data");
        driver.findElement(START_DATE_LOCATOR).click();

    }

    @Step("Click End Data")
    public void clickEndData(String s) {
        log.info("Click End Data");
        driver.findElement(END_DATA_LOCATOR).click();
    }

    @Step("Click Prev Button Locator")
    public void clickPrevButtonLocator() {
        log.info("Click Prev Button Locator");
        driver.findElement(PREV_BUTTON_LOCATOR).click();
    }

    @Step("Click Next Button Locator")
    public void clickNextButtonLocator() {
        log.info("Click Next Button Locator");
        driver.findElement(NEXT_BUTTON_LOCATOR).click();
    }

    @Step("Click Clear Button Locator")
    public void clickClearButtonLocator() {
        log.info("Click Clear Button Locator");
        driver.findElement(CLEAR_BUTTON_LOCATOR).click();

    }

    @Step("Click Done Button Locator")
    public void clickDoneButtonLocator() {
        log.info("Click Done Button Locator");
        driver.findElement(DONE_BUTTON_LOCATOR).click();
    }

    @Step("Click Checkbox Is Completed Locator")
    public void clickCheckboxIsCompletedLocator() {
        log.info("Click Checkbox Is Completed Locator");
        driver.findElement(CHECKBOX_IS_COMPLETED_LOCATOR).click();
    }

    @Step("Click Accept Button Locator")
    public void clickAcceptButtonLocator() {
        log.info("Click Accept Button Locator");
        driver.findElement(ACCEPT_BUTTON_LOCATOR).click();

    }

    @Step("Displayed Message Success Locator")
    public void isDisplayedMessageSuccessLocator(String s) {
        log.info("Displayed Message Success Locator");
        driver.findElement(MESSAGE_SUCCESS_LOCATOR).isDisplayed();
    }

    @Step("Click Edit Milestones Locator")
    public void clickEditMilestonesLocator() {
        log.info("Click Edit Milestones Locator");
        driver.findElement(EDIT_MILESTONES_LOCATOR).click();
    }

    @Step("Click Save Milestones Button Locator")
    public void clickSaveMilestonesButtonLocator() {
        log.info("Click Save Milestones Button Locator");
        driver.findElement(SAVE_MILESTONES_BUTTON_LOCATOR).click();
    }
    @Step("Displayed Message Updated Milestone Locator")
    public void isDisplayedMessageUpdatedMilestoneLocator(String s) {
        log.info("Displayed Message Updated Milestone Locator");
        driver.findElement(DISPLAYED_MESSAGE_UPDATED_MILESTONE_LOCATOR).isDisplayed();
    }
    @Step("Click Select Checkbox Locator")
    public void clickSelectCheckboxLocator() {
        log.info("Click Select Checkbox Locator");
        driver.findElement(SELECT_CHECKBOX_LOCATOR).click();
    }
    @Step("Click Delete Icon Locator")
        public void clickDeleteIconLocator() {
        log.info("Click Delete Icon Locator");
        driver.findElement(DELETE_ICON_LOCATOR).click();
    }
    @Step("Click Delete Selected Button Locator")
    public void clickDeleteSelectedButtonLocator() {
        log.info("Click Delete Selected Button Locator");
        driver.findElement(DELETE_SELECTED_BUTTON_LOCATOR).click();

    }

    @Step("Click Confirmation Locator")
    public void clickConfirmationLocator() {
        log.info("Click Confirmation Locator");
        driver.findElement(CONFIRMATION_LOCATOR).click();

    }
    @Step("Click Confirmation Delete Button Locator")
    public void clickConfirmationDeleteButtonLocator() {
        log.info("Click Confirmation Delete Button Locator");
        driver.findElement(CONFIRMATION_DELETE_BUTTON_LOCATOR).click();

    }
    @Step("Click Delete Checkbox Locator")
    public void clickDeleteCheckboxLocator() {
        log.info("Click Delete Checkbox Locator");
        driver.findElement(DELETE_CHECKBOX_LOCATOR).click();
    }
    @Step("Click Cancel Button Locator")
    public void clickCancelButtonLocator() {
        log.info("Click Cancel Button Locator");
        driver.findElement(CANCEL_BUTTON_LOCATOR).click();
}
    @Step("Click Delete Button Locator")
    public void clickDeleteButtonLocator() {
        log.info("Click Delete Button Locator");
        driver.findElement(DELETE_BUTTON_LOCATOR).click();
    }

    public boolean isAccessMessageDisplayed() {
        return false;
    }
}