import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DragAndDropPage extends _BasePage {

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    String errorMessage = "Drag and Drop didn´t work correctly";

    By sqare = By.className("column");
    By columnA = By.id("column-a");
    By columnB = By.id("column-b");
    By text = By.cssSelector("header");

}
