package testCases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SignUpQuickRegisterTest extends BaseTest{
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void goToLoginPopUp() {
        craftBet_header_page.clickOnSignUp();
    }





    @Test(priority = 1, description = "" +
            " ")
    @Description("" +
            " ")
    @Severity(SeverityLevel.MINOR)
    public void SignUpPopUpFullRegisterLabelsPresenceVerification_Test() {
        String actTitle = craftBet_signUp_popUp_page.getTitle();
        logger.info("Title Captured: " + actTitle);
        String actEmailDropDownLabel = craftBet_signUp_popUp_page.getTextLabelEmailMobileDropDownQ();
        logger.info("actEmailDropDownLabel Captured: " + actEmailDropDownLabel);
        String actEmailInputLabel = craftBet_signUp_popUp_page.getTextLabelEmailInputQ();
        logger.info("actEmailInputLabel Captured: " + actEmailInputLabel);
        String actCurrencyLabel = craftBet_signUp_popUp_page.getTextLabelCurrencyDropDownQ();
        logger.info("actEmailInputLabel Captured: " + actCurrencyLabel);
        String actTermsLabel = craftBet_signUp_popUp_page.getTextLabelTermsConditionsQ();
        logger.info("actEmailInputLabel Captured: " + actTermsLabel);
        String actRegisterButtonText = craftBet_signUp_popUp_page.getTextButtonRegisterQ();
        logger.info("actRegisterButtonText Captured: " + actRegisterButtonText);
        String actAlreadyHaveAccount = craftBet_signUp_popUp_page.getTextLabelAlreadyHaveAnAccount();
        logger.info("actAlreadyHaveAccount Captured: " + actAlreadyHaveAccount);



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

        softAssert.assertAll();
    }

    @Test(priority = 2, description = "Validate on Sign Up Pop Up Logo Presence")
    @Description("Validate on Sign Up Pop Up Logo Presence")
    @Severity(SeverityLevel.MINOR)
    public void RecoveryPopUpLogoPresenceVerification_Test() {
        Assert.assertEquals(craftBet_signUp_popUp_page.logoPresence(), true);
        logger.info("logo existence checked");
    }
}
