package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
    public class DashboardPage extends HomePage {
    public DashboardPage(WebDriver driver) {
        super(driver);
    }


    private final static By DASHBOARD_TAB_LOCATOR = By.cssSelector("//li//a[@id='navigation-dashboard']");
    private final static By ADD_PROJECT_BUTTON_LOCATOR = By.cssSelector("//div/a[@id='sidebar-projects-add']");
    private final static By ADD_EXAMPLE_PROJECT_BUTTON_LOCATOR = By.cssSelector("//div//a[2][@class='button button-left button-add']");
    private final static By DROPDOWN_CARET_LOCATOR = By.cssSelector("//span[2][@class='caret']");
    private final static By LOGOUT_BUTTON_LOCATOR = By.cssSelector("//a[@id='navigation-user-logout']");


    @Step("Dashboard Tab Displayed")
    public void isDashboardTabDisplayed() {
        //waitForElementClickable(DASHBOARD_TAB_LOCATOR);
        log.info("Return Dashboard Tab Displayed");
        driver.findElement(DASHBOARD_TAB_LOCATOR).isDisplayed();
    }
    @Step("Click Add Project Button Locator")
    public void clickAddProjectButtonLocator() {
       // waitForElementClickable(ADD_PROJECT_BUTTON_LOCATOR);
        log.info("Return Add Project Button Is Displayed");
        driver.findElement(ADD_PROJECT_BUTTON_LOCATOR).click();
    }

    @Step("Add Example Project Button Displayed")
    public void isAddExampleProjectButtonDisplayed() {
       // waitForElementClickable(ADD_EXAMPLE_PROJECT_BUTTON_LOCATOR);
        log.info("Return Add Example Project Button Displayed");
        driver.findElement(ADD_EXAMPLE_PROJECT_BUTTON_LOCATOR).isDisplayed();
    }
    @Step("Click Dropdown Caret Locator")
    public void clickDropdownCaretLocator() {
       // waitForElementClickable(DROPDOWN_CARET_LOCATOR);
        log.info("Click Dropdown Caret Locator");
        driver.findElement(DROPDOWN_CARET_LOCATOR).click();
    }
    @Step("Click LogOut Button Locator")
    public void clickLogOutButtonLocator() {
      //  waitForElementClickable(LOGOUT_BUTTON_LOCATOR);
        log.info("Click LogOut Button Locator");
        driver.findElement(LOGOUT_BUTTON_LOCATOR).click();

    }

    public boolean isAddProjectButtonDisplayed() {
        return false;
    }

    public void waitForPageLoaded() {
    }
}