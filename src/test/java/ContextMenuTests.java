import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContextMenuTests extends _Common {

    ContextMenuPage cmp;

    public void setUpPage(){
        base.navigateToByLink("Context Menu");
        cmp = new ContextMenuPage(driver);
    }

    @Test
    public void popUp_appears_correctly() {
        setUpPage();
        String errorText = "Alert pop up haven´t charge as expected";

        cmp.rightClick(cmp.spot);
        String alertText = cmp.getText();
        String expectedAlertText = "You selected a context menu";

        assertEquals(expectedAlertText, alertText, errorText);
    }

    @Test
    public void popUp_must_be_accepted_correctly() {
        setUpPage();
        String errorText = "Alert pop up haven´t charge as expected";

        cmp.rightClick(cmp.spot);
        driver.switchTo().alert().accept();
        String expectedAlertText = "";
        String alertText = cmp.getText();

        assertEquals(expectedAlertText, alertText, errorText);
    }

}