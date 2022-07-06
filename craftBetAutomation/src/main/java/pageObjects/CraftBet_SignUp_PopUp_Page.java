package pageObjects;

import org.openqa.selenium.WebDriver;

public class CraftBet_SignUp_PopUp_Page extends BasePage {
    private final BasePage basePage;

    public CraftBet_SignUp_PopUp_Page(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);
    }


}
