package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@Log4j2
public abstract class BasePage {
    protected final static By BUTTON_UPGRADE = By.cssSelector("//img[@id='pendo-image-badge-035eb248']");
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected WebElement element;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);

    }

    @Step("Wait page loaded")
    public void waitForPageLoaded() {
        log.info("Wait page loaded");
        waitForElementClickable(BUTTON_UPGRADE);
    }
    
    public void waitForElementDisplayed(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForElementClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public void jsClick(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }
    public void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
