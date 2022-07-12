package testCases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SignUpQuickRegisterTest extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void goToLoginPopUp() {
        craftBet_header_page.clickOnSignUp();
    }


    @Test(priority = 1, description = "Validate SignUp PopUps labels")
    @Description("Validate SignUp PopUps labels")
    @Severity(SeverityLevel.MINOR)
    public void SignUpPopUpQuickRegisterLabelsPresenceVerification_Test() {
        String actTitle = craftBet_signUp_popUp_page.getTitle();
        logger.info("Title Captured: " + actTitle);
        String actEmailDropDownLabel = craftBet_signUp_popUp_page.getTextLabelEmailMobileDropDownQ();
        logger.info("actEmailDropDownLabel Captured: " + actEmailDropDownLabel);
        String actEmailInputLabel = craftBet_signUp_popUp_page.getTextLabelEmailInputQ();
        logger.info("actEmailInputLabel Captured: " + actEmailInputLabel);
        String actCurrencyLabel = craftBet_signUp_popUp_page.getTextLabelCurrencyDropDownQ();
        logger.info("actCurrencyLabel Captured: " + actCurrencyLabel);
        String actTermsLabel = craftBet_signUp_popUp_page.getTextLabelTermsConditionsQ();
        logger.info("actTermsLabel Captured: " + actTermsLabel);
        String actRegisterButtonText = craftBet_signUp_popUp_page.getTextButtonRegisterQ();
        logger.info("actRegisterButtonText Captured: " + actRegisterButtonText);
        String actAlreadyHaveAccount = craftBet_signUp_popUp_page.getTextLabelAlreadyHaveAnAccount();
        logger.info("actAlreadyHaveAccount Captured: " + actAlreadyHaveAccount);
        String actPleaseFillLabel = craftBet_signUp_popUp_page.getTextLabelPleaseFill();
        logger.info("actPleaseFillLabel Captured: " + actPleaseFillLabel);
        String actSwitchButtonLabel = craftBet_signUp_popUp_page.getTextButtonSwitchQuickFullRegistration();
        logger.info("actSwitchButtonLabel Captured: " + actSwitchButtonLabel);
        String actThisSiteProtected = craftBet_signUp_popUp_page.getTextLabelThisSiteProtected();
        logger.info("actThisSiteProtected Captured: " + actThisSiteProtected);
        String actSafeAndSecureLabel = craftBet_signUp_popUp_page.getTextLabelSafeAndSecure();
        logger.info("actSafeAndSecureLabel Captured: " + actSafeAndSecureLabel);

        String expectedTitle = "Quick Register";
        logger.info("Title expected: " + expectedTitle);
        String expectedEmailDropDownLabel = "Register By";
        logger.info("Email Drop Down expected label: " + expectedEmailDropDownLabel);
        String expectedEmailInputLabel = "Email";
        logger.info("Email input expected label: " + expectedEmailInputLabel);
        String expectedCurrencyLabel = "Currency";
        logger.info("Currency drop down expected label: " + expectedCurrencyLabel);
        String expectedTermsLabel = "I have 1read and accept the Terms & Conditions and Privacy Policy and I agree that I am at least 21 years of age.";
        logger.info("Terms and Conditions expected label: " + expectedTermsLabel);
        String expectedRegisterButtonText = "REGISTER";
        logger.info("RegisterButton expected label: " + expectedRegisterButtonText);
        String expectedAlreadyHaveAccount = "Already have an account? Log In";
        logger.info("AlreadyHaveAccount expected label: " + expectedAlreadyHaveAccount);
        String expectedPleaseFillLabel = "Please fill in all fields of this form.";
        logger.info("Please fill expected label: " + expectedPleaseFillLabel);
        String expectedSwitchButtonLabel = "Full Register";
        logger.info("Please fill expected label: " + expectedSwitchButtonLabel);
        String expectedThisSiteProtected = "This site is protected by recaptcha and the Google Privacy Policy and Terms of Service apply. Select a social network and permit the use of your profile info for Craftbet registration";
        logger.info("expectedThisSiteProtected: " + expectedThisSiteProtected);
        String expectedSafeAndSecureLabel = "Safe and Secure";
        logger.info("expectedSafeAndSecureLabel: " + expectedSafeAndSecureLabel);


        softAssert.assertEquals(actTitle, expectedTitle);
        logger.info("Title checked");
        softAssert.assertEquals(actEmailDropDownLabel, expectedEmailDropDownLabel);
        logger.info("Email DropDown label checked");
        softAssert.assertEquals(actEmailInputLabel, expectedEmailInputLabel);
        logger.info("Email input label checked");
        softAssert.assertEquals(actCurrencyLabel, expectedCurrencyLabel);
        logger.info("Currency drop down label checked");
        softAssert.assertEquals(actTermsLabel, expectedTermsLabel);
        logger.info("Terms and Conditions input label checked");
        softAssert.assertEquals(actRegisterButtonText, expectedRegisterButtonText);
        logger.info("Register button label checked");
        softAssert.assertEquals(actAlreadyHaveAccount, expectedAlreadyHaveAccount);
        logger.info("AlreadyHaveAccount label checked");
        softAssert.assertEquals(actPleaseFillLabel, expectedPleaseFillLabel);
        logger.info("PleaseFillLabel label checked");
        softAssert.assertEquals(actSwitchButtonLabel, expectedSwitchButtonLabel);
        logger.info("SwitchButtonLabel label checked");
        softAssert.assertEquals(actThisSiteProtected, expectedThisSiteProtected);
        logger.info("ThisSiteProtected label checked");
        softAssert.assertEquals(actSafeAndSecureLabel, expectedSafeAndSecureLabel);
        logger.info("SafeAndSecureLabel label checked");

        softAssert.assertAll();
    }

    @Test(priority = 2, description = "Validate on Sign Up Pop Up Logo Presence")
    @Description("Validate on Sign Up Pop Up Logo Presence")
    @Severity(SeverityLevel.MINOR)
    public void SignUpPopUpQuickRegisterLogoPresenceVerification_Test() {
        softAssert.assertEquals(craftBet_signUp_popUp_page.BackgroundPhotoPresence(), true);
        logger.info("Background photo existence checked");
        softAssert.assertEquals(craftBet_signUp_popUp_page.logoPresence(), true);
        logger.info("Logo existence checked");
        softAssert.assertAll();
    }

    @Test(priority = 3, description = "Validate on Sign Up Pop Up Email/Mobile Drop down")
    @Description("Validate on Sign Up Pop Up Email/Mobile Drop down")
    @Severity(SeverityLevel.MINOR)
    public void SignUpPopUpQuickRegisterRegisterByDropDownVerification_Test() {
        craftBet_signUp_popUp_page.selectEmailMobileDropDownQ("Email");
        softAssert.assertEquals(craftBet_signUp_popUp_page.getTextLabelEmailInputQ(), "Email");
        craftBet_signUp_popUp_page.selectEmailMobileDropDownQ("Mobile");
        softAssert.assertEquals(craftBet_signUp_popUp_page.getTextLabelMobileInputQ(), "Mobile");
        softAssert.assertAll();
    }

    @Test(priority = 3, description = "Validate on Sign Up Pop Up Terms  and conditions check box need to be checked")
    @Description("Validate on Sign Up Pop Up Terms  and conditions check box need to be checked")
    @Severity(SeverityLevel.MINOR)
    public void SignUpPopUpQuickRegisterRegisterPrivacyPolicy() {
        craftBet_signUp_popUp_page.selectEmailMobileDropDownQ("Email");
        craftBet_signUp_popUp_page.sendKeysEmailInputQ(craftBet_signUp_popUp_page.generateRandomEmailValid());
        softAssert.assertEquals(craftBet_signUp_popUp_page.getAttributeClassButtonRegisterQ(), "craft_btn reg_btn active-item not_active");
        craftBet_signUp_popUp_page.clickOnCheckBoxTermsConditionsQ();
        softAssert.assertEquals(craftBet_signUp_popUp_page.getAttributeClassButtonRegisterQ(), "craft_btn reg_btn active-item");
        softAssert.assertAll();

    }

    @Test(priority = 4, description = "Validate on Sign Up Pop Up sign up with valid Email")
    @Description("Validate on Sign Up Pop Up sign up with valid Email")
    @Severity(SeverityLevel.BLOCKER)
    public void SignUpPopUpQuickRegisterPositiveTest() {
        craftBet_signUp_popUp_page.selectEmailMobileDropDownQ("Email");
        craftBet_signUp_popUp_page.sendKeysEmailInputQ(craftBet_signUp_popUp_page.generateRandomEmailValid());
        craftBet_signUp_popUp_page.clickOnCheckBoxTermsConditionsQ();
        craftBet_signUp_popUp_page.clickOnButtonRegisterQ();
        Assert.assertEquals(craftBet_header_page.userIdLabelIsEnabled(),true);

    }

    @Test(priority = 4, dataProvider ="invalidData",description = "Validate on Sign Up Pop Up sign up with valid Email")
    @Description("Validate on Sign Up Pop Up sign up with valid Email")
    @Severity(SeverityLevel.BLOCKER)
    public void SignUpPopUpQuickRegisterNegativeTest(String invalidEmail) {
        craftBet_signUp_popUp_page.selectEmailMobileDropDownQ("Email");
        logger.info("Chosen Email from drop down");
        craftBet_signUp_popUp_page.sendKeysEmailInputQ(invalidEmail);
        logger.info("invalid Email sent");
        craftBet_signUp_popUp_page.clickOnCheckBoxTermsConditionsQ();
        logger.info("Terms and conditions checkbox clicked");
        craftBet_signUp_popUp_page.clickOnButtonRegisterQ();
        logger.info("Register button clicked");
        String errorMessage = craftBet_passwordRecovery_page.getErrorMessage();
        logger.info("Error message captured");
        Assert.assertEquals(errorMessage,"Invalid email address");
    }

    @DataProvider(name = "invalidData")
    public Object[][] invalidSignUpData() {

            Object invalidLoginData[][] = {{generateRandomEmailInValid1()},{generateRandomEmailInValid2()},
                                           {generateRandomEmailInValid3()},{generateRandomEmailInValid4()},
                                           {generateRandomEmailInValid5()},{generateRandomEmailInValid6()}};
            return invalidLoginData;

    }













    //Abc.example.com no @ character
    public String generateRandomEmailInValid1(){
        String randomEmail;
        String generatedString = RandomStringUtils.randomAlphanumeric(10);
        randomEmail = generatedString + ".gmail.com";
        return randomEmail;
    }

    //A@b@c@example.com   only one @ is allowed outside quotation marks
    public String generateRandomEmailInValid2(){
        String randomEmail;
        String generatedString1 = RandomStringUtils.randomAlphanumeric(5);
        String generatedString2 = RandomStringUtils.randomAlphanumeric(5);
        randomEmail = generatedString1+"@"+generatedString2 + "@gmail.com";
        return randomEmail;
    }

    //a"b(c)d,e:f;g<h>i[j\k]l@example.com    ( "  none of the special characters in this local-part are allowed outside quotation marks )
    public String generateRandomEmailInValid3(){
        String randomEmail;
        String generatedString1 = RandomStringUtils.randomAlphanumeric(2);
        String generatedString2 = RandomStringUtils.randomAlphanumeric(2);
        randomEmail = generatedString1+"\\"+ generatedString2 + "@gmail.com";
        return randomEmail;
    }

    // just"not"right@example.com (quoted strings must be dot separated or the only element making up the local-part)
    public String generateRandomEmailInValid4(){
        String randomEmail;
        String generatedString1 = RandomStringUtils.randomAlphanumeric(2);
        String generatedString2 = RandomStringUtils.randomAlphanumeric(2);
        randomEmail = generatedString1+"\""+generatedString2+ "@gmail.com";
        return randomEmail;
    }

    //this is"not\allowed@example.com (spaces, quotes, and backslashes may only exist when within quoted strings and preceded by a backslash)
    public String generateRandomEmailInValid5(){
        String randomEmail;
        String generatedString1 = RandomStringUtils.randomAlphanumeric(2);
        String generatedString2 = RandomStringUtils.randomAlphanumeric(2);
        randomEmail = generatedString1+" "+generatedString2+ "@gmail.com";
        return randomEmail;
    }

    //i_like_underscore@but_its_not_allowed_in_this_part.example.com (Underscore is not allowed in domain part)
    public String generateRandomEmailInValid6(){
        String randomEmail;
        String generatedString1 = RandomStringUtils.randomAlphanumeric(2);
        String generatedString2 = RandomStringUtils.randomAlphanumeric(2);
        randomEmail = generatedString1+"_"+generatedString2+ "@gmail.com";
        return randomEmail;
    }
}



