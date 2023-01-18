import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KeyPressesTests extends _Common {

    KeyPressesPage kpp;

    public void setUpPage() {
        base.navigateToByLink("Key Presses");
        kpp = new KeyPressesPage(driver);
    }

    @Test
    public void press_any_text_works_correctly() {
        setUpPage();

        driver.findElement(kpp.input).sendKeys("hello world");
        String expectedText = "You entered: D";
        String actualText = driver.findElement(kpp.result).getText();
        String errorText = "Text dont match";

        assertEquals(expectedText, actualText, errorText);
    }

    @Test
    public void press_arrow_keys_works_correctly() {
        setUpPage();
        String errorText = "Text dont match";

        driver.findElement(kpp.input).sendKeys(Keys.LEFT);
        String expectedText = "You entered: LEFT";
        String actualText = driver.findElement(kpp.result).getText();
        assertEquals(expectedText, actualText, errorText);

        driver.findElement(kpp.input).sendKeys(Keys.RIGHT);
        expectedText = "You entered: RIGHT";
        actualText = driver.findElement(kpp.result).getText();
        assertEquals(expectedText, actualText, errorText);

        driver.findElement(kpp.input).sendKeys(Keys.UP);
        expectedText = "You entered: UP";
        actualText = driver.findElement(kpp.result).getText();
        assertEquals(expectedText, actualText, errorText);

        driver.findElement(kpp.input).sendKeys(Keys.DOWN);
        expectedText = "You entered: DOWN";
        actualText = driver.findElement(kpp.result).getText();
        assertEquals(expectedText, actualText, errorText);
    }

    @Test
    public void press_back_key_works_correctly() {
        setUpPage();

        driver.findElement(kpp.input).sendKeys("hello world");
        driver.findElement(kpp.input).sendKeys(Keys.BACK_SPACE);
        String expectedText = "You entered: BACK_SPACE";
        String actualText = driver.findElement(kpp.result).getText();
        String errorText = "Text dont match";

        assertEquals(expectedText, actualText, errorText);
    }

    @Test
    public void press_function_keys_works_correctly() {
        setUpPage();
        String errorText = "Text dont match";

        for (int i=1; i<=12; i++) {
            String function = "F"+i;
            driver.findElement(kpp.input).sendKeys(Keys.valueOf(function));
            String expectedText = "You entered: F"+i;
            String actualText = driver.findElement(kpp.result).getText();
            assertEquals(expectedText, actualText, errorText);
        }
    }



}