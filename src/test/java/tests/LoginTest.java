package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;

public class LoginTest extends BasePage {
    @Test(description = "Positive Login Test", groups = {"Smoke"})
    public void positiveLoginTest() {
        loginPage.setEmail("");
        loginPage.setPassword("");
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.isShoppingCartButtonPresent());
    }

    @Test(description = "Negative Login Test", groups = {"Regression"})
    public void negativeLoginTest() {
        loginPage.setEmail("");
        loginPage.setPassword("");
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.isErrorMessagePresent());
    }

    @Test(description = "Logout Test", groups = {"Smoke"})
    public void logoutTest() {
        loginPage.setEmail("");
        loginPage.setPassword("");
        loginPage.clickLoginButton();
        productPage.clickMenuButton();
        productPage.clickLogoutLink();
        Assert.assertTrue(loginPage.isBotColumnPresent());
    }
}
}
