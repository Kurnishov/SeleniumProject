package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import static configuration.PageExtensions.*;

public class ContactUsPage {

    private final By bookFreeText = By.xpath("//div[@class='hs-richtext hs-main-font-element'][contains(.,'Book a free product demo today.')]");
    private final By yourMessageInput = By.xpath("//textarea[@placeholder='Your message']");
    private final By countryDropdownList = By.xpath("//select[@name='country']");
    private final By sendButton = By.xpath("//input[@value='Send']");
    private final By errorMessage = By.xpath("//label[@class][contains(.,'Please complete this required field.')]");

    public boolean getBookFreeText() {
        return findElement(bookFreeText).isDisplayed();
    }

    public boolean getErrorLabel() {
        return findElement(errorMessage).isDisplayed();
    }

    public void setMessage(String message) {
        findElement(yourMessageInput).sendKeys(message);
    }

    public void setCountry(String country) {
        var options = findElements(countryDropdownList);
        for (WebElement option : options) {
            if (option.getAttribute("value").equals(country)) {
                Select selectCountry = new Select(option);
                selectCountry.selectByValue(country);
            }
        }
    }

    public void clickSendButton() {
        findElement(sendButton).click();
    }
}
