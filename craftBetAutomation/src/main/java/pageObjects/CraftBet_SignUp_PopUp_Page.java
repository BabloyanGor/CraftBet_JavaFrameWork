package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CraftBet_SignUp_PopUp_Page extends BasePage {
    private final BasePage basePage;

    public CraftBet_SignUp_PopUp_Page(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);
    }

    @FindBy(xpath = "//a[@class='reg_item active']")
    @CacheLookup
    WebElement SignUpPopUpHeader;

    public String getTextSignUpPopUpHeader(){
        return basePage.getText(SignUpPopUpHeader);
    }

}
