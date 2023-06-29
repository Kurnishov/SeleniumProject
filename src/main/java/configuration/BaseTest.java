package configuration;

import org.junit.jupiter.api.*;

public class BaseTest {

    @BeforeEach
    protected void navigateToMainUrl() {
        MainConfig.setup();
        MainConfig.driver.get("https://www.stibosystems.com/");
    }

    @AfterEach
    protected void teardown() {
        MainConfig.driver.quit();
    }
}
