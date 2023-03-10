package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import lombok.extern.log4j.Log4j2;
import tests.BaseTests;


@Log4j2
    public class LoginPage extends BaseTests {

    private final static By LOGIN_BUTTON = By.cssSelector(".single-sign-on");
    private final static By EMAIL_INPUT =  By.cssSelector("input#name");
    private final static By PASSWORD_INPUT =  By.cssSelector("input#password");
    private final static By ERROR_MESSAGE = By.cssSelector(".error-text");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step()
    public void waitLoginPageLoaded() {
        driver.findElement(LOGIN_BUTTON);
    }

    @Step()
    public void setEmail(String email) {
        driver.findElement(EMAIL_INPUT).sendKeys(email);
    }
    @Step
    public void setPassword(String password) {
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }
    @Step
    public void isErrorMessage() {
        driver.findElement(ERROR_MESSAGE).isDisplayed();
    }

    public void clickLogInButton() {
    }

    public boolean isBotColumnPresent() {
        return false;
    }
}

