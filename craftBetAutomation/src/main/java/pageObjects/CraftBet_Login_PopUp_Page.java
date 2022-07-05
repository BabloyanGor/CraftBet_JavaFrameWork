package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CraftBet_Login_PopUp_Page extends BasePage{
    private final BasePage basePage;

    public CraftBet_Login_PopUp_Page(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);
    }

    @FindBy(xpath = "//*[@class='login-title']")
    @CacheLookup
    WebElement loginPopUpTitle;

    public String getLoginPopUpTitle(){
        return basePage.getText(loginPopUpTitle);
    }





}
