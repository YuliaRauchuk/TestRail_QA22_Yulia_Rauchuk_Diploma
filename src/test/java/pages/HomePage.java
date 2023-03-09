package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2

    public abstract class HomePage extends BasePage {
    private final static By HEADER_MENU_ITEM = By.cssSelector("//ul[@class='header-menu']");
    protected Actions actions = new Actions(driver);
    protected WebDriverWait wait;

    public HomePage(WebDriver driver) {

        super(driver);
        this.wait = new WebDriverWait(driver,  30);
    }
    public abstract byte[] waitForPageLoaded();

    @Step("Open Header Menu Item")
    public void clickHeaderMenuItem(String headerName) {
        waitForElementClickable(HEADER_MENU_ITEM);
        log.info("Open Header Menu Item");
        driver.findElement(HEADER_MENU_ITEM).click();

    }

    public void clickDropdownCaretLocator() {
    }
    public void clickLogOutButtonLocator() {
    }
}