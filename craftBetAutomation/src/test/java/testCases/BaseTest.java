package testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import pageObjects.BasePage;
import pageObjects.CraftBet_HomePage;
import utilities.DriverFactory;
import utilities.ReadConfig;

import java.time.Duration;


public class BaseTest extends DriverFactory {

    ReadConfig readConfig = new ReadConfig();
    public String baseURL=readConfig.getApplicationURL();
    public String browser=readConfig.getBrowser();
    public String username=readConfig.getUsername();
    public String password=readConfig.getPassword();
    public static Logger logger;
    public CraftBet_HomePage craftBet_homePage;

    public BaseTest() {
    }

    @BeforeMethod
    public void setup() {
        logger = Logger.getLogger("craftBet");
        PropertyConfigurator.configure("Log4j.properties");

        try {
            super.initDriver(baseURL,browser);
        } catch (org.openqa.selenium.TimeoutException exception) {
            super.initDriver(baseURL,browser);
        }
        //region <Page Class Instance Initialization >
        craftBet_homePage = PageFactory.initElements(this.driver, CraftBet_HomePage.class);
        logger.info("Home Page initialized");

        //endregion
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        try {
            this.driver.quit();
            logger.info("Browser closed");
        } catch (Exception exception) {
            this.driver.quit();
            logger.info("Browser closed with exception");
        }
    }
}
