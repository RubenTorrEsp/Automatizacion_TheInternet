import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DragAndDropTests extends _Common {

    DragAndDropPage ddp;

    public void setUpPage() {
        base.navigateToByLink("Drag and Drop");
        ddp = new DragAndDropPage(driver);
    }

    @Test
    public void drop_a2b_works() {
        setUpPage();

        String expectedTitle = "a";
        String actualTitle = "a";

        List<WebElement> columns = driver.findElements(By.className("column"));

        System.out.println("Before");
        System.out.println(columns.get(0).getText());
        System.out.println(columns.get(1).getText());

        WebElement columnA = driver.findElement(By.id("column-a"));
        WebElement columnB = driver.findElement(By.id("column-b"));

        Actions action = new Actions(driver);
        action.dragAndDrop(columnA, columnB).build().perform();

        columns = driver.findElements(By.className("column"));

        System.out.println("After");
        System.out.println(columns.get(0).getText());
        System.out.println(columns.get(1).getText());


        assertEquals(expectedTitle, actualTitle, ddp.errorMessage);
    }

}
