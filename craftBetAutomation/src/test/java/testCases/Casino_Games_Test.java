package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.time.Duration;

public class Casino_Games_Test extends BaseTest{


    @BeforeMethod
    public void logInGoToCasinoPage() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        craftBet_header_page.clickOnLogInButtonIfVisible();
        craftBet_login_popUp_page.loginPopUpEmailOrUsernameSendKeys(username);
        logger.info("username passed");
        craftBet_login_popUp_page.loginPopUpPasswordSendKeys(password);
        logger.info("password passed");
        craftBet_login_popUp_page.clickLoginPopUpLogInButton();
        logger.info("Log In Button was clicked");
        Thread.sleep(2000);
        craftBet_header_page.clickOnHeaderCasinoLink();
        logger.info("Casino Link was clicked");
    }

    @Test
    public void casinoGameTest() throws InterruptedException {

        int intGameNumber = Integer.parseInt(craftBet_casino_page.getTextCasinoGamesSeeMoreButtonGamesNumber().substring(1,craftBet_casino_page.getTextCasinoGamesSeeMoreButtonGamesNumber().length() - 1));

        while(intGameNumber>16){
            craftBet_casino_page.clickOnCasinoGamesSeeMoreButton();
            System.out.println(craftBet_casino_page.getTextCasinoGamesSeeMoreButtonGamesNumber());
        }
        craftBet_casino_page.clickOnCasinoGamesSeeMoreButton();





//        for (WebElement startGameButton:craftBet_casino_page.getGamesStartButtonsList()){
//            bp.actionDownXTime(4);
////            bp.actionMoveToElement(startGameButton);
////            bp.javaScriptClick(craftBet_casino_page.getActiveGamesStartButtons());
//
//            Thread.sleep(1000);
//            System.out.println(bp.getUrl());
//            break;
//
//
//            //System.out.println(testDriver.getCurrentUrl());
//            //testDriver.navigate().back();

 //      }
    }





}
