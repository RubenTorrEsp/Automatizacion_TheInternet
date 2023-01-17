import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxesPage extends _BasePage {

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    List<WebElement> checkboxes = driver.findElements(By.cssSelector("input"));

    public int countSelected(List<WebElement> boxes){
        int selected = 0;

        for (int i=0; i<boxes.size(); i++) {
            if (boxes.get(i).isSelected()) selected++;
        }

        return selected;
    }

}