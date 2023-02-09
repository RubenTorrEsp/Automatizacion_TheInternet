import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputsTests extends _Common {

    InputsPage ip;

    public void setUpPage() {
        base.navigateToByLink("Inputs");
        ip = new InputsPage(driver);
    }

    @Test
    public void input_works() throws InterruptedException {
        setUpPage();

        driver.findElement(ip.input).sendKeys("0");
        Thread.sleep(2000);

        String expectedNumber = "";
        String actualNumber = driver.findElement(ip.input).getText();

        assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void input_letter_filter_works() throws InterruptedException {
        setUpPage();

        driver.findElement(ip.input).sendKeys("Prueba");
        Thread.sleep(2000);

        String expectedText = "";
        String actualText = driver.findElement(ip.input).getText();

        assertEquals(expectedText, actualText);
    }

}
