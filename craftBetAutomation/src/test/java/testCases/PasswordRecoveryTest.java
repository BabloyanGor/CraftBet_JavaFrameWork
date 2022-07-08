package testCases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

public class PasswordRecoveryTest extends BaseTest{
    SoftAssert softAssert = new SoftAssert();
    BasePage bp = new BasePage();

    @BeforeMethod
    public void goToLoginPopUp() {
        craftBet_header_page.clickOnLogInButtonIfVisible();
        craftBet_login_popUp_page.clickLoginPopUpForgotPassword();
    }

    @Test(priority = 1, description = "Validate on Password Recovery PopUp Header, Email/mobile or username, Password, Remember me," +
            " You can Sign in with, Don't have an account? Sign Up, Don't have an account? Sign Up, Safe and Secure labels")
    @Description("Validate on Log_in Pop Up Header, Email/mobile or username, Password, Remember me, You can Sign in with," +
            " Don't have an account? Sign Up, Don't have an account? Sign Up, Safe and Secure labels")
    @Severity(SeverityLevel.MINOR)
    public void loginPopUpLabelsPresenceVerification_Test() {
        String actHeader = craftBet_login_popUp_page.getLoginPopUpHeader();
        logger.info("Header Captured");

        String expectedHeader = "Log In";

        softAssert.assertEquals(actHeader, expectedHeader);
        logger.info("Header label checked");


        softAssert.assertAll();
    }
}
