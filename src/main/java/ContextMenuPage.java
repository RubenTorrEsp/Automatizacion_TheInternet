import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends _BasePage {

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    WebElement spot = driver.findElement(By.id("hot-spot"));

    public String getText() {
        try {
            return driver.switchTo().alert().getText();
        } catch (NoAlertPresentException e) {
            return "";
        }
    }

    public void rightClick(WebElement element) {
        Actions action = new Actions(driver);
        action.contextClick(element).perform();
    }

}