package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import io.qameta.allure.Attachment;

@Log4j2
    public class LoginPage extends BasePage {

    private final static By MY_ACCOUNT = By.cssSelector("//div[@id='gk-header-top-menu']//div[3]/a");
    private final static By EMAIL_INPUT = By.cssSelector("//input[@id='email']");
    private final static By PASSWORD_INPUT = By.cssSelector("//input[@id='password']");
    private final static By EMAIL_ERROR_MESSAGE = By.cssSelector("//div[@class='form-errors']//p//text()[\"(Email Address field is required.)\"]");
    private final static By PASSWORD_ERROR_MESSAGE = By.cssSelector("//div[@class='form-errors']//p//text()[\"(Password field is required.)\"]");

      public LoginPage(WebDriver driver) {
        super(driver);
   }

        public void clickMyAccount() {driver.findElement(MY_ACCOUNT).click();}
        public void setEmailInput(String emailInput) {driver.findElement(EMAIL_INPUT).sendKeys(emailInput);}
        public void setPasswordInput(String passwordInput) {driver.findElement(PASSWORD_INPUT).sendKeys(passwordInput);}
        public boolean getEmailErrorMessage(String errorEmail) {return driver.findElement(EMAIL_ERROR_MESSAGE).isDisplayed(); }
        public boolean getPasswordErrorMessage(String errorPassword) {return driver.findElement(PASSWORD_ERROR_MESSAGE).isDisplayed();}
}