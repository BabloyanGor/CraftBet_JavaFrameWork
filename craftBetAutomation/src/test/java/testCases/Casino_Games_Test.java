package testCases;

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
        Thread.sleep(2000);
        craftBet_header_page.clickOnHeaderCasinoLink();
        logger.info("Casino Link was clicked");
    }

    @Test
    public void casinoGameTest() throws InterruptedException, IOException {
        int i = 1;
        ArrayList<String> srces = new ArrayList<>();
        ArrayList<String> errorSrcXl = new ArrayList<>();
        int intGameNumber = Integer.parseInt(craftBet_casino_page.getTextCasinoGamesSeeMoreButtonGamesNumber().substring(1, craftBet_casino_page.getTextCasinoGamesSeeMoreButtonGamesNumber().length() - 1));

        while (intGameNumber > 50) {
            try {

                craftBet_casino_page.clickOnCasinoGamesSeeMoreButton();
                System.out.println(craftBet_casino_page.getTextCasinoGamesSeeMoreButtonGamesNumber());
                intGameNumber = Integer.parseInt(craftBet_casino_page.getTextCasinoGamesSeeMoreButtonGamesNumber().substring(1, craftBet_casino_page.getTextCasinoGamesSeeMoreButtonGamesNumber().length() - 1));
            } catch (Exception e) {
                System.out.println("Click button many time exception: " + e);
                break;
            }
        }
        try {
            craftBet_casino_page.clickOnCasinoGamesSeeMoreButton();

        } catch (Exception e) {
            System.out.println("Click button one time exception: " + e);
        }
        try{
            srces = craftBet_casino_page.getSRCForImages();
            errorSrcXl = new ArrayList<>();
        }
        catch(Exception e){}


        for (String src : srces) {
            //String title = craftBet_casino_page.getTextGameTitle(i);
            try {
                craftBet_casino_page.getDriver().navigate().to(src);

                if (src == null || src.isEmpty()) {
                    errorSrcXl.add(i + " this game has empty src  --> ");
                } else {
                    try {
                        URL img = new URL(src);
                        HttpURLConnection connection = (HttpURLConnection) img.openConnection();
                        connection.connect();
                        int cod = connection.getResponseCode();

                        if (cod != 200) {
                            System.out.println(i + " ---> " + src + " this is not valid src response cod is --> " + cod);
                            errorSrcXl.add(i + " ---> " + src + "      this is not valid src response cod is --> " + cod);
                        } else {
                        }
                    } catch (Exception e) {
                        System.out.println("Url connection exception: " + e);
                    }
                }
            } catch (Exception e) {
                errorSrcXl.add(i + " ---> " + src + "      this is not valid src with exception --> ");
                System.out.println("Navigate to url exception: " + e);
            }

            i++;
            System.out.println(i);
        }

        System.out.println("Errors are:  " + errorSrcXl.size());
        String target = System.getProperty("user.dir") + "/src/test/java/testData/data.xlsx";
        FileOutputStream file = new FileOutputStream(target);
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("brokenIMG");
        int k = 0;
        for (String err : errorSrcXl) {
            XSSFRow row = sheet.createRow(k);
            row.createCell(0).setCellValue(err);
            k++;
        }
        workbook.write(file);
        workbook.close();
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