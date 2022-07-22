package testCases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.BasePage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;

public class Casino_Games_Test extends BaseTest {


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
        Thread.sleep(5000);
        craftBet_header_page.clickOnHeaderCasinoLink();
        logger.info("Casino Link was clicked");
    }

    @Test(priority = 50, description = "Validate Casino games title Image presence")
    @Description("Validate Casino games title Image presence")
    @Severity(SeverityLevel.NORMAL)
    public void casinoGameTest() throws InterruptedException, IOException {
        SoftAssert softAssert = new SoftAssert();
        int i = 1;
        ArrayList<String> srces = new ArrayList<>();
        ArrayList<String> errorSrcXl = new ArrayList<>();
        int intGameNumber = Integer.parseInt(craftBet_casino_page.getTextCasinoGamesSeeMoreButtonGamesNumber().substring(1, craftBet_casino_page.getTextCasinoGamesSeeMoreButtonGamesNumber().length() - 1));

        while (intGameNumber > 16) {
            try {
                craftBet_casino_page.clickOnCasinoGamesSeeMoreButton();
//                System.out.println(craftBet_casino_page.getTextCasinoGamesSeeMoreButtonGamesNumber());
                intGameNumber = Integer.parseInt(craftBet_casino_page.getTextCasinoGamesSeeMoreButtonGamesNumber().substring(1, craftBet_casino_page.getTextCasinoGamesSeeMoreButtonGamesNumber().length() - 1));
                craftBet_casino_page.scrollToCasinoGamesSeeMoreButtonGamesNumber();

            } catch (Exception e) {
//                System.out.println("Click button many time exception: " + e);
                logger.info("Much click exception" + intGameNumber);
                break;
            }
        }
        try {
            craftBet_casino_page.clickOnCasinoGamesSeeMoreButton();
            logger.info("All games opened on one page");


        } catch (Exception e) {
//            System.out.println("Click button one time exception: " + e);
            logger.info("last click exception");
        }
        try{
            srces = craftBet_casino_page.getSRCForImages();
            errorSrcXl = new ArrayList<>();
        }
        catch(Exception e){
            logger.info("get all images exception");
        }


        for (String src : srces) {
            //String title = craftBet_casino_page.getTextGameTitle(i);
            try {
                craftBet_casino_page.getDriver().navigate().to(src);

                if (src == null || src.isEmpty()) {
                    errorSrcXl.add(i + " this games src has empty/null value");

                } else {
                    try {
                        URL img = new URL(src);
                        HttpURLConnection connection = (HttpURLConnection) img.openConnection();
                        connection.connect();
                        int cod = connection.getResponseCode();

                        if (cod != 200) {
//                            System.out.println(i + " ---> " + src + " this is not valid src response cod is --> " + cod);
                            errorSrcXl.add(i + "  this is not valid src response cod is -->  " + cod+"  src ---> " + src );
                        } else {
                        }
                    } catch (Exception e) {
//                        System.out.println("Url connection exception: " + e);
                        logger.info("http connection exception");
                    }
                }
            } catch (Exception e) {
                errorSrcXl.add(i + "   this is not valid src with exception -->   " + src );
                logger.info(i + "  url navigation exception: with saving src value");
//                System.out.println("Navigate to url exception: " + e);
            }

            i++;
//            System.out.println(i);
        }

//        System.out.println("Errors are:  " + errorSrcXl.size());
        String target = System.getProperty("user.dir") + "/src/test/java/testData/data.xlsx";
        FileOutputStream file = new FileOutputStream(target);
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("brokenIMG");
        int k = 0;
        if (errorSrcXl.size()==0){
            softAssert.assertTrue(true,"All games have title images");
        }
        else{
            for (String err : errorSrcXl) {
                softAssert.assertTrue(false,i+"  this games src has invalid data src------>  " + err);
                XSSFRow row = sheet.createRow(k);
                row.createCell(0).setCellValue(err);
                k++;
            }
            workbook.write(file);
            workbook.close();
        }
        softAssert.assertAll();
    }


//        @Test
//        @Severity(SeverityLevel.BLOCKER)
//        public void porc () {
//            craftBet_header_page.clickOnLogInButtonIfVisible();
//            craftBet_login_popUp_page.loginPopUpEmailOrUsernameSendKeys(username);
//            logger.info("username passed");
//            craftBet_login_popUp_page.loginPopUpPasswordSendKeys(password);
//            logger.info("password passed");
//            craftBet_login_popUp_page.clickLoginPopUpLogInButton();
//            logger.info("Log In Button was clicked");
//
//            System.out.println(driver.manage().getCookies());
//
//
//        }


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