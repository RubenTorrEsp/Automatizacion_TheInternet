import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class JavaScriptAlertsPage extends _BasePage {

    String result;

    List<WebElement> buttons = driver.findElements(By.cssSelector("button"));

    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }
}
