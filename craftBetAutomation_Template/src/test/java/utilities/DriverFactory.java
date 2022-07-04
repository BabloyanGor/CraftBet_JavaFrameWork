package utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import testCases.BaseTest;


public class DriverFactory {
    public static WebDriver driver;
    public DriverFactory() {

    }

    public void initDriver(String siteUrl,String browser) {
        switch (browser) {
            case "chrome":
                BaseTest.logger.info("Browser for test will be chrome as chosen");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get(siteUrl);
                break;
            case "firefox":
                BaseTest.logger.info("Browser for test will be firefox as chosen");
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.get(siteUrl);
                break;
            case "edge":
                BaseTest.logger.info("Browser for test will be edge as chosen");
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                driver.get(siteUrl);
                break;
            default:
                BaseTest.logger.info("Browser for test will be chrome by default");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get(siteUrl);
                break;
        }

    }

}

