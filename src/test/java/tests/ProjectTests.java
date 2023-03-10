package tests;

import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;


@Log4j2
public class ProjectTests extends BaseTests {

    @Test(description = "Positive Create New Project Test", groups = {"Smoke"})
    public void positiveCreateNewProjectTest() {
        loginPage.setEmail("rauchukyulia@gmail.com");
        loginPage.setPassword("ZYzBBO5Tm8G7/3JFqEnT");
        loginPage.clickLogInButton();
        dashboardPage.clickAddProjectButtonLocator();
        addNewProjectPage.setProjectName("Project");
        addNewProjectPage.setAnnouncement("AAA");
        addNewProjectPage.clickSuiteModeLocator();
        addNewProjectPage.clickProjectCompleteInput();
        addNewProjectPage.clickSaveProjectButtonLocator();

        Assert.assertTrue(addNewProjectPage.isAccessMessageDisplayed(), "Checking for a Success Message");
    }

    @Test(description = "Positive Delete Project Test", groups = {"Smoke"})
    public void positiveDeleteProjectTest() {
        dashboardPage.clickAddProjectButtonLocator();
        addNewProjectPage.setProjectName("Project");
        addNewProjectPage.setAnnouncement("QWE");
        addNewProjectPage.clickSuiteModeLocator();
        addNewProjectPage.clickProjectCompleteInput();
        addNewProjectPage.clickSaveProjectButtonLocator();
        addNewProjectPage.clickDeleteProjectButtonLocator();
        addNewProjectPage.isDisplayedDeleteProjectConfirmationMessageLocator();
        addNewProjectPage.clickCheckboxDeleteProjectLocator();
        addNewProjectPage.clockOkButtonLocator();
        addNewProjectPage.isDisplayedDeleteProjectMessageLocator();

        Assert.assertTrue(addNewProjectPage.isAccessMessageDisplayed(), "Checking for a Success Message");
        }
    }