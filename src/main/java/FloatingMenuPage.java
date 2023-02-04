import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FloatingMenuPage extends _BasePage {

    public FloatingMenuPage(WebDriver driver) {
        super(driver);
    }

    By link = By.cssSelector("a");

    List<WebElement> links = driver.findElements(link);

}
