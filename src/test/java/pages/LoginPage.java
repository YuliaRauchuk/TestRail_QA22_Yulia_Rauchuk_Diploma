package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import lombok.extern.log4j.Log4j2;


@Log4j2
    public class LoginPage extends BasePage {

    private final static By MY_ACCOUNT_LOCATOR = By.cssSelector("//div[@id='gk-header-top-menu']//div[3]/a");
    private final static By EMAIL_INPUT = By.cssSelector("//input[@id='email']");
    private final static By PASSWORD_INPUT = By.cssSelector("//input[@id='password']");
    private final static By LOG_IN_BUTTON = By.cssSelector("//button//span[@class='single-sign-on']");
    private final static By EMAIL_ERROR_MESSAGE = By.cssSelector("//div[@class='form-errors']");
    private final static By PASSWORD_ERROR_MESSAGE = By.cssSelector("//div[@class='form-errors']");
    private final static By FORM_LOGIN_PAGE = By.cssSelector("//div[@id='form']");

    public LoginPage(WebDriver driver) {
        super(driver);
   }

    @Override
    public byte[] waitForPageLoaded() {
        return new byte[0];
    }

    public void clickMyAccount() {driver.findElement(MY_ACCOUNT_LOCATOR).click();}
        public void setEmailInput(String emailInput) {driver.findElement(EMAIL_INPUT).sendKeys(emailInput);}
        public void setPasswordInput(String passwordInput) {driver.findElement(PASSWORD_INPUT).sendKeys(passwordInput);}
        public boolean getEmailErrorMessage(String errorEmail) {return driver.findElement(EMAIL_ERROR_MESSAGE).isDisplayed(); }
        public boolean getPasswordErrorMessage(String errorPassword) {return driver.findElement(PASSWORD_ERROR_MESSAGE).isDisplayed();}

    public void waitForLoginPageLoaded() {
    }

    public void clickLogInButton() {
    }

    public boolean isErrorMessageDisplayed() {
        return false;
    }

    public boolean isMessageDisplayed() {
        return false;
    }
}