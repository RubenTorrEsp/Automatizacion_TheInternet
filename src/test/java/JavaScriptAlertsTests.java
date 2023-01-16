import org.junit.jupiter.api.Test;
import static junit.framework.Assert.assertEquals;

public class JavaScriptAlertsTests extends _Common {

    JavaScriptAlertsPage jsap;

    public void setUpPage() {
        base.navigateToByLink("JavaScript Alerts");
        jsap = new JavaScriptAlertsPage(driver);
    }

    @Test
    public void JS_Alert_Works() {
        setUpPage();
        jsap.clickButton(0);
        driver.switchTo().alert().accept();

        String expectedResult = "You successfully clicked an alert";
        String resultText = driver.findElement(jsap.result).getText();

        String errorMessage = "The text does not match";
        assertEquals(errorMessage, expectedResult, resultText);
    }

    @Test
    public void JS_Confirm_Accept_Works() {
        setUpPage();
        jsap.clickButton(1);
        driver.switchTo().alert().accept();

        String expectedResult = "You clicked: Ok";
        String resultText = driver.findElement(jsap.result).getText();

        String errorMessage = "The text does not match";
        assertEquals(errorMessage, expectedResult, resultText);
    }

    @Test
    public void JS_Confirm_Cancel_Works() {
        setUpPage();
        jsap.clickButton(1);
        driver.switchTo().alert().dismiss();

        String expectedResult = "You clicked: Cancel";
        String resultText = driver.findElement(jsap.result).getText();

        String errorMessage = "The text does not match";
        assertEquals(errorMessage, expectedResult, resultText);
    }

    @Test
    public void JS_Prompt_Accept_Works() {
        setUpPage();
        jsap.clickButton(2);
        driver.switchTo().alert().sendKeys(jsap.promptText);
        driver.switchTo().alert().accept();

        String expectedResult = "You entered: " + jsap.promptText;
        String resultText = driver.findElement(jsap.result).getText();

        String errorMessage = "The text does not match";
        assertEquals(errorMessage, expectedResult, resultText);
    }

    @Test
    public void JS_Prompt_Cancel_Works() {
        setUpPage();
        jsap.clickButton(2);
        driver.switchTo().alert().sendKeys(jsap.promptText);
        driver.switchTo().alert().dismiss();

        String expectedResult = "You entered: null";
        String resultText = driver.findElement(jsap.result).getText();

        String errorMessage = "The text does not match";
        assertEquals(errorMessage, expectedResult, resultText);
    }

}