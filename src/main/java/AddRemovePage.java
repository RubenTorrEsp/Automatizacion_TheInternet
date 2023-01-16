import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemovePage extends _BasePage {

    public AddRemovePage(WebDriver driver) {
        super(driver);
    }

    By addElementButton = By.cssSelector("button");
    By deleteButton = By.className("added-manually");


    public void addButtons(int rep) {
        for (int i=0; i<rep; i++){
            driver.findElement(addElementButton).click();
        }
    }

    public void removeButtons(int rep) {
        for (int i=0; i<rep; i++){
            driver.findElement(deleteButton).click();
        }
    }

}