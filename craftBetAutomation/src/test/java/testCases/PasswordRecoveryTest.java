package testCases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

public class PasswordRecoveryTest extends BaseTest{
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void goToLoginPopUp() {
        craftBet_header_page.clickOnLogInButtonIfVisible();
        craftBet_login_popUp_page.clickLoginPopUpForgotPassword();
    }

    @Test(priority = 1, description = "Validate on Password Recovery PopUp Title, Email/mobile or username input Label, Info Message," +
                                      " Help message, Text on Send Me Recovery Button")
    @Description("Validate on Password Recovery PopUp Title, Email/mobile or username input Label, Info Message," +
                  " Help message, Text on Send Me Recovery Button")
    @Severity(SeverityLevel.MINOR)
    public void RecoveryPopUpLabelsPresenceVerification_Test() {
        String actTitle = craftBet_passwordRecovery_page.getTitleText();
        logger.info("Title Captured");
        String actEmailInputLabel = craftBet_passwordRecovery_page.getEmailInputsLabel();
        logger.info("Emails label Captured");
        String actFormLabelInfo = craftBet_passwordRecovery_page.getFormLabelInfo();
        logger.info("Info message Captured");
        String actHelpMessageLabel = craftBet_passwordRecovery_page.getHelpMessageLabel();
        logger.info("Help message Captured");
        String actTextOnSendMeRecoveryButton = craftBet_passwordRecovery_page.getTextOnSendMeRecoveryButton();
        logger.info("Text on Send Me Recovery Button Captured");

        String expectedTitle = "Password recovery";
        String expectedEmailInputLabel = "E-mail / Phone number";
        String expectedFormLabelInfo = "Number format: +country code (area code) (phone number). Example: +7 212 533 39 09";
        String expectedHelpMessageLabel = "We can help you reset your password using your mobile number or the email address linked to your account.";
        String expectedTextOnSendMeRecoveryButton = "Send Me Recovery Link";

        softAssert.assertEquals(actTitle, expectedTitle);
        logger.info("Title checked");
        softAssert.assertEquals(actEmailInputLabel, expectedEmailInputLabel);
        logger.info("Email Input Label checked");
        softAssert.assertEquals(actFormLabelInfo, expectedFormLabelInfo);
        logger.info("Form Label Info checked");
        softAssert.assertEquals(actHelpMessageLabel, expectedHelpMessageLabel);
        logger.info("Help Message checked");
        softAssert.assertEquals(actTextOnSendMeRecoveryButton, expectedTextOnSendMeRecoveryButton);
        logger.info("Text on Send Me Recovery Link button checked");

        softAssert.assertAll();
    }

    @Test(priority = 2, description = "Validate on Password Recovery Pop Up Logo Presence")
    @Description("Validate on Password Recovery Pop Up Logo Presence")
    @Severity(SeverityLevel.MINOR)
    public void RecoveryPopUpLogoPresenceVerification_Test() {
        Assert.assertEquals(craftBet_passwordRecovery_page.logoExistenceVerification(), true);
    }


    @Test(priority = 3, description = "Validate on Password Recovery Pop Up Support link")
    @Description("Validate on Password Recovery Pop Up Support link")
    @Severity(SeverityLevel.MINOR)
    public void RecoveryPopUpSupportLink_Test() {
        String RecoveryUrl = craftBet_passwordRecovery_page.getUrl();
        craftBet_passwordRecovery_page.clickOnSupportLink();
        String supportUrl = craftBet_passwordRecovery_page.getUrl();
        Assert.assertNotEquals(RecoveryUrl, supportUrl);
    }


    @Test(priority = 9, description = "Validate on Password recovery pop up functionality of Recovery with valid credentials")
    @Description("Validate on Password recovery pop up functionality of Recovery with valid credentials")
    @Severity(SeverityLevel.BLOCKER)
    public void RecoveryPopUpPositiveTest() {
        craftBet_passwordRecovery_page.sendKeysToEmailPhoneInput("g.babloyan@iqsoft.am");
        logger.info("email passed");
        craftBet_passwordRecovery_page.clickOnSendMeRecoveryButton();
        logger.info("Send me password Recovery Button was clicked");
        String actSuccessMessage = craftBet_passwordRecovery_page.getSuccessMessage();

        if (actSuccessMessage.contains("Recovery link successfully sent")){
            Assert.assertTrue(true);
        }
        else{
            Assert.assertTrue(false);
        }
    }




    @Test(priority = 10, dataProvider = "invalidRecoveryData", description = "Validate on Password recovery pop up functionality of Recovery with invalid credentials")
    @Description("Validate on Password recovery pop up functionality of Recovery with invalid credentials")
    @Severity(SeverityLevel.BLOCKER)
    public void RecoveryPopUpNegativeTest(String dataEmail) {
        craftBet_passwordRecovery_page.sendKeysToEmailPhoneInput(dataEmail);
        logger.info("email passed");
        craftBet_passwordRecovery_page.clickOnSendMeRecoveryButton();
        logger.info("Send me password Recovery Button was clicked");
        String actErrorMessage = craftBet_passwordRecovery_page.getErrorMessage();

        if (actErrorMessage.equals("Wrong recovery input")){
            Assert.assertTrue(true);
        }
        else{
            Assert.assertTrue(false);
        }
    }

    @DataProvider(name = "invalidRecoveryData")
    public Object[][] RecoveryInvalidData() {
        Object invalidRecoveryData[][] = {{" g.babloyan@iqsoft.am"}, {"g.babloyan@iqsoft.am "}, {"g .babloyan@iqsoft.am"},
                                       {"g. babloyan@iqsoft.am"}, {"g.babloyan @iqsoft.am"},{"g.babloyan@iqsoft.a m"}};
        return invalidRecoveryData;
    }







}
