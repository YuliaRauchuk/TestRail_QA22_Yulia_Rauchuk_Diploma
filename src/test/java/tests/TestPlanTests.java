package tests;

import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;

@Log4j2
public class TestPlanTests extends BaseTests {

    @Test(description = "Positive Test Plan Tests", groups = {"Smoke"})
    public void testPlanTests() {
        loginPage.setEmail("rauchukyulia@gmail.com");
        loginPage.setPassword("ZYzBBO5Tm8G7/3JFqEnT");
        loginPage.clickLogInButton();
       // testRunResultsPage.clickTestRunResultsTab();
        testPlanPage.clickAddTestPlanTabLocator();
        addTestPlanPage.clickTestPlanNameInput("Plan Ray");
        addTestPlanPage. clickReferencesLocator("QWE");
        addTestPlanPage.clickDescriptionLocator("Descr");
        addTestPlanPage.clickAddTestPlanButtonLocator();
        addTestPlanPage.isDisplayedMessageSuccessLocator("Successfully added the new test plan.");

        Assert.assertTrue(testRunResultsPage.isDisplayedMessageSuccessLocator());

    }
}

