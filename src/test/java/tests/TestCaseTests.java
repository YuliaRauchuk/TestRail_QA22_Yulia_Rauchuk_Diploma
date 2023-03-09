package tests;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Log4j2
public class TestCaseTests extends BaseTests {
    public TestCaseTests(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {

    }
    @Test(description = "Positive Test Case Tests", groups = {"Smoke"})
    public void testCase() {
        loginPage.waitForLoginPageLoaded();
        loginPage.setEmailInput("rauchukyulia@gmail.com");
        loginPage.setPasswordInput("ZYzBBO5Tm8G7/3JFqEnT");
        loginPage.clickLogInButton();
        dashboardPage.waitForPageLoaded();
        testCasePage.clickTestCasesTabLocator();
        addTestCasePage.clickTitleLocator("New Test Case");
        addTestCasePage.clickSectionDropdownLocator("Test Cases");
        addTestCasePage.clickTemplateDropdownLocator("Test Case (Text)");
        addTestCasePage.clickTypeDropdownLocator("Other");
        addTestCasePage.clickPriorityDropdownLocator("Medium");
        addTestCasePage.clickEstimateLocator("AAA");
        addTestCasePage.clickReferencesLocator("QWE");
        addTestCasePage.clickAutomationDropdownLocator("None");
        addTestCasePage.clickPreconditionLocator("SDK");
        addTestCasePage.clickStepsLocator("Open Tab," +
                "Check One, " +
                "Check Two, " +
                "Check Three, " +
                "Check Four");
        addTestCasePage.clickExpectedResultLocator("Working");
        addTestCasePage.clickAddTestCaseButton();
        addTestCasePage.isDisplayedSuccessMessage();

        Assert.assertEquals(addTestCasePage.isDisplayedSuccessMessage(), "Checking for success message");


    }

    @Test(description = "Negative Edit Test Case Tests", groups = {"Smoke"})
    public void editTestCaseTests() {
        loginPage.waitForLoginPageLoaded();
        loginPage.setEmailInput("rauchukyulia@gmail.com");
        loginPage.setPasswordInput("ZYzBBO5Tm8G7/3JFqEnT");
        loginPage.clickLogInButton();
        dashboardPage.waitForPageLoaded();
        testCasePage.clickTestCasesTabLocator();
        addTestCasePage.clickTitleLocator("New Test Case");
        addTestCasePage.clickSectionDropdownLocator("Test Cases");
        addTestCasePage.clickTemplateDropdownLocator("Test Case (Text)");
        addTestCasePage.clickTypeDropdownLocator("Other");
        addTestCasePage.clickPriorityDropdownLocator("Medium");
        addTestCasePage.clickStepsLocator("Open Tab," +
                "One, " +
                "Two, " +
                "Three");
        addTestCasePage.clickAddTestCaseButton();
        addTestCasePage.clickEditButtonLocator();
        addTestCasePage.clickTitleLocator("");
        addTestCasePage.clickSectionDropdownLocator("Test Cases");
        addTestCasePage.clickTemplateDropdownLocator("Test Case (Text)");
        addTestCasePage.clickTypeDropdownLocator("Other");
        addTestCasePage.clickPriorityDropdownLocator("Medium");
        addTestCasePage.clickStepsLocator("Open Tab," +
                "One, " +
                "Two, " +
                "Three");
        addTestCasePage.clickSaveTestCaseButtonLocator();
        addTestCasePage.isDisplayedMessageErrorLocator();

        Assert.assertEquals(addTestCasePage.isDisplayedMessageErrorLocator(), "Checking for success message");

    }
    @Test(description = "Positive Delete Test Case Tests", groups = {"Smoke"})
    public void deleteTestCaseTests() {
        loginPage.waitForLoginPageLoaded();
        loginPage.setEmailInput("rauchukyulia@gmail.com");
        loginPage.setPasswordInput("ZYzBBO5Tm8G7/3JFqEnT");
        loginPage.clickLogInButton();
        dashboardPage.waitForPageLoaded();
        testCasePage.clickTestCasesTabLocator();
        addTestCasePage.clickTitleLocator("QWE");
        addTestCasePage.clickSectionDropdownLocator("Test");
        addTestCasePage.clickTemplateDropdownLocator("Test Case (Text)");
        addTestCasePage.clickTypeDropdownLocator("Other");
        addTestCasePage.clickPriorityDropdownLocator("Medium");
        addTestCasePage.clickStepsLocator("");
        addTestCasePage.clickAddTestCaseButton();
        addTestCasePage.clickEditButtonLocator();
        addTestCasePage.clickDeleteThisTestCaseButtonLocator();
        addTestCasePage.clickMarkAsDeletedButtonLocator();
        Assert.assertTrue(addTestCasePage.idDisplayedSuccessMessageDeleteTestCaseLocator("Successfully flagged the test case as deleted."), "Checking for an error message");

    }
}


