package tests;

import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;


@Log4j2
public class LoginTests extends BaseTests {

    @Test(description = "Positive Login Tests", groups = {"positive"})
    public void loginTests(String email, String password) {
        loginPage.waitLoginPageLoaded();
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        loginPage.clickLogInButton();
        loginPage.isErrorMessage();
        dashboardPage.waitForPageLoaded();

        Assert.assertTrue(dashboardPage.isAddProjectButtonDisplayed());

    }

    @Test(description = "Negative Login Test", groups = {"negative"})
    public void negativeLoginTests(String email) {
        loginPage.waitLoginPageLoaded();
        loginPage.setEmail(email);
        loginPage.setPassword("QWE");
        loginPage.clickLogInButton();
        loginPage.isErrorMessage();
        dashboardPage.waitForPageLoaded();
        Assert.assertTrue(loginPage.isErrorMessagePresent());

    }
    @Test(description = "Positive LogOut Test", groups = {"Smoke"})
    public void positiveLogOutTests(String email, String password) {
        loginPage.waitLoginPageLoaded();
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        loginPage.clickLogInButton();
        dashboardPage.clickDropdownCaretLocator();
        dashboardPage.clickLogOutButtonLocator();

        Assert.assertTrue(loginPage.isBotColumnPresent());
    }
}
