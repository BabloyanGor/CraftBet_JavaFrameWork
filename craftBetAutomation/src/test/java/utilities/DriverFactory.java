package utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import testCases.BaseTest;


public class DriverFactory {
    public static WebDriver driver;
    public static ChromeOptions cOptions;
    public static FirefoxOptions fOptions;
    public static EdgeOptions eOptions;

    public DriverFactory() {

    }

    public void initDriver(String siteUrl,String browser, String browserType) {
        switch (browser) {
            case "chrome":
                BaseTest.logger.info("Browser for test will be chrome as chosen");
                WebDriverManager.chromedriver().setup();
                if (browserType.equals("headless")){
                    cOptions=new ChromeOptions();
                    cOptions.setHeadless(true);
                    driver= new ChromeDriver(cOptions);
                }
                else{
                    driver = new ChromeDriver();
                }
                driver.manage().window().maximize();
                driver.get(siteUrl);
                break;

            case "firefox":
                BaseTest.logger.info("Browser for test will be firefox as chosen");
                WebDriverManager.firefoxdriver().setup();
                if (browserType.equals("headless")){
                    fOptions=new FirefoxOptions();
                    fOptions.setHeadless(true);
                    driver= new FirefoxDriver(fOptions);
                }
                else{
                    driver = new FirefoxDriver();
                }
                driver.manage().window().maximize();
                driver.get(siteUrl);
                break;
            case "edge":
                BaseTest.logger.info("Browser for test will be edge as chosen");
                WebDriverManager.edgedriver().setup();
                if (browserType.equals("headless")){
                    eOptions=new EdgeOptions();
                    eOptions.setHeadless(true);
                    driver= new EdgeDriver(eOptions);
                }
                else{
                    driver = new EdgeDriver();
                }
                driver.manage().window().maximize();
                driver.get(siteUrl);
                break;
            default:
                BaseTest.logger.info("Browser for test will be chrome by default");
                WebDriverManager.chromedriver().setup();
                if (browserType.equals("headless")){
                    cOptions=new ChromeOptions();
                    cOptions.setHeadless(true);
                    driver= new ChromeDriver(cOptions);
                }
                else{
                    driver = new ChromeDriver();
                }

                driver.manage().window().maximize();
                driver.get(siteUrl);
                break;
        }

    }

}

