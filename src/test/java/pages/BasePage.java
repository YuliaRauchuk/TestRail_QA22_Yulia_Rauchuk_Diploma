package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


    @Log4j2
    public abstract class BasePage {
        protected final static By IMAGE = By.xpath("//img[contains(@id,'pendo-image-badge')]");

        protected WebDriver driver;
        protected WebDriverWait wait;

        public BasePage(WebDriver driver) {
            this.driver = driver;
            this.wait = new WebDriverWait(driver, 30);
        }
        private void waitForElementClickable(By image) {
        }

        @Step("wait for page loaded")
        public void waitForPageLoaded() {
            log.info("wait for page loaded");
            waitForElementClickable(IMAGE);
        }
        @Step
    public boolean isBotColumnPresent() {
        return false;
    }
    @Step
    public boolean isErrorMessagePresent() {
        return false;
    }
    }