package configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class MainConfig {
    public static WebDriver driver;

    protected static void setup() {
        System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
    }
}
