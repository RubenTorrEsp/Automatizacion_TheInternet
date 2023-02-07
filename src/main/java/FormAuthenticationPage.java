import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FormAuthenticationPage extends _BasePage {

    public FormAuthenticationPage(WebDriver driver) {
        super(driver);
    }

    String correctUser = "tomsmith";
    String wrongUser = "will smith";
    String correctPass = "SuperSecretPassword!";
    String wrongPass = "1234";

    By input = By.cssSelector("input");
    By buton = By.cssSelector("button");

    List<WebElement> inputs = driver.findElements(input);
    WebElement userName = inputs.get(0);
    WebElement password = inputs.get(1);

    public String getFlashMessage() {
        String message = driver.findElement(By.id("flash")).getText();
        return message;
    }

    public void logOut() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(page -> page.findElement(By.linkText("Logout")))
                .click();
    }

}
