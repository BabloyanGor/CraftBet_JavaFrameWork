package testCases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;
import pageObjects.CraftBet_Header_Page;

import java.io.IOException;

public class LoginTest extends BaseTest {
    SoftAssert softAssert =new SoftAssert();
    BasePage bp = new BasePage();



    @Test(priority = 1, description = "")
    public void loginPopUpGUI_Test()  {
        craftBet_header_page.clickOnLogInButtonIfVisible();
        String actTitle = craftBet_login_popUp_page.getLoginPopUpTitle();
        String expTitle = "Log In     ";
        softAssert.assertEquals(actTitle,expTitle);







        softAssert.assertAll();

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
