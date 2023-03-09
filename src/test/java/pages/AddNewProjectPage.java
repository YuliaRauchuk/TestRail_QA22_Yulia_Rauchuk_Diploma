package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePage;


    @Log4j2
    public class AddNewProjectPage extends HomePage {
    private final static By NAME_INPUT = By.cssSelector("input#name");
    private final static By ANNOUNCEMENT_LOCATOR = By.cssSelector("//div[@class='textarea-resizable']");
    private final static By SUITE_MODE_LOCATOR = By.cssSelector("//input[@id='suite_mode_single']");
    private final static By PROJECT_COMPLETE_INPUT = By.cssSelector("//input[@id='is_completed']");
    private final static By SAVE_PROJECT_BUTTON_LOCATOR = By.cssSelector("//div//button[@id='accept']");
    private final static By CANCEL_PROJECT_BUTTON_LOCATOR = By.cssSelector("/a[@id='admin-integration-form-cancel']");
    private final static By DELETE_PROJECT_BUTTON_LOCATOR = By.cssSelector("//div[@class='icon-small-delete']");
    private final static By EDIT_PROJECT_LOCATOR = By.cssSelector("//div[@class='icon-small-edit']");
    private final static By DELETE_PROJECT_CONFIRMATION_MESSAGE_LOCATOR = By.cssSelector("//div[@class='ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix']");
    private final static By CHECKBOX_DELETE_PROJECT_LOCATOR = By.cssSelector("//*[@id='deleteDialog']/div[2]/div/div/label/input");
    private final static By OK_BUTTON_LOCATOR = By.xpath("//*[@id=\"confirmDialogOkCancel\"]/div[3]/a[1]");
    private final static By CONFORMATION_CANCEL_BUTTON_LOCATOR = By.xpath("//*[@id=\"deleteDialog\"]/div[3]/a[3]");
    private final static By DELETE_PROJECT_MESSAGE_LOCATOR = By.cssSelector ("//div[@class='message message-success']");

    public AddNewProjectPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public byte[] waitForPageLoaded() {

        return new byte[0];
    }
    @Step("Project Name")
    public void setProjectName(String name) {
        waitForElementClickable(NAME_INPUT);
        log.info("Project Name");
        driver.findElement(NAME_INPUT).sendKeys(name);
    }

    @Step("Setting Announcement")
    public void setAnnouncement(String name) {
        waitForElementClickable(ANNOUNCEMENT_LOCATOR);
        log.info("Setting Announcement");
        driver.findElement(ANNOUNCEMENT_LOCATOR).sendKeys(name);
    }

    @Step("Click Suite Mode Locator")
    public void clickSuiteModeLocator() {
        waitForElementClickable(SUITE_MODE_LOCATOR);
        log.info("Click Suite Mode Locator");
        driver.findElement(SUITE_MODE_LOCATOR).click();
    }

    @Step("Click Project Complete Input")
    public void clickProjectCompleteInput() {
        waitForElementClickable(PROJECT_COMPLETE_INPUT);
        log.info("Click Project Complete Input");
        driver.findElement(PROJECT_COMPLETE_INPUT).click();
    }
    @Step("Click Project Button Locator")
    public void clickSaveProjectButtonLocator() {
        waitForElementClickable(SAVE_PROJECT_BUTTON_LOCATOR);
        log.info("Click Project Button Locator");
        driver.findElement(SAVE_PROJECT_BUTTON_LOCATOR).click();
    }

    @Step("Click Cancel Project Button Locator")
    public void setCancelProjectButtonLocator() {
        waitForElementClickable(CANCEL_PROJECT_BUTTON_LOCATOR);
        log.info("Click Cancel Project Button Locator");
        driver.findElement(CANCEL_PROJECT_BUTTON_LOCATOR).click();
    }

    @Step("Click Delete Project Button Locator")
    public void clickDeleteProjectButtonLocator() {
        waitForElementClickable(DELETE_PROJECT_BUTTON_LOCATOR);
        log.info("Click Delete Project Button Locator");
        driver.findElement(DELETE_PROJECT_BUTTON_LOCATOR).click();
    }

    @Step("Click Edit Project Locator")
    public void setEditProjectLocator() {
        waitForElementClickable(EDIT_PROJECT_LOCATOR);
        log.info("Click Edit Project Locator");
        driver.findElement(EDIT_PROJECT_LOCATOR).click();
    }
    @Step("Displayed Delete Project Confirmation Message Locator")
    public void isDisplayedDeleteProjectConfirmationMessageLocator() {
        waitForElementClickable(DELETE_PROJECT_CONFIRMATION_MESSAGE_LOCATOR);
        log.info("Displayed Delete Project Confirmation Message Locator");
        driver.findElement(DELETE_PROJECT_CONFIRMATION_MESSAGE_LOCATOR).isDisplayed();
    }

    @Step("Click Checkbox Delete Project Locator")
    public void clickCheckboxDeleteProjectLocator() {
        waitForElementClickable(CHECKBOX_DELETE_PROJECT_LOCATOR);
        log.info("Click Checkbox Delete Project Locator");
        driver.findElement(CHECKBOX_DELETE_PROJECT_LOCATOR).click();
    }

    @Step("Click Ok Button Locator")
    public void clockOkButtonLocator() {
        waitForElementClickable(OK_BUTTON_LOCATOR);
        log.info("Click Ok Button Locator");
        driver.findElement(OK_BUTTON_LOCATOR).click();
    }

    @Step("Click Conformation Cancel Button Locator")
    public void clickConformationCancelButtonLocator() {
        waitForElementClickable(CONFORMATION_CANCEL_BUTTON_LOCATOR);
        log.info("Click Conformation Cancel Button Locator");
        driver.findElement(CONFORMATION_CANCEL_BUTTON_LOCATOR).click();
    }

    @Step("Displayed Delete Project Message Locator")
    public void isDisplayedDeleteProjectMessageLocator() {
        waitForElementClickable(DELETE_PROJECT_MESSAGE_LOCATOR );
        log.info("Displayed Delete Project Message Locator");
        driver.findElement(DELETE_PROJECT_MESSAGE_LOCATOR ).isDisplayed();
    }

        public boolean isAccessMessageDisplayed() {
            return false;
        }

    }