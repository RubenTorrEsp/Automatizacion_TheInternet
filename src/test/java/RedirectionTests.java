import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RedirectionTests extends _Common {

        RedirectionPage rp;

        public void setUpPage() {
            base.navigateToByLink("Redirect Link");
            rp = new RedirectionPage(driver);
        }

        @Test
        public void redirection_works() {
            setUpPage();
            boolean checkURL;

            checkURL = driver.getCurrentUrl().endsWith("redirector");
            assertTrue(checkURL);

            By redirectLink = By.linkText("here");
            base.click(redirectLink);

            checkURL = driver.getCurrentUrl().endsWith("status_codes");
            assertTrue(checkURL);
        }
}