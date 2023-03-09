package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;
import pages.AddNewProjectPage;

import java.util.concurrent.TimeUnit;


public abstract class BaseTests {

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected OverviewPage overviewPage;
    protected ProjectPage projectPage;
    protected TestCasePage testCasePage;
    protected AddNewProjectPage addNewProjectPage;
    protected DashboardPage dashboardPage;
    protected AddTestCasePage addTestCasePage;
    protected TestRunResultsPage testRunResultsPage;
    protected TestPlanPage testPlanPage;
    protected AddTestPlanPage addTestPlanPage;

    public BaseTests(WebDriver driver) {
    }
    public void waitForPageLoaded() {
    }

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
        dashboardPage= new DashboardPage(driver) {
            @BeforeMethod(alwaysRun = true)
            public void navigate() {
                loginPage.open();
            }

            @AfterMethod(alwaysRun = true)
            public void clear() {
                driver.manage().deleteAllCookies();
                ((JavascriptExecutor) driver).executeScript(String.format("window.localStorage.clear();"));
                ((JavascriptExecutor) driver).executeScript(String.format("window.sessionStorage.clear();"));
            }

            @AfterClass(alwaysRun = true)
            public void tearDown() {
                driver.quit();
            }
        };
    }
}
