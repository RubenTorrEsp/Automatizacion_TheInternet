import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemovePage extends BasePage {
    By addElementButton = new By.ByLinkText("Add Element");
    By deleteButton = new By.ByLinkText("Delete");

    public AddRemovePage(WebDriver driver) {
        super(driver);
    }
}
