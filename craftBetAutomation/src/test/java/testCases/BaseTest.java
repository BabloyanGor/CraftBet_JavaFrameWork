package testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import pageObjects.*;
import utilities.DriverFactory;
import utilities.ReadConfig;

import java.time.Duration;


public class BaseTest extends DriverFactory {

    ReadConfig readConfig = new ReadConfig();
    public String baseURL = readConfig.getApplicationURL();
    public String browserType = readConfig.getBrowserType();
    public String browser = readConfig.getBrowser();
    public String username = readConfig.getUsername();
    public String password = readConfig.getPassword();
    public static Logger logger;


    public CraftBet_Header_Page craftBet_header_page;
    public CraftBet_Login_PopUp_Page craftBet_login_popUp_page;
    public CraftBet_Footer_Page craftBet_footer_page;
    public CraftBet_PasswordRecovery_Page craftBet_passwordRecovery_page;
    public CraftBet_SignUp_PopUp_Page craftBet_signUp_popUp_page;
    public CraftBet_Casino_Page craftBet_casino_page;


    public BaseTest() {
    }

    @BeforeMethod
    public void setup() {
        logger = Logger.getLogger("craftBet");
        PropertyConfigurator.configure("Log4j.properties");

        try {
            super.initDriver(baseURL, browser, browserType);

        } catch (org.openqa.selenium.TimeoutException exception) {
            super.initDriver(baseURL, browser, browserType);

        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //region <Page Class Instance Initialization >
        craftBet_header_page = PageFactory.initElements(this.driver, CraftBet_Header_Page.class);
        logger.info("Header page elements are initialized");
        craftBet_login_popUp_page = PageFactory.initElements(this.driver, CraftBet_Login_PopUp_Page.class);
        logger.info("Login_PopUp_Page login PopUp elements are initialized");
        craftBet_signUp_popUp_page = PageFactory.initElements(this.driver, CraftBet_SignUp_PopUp_Page.class);
        logger.info("SignUp_PopUp_Page elements are initialized");
        craftBet_footer_page = PageFactory.initElements(this.driver, CraftBet_Footer_Page.class);
        logger.info("Footer Page elements are initialized");
        craftBet_passwordRecovery_page = PageFactory.initElements(this.driver, CraftBet_PasswordRecovery_Page.class);
        logger.info("Password recovery Page elements are initialized");
        craftBet_casino_page = PageFactory.initElements(this.driver, CraftBet_Casino_Page.class);
        logger.info("Casino Page elements are initialized");


        //endregion

        craftBet_header_page.selectEnglishLanguageFromDropDown();
        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  Test started ");
    }

    @AfterMethod
    public void tearDown() {
        try {
            this.driver.quit();
            logger.info("Browser closed");
        } catch (Exception exception) {
            this.driver.quit();
            logger.info("Browser close order has an exception");
        }
        logger.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<  Test finished ");
    }

    @AfterSuite
    public void Finish() {
        logger.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<  Test Suite finished  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
    }
}
