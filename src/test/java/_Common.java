import org.junit.*;

import org.openqa.selenium.WebDriver;

public class _Common {
    public WebDriver driver;

    _BasePage base;

    @Before
    public void setUp () {
        base = new _BasePage(driver);
        driver = base.chromeDriverConnection();
        base.goToURL("https://the-internet.herokuapp.com/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
