import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class JavaScriptAlertsPage extends _BasePage {

    String promptText = "Test text";
    By result = By.id("result");
    List<WebElement> buttons = driver.findElements(By.cssSelector("button"));

    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }

    public void clickButton(int order){
        buttons.get(order).click();
    }

}