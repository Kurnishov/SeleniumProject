package pages;

import org.openqa.selenium.By;

import static configuration.PageExtensions.*;

public class MainDashboardPage {
    private final By bookDemoButton = By.xpath("//a[@class='sb-big-hero-content-link-orange']");
    private final By mainPageData = By.xpath("//div[@class='sb-big-hero-main']");

    public void clickBookDemoButton() {
        findElement(bookDemoButton).click();
        switchToNewWindow();
    }

    public boolean getMainPageData() {
       return findElement(mainPageData).isDisplayed();
    }
}
