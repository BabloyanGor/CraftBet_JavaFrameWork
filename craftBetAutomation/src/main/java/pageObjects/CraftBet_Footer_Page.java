package pageObjects;

import org.openqa.selenium.WebDriver;

public class CraftBet_Footer_Page extends BasePage{
    private final BasePage basePage;
    public CraftBet_Footer_Page(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);
    }
}
