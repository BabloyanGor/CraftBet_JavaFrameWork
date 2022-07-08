package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CraftBet_PasswordRecovery_Page extends BasePage{
    private final BasePage basePage;
    public CraftBet_PasswordRecovery_Page(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);
    }



    @FindBy(xpath = "//div[@class='forgot-password-section_content']//child::h2")
    @CacheLookup
    WebElement passwordRecoveryPageTitle;

    public String getTitleText(){
        try{
            return basePage.getText(passwordRecoveryPageTitle);
        }
        catch(Exception e){
            return "There is no passwordRecoveryPageTitle element ";
        }

    }

    @FindBy(xpath = "//img[@class='recovery-logo']")
    @CacheLookup
    WebElement passwordRecoveryPageLogo;

    public boolean logoExistenceVerification(){
        try{
            basePage.waitElementToBeVisible(passwordRecoveryPageLogo);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
    @FindBy(xpath = "//form[@class='ng-pristine ng-invalid ng-touched']//child::label")
    @CacheLookup
    WebElement emailInputsLabel;
    public String getEmailInputsLabel(){
        try{
            basePage.waitElementToBeVisible(emailInputsLabel);
            return basePage.getText(emailInputsLabel);
        }
        catch (Exception e){
            return "There is no emailInputsLabel element";
        }
    }

    @FindBy(xpath = "//input[@formcontrolname='fEmail']")
    @CacheLookup
    WebElement emailPhoneInput;
    public void sendKeysToEmailPhoneInput(String text){
        try{
            basePage.sendKeysIfElementVisible(emailPhoneInput,text);
        }
        catch (Exception e){
        }
    }

    @FindBy(xpath = "//div[@class='form_row number-info']")
    @CacheLookup
    WebElement formLabelInfo;
    public String getFormLabelInfo(){
        try{
            basePage.waitElementToBeVisible(formLabelInfo);
            return basePage.getText(formLabelInfo);
        }
        catch (Exception e){
            return "There is no formLabelInfo element";
        }
    }

    @FindBy(xpath = "//div[@class='help_block']//child::p")
    @CacheLookup
    WebElement helpBlockLabel;
    public String getHelpBlockLabel(){
        try{
            basePage.waitElementToBeVisible(helpBlockLabel);
            return basePage.getText(helpBlockLabel);
        }
        catch (Exception e){
            return "There is no helpBlockLabel element";
        }
    }

    @FindBy(xpath = "//a[@class='support']")
    @CacheLookup
    WebElement supportLink;
    public void clickOnSupportLink(){
        try{
            basePage.waitElementToBeVisible(supportLink);
            basePage.clickOnElementIfClickable(supportLink);
        }
        catch (Exception e){
        }
    }

    @FindBy(xpath = "//button[@class='recovery-btn bg_recovery craft_btn']")
    @CacheLookup
    WebElement sendMeRecoveryButton;
    public void clickOnSendMeRecoveryButton(){
        try{
            basePage.waitElementToBeVisible(sendMeRecoveryButton);
            basePage.clickOnElementIfClickable(sendMeRecoveryButton);
        }
        catch (Exception e){
        }
    }


}
