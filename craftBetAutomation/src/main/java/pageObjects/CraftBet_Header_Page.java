package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CraftBet_Header_Page extends BasePage {
    private final BasePage basePage;

    public CraftBet_Header_Page(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);
    }


    @FindBy(xpath = "")
    @CacheLookup
    List<WebElement> HeaderMenuLinks;
    public void clickOnHeaderMenuLinks() {
        for(WebElement link:HeaderMenuLinks){
            try{
                basePage.waitElementToBeVisible(link);
                basePage.javaScriptClick(link);
            }
            catch(Exception e){

            }
        }

    }




















    @FindBy(xpath = "//div[@class='header-section_topPanel_left']")
    @CacheLookup
    WebElement logo;
    public void clickOnLogoIfVisible() {
        try{
            basePage.waitElementToBeVisible(logo);
            basePage.javaScriptClick(logo);
        }
        catch(Exception e){

        }
    }
    @FindBy(xpath = "//a[text()=' Sports ']")
    @CacheLookup
    WebElement linkSports;
    public void clickOnLinkSports() {
        try{
            basePage.waitElementToBeVisible(linkSports);
            basePage.javaScriptClick(linkSports);
        }
        catch(Exception e){

        }
    }
    @FindBy(xpath = "//a[text()=' Live ']")
    @CacheLookup
    WebElement linkLife;
    public void clickOnLinkLife() {
        try{
            basePage.waitElementToBeVisible(linkLife);
            basePage.javaScriptClick(linkLife);
        }
        catch(Exception e){

        }
    }

    @FindBy(xpath = "//a[text()=' Asian Sport ']")
    @CacheLookup
    WebElement linkAsianSport;
    public void clickOnLinkAsianSport() {
        try{
            basePage.waitElementToBeVisible(linkAsianSport);
            basePage.javaScriptClick(linkAsianSport);
        }
        catch(Exception e){

        }
    }

    @FindBy(xpath = "//a[text()=' Asian Sport ']")
    @CacheLookup
    WebElement linkVirtualSport;
    public void clickOnLinkVirtualSport() {
        try{
            basePage.waitElementToBeVisible(linkVirtualSport);
            basePage.javaScriptClick(linkVirtualSport);
        }
        catch(Exception e){

        }
    }
    public void hoverToLinkVirtualSport() {
        try{
            basePage.waitElementToBeVisible(linkVirtualSport);
            basePage.actionMoveToElement(linkVirtualSport);
        }
        catch(Exception e){

        }
    }

    @FindBy(xpath = "//a[text()=' Casino ']")
    @CacheLookup
    WebElement linkCasino;
    public void clickOnLinkLinkCasino() {
        try{
            basePage.waitElementToBeVisible(linkCasino);
            basePage.javaScriptClick(linkCasino);
        }
        catch(Exception e){

        }
    }

    @FindBy(xpath = "//a[text()=' Asian Sport ']")
    @CacheLookup
    WebElement linkLifeCasinoDropDown;
    public void clickOnLinkLifeCasino() {
        try{
            basePage.waitElementToBeVisible(linkLifeCasinoDropDown);
            basePage.javaScriptClick(linkLifeCasinoDropDown);
        }
        catch(Exception e){

        }
    }
    public void hoverToLinkLifeCasino() {
        try{
            basePage.waitElementToBeVisible(linkLifeCasinoDropDown);
            basePage.actionMoveToElement(linkLifeCasinoDropDown);
        }
        catch(Exception e){

        }
    }












    @FindBy(xpath = "//button[@class = 'global_register-btn button-style1-type-btn']")
    @CacheLookup
    WebElement signUp;
    public void clickOnSignUp(){
        basePage.waitElementToBeVisible(signUp);
        basePage.clickOnElementIfClickable(signUp);
    }
    @FindBy(xpath = "//button[@class = 'global_login-btn button-style2-type-btn']")
    @CacheLookup
    WebElement logIn;
    @FindBy(xpath = "//*[@class = 'dropdown-style1-type-Dpd']")
    @CacheLookup
    WebElement languageDropDown;
    @FindBy(xpath = "//span[text()= 'English']")
    @CacheLookup
    WebElement EnglishLanguageDropDown;

    @FindBy(xpath = "//span[text()= 'Русский']")
    @CacheLookup
    WebElement RussianLanguageDropDown;

    @FindBy(xpath = "//span[text()= 'Հայերեն']")
    @CacheLookup
    WebElement ArmenianLanguageDropDown;
    @FindBy(xpath = "//*[@class = 'icon icon-message']")
    @CacheLookup
    WebElement messageIcon;

    @FindBy(xpath = "//*[@class='user_id']")
    @CacheLookup
    WebElement UserIdLabel;

    public boolean userIdLabelIsEnabled() {
        return basePage.elementIsEnable(UserIdLabel);
    }

    public boolean userIdLabelIsDisplayed() {
        return basePage.elementIsDisplayed(UserIdLabel);
    }



    @FindBy(xpath = "//a[text() = ' Casino ']")
    @CacheLookup
    WebElement CasinoLink;

    public void clickOnHeaderCasinoLink(){
        basePage.waitElementToBeVisible(CasinoLink);
        basePage.clickOnElementIfClickable(CasinoLink);
    }


    public void clickOnLogInButtonIfVisible() {
        clickOnElementIfVisible(logIn);
    }

    public boolean checkLoginButtonEnable() {
        if (basePage.elementIsEnable(logIn)) {
            return true;
        } else {
            return false;
        }
    }

    public void clickOnLanguageDropDownIfVisible() {
        clickOnElementIfVisible(languageDropDown);
    }

    public void selectEnglishLanguageFromDropDown() {
        clickOnElementIfVisible(languageDropDown);
        clickOnElementIfVisible(EnglishLanguageDropDown);
    }
    public void selectRussianLanguageFromDropDown() {
        clickOnElementIfVisible(languageDropDown);
        clickOnElementIfVisible(RussianLanguageDropDown);
    }

    public void clickOnMessageIconIfVisible() {
        clickOnElementIfVisible(messageIcon);
    }


}



