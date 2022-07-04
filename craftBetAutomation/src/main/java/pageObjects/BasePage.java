package pageObjects;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BasePage {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;
    Select select;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public BasePage() {
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    /* this method will be take Screenshot whale page*/
    public void captureScreen(WebDriver driver, String tname) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir") + "\\Extent_Report\\Screenshots\\" + tname + ".png");
        FileUtils.copyFile(source, target);
        System.out.println("Screenshot taken");
    }

    /* this method will be used for validate webElements visibility */
    public void waitElementToBeVisible(WebElement element) {
        this.webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    /* this method will be used for validate webElements clickability */
    public void waitElementTobeClickable(WebElement element) {
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }



    /* this method will be used for clicking on element which is visible */
    public void clickOnElementIfVisible(WebElement element) {
        this.waitElementToBeVisible(element);
        element.click();
    }

    /* this method will be used for clicking on element which is Clickable*/
    public void clickOnElementIfClickable(WebElement element) {
        this.waitElementTobeClickable(element);
        element.click();
    }

    /* this method will be used for sending keys on element which is visible */
    public void sendKeysIfElementVisible(WebElement element, String keys){
        this.waitElementToBeVisible(element);
        element.clear();
        element.sendKeys(keys);
    }

    /* this method will be used for selecting element from dropdown using visible text */
    public void selectFromDropDownByVisibleText(WebElement element, String text){
        select = new Select(element);
        select.selectByVisibleText(text);
    }

    /* this method will be used for selecting element from dropdown using dropdown elements index */
    public void selectFromDropDownByID(WebElement element, int index){
        select = new Select(element);
        select.selectByIndex(index);
    }

    //region <Random email, String word, String numbers>

    /* this method will be return random String  num symbols */
    public String randomString(int num) {
        String generatedString = RandomStringUtils.randomAlphabetic(num);
        return (generatedString);
    }

    /* this method will be return integer number 4 symbols */
    public static String randomNum(int num) {
        String generatedInt = RandomStringUtils.randomNumeric(num);
        return (generatedInt);
    }

    /* this method will return random valid emails */
    public String generateRandomEmail() {
        String randomEmail;
        String generatedString = RandomStringUtils.randomAlphanumeric(10);
        randomEmail = generatedString + "@gmail.com";
        return randomEmail;
    }

    //endregion


    //region <JavaScript executor>

    //endregion

    //region <Actions>
    //endregion




}
