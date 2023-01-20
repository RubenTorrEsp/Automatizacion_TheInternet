import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputsPage extends _BasePage {

    public InputsPage(WebDriver driver) {
        super(driver);
    }

    WebElement input = driver.findElement(By.cssSelector("input"));



}
