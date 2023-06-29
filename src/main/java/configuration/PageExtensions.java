package configuration;

import org.openqa.selenium.*;

import java.util.*;

import static configuration.MainConfig.*;

public class PageExtensions {
    private static final String mainWindow = driver.getWindowHandle();

    public static WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public static List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }

    public static void switchToNewWindow() {
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }
}
