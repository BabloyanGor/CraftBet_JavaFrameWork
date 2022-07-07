package pageObjects;

import org.openqa.selenium.WebDriver;

public class CraftBet_PasswordRecovery_Page extends BasePage{
    private final BasePage basePage;
    public CraftBet_PasswordRecovery_Page(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);
    }
}
