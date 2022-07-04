package testCases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.io.IOException;

public class LogoTest extends BaseTest {
    SoftAssert softAssertions =new SoftAssert();
    BasePage bp = new BasePage();

    @Test(groups= {"SmokeTest"})
    public void TestSuccess() throws IOException {
        logger.info("TestSuccess started");
        String homePageUrl = driver.getCurrentUrl();
        craftBet_homePage.clickOnLogoIfVisible();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,homePageUrl);
        logger.info("TestSuccess finished");
    }

    @Test(groups= {"RegressionTest"})
    public void testFail() throws IOException {
        logger.info("testFail started");
        craftBet_homePage.clickOnLogoIfVisible();
        Assert.assertTrue(false);
        logger.info("testFail finished");
    }

    @Test(groups= {"SmokeTest"})
    public void testSkipp(){
        logger.info("testSkipp started");
        throw new SkipException("Skipping this exception");
        //logger.info("testSkipp finished");
    }
}
