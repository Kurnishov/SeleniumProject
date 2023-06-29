package pages;

import org.openqa.selenium.*;

import static configuration.PageExtensions.*;

public class BasePage {
    private final By acceptAllButton = By.xpath("//button[@aria-label='Accept all']");
    private final By stiboSystemsLogo = By.xpath("//div[@class='sb-nav-content']//img[@alt='Stibo Systems - The Master Data Management Company']");

    public void clickAcceptAllButton() {
        findElement(acceptAllButton).click();
    }

    public void clickStiboSystemsLogo() {
        findElement(stiboSystemsLogo).click();
    }
}
