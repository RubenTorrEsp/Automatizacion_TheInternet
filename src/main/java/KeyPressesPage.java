import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage extends _BasePage {

    public KeyPressesPage(WebDriver driver) { super(driver); }

    By input = By.id("target");
    By result = By.id("result");

}