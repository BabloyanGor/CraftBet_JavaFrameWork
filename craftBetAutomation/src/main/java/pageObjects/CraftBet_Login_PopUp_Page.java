package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CraftBet_Login_PopUp_Page extends BasePage{
    private final BasePage basePage;

    public CraftBet_Login_PopUp_Page(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);
    }

    @FindBy(xpath = "//*[@class='login-title']")
    @CacheLookup
    WebElement loginPopUpHeader;
    public String getLoginPopUpHeader(){
        return basePage.getText(loginPopUpHeader);
    }

    @FindBy(xpath = "//*[@class='icon-close-modal']")
    @CacheLookup
    WebElement loginPopUpCloseButton;

    public void clickOnLoginPopUpCloseButton(){
        basePage.clickOnElementIfVisible(loginPopUpCloseButton);
    }

    @FindBy(xpath = "//img[@class='login-logo']")
    @CacheLookup
    WebElement loginPopUpLogo;
    public boolean LoginPopUpLogoPresense(){
        try{
            basePage.waitElementToBeVisible(loginPopUpLogo);
            return true;
        }
        catch(Exception e){
            return false;
        }

    }

    @FindBy(xpath = "//span[contains(text(),'Email/mobile or username')]")
    @CacheLookup
    WebElement loginPopUpEmailOrUsernameLabel;
    public String getLoginPopUpEmailOrUsernameLabel(){
        return basePage.getText(loginPopUpEmailOrUsernameLabel);
    }

    @FindBy(xpath = "//*[@name='username']")
    @CacheLookup
    WebElement loginPopUpEmailOrUsernameInput;
    public void loginPopUpEmailOrUsernameSendKeys(String username){
        basePage.sendKeysIfElementVisible(loginPopUpEmailOrUsernameInput,username);
    }

    @FindBy(xpath = "//span[contains(text(),'Password')]")
    @CacheLookup
    WebElement loginPopUpPasswordLabel;
    public String getLoginPopUpPasswordLabel(){
        return basePage.getText(loginPopUpPasswordLabel);
    }

    @FindBy(xpath = "//input[@formcontrolname='Password']")
    @CacheLookup
    WebElement loginPopUpPasswordInput;

    public void loginPopUpPasswordSendKeys(String password){
        basePage.sendKeysIfElementVisible(loginPopUpPasswordInput,password);
    }
    public String loginPopUpPasswordGetText(){
        return basePage.getText(loginPopUpPasswordInput);
    }

    @FindBy(xpath = "//span[@class='icon-eye-password-close']")
    @CacheLookup
    WebElement loginPopUpEyeShowPassword;
    public void clickLoginPopUpEyeShowPassword(){
        basePage.clickOnElementIfVisible(loginPopUpEyeShowPassword);
    }


    @FindBy(xpath = "//a[@class='forgot_password login-section-forgot_password']")
    @CacheLookup
    WebElement loginPopUpForgotPassword;

    public void clickLoginPopUpForgotPassword(){
        basePage.clickOnElementIfVisible(loginPopUpForgotPassword);
    }

    @FindBy(xpath = "//input[@id='remeberMe']")
    @CacheLookup
    WebElement loginPopUpRememberMeCheckbox;
    public void clickLoginPopUpRememberMeCheckbox(){
        basePage.clickOnElementIfVisible(loginPopUpRememberMeCheckbox);
    }

    @FindBy(xpath = "//label[@class='reg-conditions']")
    @CacheLookup
    WebElement loginPopUpRememberMeLabel;

    public void clickLoginPopUpRememberMeLabel(){
        basePage.clickOnElementIfVisible(loginPopUpRememberMeLabel);
    }
    public String loginPopUpRememberMeLabelGetText(){
        return basePage.getText(loginPopUpRememberMeLabel);
    }

    @FindBy(xpath = "//*[@class='social-login-text']")
    @CacheLookup
    WebElement loginPopUpYouCanSignUpWithLabel;
    public String loginPopUpYouCanSignUpWithLabelGetText(){
        return basePage.getText(loginPopUpYouCanSignUpWithLabel);
    }

    @FindBy(xpath = "/html/body/app-root/simple-modal-holder/simple-modal-wrapper/div/app-app-confirm/div/div[2]/div/app-login/div/form/ul/li[2]")
    @CacheLookup
    WebElement loginPopUpYouCanSignUpWithGoogle;
    public void clickLoginPopUpYouCanSignUpWithGoogle(){
        basePage.clickOnElementIfVisible(loginPopUpYouCanSignUpWithGoogle);
    }
    @FindBy(xpath = "/html/body/app-root/simple-modal-holder/simple-modal-wrapper/div/app-app-confirm/div/div[2]/div/app-login/div/form/ul/li[1]")
    @CacheLookup
    WebElement loginPopUpYouCanSignUpWithFaceBook;
    public void clickLoginPopUpYouCanSignUpWithFaceBook(){
        basePage.clickOnElementIfVisible(loginPopUpYouCanSignUpWithFaceBook);
    }
    @FindBy(xpath = "/html/body/app-root/simple-modal-holder/simple-modal-wrapper/div/app-app-confirm/div/div[2]/div/app-login/div/form/ul/li[3]")
    @CacheLookup
    WebElement loginPopUpYouCanSignUpWithTelegram;
    public void clickLoginPopUpYouCanSignUpWithTelegram(){
        basePage.clickOnElementIfVisible(loginPopUpYouCanSignUpWithTelegram);
    }
    @FindBy(xpath = "/html/body/app-root/simple-modal-holder/simple-modal-wrapper/div/app-app-confirm/div/div[2]/div/app-login/div/form/ul/li[4]")
    @CacheLookup
    WebElement loginPopUpYouCanSignUpWithInstagram;
    public void clickLoginPopUpYouCanSignUpWithInstagram(){
        basePage.clickOnElementIfVisible(loginPopUpYouCanSignUpWithInstagram);
    }


    @FindBy(xpath = "//button[@class='craft_btn login_btn -btn not_active']")
    @CacheLookup
    WebElement loginPopUpLogInButton;
    public void clickLoginPopUpLogInButton(){
        basePage.clickOnElementIfVisible(loginPopUpLogInButton);
    }
    public boolean isClickableLoginPopUpLogInButton(){
        if (basePage.elementIsEnable(loginPopUpLogInButton)){
            return true;
        }
        else {
            return false;
        }

    }

    @FindBy(xpath = "//*[contains(text(),'have an account')]")
    @CacheLookup
    WebElement loginPopUpDoNotHaveAccountLabel;
    public String loginPopUpDoNotHaveAccountLabelGetText(){
        return basePage.getText(loginPopUpDoNotHaveAccountLabel);
    }

    @FindBy(xpath = "//a[contains(text(),'Sign Up')]")
    @CacheLookup
    WebElement loginPopUpSignUpLink;
    public void clickLoginPopUpSignUpLink(){
        basePage.clickOnElementIfVisible(loginPopUpSignUpLink);
    }

    @FindBy(xpath = "//span[@class='login-safety-text']")
    @CacheLookup
    WebElement loginPopUpSaveAndSecureLabel;

    public String loginPopUpSaveAndSecureLabelGetText(){
        return basePage.getText(loginPopUpSaveAndSecureLabel);
    }



}
