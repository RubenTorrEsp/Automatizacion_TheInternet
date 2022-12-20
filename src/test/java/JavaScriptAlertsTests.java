import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class JavaScriptAlertsTests extends _Common {

    JavaScriptAlertsPage jsap;

    String promptText = "Texto de prueba";

    public void setUpPage() {
        base.navigateToByLink("JavaScript Alerts");
        jsap = new JavaScriptAlertsPage(driver);
    }

    public void clickButton(int order){
        jsap.buttons.get(order).click();
    }

    @Test
    public void JS_Alert_Works() {
        setUpPage();
        clickButton(0);
        driver.switchTo().alert().accept();
        jsap.result = driver.findElement(By.id("result")).getText();
        String expectedResult = "You successfully clicked an alert";

        assertEquals("El texto no coincide",expectedResult, jsap.result);
    }

    @Test
    public void JS_Confirm_Accept_Works() {
        setUpPage();
        clickButton(1);
        driver.switchTo().alert().accept();
        jsap.result = driver.findElement(By.id("result")).getText();
        String expectedResult = "You clicked: Ok";

        assertEquals("El texto no coincide",expectedResult, jsap.result);
    }

    @Test
    public void JS_Confirm_Cancel_Works() {
        setUpPage();
        clickButton(1);
        driver.switchTo().alert().dismiss();
        jsap.result = driver.findElement(By.id("result")).getText();
        String expectedResult = "You clicked: Cancel";

        assertEquals("El texto no coincide",expectedResult, jsap.result);
    }

    @Test
    public void JS_Prompt_Accept_Works() {
        setUpPage();
        clickButton(2);
        driver.switchTo().alert().sendKeys(promptText);
        driver.switchTo().alert().accept();
        jsap.result = driver.findElement(By.id("result")).getText();
        String expectedResult = "You entered: "+promptText;

        assertEquals("El texto no coincide",expectedResult, jsap.result);
    }

    @Test
    public void JS_Prompt_Cancel_Works() {
        setUpPage();
        clickButton(2);
        driver.switchTo().alert().sendKeys(promptText);
        driver.switchTo().alert().dismiss();
        jsap.result = driver.findElement(By.id("result")).getText();
        String expectedResult = "You entered: null";

        assertEquals("El texto no coincide",expectedResult, jsap.result);
    }
}
