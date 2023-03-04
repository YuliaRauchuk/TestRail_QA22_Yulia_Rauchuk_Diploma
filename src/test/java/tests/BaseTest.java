package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.project.AddNewProjectPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected final static String BASE_URL = "https://gry.testrail.io";
    protected final static String EMAIL = "rauchukyulia@gmail.com";
    protected final static String PASSWORD = "IclWS7XA8yMN5dik7NQS";


    protected WebDriver driver;
    protected LoginPage loginPage;
    protected AddNewProjectPage dashboardPage;


    @BeforeClass(alwaysRun = true)
    public void setUp(ITestContext testContext) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options =new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("-- ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        testContext.setAttribute("driver", driver);

        loginPage = new LoginPage(driver);
        dashboardPage= new AddNewProjectPage(driver) {
            @Override
            public void waitForPageLoaded() {

            }
        };

    }
    @BeforeMethod(alwaysRun = true)
    public void navigate() {
        driver.get(BASE_URL);}

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}
