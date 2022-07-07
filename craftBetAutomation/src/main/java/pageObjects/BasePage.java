package pageObjects;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BasePage {
    static WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;
    Select select;
    JavascriptExecutor js;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(60));
        js = (JavascriptExecutor) driver;
    }

    public BasePage() {
    }


    /* this method will be return integer number 4 symbols */
    public static String randomNum(int num) {
        String generatedInt = RandomStringUtils.randomNumeric(num);
        return (generatedInt);
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    /* this method will be take Screenshot whale page*/
    public File captureScreen(WebDriver driver, String tname) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir") + "\\Extent_Report\\Screenshots\\" + tname + ".png");
        FileUtils.copyFile(source, target);
        System.out.println("Screenshot taken");
        return target;
    }

    public void captureScreenDrawBorder(WebDriver driver, WebElement element, String tname) throws IOException {
        js.executeScript("arguments[0].style.border = '3px solid red'", element);
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir") + "\\Extent_Report\\Screenshots\\" + tname + ".png");
        FileUtils.copyFile(source, target);
        System.out.println("Screenshot taken");
    }

    public void captureFromScreenSpecificElement(WebDriver driver, WebElement element, String tname) throws IOException {

        File source = element.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir") + "\\Extent_Report\\Compare_Screenshots\\" + tname + ".png");
        FileUtils.copyFile(source, target);
        System.out.println("Screenshot taken");
    }

    /* this method will be used for validate webElements visibility */
    public void waitElementToBeVisible(WebElement element) {
        this.webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    /* this method will be used for validate webElements click ability */
    public void waitElementTobeClickable(WebElement element) {
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }


    /* this method will be used for clicking on element which is visible */
    public void clickOnElementIfVisible(WebElement element) {
        this.waitElementToBeVisible(element);
        element.click();
    }

    /* this method will be used for clicking on element which is Clickable */
    public void clickOnElementIfClickable(WebElement element) {
        this.waitElementTobeClickable(element);
        element.click();
    }

    /* this method will be used for sending keys on element which is visible */
    public void sendKeysIfElementVisible(WebElement element, String keys) {
        this.waitElementToBeVisible(element);
        element.clear();
        element.sendKeys(keys);
    }

    /* this method will true if element is enabled */
    public boolean elementIsEnable(WebElement element) {
        return element.isEnabled();

    }

    public boolean elementIsDisplayed(WebElement element) {
        return element.isDisplayed();

    }

    /* this method will return true if element is selected */
    public boolean elementIsSelected(WebElement element) {
        return element.isSelected();
    }

    /* this method will get text from element */
    public String getText(WebElement element) {
        waitElementToBeVisible(element);
        return element.getText();
    }

    /* this method will get current URL */
    public String getUrl() {
        return driver.getCurrentUrl();
    }

    /* this method will get attribute from element */
    public String getAttribute(WebElement element, String attribute) {
        return element.getAttribute(attribute);
    }

    /* this method will get attribute from element */
    public String getTagName(WebElement element) {
        return element.getTagName();
    }

    //region <Select from Dropdown>
    /* this method will be used for selecting element from dropdown using visible text */
    public void selectFromDropDownByVisibleText(WebElement element, String text) {
        select = new Select(element);
        select.selectByVisibleText(text);
    }

    /* this method will be used for selecting element from dropdown using dropdown elements index */
    public void selectFromDropDownByIndex(WebElement element, int index) {
        select = new Select(element);
        select.selectByIndex(index);
    }

    /* this method will be used for selecting element from dropdown using dropdown elements index */
    public void selectFromDropDownByValue(WebElement element, String value) {
        select = new Select(element);
        select.selectByValue(value);
    }
    //endregion


    //region <javaScript executor>

    /* this method will be used for scrolling down to particular element */
    public void javaScriptScrollDownToParticularElement(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    /* this method will be used for scrolling down to particular position */
    public void javaScriptScrollDownToParticularPosition(String position) {
        js.executeScript("window.scrollBy(0," + position + ")", "");
    }

    /* this method will be used for scrolling to bottom of the page */
    public void javaScriptScrollToBottom() {
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    /* this method will scroll the page down */
    public void scrollPageDown() {
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    /* this method will scroll the page up */
    public void scrollPageUp() {
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
    }

    /* this method will zoom the page */
    public void zoomPageByJS(String zoomProcsent) {
        js.executeScript("document.body.style.zoom='" + zoomProcsent + "%'"); //zoom by 100%
    }

    /* this method will be used for clicking on WebElement */
    public void javaScriptClick(WebElement element) {
        waitElementTobeClickable(element);
        js.executeScript("arguments[0].click();", element);
    }

    /* this method will be used for sending text to text box */
    public void javaScriptSendKeys(String text) {
        js.executeScript("document.getElementById('q').value='" + text + "'");
    }

    /* this method will refresh browser */
    public void javaScriptRefreshBrowser() {
        js.executeScript("history.go(0)");
    }

    /* this method will draw border for element */
    public void javaScriptDrawBorder(WebElement element) {
        js.executeScript("arguments[0].style.border = '3px solid red'", element);
    }

    /* this method will return title of the page */
    public String javaScriptGetTitle() {
        String title = js.executeScript("return document.title;").toString();
        return title;
    }

    /* this method will generate the alert window */
    public void javaScriptGenerateAlert(String massage) {
        js.executeScript("alert('" + massage + "')");
    }


    //endregion


    //region <Actions>
    public void actionClickToElement(WebElement element) {
        waitElementToBeVisible(element);
        actions.moveToElement(element).build().perform();
    }

    public void actionMoveToElement(WebElement element) {
        actions.moveToElement(element).build().perform();
    }

    public void actionMoveToElementClick(WebElement element) {
        actions.moveToElement(element).click().build().perform();

    }

    public void actionDoubleClick(WebElement element) {
        waitElementToBeVisible(element);
        actions.doubleClick(element).perform();
    }

    public void actionDownXTime(int x) {
        for (int i = 0; i<x; i++){
            actions.sendKeys(Keys.ARROW_DOWN).perform();
        }
    }

    //endregion

    //region <Robot>


    //endregion




    //region <Navigation>
    public void navigateForward(){
        driver.navigate().forward();
    }
    public void navigateBack(){
        driver.navigate().back();
    }
    public void navigateRefresh(){
        driver.navigate().refresh();
    }

    //endregion

}
