package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CraftBet_SignUp_PopUp_Page extends BasePage {
//    public CraftBet_SignUp_PopUp_Page( ) {
//
//    }
    private final BasePage basePage;

    public CraftBet_SignUp_PopUp_Page(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);
    }

    @FindBy(xpath = "//a[@class='reg_item active']")
    @CacheLookup
    WebElement logo;

    public boolean logoPresence() {
        try {
            basePage.waitElementToBeVisible(logo);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @FindBy(xpath = "//div[@class='register-background']")
    @CacheLookup
    WebElement BackgroundPhoto;

    public boolean BackgroundPhotoPresence() {
        try {
            basePage.waitElementToBeVisible(BackgroundPhoto);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    @FindBy(xpath = "//div[@class='reg-prompt-text']")
    @CacheLookup
    WebElement labelPleaseFill;

    public String getTextLabelPleaseFill() {
        try {
            return basePage.getText(labelPleaseFill);
        } catch (Exception e) {
            return "Cant find element labelPleaseFill";
        }
    }

    @FindBy(xpath = "//button[text()='Quick Register']")
    @CacheLookup
    WebElement buttonQuickRegistration;
    @FindBy(xpath = "//button[text()='Full Register']")
    @CacheLookup
    WebElement buttonFullRegistration;
//    public String getTextButtonSwitchQuickFullRegistration() {
//        try {
//            return basePage.getText(buttonSwitchQuickFullRegistration);
//        } catch (Exception e) {
//            return "Cant find element buttonSwitchQuickFullRegistration";
//        }
//    }

    public void clickOnButtonFullRegistration() {
        try{
            basePage.waitElementToBeVisible(buttonFullRegistration);
            basePage.javaScriptClick(buttonFullRegistration);
        }
        catch (Exception e){

        }
    }
    public void clickOnButtonQuickRegistration() {
        try{
            basePage.waitElementToBeVisible(buttonQuickRegistration);
            basePage.javaScriptClick(buttonQuickRegistration);
        }
        catch (Exception e){

        }
    }


    @FindBy(xpath = "//div[@class='social-register-text']")
    @CacheLookup
    WebElement labelThisSiteProtected;

    public String getTextLabelThisSiteProtected() {
        try {
            return basePage.getText(labelThisSiteProtected);
        } catch (Exception e) {
            return "Cant find element labelThisSiteProtected";
        }
    }

    @FindBy(xpath = "//div[@class='safety-info_text']//a")
    @CacheLookup
    WebElement labelSafeAndSecure;

    public String getTextLabelSafeAndSecure() {
        try {
            return basePage.getText(labelSafeAndSecure);
        } catch (Exception e) {
            return "Cant find element labelSafeAndSecure";
        }
    }

    @FindBy(xpath = "//a[@class='reg_item active']")
    @CacheLookup
    WebElement titleQ;
    @FindBy(xpath = "//a[@class='reg_item disabled']")
    @CacheLookup
    WebElement titleF;
    public String getTitleQ() {
        try {
            basePage.waitElementToBeVisible(titleQ);
            return basePage.getText(titleQ);
        } catch (Exception e) {
            return "Cant find element titleQ";
        }
    }


    @FindBy(xpath = "//span[@class='icon-close-modal']")
    @CacheLookup
    WebElement closeXButton;

    public void clickOnButtonCloseXButton() {
        basePage.waitElementToBeVisible(closeXButton);
        basePage.javaScriptClick(closeXButton);
    }


    @FindBy(xpath = "//div[@class='form_field']//label[text()='Register By']")
    @CacheLookup
    WebElement labelEmailMobileDropDownQ;

    public String getTextLabelEmailMobileDropDownQ() {
        try {
            return basePage.getText(labelEmailMobileDropDownQ);
        } catch (Exception e) {
            return "Cant find element labelEmailMobileDropDownQ";
        }
    }

    @FindBy(xpath = "//select[@class='custom_dropdown_reg']")
    @CacheLookup
    WebElement emailMobileDropDownQ;

    public void selectEmailMobileDropDownQ(String text) {
        try {
            basePage.waitElementToBeVisible(emailMobileDropDownQ);
            basePage.selectFromDropDownByVisibleText(emailMobileDropDownQ, text);
        } catch (Exception e) {

        }
    }
    public String getTextEmailMobileDropDownQ() {
        try {
            return basePage.getSelectedItemText(basePage.createSelectElement(emailMobileDropDownQ));
        } catch (Exception e) {
            return "Cant find element currencyDropDownQ";
        }
    }


    @FindBy(xpath = "//div[@class='form_field']//label[text()='Email']")
    @CacheLookup
    WebElement labelEmailInputQ;

    public String getTextLabelEmailInputQ() {
        try {
            return basePage.getText(labelEmailInputQ);
        } catch (Exception e) {
            return "Cant find element labelEmailInputQ";
        }
    }

    @FindBy(xpath = "//input[@placeholder='Email']")
    @CacheLookup
    WebElement emailInputQ;

    public void sendKeysEmailInputQ(String email) {
        try {
            basePage.sendKeysIfElementVisible(emailInputQ, email);
        } catch (Exception e) {

        }
    }

    @FindBy(xpath = "//div[@class='form_field']//label[text()='Mobile']")
    @CacheLookup
    WebElement labelMobileInputQ;

    public String getTextLabelMobileInputQ() {
        try {
            return basePage.getText(labelMobileInputQ);
        } catch (Exception e) {
            return "Cant find element labelMobileInputQ";
        }
    }

    @FindBy(xpath = "//div[@class='flex_between current_item']")
    @CacheLookup
    WebElement mobileDropDownQ;
    @FindBy(xpath = "//span[text()=' AM (+374)']")
    @CacheLookup
    WebElement mobileArm;

    public void clickOnMobileArmQ() {
        basePage.waitElementToBeVisible(mobileArm);
        basePage.javaScriptClick(mobileArm);
    }
    public void clickOnMobileDropDownQ() {
        basePage.waitElementToBeVisible(mobileDropDownQ);
        basePage.javaScriptClick(mobileDropDownQ);
    }


    public void SelectFromMobileDropDownByVisibleTextQ(String text) {
        try {
            basePage.waitElementToBeVisible(mobileDropDownQ);
            basePage.selectFromDropDownByVisibleText(mobileDropDownQ, text);
        } catch (Exception e) {

        }
    }

    public void SelectFromMobileDropDownByIndexQ(int index) { //index starts from 0
        try {
            basePage.waitElementToBeVisible(mobileDropDownQ);
            basePage.selectFromDropDownByIndex(mobileDropDownQ, index);
        } catch (Exception e) {

        }
    }
    public String getTextFromMobileDropDownQ() {
        try {
            return basePage.getSelectedItemText(basePage.createSelectElement(mobileDropDownQ));
        } catch (Exception e) {
            return "Cant find element currencyDropDownQ";
        }
    }


    @FindBy(xpath = "//div[@class='flex_between current_item']//div//img")
    @CacheLookup
    WebElement mobileDropDownFlagQ;

    public void SelectFromMobileDropDownQ() {
        try {
            basePage.waitElementToBeVisible(mobileDropDownFlagQ);
        } catch (Exception e) {

        }
    }

    @FindBy(xpath = "//div[@class='mobileData_tabs']//input")
    @CacheLookup
    WebElement mobileInputQ;

    public void sendKeysMobileInputQ(String number) {
        try {
            basePage.sendKeysIfElementVisible(mobileInputQ, number);
        } catch (Exception e) {

        }
    }

    @FindBy(xpath = "//div[@class='form_field']//label[text()='Currency']")
    @CacheLookup
    WebElement labelCurrencyDropDownQ;



    public String getTextLabelCurrencyDropDownQ() {
        try {
            return basePage.getText(labelCurrencyDropDownQ);
        } catch (Exception e) {
            return "Cant find element labelCurrencyDropDownQ";
        }
    }

    @FindBy(xpath = "//label[text()='Currency']//following::select")
    @CacheLookup
    WebElement currencyDropDownQ;

    public void selectFromCurrencyDropDownByVisibleTextQ(String text) {
        try {
            basePage.waitElementToBeVisible(currencyDropDownQ);
            basePage.selectFromDropDownByVisibleText(currencyDropDownQ, text);
        } catch (Exception e) {

        }
    }
    public String getTextFromCurrencyDropDownQ() {
        try {
            return basePage.getSelectedItemText(basePage.createSelectElement(currencyDropDownQ));
        } catch (Exception e) {
            return "Cant find element currencyDropDownQ";
        }
    }

    public void clickOnCurrencyDropDownQ() {
        try {
            basePage.waitElementToBeVisible(currencyDropDownQ);
            basePage.javaScriptClick(currencyDropDownQ);
        } catch (Exception e) {

        }
    }


    @FindBy(xpath = "//span[@class='reg-conditions']")
    @CacheLookup
    WebElement labelTermsConditionsQ;

    public String getTextLabelTermsConditionsQ() {
        try {
            return basePage.getText(labelTermsConditionsQ);
        } catch (Exception e) {
            return "Cant find element labelTermsConditionsQ";
        }
    }

    @FindBy(xpath = "//span[@class='reg-conditions']//a")
    @CacheLookup
    WebElement linkTermsConditionsQ;

    public void clickOnLinkTermsConditionsQ() {
        try {
            basePage.waitElementToBeVisible(linkTermsConditionsQ);
            basePage.javaScriptClick(linkTermsConditionsQ);
        } catch (Exception e) {

        }
    }

    @FindBy(xpath = "//input[@id='acceptTerms']")
    @CacheLookup
    WebElement checkBoxTermsConditionsQ;

    public void clickOnCheckBoxTermsConditionsQ() {
        try {
            basePage.waitElementToBeVisible(checkBoxTermsConditionsQ);
            basePage.javaScriptClick(checkBoxTermsConditionsQ);
        } catch (Exception e) {

        }
    }

    @FindBy(xpath = "//div[@class='reg-step-navigate-buttons flex-center']//button")
    @CacheLookup
    WebElement buttonRegisterQ;

    public String getTextButtonRegisterQ() {
        try {
            return basePage.getText(buttonRegisterQ);
        } catch (Exception e) {
            return "Cant find element buttonRegisterQ";
        }
    }

    public void clickOnButtonRegisterQ() {
        try {
            basePage.waitElementToBeVisible(buttonRegisterQ);
            basePage.javaScriptClick(buttonRegisterQ);
        } catch (Exception e) {

        }
    }

    public String  getAttributeClassButtonRegisterQ() {
        try {
            return basePage.getAttribute(buttonRegisterQ,"class");

        } catch (Exception e) {
            return "Cant find element buttonRegisterQ";
        }
    }

    @FindBy(xpath = "//div[@class='error_message register_error_message']")
    @CacheLookup
    WebElement errorMessage;
    public String getTextErrorMessage() {
        try {
            return basePage.getText(errorMessage);
        } catch (Exception e) {
            return "Cant find element errorMessage";
        }
    }

    @FindBy(xpath = "//div[@class='register_PSection_redirect']")
    @CacheLookup
    WebElement labelAlreadyHaveAnAccount;

    public String getTextLabelAlreadyHaveAnAccount() {
        try {
            return basePage.getText(labelAlreadyHaveAnAccount);
        } catch (Exception e) {
            return "Cant find element labelAlreadyHaveAnAccount";
        }
    }

    @FindBy(xpath = "//div[@class='register_PSection_redirect']//a")
    @CacheLookup
    WebElement linkLogIn;

    public void clickOnLinkLogIn() {
        try {
            basePage.waitElementToBeVisible(linkLogIn);
            basePage.javaScriptClick(linkLogIn);
        } catch (Exception e) {

        }
    }


    // full registration

    // first page

    @FindBy(xpath = "//select[@class='custom_dropdown_reg ng-pristine ng-valid ng-touched']")
    @CacheLookup
    WebElement genderDropDownF;

    public void SelectFromGenderDropDownF(String text) {
        try {
            basePage.waitElementToBeVisible(genderDropDownF);
            basePage.selectFromDropDownByVisibleText(genderDropDownF, text);
        } catch (Exception e) {

        }
    }

    public String getPlaceHolder() {
        try {
            basePage.waitElementToBeVisible(genderDropDownF);
            return basePage.getAttribute(genderDropDownF, "placeholder");

        } catch (Exception e) {
            return "Cant find element or Attribute genderDropDownF/PlaceHolder";
        }
    }

    @FindBy(xpath = "//label[text()='First name']")
    @CacheLookup
    WebElement labelFirstNameF;

    public String getTextLabelFirstName() {
        try {
            return basePage.getText(labelFirstNameF);
        } catch (Exception e) {
            return "Cant find element labelFirstName";
        }
    }

    @FindBy(xpath = "//input[@placeholder='First name']")
    @CacheLookup
    WebElement inputFirstNameF;

    public void sendKeysInputFirstNameF(String firstName) {
        try {
            basePage.sendKeysIfElementVisible(inputFirstNameF, firstName);
        } catch (Exception e) {

        }
    }

    @FindBy(xpath = "//label[text()='Last name']")
    @CacheLookup
    WebElement labelLastName;

    public String getTextLabelLastName() {
        try {
            return basePage.getText(labelLastName);
        } catch (Exception e) {
            return "Cant find element labelLastName";
        }
    }

    @FindBy(xpath = "//input[@placeholder='Last name']")
    @CacheLookup
    WebElement inputLastNameF;

    public void sendKeysInputLastNameF(String lastName) {
        try {
            basePage.sendKeysIfElementVisible(inputLastNameF, lastName);
        } catch (Exception e) {

        }
    }


    @FindBy(xpath = "//label[text()='Mobile Number']")
    @CacheLookup
    WebElement labelMobileNumber;

    public String getTextLabelMobileNumber() {
        try {
            return basePage.getText(labelMobileNumber);
        } catch (Exception e) {
            return "Cant find element labelMobileNumber";
        }
    }

    @FindBy(xpath = "//div[@class='flex_between current_item']")
    @CacheLookup
    WebElement dropDownMobileNumberF;

    public void SelectFromDropDownMobileNumberByValueF(String text) {
        try {
            basePage.waitElementToBeVisible(dropDownMobileNumberF);
            basePage.selectFromDropDownByVisibleText(dropDownMobileNumberF, text);
        } catch (Exception e) {

        }
    }

    public void SelectFromDropDownMobileNumberByIndexF(int index) {
        try {
            basePage.waitElementToBeVisible(dropDownMobileNumberF);
            basePage.selectFromDropDownByIndex(dropDownMobileNumberF, index);
        } catch (Exception e) {

        }
    }


    @FindBy(xpath = "//input[@placeholder='00 00 00 00']")
    @CacheLookup
    WebElement inputNumberF;

    public void sendKeysInputNumberF(String number) {
        try {
            basePage.sendKeysIfElementVisible(inputNumberF, number);
        } catch (Exception e) {

        }
    }

    public String getTextInputNumberF() {
        try {
            return basePage.getText(inputNumberF);
        } catch (Exception e) {
            return "Cant find element inputNumberF";
        }
    }


    @FindBy(xpath = "//label[text()='Birth Day']")
    @CacheLookup
    WebElement labelBirthDayF;

    public String getTextLabelBirthDyF() {
        try {
            return basePage.getText(labelBirthDayF);
        } catch (Exception e) {
            return "Cant find element labelBirthDayF";
        }
    }



    @FindBy(xpath = "//select[@class='custom_dropdown_reg ng-pristine ng-invalid invalid-filed ng-touched']")
    @CacheLookup
    WebElement dropDownYearF;

    public void SelectFromDropDownYearByVisibleTextF(String text) {
        try {
            basePage.waitElementToBeVisible(dropDownYearF);
            basePage.selectFromDropDownByVisibleText(dropDownYearF, text);
        } catch (Exception e) {

        }
    }

    public void SelectFromDropDownYearByIndexF(int index) {
        try {
            basePage.waitElementToBeVisible(dropDownYearF);
            basePage.selectFromDropDownByIndex(dropDownYearF, index);
        } catch (Exception e) {

        }
    }

    @FindBy(xpath = "//select[@id='birth-month']")
    @CacheLookup
    WebElement dropDownMonthF;

    public void SelectFromDropDownMonthFByVisibleTextF(String text) {
        try {
            basePage.waitElementToBeVisible(dropDownMonthF);
            basePage.selectFromDropDownByVisibleText(dropDownMonthF, text);
        } catch (Exception e) {

        }
    }

    public void SelectFromDropDownMonthFByIndexF(int index) {
        try {
            basePage.waitElementToBeVisible(dropDownMonthF);
            basePage.selectFromDropDownByIndex(dropDownMonthF, index);
        } catch (Exception e) {

        }
    }

    @FindBy(xpath = "//select[@class='disable-item ng-untouched ng-pristine ng-invalid']")
    @CacheLookup
    WebElement dropDownDayF;

    public void SelectFromDropDownDayFByVisibleTextF(String text) {
        try {
            basePage.waitElementToBeVisible(dropDownDayF);
            basePage.selectFromDropDownByVisibleText(dropDownDayF, text);
        } catch (Exception e) {

        }
    }

    public void SelectFromDropDownDayFByIndexF(int index) {
        try {
            basePage.waitElementToBeVisible(dropDownDayF);
            basePage.selectFromDropDownByIndex(dropDownDayF, index);
        } catch (Exception e) {

        }
    }

    @FindBy(xpath = "//div[@class='reg-step-navigate-buttons flex-end']//button")
    @CacheLookup
    WebElement buttonContinueFirstF;


    public void clickOnButtonContinueF() {
        try {
            basePage.waitElementToBeVisible(buttonContinueFirstF);
            basePage.javaScriptClick(buttonContinueFirstF);
        } catch (Exception e) {

        }
    }
    public  String getAttributeButtonContinueF(){
        try {
            basePage.waitElementToBeVisible(buttonContinueFirstF);
           return basePage.getAttribute(buttonContinueFirstF,"class");
        } catch (Exception e) {
            return "Cant find element/Attribute buttonContinueF";
        }
        // craft_btn next-btn not_active ---->Not Active
        // craft_btn next-btn            ---->Active
    }





// Second Page

    @FindBy(xpath = "//span[@class='icon-arrow-to-left']")
    @CacheLookup
    WebElement arrowBackLeftF;
    public void clickOnArrowBackLeftF() {
        try {
            basePage.waitElementToBeVisible(arrowBackLeftF);
            basePage.javaScriptClick(arrowBackLeftF);
        } catch (Exception e) {

        }
    }
    @FindBy(xpath = "//a[@class='reg_item active go_back']")
    @CacheLookup
    WebElement labelGoBackF;
    public String getTextLabelGoBackF() {
        try {
            return basePage.getText(labelGoBackF);
        } catch (Exception e) {
            return "Cant find element labelGoBackF";
        }
    }
    public void clickOnLabelGoBackF() {
        try {
            basePage.waitElementToBeVisible(labelGoBackF);
            basePage.javaScriptClick(labelGoBackF);
        } catch (Exception e) {

        }
    }
    @FindBy(xpath = "//div[@class='form_field form_field__Region2']//label")
    @CacheLookup
    WebElement labelDropDownCountryF;

    public String getTextLabelDropDownCountryF() {
        try {
            return basePage.getText(labelDropDownCountryF);
        } catch (Exception e) {
            return "Cant find element labelDropDownCountryF";
        }
    }

    @FindBy(xpath = "//select[@class='custom_dropdown_reg ng-pristine ng-valid ng-touched']")
    @CacheLookup
    WebElement dropDownCountryF;

    public void SelectFromDropDownDropDownCountryFByVisibleText(String text) {
        try {
            basePage.waitElementToBeVisible(dropDownCountryF);
            basePage.selectFromDropDownByVisibleText(dropDownCountryF, text);
        } catch (Exception e) {

        }
    }

    public void SelectFromDropDownDropDownCountryFIndex(int index) {
        try {
            basePage.waitElementToBeVisible(dropDownCountryF);
            basePage.selectFromDropDownByIndex(dropDownCountryF, index);
        } catch (Exception e) {

        }
    }

    @FindBy(xpath = "//select[@class='custom_dropdown_reg disable-item ng-untouched ng-pristine ng-valid']")
    @CacheLookup
    WebElement dropDownCityF;

    public void SelectFromDropDownCityFByVisibleText(String text) {
        try {
            basePage.waitElementToBeVisible(dropDownCityF);
            basePage.selectFromDropDownByVisibleText(dropDownCityF, text);
        } catch (Exception e) {

        }
    }

    public void SelectFromDropDownCityFIndex(int index) {
        try {
            basePage.waitElementToBeVisible(dropDownCityF);
            basePage.selectFromDropDownByIndex(dropDownCityF, index);
        } catch (Exception e) {

        }
    }

    @FindBy(xpath = "//label[text()='Address']")
    @CacheLookup
    WebElement labelInputAddressF;
    public String getTextLabelInputAddressF() {
        try {
            return basePage.getText(labelInputAddressF);
        } catch (Exception e) {
            return "Cant find element labelInputAddressF";
        }
    }

    @FindBy(xpath = "//input[@placeholder='Address']")
    @CacheLookup
    WebElement inputAddressF;

    public void sendKeysInputAddressF(String number) {
        try {
            basePage.sendKeysIfElementVisible(inputAddressF, number);
        } catch (Exception e) {
        }
    }



    @FindBy(xpath = "//label[text()='Document number']")
    @CacheLookup
    WebElement labelDocNumberF;

    public String getTextLabelDocNumberF() {
        try {
            return basePage.getText(labelDocNumberF);
        } catch (Exception e) {
            return "Cant find element labelDocNumberF";
        }
    }

    @FindBy(xpath = "//input[@placeholder='Document number']")
    @CacheLookup
    WebElement inputDocNumberF;
    public void sendKeysInputDocNumberF(String number) {
        try {
            basePage.sendKeysIfElementVisible(inputDocNumberF, number);
        } catch (Exception e) {
        }
    }


    @FindBy(xpath = "//label[text()='Promo Code (Optional)']")
    @CacheLookup
    WebElement labelPromoCodF;

    public String getTextLabelPromoCodF() {
        try {
            return basePage.getText(labelPromoCodF);
        } catch (Exception e) {
            return "Cant find element labelPromoCodF";
        }
    }

    @FindBy(xpath = "//input[@placeholder='Promo Code (Optional)']")
    @CacheLookup
    WebElement inputPromoCodF;

    public void sendKeysInputPromoCodF(String number) {
        try {
            basePage.sendKeysIfElementVisible(inputPromoCodF, number);
        } catch (Exception e) {
        }
    }

    @FindBy(xpath = "//div[@class='reg-step-navigate-buttons flex-between']//button")
    @CacheLookup
    WebElement buttonContinueSecondF;


    public void clickOnButtonContinueSecondF() {
        try {
            basePage.waitElementToBeVisible(buttonContinueSecondF);
            basePage.javaScriptClick(buttonContinueSecondF);
        } catch (Exception e) {

        }
    }




// The third Page

    @FindBy(xpath = "//label[text()='Username']")
    @CacheLookup
    WebElement labelUsernameF;

    public String getTextLabelUsernameF() {
        try {
            return basePage.getText(labelUsernameF);
        } catch (Exception e) {
            return "Cant find element labelUsernameF";
        }
    }

    @FindBy(xpath = "//input[@class='ng-untouched ng-pristine ng-valid']")
    @CacheLookup
    WebElement inputUsernameF;

    public void sendKeysInputUsernameF(String username) {
        try {
            basePage.sendKeysIfElementVisible(inputUsernameF, username);
        } catch (Exception e) {
        }
    }

    @FindBy(xpath = "//label[text()='Email']")
    @CacheLookup
    WebElement labelEmailF;

    public String getTextLabelEmailF() {
        try {
            return basePage.getText(labelEmailF);
        } catch (Exception e) {
            return "Cant find element labelEmailF";
        }
    }

    @FindBy(xpath = "//input[@placeholder='Email']")
    @CacheLookup
    WebElement inputEmailF;

    public void sendKeysInputEmailF(String email) {
        try {
            basePage.sendKeysIfElementVisible(inputEmailF, email);
        } catch (Exception e) {
        }
    }


    @FindBy(xpath = "//label[text()='Currency']")
    @CacheLookup
    WebElement labelCurrencyDropDownF;

    public String getTextLabelCurrencyDropDownF() {
        try {
            return basePage.getText(labelCurrencyDropDownF);
        } catch (Exception e) {
            return "Cant find element labelCurrencyDropDownF";
        }
    }

    @FindBy(xpath = "//select[@class='ng-pristine ng-valid ng-touched']")
    @CacheLookup
    WebElement dropDownCurrencyF;
    public void SelectFromDropDownCurrencyFByVisibleText(String text) {
        try {
            basePage.waitElementToBeVisible(dropDownCurrencyF);
            basePage.selectFromDropDownByVisibleText(dropDownCurrencyF, text);
        } catch (Exception e) {

        }
    }

    public void SelectFromDropDownCurrencyFIndex(int index) {
        try {
            basePage.waitElementToBeVisible(dropDownCurrencyF);
            basePage.selectFromDropDownByIndex(dropDownCurrencyF, index);
        } catch (Exception e) {

        }
    }

    @FindBy(xpath = "//label[text()='Password']")
    @CacheLookup
    WebElement labelPasswordF;

    public String getTextLabelPasswordF() {
        try {
            return basePage.getText(labelPasswordF);
        } catch (Exception e) {
            return "Cant find element labelPasswordF";
        }
    }

    @FindBy(xpath = "//input[@placeholder='Password (8 or more characters)']")
    @CacheLookup
    WebElement inputPasswordF;
    public void sendKeysInputPasswordF(String password) {
        try {
            basePage.sendKeysIfElementVisible(inputPasswordF, password);
        } catch (Exception e) {
        }
    }

    @FindBy(xpath = "//label[text()='Confirm Password']")
    @CacheLookup
    WebElement labelConfirmPasswordF;

    public String getTextLabelConfirmPasswordF() {
        try {
            return basePage.getText(labelConfirmPasswordF);
        } catch (Exception e) {
            return "Cant find element labelConfirmPasswordF";
        }
    }

    @FindBy(xpath = "//input[@placeholder='Confirm password']")
    @CacheLookup
    WebElement inputConfirmPasswordF;

    public void sendKeysInputConfirmPasswordF(String passwordConfirm) {
        try {
            basePage.sendKeysIfElementVisible(inputConfirmPasswordF, passwordConfirm);
        } catch (Exception e) {
        }
    }

    @FindBy(xpath = "//span[@class='reg-conditions']//span")
    @CacheLookup
    WebElement labelPrivacyPolicyF;

    public String getTextLabelPrivacyPolicyF() {
        try {
            return basePage.getText(labelPrivacyPolicyF);
        } catch (Exception e) {
            return "Cant find element labelPrivacyPolicyF";
        }
    }


    @FindBy(xpath = "//a[text()='Terms & Conditions and Privacy Policy ']")
    @CacheLookup
    WebElement linkPrivacyPolicyF;
    public void clickOnLinkPrivacyPolicyF() {
        try {
            basePage.waitElementToBeVisible(linkPrivacyPolicyF);
            basePage.javaScriptClick(linkPrivacyPolicyF);
        } catch (Exception e) {

        }
    }

    @FindBy(xpath = "//input[@class='reg-checkbox distans-right ng-valid ng-dirty invalid-filed ng-touched']")
    @CacheLookup
    WebElement checkBoxPrivacyPolicyF;
    public void clickOnCheckBoxPrivacyPolicyF() {
        try {
            basePage.waitElementToBeVisible(checkBoxPrivacyPolicyF);
            basePage.javaScriptClick(checkBoxPrivacyPolicyF);
        } catch (Exception e) {

        }
    }
    public boolean checkBoxCheckBoxPrivacyPolicyFIsSelected(){
        basePage.waitElementToBeVisible(checkBoxPrivacyPolicyF);
        if (basePage.elementIsSelected(checkBoxPrivacyPolicyF)){
            return true;
        }
        else{
            return false;
        }
    }

    @FindBy(xpath = "//span[@class='reg-conditions' and @xpath='2']")
    @CacheLookup
    WebElement labelReceiveNewsF;

    public String getTextLabelReceiveF() {
        try {
            return basePage.getText(labelReceiveNewsF);
        } catch (Exception e) {
            return "Cant find element labelReceiveNewsF";
        }
    }

    @FindBy(xpath = "//input[@class='reg-checkbox distans-right ng-dirty ng-valid invalid-filed ng-touched']")
    @CacheLookup
    WebElement checkBoxReceiveF;
    public void clickOnCheckBoxReceiveF() {
        try {
            basePage.waitElementToBeVisible(checkBoxReceiveF);
            basePage.javaScriptClick(checkBoxReceiveF);
        } catch (Exception e) {

        }
    }
    public boolean checkBoxReceiveFIsSelected(){
            basePage.waitElementToBeVisible(checkBoxReceiveF);
            if (basePage.elementIsSelected(checkBoxReceiveF)){
                return true;
            }
            else{
                return false;
            }
    }

    @FindBy(xpath = "//button[@class='craft_btn next-btn']")
    @CacheLookup
    WebElement buttonRegisterF;

    public String getTextButtonRegisterF() {
        try {
            return basePage.getText(buttonRegisterF);
        } catch (Exception e) {
            return "Cant find element buttonRegisterF";
        }
    }

    public void clickOnButtonRegisterF() {
        try {
            basePage.waitElementToBeVisible(buttonRegisterF);
            basePage.javaScriptClick(buttonRegisterF);
        } catch (Exception e) {

        }
    }


    public Object[][] invalidSignUpData() {
        Object invalidLoginData[][] = {{basePage.generateRandomEmailInValid1()},{basePage.generateRandomEmailInValid2()},
                {basePage.generateRandomEmailInValid3()},{basePage.generateRandomEmailInValid4()},
                {basePage.generateRandomEmailInValid5()},{basePage.generateRandomEmailInValid6()}};

        return invalidLoginData;
    }

}
