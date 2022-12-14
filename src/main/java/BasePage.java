import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver chromeDriverConnection() {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    public void navigateToByLink(String tag){
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(contactPage -> contactPage.findElement(By.linkText(tag)));
        click(By.linkText(tag));
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public void goToURL(String url){
        driver.get(url);
    }
}
