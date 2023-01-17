import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static junit.framework.Assert.*;

public class CheckboxesTests extends _Common {

    CheckboxesPage cbp;

    public void setUpPage() {
        base.navigateToByLink("Checkboxes");
        cbp = new CheckboxesPage(driver);
    }

    @Test
    public void check_unselected_input_works_correctly() {
        setUpPage();
        String errorMessage = "Number of selected chechboxes is not correct";
        int totalCheckboxes = cbp.checkboxes.size();

        for(WebElement box:cbp.checkboxes){
            if (!box.isSelected()) box.click();
        }

        int selectedBoxes = cbp.countSelected(cbp.checkboxes);

        assertEquals(errorMessage, totalCheckboxes, selectedBoxes);
    }

    @Test
    public void uncheck_selected_input_works_correctly() {
        setUpPage();
        String errorMessage = "Number of selected chechboxes is not correct";
        int expectedBoxes = 0;

        for(WebElement box:cbp.checkboxes){
            if (box.isSelected()) box.click();
        }

        int selectedBoxes = cbp.countSelected(cbp.checkboxes);

        assertEquals(errorMessage, expectedBoxes, selectedBoxes);
    }

    @Test
    public void check_previously_unchecked_input_works_correctly(){
        setUpPage();
        String SelectedErrorMessage = "Checkbox is not selected";
        String NotSelectedErrorMessage = "Checkbox is selected";
        WebElement box = cbp.checkboxes.get(1);

        assertTrue(SelectedErrorMessage, box.isSelected());
        box.click();

        assertFalse(NotSelectedErrorMessage, box.isSelected());
        box.click();

        assertTrue(SelectedErrorMessage, box.isSelected());
    }

    @Test
    public void uncheck_previously_checked_input_works_correctly(){
        setUpPage();
        String SelectedErrorMessage = "Checkbox is not selected";
        String NotSelectedErrorMessage = "Checkbox is selected";
        WebElement box = cbp.checkboxes.get(0);

        assertFalse(NotSelectedErrorMessage, box.isSelected());
        box.click();

        assertTrue(SelectedErrorMessage, box.isSelected());
        box.click();

        assertFalse(NotSelectedErrorMessage, box.isSelected());
    }

}