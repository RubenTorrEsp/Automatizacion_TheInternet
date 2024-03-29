import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _BasePage {

    public WebDriver driver;

    public _BasePage(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver chromeDriverConnection() {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    public void navigateToByLink(String tag){
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(page -> page.findElement(By.linkText(tag)));
        click(By.linkText(tag));
    }

    public void click(By locator){
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(page -> page.findElement(locator));
        driver.findElement(locator).click();
    }

    public WebElement findElement(By locator){
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(page -> page.findElement(locator));
        return driver.findElement(locator);
    }

    public void goToURL(String url){
        driver.get(url);
    }
}
