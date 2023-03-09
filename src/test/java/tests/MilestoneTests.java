package tests;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.OverviewPage;
import pages.milestones.AddMilestonesPage;
import pages.milestones.MilestonesPage;

@Log4j2
public class MilestoneTests extends BaseTests {

    OverviewPage overviewPage;
    MilestonesPage milestonesPage;
    AddMilestonesPage addMilestonesPage;

    public MilestoneTests(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {

    }
    @BeforeClass
    public void initialise() {
        overviewPage = new OverviewPage(driver);
        milestonesPage = new MilestonesPage(driver);
        addMilestonesPage = new AddMilestonesPage(driver);

    }

    @Test(description = "Positive tests Create Milestones", groups = {"Smoke"})
    public void createMilestones() {

        loginPage.waitForLoginPageLoaded();
        loginPage.setEmailInput("rauchukyulia@gmail.com");
        loginPage.setPasswordInput("ZYzBBO5Tm8G7/3JFqEnT");
        overviewPage.clickAddMilestonesButtonLocator();
        milestonesPage.clickNameLocator("Ray");
        milestonesPage.clickReferencesLocator("AAA");
        milestonesPage.clickParentLocator("QWE");
        milestonesPage.clickDescriptionLocator("New Milestones");
        milestonesPage.clickStartData("10.01.2023");
        milestonesPage.clickEndData("10.03.2023");
        milestonesPage.clickCheckboxIsCompletedLocator();
        milestonesPage.clickAcceptButtonLocator();
        milestonesPage.isDisplayedMessageSuccessLocator("Successfully added the new milestone.");

        Assert.assertTrue(milestonesPage.isAccessMessageDisplayed(), "Checking for a message about the successfully added the new milestone");
    }

    @Test(description = "Positive tests Edit Milestones", groups = {"Smoke"})
    public void editMilestones () {
        overviewPage.clickAddMilestonesButtonLocator();
        milestonesPage.clickNameLocator("NewMil");
        milestonesPage.clickReferencesLocator("mil");
        milestonesPage.clickParentLocator("QWE");
        milestonesPage.clickCheckboxIsCompletedLocator();
        milestonesPage.clickAcceptButtonLocator();
        milestonesPage.isDisplayedMessageSuccessLocator("Successfully added the new milestone.");
        milestonesPage.clickEditMilestonesLocator();
        milestonesPage.clickDescriptionLocator("Edit Milestones");
        milestonesPage.clickSaveMilestonesButtonLocator();
        milestonesPage.isDisplayedMessageUpdatedMilestoneLocator("Successfully updated the milestone.");

        Assert.assertTrue(milestonesPage.isAccessMessageDisplayed(), "Checking for a message about the successfully updated the milestone");
    }


    @Test(description = "Positive tests Delete Milestones", groups = {"Smoke"})
    public void deleteMilestones () {
        overviewPage.clickAddMilestonesButtonLocator();
        milestonesPage.clickNameLocator("Miles");
        milestonesPage.clickReferencesLocator("qwe");
        milestonesPage.clickParentLocator("ray");
        milestonesPage.clickCheckboxIsCompletedLocator();
        milestonesPage.clickAcceptButtonLocator();
        milestonesPage.isDisplayedMessageSuccessLocator("Successfully added the new milestone.");
        milestonesPage.clickSelectCheckboxLocator();
        milestonesPage.clickDeleteSelectedButtonLocator();
        milestonesPage.clickConfirmationLocator();
        milestonesPage.clickDeleteCheckboxLocator();
        milestonesPage.clickConfirmationDeleteButtonLocator();
        milestonesPage.clickDeleteButtonLocator();
        milestonesPage.waitForPageLoaded();

        Assert.assertTrue(milestonesPage.isAccessMessageDisplayed(), "Checking for a milestone was deleted");

    }
}