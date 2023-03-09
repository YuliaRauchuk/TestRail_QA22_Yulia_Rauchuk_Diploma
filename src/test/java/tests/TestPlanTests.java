package tests;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Log4j2
public class TestPlanTests extends BaseTests {
    public TestPlanTests (WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {

    }
    @Test(description = "Positive Test Plan Tests", groups = {"Smoke"})
    public void testPlanTests() {
        loginPage.waitForLoginPageLoaded();
        loginPage.setEmailInput("rauchukyulia@gmail.com");
        loginPage.setPasswordInput("ZYzBBO5Tm8G7/3JFqEnT");
        loginPage.clickLogInButton();
        dashboardPage.waitForPageLoaded();
        testRunResultsPage.clickTestRunResultsTabLocator();
        testPlanPage.clickAddTestPlanTabLocator();
        addTestPlanPage.clickTestPlanNameInput("Plan Ray");
        addTestPlanPage. clickReferencesLocator("QWE");
        addTestPlanPage.clickDescriptionLocator("Descr");
        addTestPlanPage.clickAddTestPlanButtonLocator();
        addTestPlanPage.isDisplayedMessageSuccessLocator("Successfully added the new test plan.");
        testRunResultsPage.waitForPageLoaded();

        Assert.assertTrue(testRunResultsPage.isDisplayedMessageSuccessLocator());

    }
}

