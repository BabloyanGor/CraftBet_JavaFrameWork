package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CraftBet_Header_Page extends BasePage {

    private final BasePage basePage;


    public CraftBet_Header_Page(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);
    }

    @FindBy(xpath = "//button[@class = 'global_register-btn button-style1-type-btn']")
    @CacheLookup
    WebElement signUp;

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

    @FindBy(xpath = "//div[@class='header-section_topPanel_left']")
    @CacheLookup
    WebElement logo;

    public void clickOnSignInButtonIfVisible(){
        clickOnElementIfVisible(signUp);
    }
    public void clickOnLogInButtonIfVisible(){
        clickOnElementIfVisible(logIn);
    }

    public void clickOnLanguageDropDownIfVisible(){
        clickOnElementIfVisible(languageDropDown);
    }

    public void selectEnglishLanguageFromDropDown(){
        clickOnElementIfVisible(languageDropDown);
        clickOnElementIfVisible(EnglishLanguageDropDown);
    }
    public void clickOnMessageIconIfVisible(){
        clickOnElementIfVisible(messageIcon);
    }


    public void clickOnLogoIfVisible(){
        clickOnElementIfVisible(logo);
    }


}
