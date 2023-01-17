import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class _Common {
    public WebDriver driver;

    _BasePage base;

    @BeforeEach
    public void setUp () {
        base = new _BasePage(driver);
        driver = base.chromeDriverConnection();
        base.goToURL("https://the-internet.herokuapp.com/");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}