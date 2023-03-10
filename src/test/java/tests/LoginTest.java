package tests;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.OverviewPage;



@Log4j2
public class LoginTest extends BaseTests {

    @Test(description = "Positive Login Test", groups = {"all", "positive"})
    public void loginTests() {
        loginPage.setEmail("rauchukyulia@gmail.com");
        loginPage.setPassword("ZYzBBO5Tm8G7/3JFqEnT");
        loginPage.clickLogInButton();
        dashboardPage.waitForPageLoaded();

        Assert.assertTrue(dashboardPage.isAddProjectButtonDisplayed());

    }

    @Test(description = "Negative Login Tests", groups = {"all", "negative"})
    public void negativeLoginTests() {

        loginPage.setEmail("rauchukyulia@gmail.com");
        loginPage.setPassword("password");
        loginPage.clickLogInButton();


        Assert.assertTrue(loginPage.isErrorMessagePresent());

    }
    @Test(description = "Positive LogOut Tests", groups = {"Smoke"})
    public void positiveLogOutTests() {

        loginPage.setEmail("rauchukyulia@gmail.com");
        loginPage.setPassword("ZYzBBO5Tm8G7/3JFqEnT");
        loginPage.clickLogInButton();
        dashboardPage.clickDropdownCaretLocator();
        dashboardPage.clickLogOutButtonLocator();

        Assert.assertTrue(loginPage.isBotColumnPresent());
    }
}
