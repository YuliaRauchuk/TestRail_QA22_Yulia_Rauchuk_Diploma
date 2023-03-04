package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
@Log4j2
public class DashboardPage extends HomePage {
    private final static By ADD_PROJECT_BUTTON = By.cssSelector("//div/a[@id='sidebar-projects-add']");
    private WebElement driver;

    public DashboardPage(WebDriver driver) {
        super(driver);
    }
    public void setAddProjectButton() {
        driver.findElement(ADD_PROJECT_BUTTON).click();
    }
    @Override
    public void waitForPageLoaded() {

    }

    @Step("select add project button displayed")
    public boolean isAddProjectButtonDisplayed() {
        log.info("return add project button is displayed");
        return driver.findElement(ADD_PROJECT_BUTTON).isDisplayed();
    }

    @Step("click add project button")
    public void clickAddProjectButton() {
        log.info("click add project button");
        driver.findElement(ADD_PROJECT_BUTTON).click();
    }
}