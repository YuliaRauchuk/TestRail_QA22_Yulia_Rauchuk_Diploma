package pages.milestones;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.elements.DropDown;
import pages.elements.Input;
import pages.elements.TextArea;


@Log4j2
    public class AddMilestonesPage<Milestones> extends HomePage {


    private final static By ADD_MILESTONES_BUTTON= By.cssSelector("//div//a[@id='navigation-milestones-add']//span");

    public AddMilestonesPage(WebDriver driver) {
        super(driver);
    }
    public void setAddMilestonesButtonValue(String value) {
        driver.findElement(ADD_MILESTONES_BUTTON).sendKeys(value);
    }
    @Override
    public void waitForPageLoaded() {

    }
    @Step("fillForm Milestones")
    @Attachment(value = "screenshot", type = "image/png")


    public void fillForm(Milestones milestones) {
        log.info("fillForm Milestones");
        new Input(driver, "Name").setValue(milestones.getName());
        new Input(driver, "References").setValue(milestones.getReferences());
        new DropDown(driver, "Parent").selectByVisibleText(milestones.getParent());
        new TextArea(driver, "Description").setValue(milestones.getDescription());
        new Input(driver, "Start Date").setValue(milestones.getStartDate());
        new Input(driver, "End Date").setValue(milestones.getEndDate());
    }
}

