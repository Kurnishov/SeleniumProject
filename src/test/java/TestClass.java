import configuration.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;
import pages.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestClass extends BaseTest {

    private final BasePage basePage = new BasePage();
    private final MainDashboardPage mainDashboardPage = new MainDashboardPage();
    private final ContactUsPage contactUsPage = new ContactUsPage();

    @Test
    @Description("Basic site validation")
    public void TestMethod() {
       var testMessage = "Testing";
       var country = "Ukraine";
       basePage.clickAcceptAllButton();

       mainDashboardPage.clickBookDemoButton();
       assertTrue(contactUsPage.getBookFreeText());
       contactUsPage.setMessage(testMessage);
       contactUsPage.setCountry(country);
       contactUsPage.clickSendButton();
       assertTrue(contactUsPage.getErrorLabel());

       basePage.clickStiboSystemsLogo();
       assertTrue(mainDashboardPage.getMainPageData());
    }
}
