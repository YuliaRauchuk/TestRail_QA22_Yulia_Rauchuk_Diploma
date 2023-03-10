package pages.milestones;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePage;;



@Log4j2
    public class AddMilestonesPage extends HomePage {


    private final static By ADD_MILESTONES_BUTTON = By.cssSelector("//div//a[@id='navigation-milestones-add']//span");

    public AddMilestonesPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddMilestonesButtonValue(String value) {
        driver.findElement(ADD_MILESTONES_BUTTON).sendKeys(value);
    }
}




