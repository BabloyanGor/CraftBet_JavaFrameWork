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
    public void goToUrl() {
         basePage.navigateToUrl("https://craftbet.com/home");
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
    @FindBy(xpath = "//div[@class='login-section_field form_field distans-right email']//child::span")
    @CacheLookup
    WebElement loginPopUpEmailOrUsernameLabel;
    @FindBy(xpath = "//*[@name='username']")
    @CacheLookup
    WebElement loginPopUpEmailOrUsernameInput;
    @FindBy(xpath = "//div[@class='login-section_field form_field distans-right password']//child::span[@class='floating-label ']")
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
    @FindBy(xpath = "//button[@class='craft_btn login_btn -btn']")
    @CacheLookup
    WebElement loginPopUpLogInButton;
    @FindBy(xpath = "//*[@class = 'login_PSection_redirect']//child::div")
    @CacheLookup
    WebElement loginPopUpDoNotHaveAccountLabel;
    @FindBy(xpath = "//div[@class='login_PSection_redirect']//child::a")
    @CacheLookup
    WebElement loginPopUpSignUpLink;
    @FindBy(xpath = "//span[@class='login-safety-text']")
    @CacheLookup
    WebElement loginPopUpSaveAndSecureLabel;
    @FindBy(xpath = "//*[@class='error_message']")
    @CacheLookup
    WebElement loginPopUpErrorMessage;


    public String getLoginPopUpHeader() {
        try{
            return basePage.getText(loginPopUpHeader);
        }
        catch(Exception e){
            return "There is no loginPopUpHeader element";
        }
    }

    public void clickOnLoginPopUpCloseButton() {
        try{
            basePage.waitElementToBeVisible(loginPopUpCloseButton);
            basePage.clickOnElementIfClickable(loginPopUpCloseButton);
        }
        catch(Exception e){
        }
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
        try{
            return basePage.getText(loginPopUpEmailOrUsernameLabel);
        }
        catch(Exception e){
            return "There is no loginPopUpEmailOrUsernameLabel element";
        }
    }

    public void loginPopUpEmailOrUsernameSendKeys(String username) {
        try{
            basePage.sendKeysIfElementVisible(loginPopUpEmailOrUsernameInput, username);
        }
        catch(Exception e){

        }
    }
    public String getLoginPopUpPasswordLabel() {
        try{
            return basePage.getText(loginPopUpPasswordLabel);
        }
        catch(Exception e){
            return "There is no loginPopUpPasswordLabel element";
        }

    }

    public void loginPopUpPasswordSendKeys(String password) {
        try{
            basePage.sendKeysIfElementVisible(loginPopUpPasswordInput, password);
        }
        catch(Exception e){

        }
    }

    public WebElement getLoginPopUpPasswordInput() {
        return loginPopUpPasswordInput;
    }





    public String getPasswordInputTypeAttribute() {
        try{
            return basePage.getAttribute(loginPopUpPasswordInput, "type");
        }
        catch(Exception e){
            return "There is no type attribute";
        }
    }

    public String loginPopUpPasswordGetText() {
        try{
            return basePage.getText(loginPopUpPasswordInput);
        }
        catch(Exception e){
            return "There is no loginPopUpPasswordInput element";
        }

    }


    public void clickLoginPopUpEyeShowPassword() {
        try{
            basePage.waitElementToBeVisible(loginPopUpEyeShowPassword);
            basePage.clickOnElementIfClickable(loginPopUpEyeShowPassword);
        }
        catch(Exception e){
        }
    }


    public void clickLoginPopUpForgotPassword() {
        try{
            basePage.waitElementToBeVisible(loginPopUpForgotPassword);
            basePage.clickOnElementIfClickable(loginPopUpForgotPassword);
        }
        catch(Exception e){
        }
    }


    public void clickLoginPopUpRememberMeCheckbox() {
        try{
            basePage.waitElementToBeVisible(loginPopUpRememberMeCheckbox);
            basePage.clickOnElementIfClickable(loginPopUpRememberMeCheckbox);
        }
        catch(Exception e){
        }
    }

    public boolean loginPopUpRememberMeCheckboxIsSelected() {
        try{
            basePage.waitElementToBeVisible(loginPopUpRememberMeCheckbox);
            return basePage.elementIsSelected(loginPopUpRememberMeCheckbox);
        }
        catch(Exception e){
            return basePage.elementIsSelected(loginPopUpRememberMeCheckbox);
        }
    }

    public void clickLoginPopUpRememberMeLabel() {
        try{
            basePage.waitElementToBeVisible(loginPopUpRememberMeLabel);
            basePage.clickOnElementIfClickable(loginPopUpRememberMeLabel);
        }
        catch(Exception e){
        }
    }

    public String loginPopUpRememberMeLabelGetText() {
        try{
            return basePage.getText(loginPopUpRememberMeLabel);
        }
        catch(Exception e){
            return "There is no loginPopUpRememberMeLabel element";
        }
    }


    public String loginPopUpYouCanSignUpWithLabelGetText() {
        try{
            return basePage.getText(loginPopUpYouCanSignUpWithLabel);
        }
        catch(Exception e){
            return "There is no loginPopUpYouCanSignUpWithLabel element";
        }
    }

    public void clickLoginPopUpYouCanSignUpWithGoogle() {
        try{
            basePage.waitElementToBeVisible(loginPopUpYouCanSignUpWithGoogle);
            basePage.clickOnElementIfClickable(loginPopUpYouCanSignUpWithGoogle);
        }
        catch(Exception e){
        }
    }

    public void clickLoginPopUpYouCanSignUpWithFaceBook() {
        try{
            basePage.waitElementToBeVisible(loginPopUpYouCanSignUpWithFaceBook);
            basePage.clickOnElementIfClickable(loginPopUpYouCanSignUpWithFaceBook);
        }
        catch(Exception e){
        }
    }

    public void clickLoginPopUpYouCanSignUpWithTelegram() {
        try{
            basePage.waitElementToBeVisible(loginPopUpYouCanSignUpWithTelegram);
            basePage.clickOnElementIfClickable(loginPopUpYouCanSignUpWithTelegram);
        }
        catch(Exception e){
        }
    }

    public void clickLoginPopUpYouCanSignUpWithInstagram() {
        try{
            basePage.waitElementToBeVisible(loginPopUpYouCanSignUpWithInstagram);
            basePage.clickOnElementIfClickable(loginPopUpYouCanSignUpWithInstagram);
        }
        catch(Exception e){
        }
    }

    public void clickLoginPopUpLogInButton() {
        try{
            basePage.waitElementToBeVisible(loginPopUpLogInButton);
            basePage.clickOnElementIfClickable(loginPopUpLogInButton);
        }
        catch(Exception e){
        }
    }

    public boolean isClickableLoginPopUpLogInButton() {
        try{
            if (basePage.elementIsEnable(loginPopUpLogInButton)) {
                return true;
            } else {
                return false;
            }
        }
        catch (Exception e){
            if (basePage.elementIsEnable(loginPopUpLogInButton)) {
                return true;
            } else {
                return false;
            }
        }
    }


    public String loginPopUpLoginButtonGetText() {
        try{
            return basePage.getText(loginPopUpLogInButton);
        }
        catch(Exception e){
            return "There is no loginPopUpLogInButton element";
        }
    }


    public String loginPopUpDoNotHaveAccountLabelGetText() {
        try{
            return basePage.getText(loginPopUpDoNotHaveAccountLabel);
        }
        catch(Exception e){
            return "There is no loginPopUpDoNotHaveAccountLabel element";
        }
    }

    public void clickLoginPopUpSignUpLink() {
        try{
            basePage.waitElementToBeVisible(loginPopUpSignUpLink);
            basePage.clickOnElementIfClickable(loginPopUpSignUpLink);
        }
        catch(Exception e){
        }
    }

    public String loginPopUpSaveAndSecureLabelGetText() {
        try{
            return basePage.getText(loginPopUpSaveAndSecureLabel);
        }
        catch(Exception e){
            return "There is no loginPopUpSaveAndSecureLabel element";
        }
    }

    public String loginPopUpErrorMessageGetText() {
        try{
            return basePage.getText(loginPopUpErrorMessage);
        }
        catch(Exception e){
            return "There is no loginPopUpErrorMessage element";
        }
    }


}
