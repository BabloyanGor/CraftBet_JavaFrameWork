package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static java.lang.Integer.parseInt;

public class CraftBet_Casino_Page extends BasePage {
    private final BasePage basePage;

    public CraftBet_Casino_Page(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);
    }


    @FindBy(xpath = "//*[@class='product_list_item']")
    @CacheLookup
    List<WebElement> casinoGames;

    public List<WebElement> casinoAllGames() {
        return casinoGames;
    }




    @FindBy(xpath = "//a[@title='Real']")
    @CacheLookup
    List <WebElement> gamesStartButtons;

    public List<WebElement> getGamesStartButtonsList(){
        return gamesStartButtons;
    }
    public int  getGamesStartButtonsListSize(){
        return gamesStartButtons.size();
    }

    public WebElement  getActiveGamesStartButtons(){
        WebElement button = null;
        for (WebElement activeButton:gamesStartButtons){
            if (activeButton.isDisplayed()){
                button=activeButton;
                break;
            }
        }
        return  button;
    }
//    public void clickOnGamesStartButton(WebElement element){
//        basePage.javaScriptClick(element);
//    }





    @FindBy(xpath = "//button[@class='more-button']")
    @CacheLookup
    WebElement casinoGamesSeeMorButton;

    public void clickOnCasinoGamesSeeMoreButton() throws InterruptedException {
        basePage.javaScriptClick(casinoGamesSeeMorButton);
        Thread.sleep(1000);
    }

    @FindBy(xpath = "//button[@class='more-button']//child::span")
    @CacheLookup
    WebElement casinoGamesSeeMoreButtonGamesNumber;

    public String getTextCasinoGamesSeeMoreButtonGamesNumber() {
        String num = basePage.getText(casinoGamesSeeMoreButtonGamesNumber);
        return num;
    }




}
