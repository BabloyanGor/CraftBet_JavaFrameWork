package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CraftBet_Login_PopUp_Page extends BasePage {
    private final BasePage basePage;

    public CraftBet_Login_PopUp_Page(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);
    }

    public String getCurrentUrl() {
        return basePage.getUrl();
    }

    @FindBy(xpath = "//*[@class='login-title']")
    @CacheLookup
    WebElement loginPopUpHeader;
    @FindBy(xpath = "//*[@class='icon-close-modal']")
    @CacheLookup
    WebElement loginPopUpCloseButton;
    @FindBy(xpath = "//img[@class='login-logo']")
    @CacheLookup
    WebElement loginPopUpLogo;
    @FindBy(xpath = "//span[contains(text(),'Email/mobile or username')]")
    @CacheLookup
    WebElement loginPopUpEmailOrUsernameLabel;
    @FindBy(xpath = "//*[@name='username']")
    @CacheLookup
    WebElement loginPopUpEmailOrUsernameInput;
    @FindBy(xpath = "//span[contains(text(),'Password')]")
    @CacheLookup
    WebElement loginPopUpPasswordLabel;
    @FindBy(xpath = "//input[@formcontrolname='Password']")
    @CacheLookup
    WebElement loginPopUpPasswordInput;
    @FindBy(xpath = "//span[@class='icon-eye-password-close']")
    @CacheLookup
    WebElement loginPopUpEyeShowPassword;
    @FindBy(xpath = "//a[@class='forgot_password login-section-forgot_password']")
    @CacheLookup
    WebElement loginPopUpForgotPassword;
    @FindBy(xpath = "//input[@id='remeberMe']")
    @CacheLookup
    WebElement loginPopUpRememberMeCheckbox;
    @FindBy(xpath = "//label[@class='reg-conditions']")
    @CacheLookup
    WebElement loginPopUpRememberMeLabel;
    @FindBy(xpath = "//*[@class='social-login-text']")
    @CacheLookup
    WebElement loginPopUpYouCanSignUpWithLabel;
    @FindBy(xpath = "/html/body/app-root/simple-modal-holder/simple-modal-wrapper/div/app-app-confirm/div/div[2]/div/app-login/div/form/ul/li[2]")
    @CacheLookup
    WebElement loginPopUpYouCanSignUpWithGoogle;
    @FindBy(xpath = "/html/body/app-root/simple-modal-holder/simple-modal-wrapper/div/app-app-confirm/div/div[2]/div/app-login/div/form/ul/li[1]")
    @CacheLookup
    WebElement loginPopUpYouCanSignUpWithFaceBook;
    @FindBy(xpath = "/html/body/app-root/simple-modal-holder/simple-modal-wrapper/div/app-app-confirm/div/div[2]/div/app-login/div/form/ul/li[3]")
    @CacheLookup
    WebElement loginPopUpYouCanSignUpWithTelegram;
    @FindBy(xpath = "/html/body/app-root/simple-modal-holder/simple-modal-wrapper/div/app-app-confirm/div/div[2]/div/app-login/div/form/ul/li[4]")
    @CacheLookup
    WebElement loginPopUpYouCanSignUpWithInstagram;
    @FindBy(xpath = "//button[contains(text(),' Log In ') and @type='submit']")
    @CacheLookup
    WebElement loginPopUpLogInButton;
    @FindBy(xpath = "//*[contains(text(),'have an account')]")
    @CacheLookup
    WebElement loginPopUpDoNotHaveAccountLabel;
    @FindBy(xpath = "//a[contains(text(),'Sign Up')]")
    @CacheLookup
    WebElement loginPopUpSignUpLink;
    @FindBy(xpath = "//span[@class='login-safety-text']")
    @CacheLookup
    WebElement loginPopUpSaveAndSecureLabel;
    @FindBy(xpath = "//*[@class='error_message']")
    @CacheLookup
    WebElement loginPopUpErrorMessage;

    public String getLoginPopUpHeader() {
        return basePage.getText(loginPopUpHeader);
    }

    public void clickOnLoginPopUpCloseButton() {
        basePage.clickOnElementIfVisible(loginPopUpCloseButton);
    }

    public boolean loginPopUpLogoPresence() {
        try {
            basePage.waitElementToBeVisible(loginPopUpLogo);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public String getLoginPopUpEmailOrUsernameLabel() {
        return basePage.getText(loginPopUpEmailOrUsernameLabel);
    }

    public void loginPopUpEmailOrUsernameSendKeys(String username) {
        basePage.sendKeysIfElementVisible(loginPopUpEmailOrUsernameInput, username);
    }

    public String getLoginPopUpPasswordLabel() {
        return basePage.getText(loginPopUpPasswordLabel);
    }

    public void loginPopUpPasswordSendKeys(String password) {
        basePage.sendKeysIfElementVisible(loginPopUpPasswordInput, password);
    }

    public WebElement getLoginPopUpPasswordInput() {
        return loginPopUpPasswordInput;
    }

    public String getPasswordInputTypeAttribute() {
        return basePage.getAttribute(loginPopUpPasswordInput, "type");
    }

    public String loginPopUpPasswordGetText() {
        return basePage.getText(loginPopUpPasswordInput);
    }


    public void clickLoginPopUpEyeShowPassword() {
        basePage.clickOnElementIfVisible(loginPopUpEyeShowPassword);
    }


    public void clickLoginPopUpForgotPassword() {
        basePage.clickOnElementIfVisible(loginPopUpForgotPassword);
    }


    public void clickLoginPopUpRememberMeCheckbox() {
        basePage.clickOnElementIfVisible(loginPopUpRememberMeCheckbox);
    }

    public boolean loginPopUpRememberMeCheckboxIsSelected() {
        return basePage.elementIsSelected(loginPopUpRememberMeCheckbox);
    }

    public void clickLoginPopUpRememberMeLabel() {
        basePage.clickOnElementIfVisible(loginPopUpRememberMeLabel);
    }

    public String loginPopUpRememberMeLabelGetText() {
        return basePage.getText(loginPopUpRememberMeLabel);
    }


    public String loginPopUpYouCanSignUpWithLabelGetText() {
        return basePage.getText(loginPopUpYouCanSignUpWithLabel);
    }

    public void clickLoginPopUpYouCanSignUpWithGoogle() {
        basePage.clickOnElementIfVisible(loginPopUpYouCanSignUpWithGoogle);
    }

    public void clickLoginPopUpYouCanSignUpWithFaceBook() {
        basePage.clickOnElementIfVisible(loginPopUpYouCanSignUpWithFaceBook);
    }

    public void clickLoginPopUpYouCanSignUpWithTelegram() {
        basePage.clickOnElementIfVisible(loginPopUpYouCanSignUpWithTelegram);
    }

    public void clickLoginPopUpYouCanSignUpWithInstagram() {
        basePage.clickOnElementIfVisible(loginPopUpYouCanSignUpWithInstagram);
    }

    public void clickLoginPopUpLogInButton() {
        basePage.clickOnElementIfClickable(loginPopUpLogInButton);
    }

    public boolean isClickableLoginPopUpLogInButton() {
        if (basePage.elementIsEnable(loginPopUpLogInButton)) {
            return true;
        } else {
            return false;
        }

    }

    public String loginPopUpDoNotHaveAccountLabelGetText() {
        return basePage.getText(loginPopUpDoNotHaveAccountLabel);
    }

    public void clickLoginPopUpSignUpLink() {
        basePage.clickOnElementIfVisible(loginPopUpSignUpLink);
    }

    public String loginPopUpSaveAndSecureLabelGetText() {
        return basePage.getText(loginPopUpSaveAndSecureLabel);
    }

    public String loginPopUpErrorMessageGetText() {
        return basePage.getText(loginPopUpErrorMessage);
    }


}
