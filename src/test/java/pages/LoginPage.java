package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import lombok.extern.log4j.Log4j2;

@Log4j2
    public class LoginPage extends BasePage {


    private final By emailField = By.cssSelector(".single-sign-on");
    private final By passField =  By.cssSelector("input#name");
    private final static By ERROR_MESSAGE = By.cssSelector(".error-text");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step()
    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys("rauchukyulia@gmail.com");
    }
    @Step
    public void setPassword(String password) {
        driver.findElement(passField).sendKeys("ZYzBBO5Tm8G7/3JFqEnT");
    }
    @Step
    public boolean getErrorMessage() {
        return driver.findElement(ERROR_MESSAGE).isSelected();
    }
}