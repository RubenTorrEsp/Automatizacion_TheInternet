import org.junit.*;

import org.openqa.selenium.WebDriver;

public class Common{
    public WebDriver driver;

    BasePage base;

    @Before
    public void setUp () {
        base = new BasePage(driver);
        driver = base.chromeDriverConnection();
        base.goToURL("https://the-internet.herokuapp.com/");
    }

    /*
    @After
    public void tearDown() {
        driver.quit();
    }
    */

}
