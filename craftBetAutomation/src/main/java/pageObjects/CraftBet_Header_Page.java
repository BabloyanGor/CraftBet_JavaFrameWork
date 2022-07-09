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

    @FindBy(xpath = "//*[@class='user_id']")
    @CacheLookup
    WebElement UserIdLabel;

    public boolean userIdLabelIsEnabled() {
        return basePage.elementIsEnable(UserIdLabel);
    }

    public boolean userIdLabelIsDisplayed() {
        return basePage.elementIsDisplayed(UserIdLabel);
    }

    @FindBy(xpath = "//div[@class='header-section_topPanel_left']")
    @CacheLookup
    WebElement logo;

    @FindBy(xpath = "//a[text() = ' Casino ']")
    @CacheLookup
    WebElement CasinoLink;

    public void clickOnHeaderCasinoLink(){
        basePage.waitElementToBeVisible(CasinoLink);
        basePage.clickOnElementIfClickable(CasinoLink);
    }

    public void clickOnSignInButtonIfVisible() {
        clickOnElementIfVisible(signUp);
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

    public void clickOnLogoIfVisible() {
        clickOnElementIfVisible(logo);
    }
}
