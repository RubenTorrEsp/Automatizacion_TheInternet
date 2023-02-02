import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DragAndDropPage extends _BasePage {

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    String errorMessage = "Drag and Drop didn´t work correctly";

    By sqare = By.className("column");
    WebElement columnA = findElement(By.id("column-a"));
    WebElement columnB = findElement(By.id("column-b"));
    By text = By.cssSelector("header");

}
