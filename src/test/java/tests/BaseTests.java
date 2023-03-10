package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;
import java.util.concurrent.TimeUnit;

public  abstract class BaseTests {


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



    @BeforeClass(alwaysRun = true)
    public void setUp(ITestContext testContext) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        testContext.setAttribute("driver", driver);


        loginPage = new LoginPage(driver);
        overviewPage = new OverviewPage(driver);
        projectPage = new ProjectPage(driver);
        testCasePage = new TestCasePage(driver);
        addNewProjectPage = new AddNewProjectPage(driver);
        dashboardPage = new DashboardPage(driver);
        addTestCasePage = new AddTestCasePage(driver);
        testRunResultsPage = new TestRunResultsPage(driver);
        testPlanPage = new TestPlanPage(driver);
        addTestPlanPage = new AddTestPlanPage(driver);
    }

    @BeforeMethod(alwaysRun = true)
    public void navigate() {
        driver.get("https://yli.testrail.io/");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();}

    protected boolean isErrorMessagePresent() {
        return false;
    }
}




