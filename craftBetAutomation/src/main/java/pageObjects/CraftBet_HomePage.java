package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CraftBet_HomePage extends BasePage {

    private final BasePage basePage;


    public CraftBet_HomePage(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);
    }


    @FindBy(xpath = "//div[@class='header-section_topPanel_left']")
    @CacheLookup
    WebElement logo;

    public void clickOnLogo(){
        logo.click();
    }
    public void clickOnLogoIfVisible(){
        clickOnElementIfVisible(logo);
    }


}
