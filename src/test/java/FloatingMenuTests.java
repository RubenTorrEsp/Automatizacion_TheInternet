import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FloatingMenuTests extends _Common{

    FloatingMenuPage fmp;

    public void setUpPage() {
        base.navigateToByLink("Floating Menu");
        fmp = new FloatingMenuPage(driver);
    }

    @Test
    public void floating_menu_links_navigation_works() {
        setUpPage();

        String[] links = {"Home", "News", "Contact", "About"} ;

        for (String link:links) {
            driver.findElement(By.linkText(link)).click();
            boolean navigate = driver.getCurrentUrl().endsWith(link.toLowerCase());

            assertTrue(navigate);
        }

    }

}
