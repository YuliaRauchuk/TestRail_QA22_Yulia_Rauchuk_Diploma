package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class OverviewPage extends BasePage {
    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    private final static By ADD_MILESTONES_BUTTON_LOCATOR = By.cssSelector("//div//a[@id='navigation-overview-addmilestones']");
    private final static By ADD_TEST_RUN_BUTTON_LOCATOR = By.cssSelector("//div//a[@id='navigation-overview-addrunssuite']");
    private final static By OVERVIEW_PAGE_TAB_LOCATOR = By.cssSelector("//li//a[@id='navigation-projects']");
    private final static By EDIT_BUTTON_LOCATOR = By.cssSelector("//div//a[@class='toolbar-button toolbar-button-last content-header-button button-edit']");
    private final static By SIDEBAR_MILESTONES_OVERVIEW_LOCATOR = By.cssSelector("//div//a[@id='sidebar-milestones-overview']");
    private final static By SIDEBAR_RUNS_OVERVIEW_LOCATOR = By.cssSelector("//div//a[@id='sidebar-runs-overview']");
    private final static By SIDEBAR_CASES_OVERVIEW_LOCATOR= By.cssSelector("//div//a[@id='sidebar-cases-overview']");



    @Step("Click Add Milestones Button Locator")
    public void clickAddMilestonesButtonLocator() {
        //waitForElementClickable(ADD_MILESTONES_BUTTON_LOCATOR);
        log.info("Click Add Milestones Button Locator");
        driver.findElement(ADD_MILESTONES_BUTTON_LOCATOR).click();
    }

    @Step("Click Add Test Run Button Locator")
    public void clickAddTestRunButtonLocator() {
        //waitForElementClickable(ADD_TEST_RUN_BUTTON_LOCATOR);
        log.info("Click Add Test Run Button Locator");
        driver.findElement(ADD_TEST_RUN_BUTTON_LOCATOR).click();
    }

    @Step("Click Overview Page Tab Locator")
    public void clickOverviewPageTabLocator() {
       // waitForElementClickable(OVERVIEW_PAGE_TAB_LOCATOR);
        log.info("Click Overview Page Tab Locator");
        driver.findElement(OVERVIEW_PAGE_TAB_LOCATOR).click();
    }
    @Step("Click Edit Button Locator")
    public void clickEditButtonLocator() {
       // waitForElementClickable(EDIT_BUTTON_LOCATOR);
        log.info("Click Edit Button Locator");
        driver.findElement(EDIT_BUTTON_LOCATOR).click();
    }

    @Step("Click Sidebar Milestones Overview Locator")
    public void clickSidebarMilestonesOverviewLocator() {
        //waitForElementClickable(SIDEBAR_MILESTONES_OVERVIEW_LOCATOR);
        log.info("Click Sidebar Milestones Overview Locator");
        driver.findElement(SIDEBAR_MILESTONES_OVERVIEW_LOCATOR).click();
    }

    @Step("Click Sidebar Runs Overview Locator")
    public void clickSidebarRunsOverviewLocator() {
       // waitForElementClickable(SIDEBAR_RUNS_OVERVIEW_LOCATOR);
        log.info("Click Sidebar Runs Overview Locator");
        driver.findElement(SIDEBAR_RUNS_OVERVIEW_LOCATOR).click();
    }
    @Step("Click Sidebar Cases Overview Locator")
    public void clickSidebarCasesOverviewLocator() {
        //waitForElementClickable(SIDEBAR_CASES_OVERVIEW_LOCATOR);
        log.info("Click Sidebar Cases Overview Locator");
        driver.findElement(SIDEBAR_CASES_OVERVIEW_LOCATOR).click();
    }
}