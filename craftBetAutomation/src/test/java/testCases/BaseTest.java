package testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import pageObjects.CraftBet_Header_Page;
import pageObjects.CraftBet_Login_PopUp_Page;
import pageObjects.CraftBet_SignUp_PopUp_Page;
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
    public CraftBet_Header_Page craftBet_header_page;
    public CraftBet_Login_PopUp_Page craftBet_login_popUp_page;

    public CraftBet_SignUp_PopUp_Page craftBet_signUp_popUp_page;
    public BaseTest() {
    }

    @BeforeSuite
    public void StartSuite(){
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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //region <Page Class Instance Initialization >
        craftBet_header_page = PageFactory.initElements(this.driver, CraftBet_Header_Page.class);
        logger.info("Home Page header elements are initialized");
        craftBet_login_popUp_page = PageFactory.initElements(this.driver, CraftBet_Login_PopUp_Page.class);
        logger.info("Login_PopUp_Page login PopUp elements are initialized");
        craftBet_signUp_popUp_page = PageFactory.initElements(this.driver, CraftBet_SignUp_PopUp_Page.class);
        logger.info("SignUp_PopUp_Page elements are initialized");


        //endregion

        craftBet_header_page.selectEnglishLanguageFromDropDown();
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



    @AfterSuite
    public void finish(){
        logger.info("All specified test was executed");
    }






}
