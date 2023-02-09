import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class StatusCodesTests extends _Common {

    StatusCodesPages scp;

    public void setUpPage() {
        base.navigateToByLink("Status Codes");
        scp = new StatusCodesPages(driver);
    }

    @Test
    public void status_works() throws InterruptedException {
        setUpPage();

        List<WebElement> links = driver.findElements(By.cssSelector("a"));

        for(int i = 2; i<6; i++) {
            System.out.println(links.get(i).getText());
        }

    }
}

