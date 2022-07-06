package testCases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;
import pageObjects.CraftBet_Login_PopUp_Page;

public class LoginPopUpTest extends BaseTest {
    SoftAssert softAssert =new SoftAssert();
    BasePage bp = new BasePage();


    @BeforeMethod
    public void goToLoginPopUp(){
        craftBet_header_page.clickOnLogInButtonIfVisible();
    }

    @Test(priority = 1, description = "Validate Log_in Pop Header")
    @Description("Validate Log_in Pop Header")
    @Severity(SeverityLevel.MINOR)
    public void loginPopUpHeader_Test()  {
        String actTitle = craftBet_login_popUp_page.getLoginPopUpHeader();
        logger.info("Header Captured");
        String expTitle = "Log In";
        softAssert.assertEquals(actTitle,expTitle);
        softAssert.assertAll();
    }

    @Test(priority = 2, description = "Validate Log_in Pop Logo Presence")
    @Description("Validate Log_in Pop Logo Presence")
    @Severity(SeverityLevel.MINOR)
    public void loginPopUpLogo_Test()  {
       if (craftBet_login_popUp_page.loginPopUpLogoPresence()){
           Assert.assertTrue(true);
       }
       else{
           Assert.fail();
       }
    }

    @Test(priority = 3, description = "Validate Log_in Pop Up Close X button functionality")
    @Description("Validate Log_in Pop Close X button functionality")
    @Severity(SeverityLevel.NORMAL)
    public void loginPopUpCloseButton_Test()  {
        craftBet_login_popUp_page.clickOnLoginPopUpCloseButton();
        logger.info("close (X) button clicked");
        if (!craftBet_login_popUp_page.loginPopUpLogoPresence()){
            Assert.assertTrue(true);
        }
        else{
            Assert.fail();
        }
    }

    @Test(priority = 3, description = "Validate Log_in Pop Up Email and Password labels")
    @Description("Validate Log_in Pop Up Email and Password labels")
    @Severity(SeverityLevel.MINOR)
    public void loginPopUpEmailAndPasswordLabelsValidation()  {
        String actualEmailLabel = craftBet_login_popUp_page.getLoginPopUpEmailOrUsernameLabel();
        logger.info("username label captured");
        String actualPasswordLabel = craftBet_login_popUp_page.getLoginPopUpPasswordLabel();
        logger.info("password label captured");
        String expectedEmailLabel = "Email/mobile or username";
        String expectedPasswordLabel = "Password";
        softAssert.assertEquals(actualEmailLabel,expectedEmailLabel);
        logger.info("username label checked");
        softAssert.assertEquals(actualPasswordLabel,expectedPasswordLabel);
        logger.info("password label checked");
        softAssert.assertAll();
    }


    @Test(priority = 4, description = "Validate Log_in Pop Up Log_In functionality")
    @Description("Validate Log_in Pop Up Log_In functionality")
    @Severity(SeverityLevel.BLOCKER)
    public void loginPopUpLogInPositiveTest()  {
        craftBet_login_popUp_page.loginPopUpEmailOrUsernameSendKeys(username);
        logger.info("username passed");
        craftBet_login_popUp_page.loginPopUpPasswordSendKeys(password);
        logger.info("password passed");
        craftBet_login_popUp_page.clickLoginPopUpLogInButton();
        logger.info("Log In Button was clicked");
        if (craftBet_login_popUp_page.loginPopUpLogoPresence()){
            Assert.assertTrue(true);
            logger.info("test passed");
        }
        else{
            Assert.fail();
            logger.error("test Failed");
        }
    }









//    @Test(groups= {"SmokeTest"})
//    public void TestSuccess() throws IOException {
//        logger.info("TestSuccess started");
//        String homePageUrl = driver.getCurrentUrl();
//        craftBet_header_page.clickOnLogoIfVisible();
//        String currentUrl = driver.getCurrentUrl();
//        Assert.assertEquals(currentUrl,homePageUrl);
//        logger.info("TestSuccess finished");
//    }
//
//    @Test(groups= {"RegressionTest"})
//    public void testFail() throws IOException {
//        logger.info("testFail started");
//        craftBet_header_page.clickOnLogoIfVisible();
//        Assert.assertTrue(false);
//        logger.info("testFail finished");
//    }
//
//    @Test(groups= {"SmokeTest"})
//    public void testSkipp(){
//        logger.info("testSkipp started");
//        throw new SkipException("Skipping this exception");
//        //logger.info("testSkipp finished");
//    }

}
