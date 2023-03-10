package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


@Log4j2
public abstract class BasePage {

    private final static By LOGIN_BUTTON = By.cssSelector(".single-sign-on");
    private final static By EMAIL_INPUT = By.cssSelector("input#name");
    private final static By PASSWORD_INPUT = By.cssSelector("input#password");
    private final static By ERROR_MESSAGE = By.cssSelector(".error-text");

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);

    }
    @Step("setting password")
        public void setPassword(String password) {
            log.info("fill password");
            driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }
    @Step("setting email")
        public void setEmail(String email) {
            log.info("setting email");
            driver.findElement(EMAIL_INPUT).sendKeys(email);
    }

    @Step
        public void clickLogInButton(){
        log.info("click login button");
        driver.findElement(LOGIN_BUTTON).click();
    }

    @Step
    public boolean getErrorMessage() {
        return driver.findElement(ERROR_MESSAGE).isSelected();
    }

    @Step
    public boolean isBotColumnPresent() {
        return false;
    }
    @Step
    public boolean isErrorMessagePresent() {
        return false;
    }

}