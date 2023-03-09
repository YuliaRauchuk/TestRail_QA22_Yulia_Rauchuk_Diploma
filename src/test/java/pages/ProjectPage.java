package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

@Log4j2
public class ProjectPage extends HomePage {
    public ProjectPage(WebDriver driver) {
        super(driver);
    }

    private final static By ADD_PROJECT_TAB_LOCATOR = By.cssSelector("//div//div[@class='content-header-title page_title']");

    @Override
    public byte[] waitForPageLoaded() {

        return new byte[0];
    }

    @Step("Click Add Project Tab Locator")
    public void clickAddProjectTabLocator() {
        waitForElementClickable(ADD_PROJECT_TAB_LOCATOR);
        log.info("Click Add Project Tab Locator");
        driver.findElement(ADD_PROJECT_TAB_LOCATOR).click();
    }
}
