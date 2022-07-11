package testCases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SignUpFullRegisterTest extends BaseTest{

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
    public void SignUpPopUpQuickRegisterLabelsPresenceVerification_Test() {
        String actTitle = craftBet_signUp_popUp_page.getTitle();
        logger.info("Title Captured: " + actTitle);

        String expectedTitle = "Password recovery";
        logger.info("Title expected: " + expectedTitle);

        softAssert.assertEquals(actTitle, expectedTitle);
        logger.info("Title checked");


        softAssert.assertAll();
    }
}
