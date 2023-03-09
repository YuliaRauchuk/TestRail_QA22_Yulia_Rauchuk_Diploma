package tests;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import pages.OverviewPage;
import pages.milestones.AddMilestonesPage;
import pages.milestones.MilestonesPage;


@Log4j2
public class LoginTest extends BaseTests {
    public LoginTest(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
    }
    @BeforeClass
    public void initialise() {

        overviewPage = new OverviewPage(driver);
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
    }

    @Test(description = "Positive Login Test", groups = {"Smoke"})
    public void loginTests() {
        loginPage.waitForLoginPageLoaded();
        loginPage.setEmailInput("rauchukyulia@gmail.com");
        loginPage.setPasswordInput("ZYzBBO5Tm8G7/3JFqEnT");
        loginPage.clickLogInButton();
        dashboardPage.waitForPageLoaded();

        Assert.assertTrue(dashboardPage.isAddProjectButtonDisplayed());

    }

    @Test(description = "Negative Login Tests", groups = {"Negative"})
    public void negativeLoginTests() {
        loginPage.waitForLoginPageLoaded();
        loginPage.setEmailInput("rauchukyulia@gmail.com");
        loginPage.setPasswordInput("password");
        loginPage.clickLogInButton();

        Assert.assertTrue(loginPage.getPasswordErrorMessage(""), "Checking for an error message");

    }
    @Test(description = "Positive LogOut Tests", groups = {"Smoke"})
    public void positiveLogOutTests() {
        loginPage.waitForLoginPageLoaded();
        loginPage.setEmailInput("rauchukyulia@gmail.com");
        loginPage.setPasswordInput("ZYzBBO5Tm8G7/3JFqEnT");
        loginPage.clickLogInButton();
        dashboardPage.waitForPageLoaded();
        dashboardPage.clickDropdownCaretLocator();
        dashboardPage.clickLogOutButtonLocator();
        dashboardPage.isDisplayedFormLoginPage();

        Assert.assertTrue(loginPage.isMessageDisplayed(), "Checking for logout");
}
}
