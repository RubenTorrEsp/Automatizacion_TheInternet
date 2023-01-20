import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DropdownPage extends _BasePage {

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    WebElement dropdown = driver.findElement(By.id("dropdown"));
    WebElement title = driver.findElement(By.cssSelector("h3"));
    List<WebElement> options = driver.findElements(By.cssSelector("option"));

}
