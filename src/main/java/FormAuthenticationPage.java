import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FormAuthenticationPage extends _BasePage {

    public FormAuthenticationPage(WebDriver driver) {
        super(driver);
    }

    String correctUser = "tomsmith";
    String wrongUser = "will smith";
    String correctPass = "SuperSecretPassword!";
    String wrongPass = "1234";

    //String message = driver.findElement(By.id("flash")).toString();

    By input = By.cssSelector("input");
    By buton = By.cssSelector("button");

    List<WebElement> inputs = driver.findElements(input);
    WebElement userName = inputs.get(0);
    WebElement password = inputs.get(1);

}
