import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;



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

        Assertions.assertEquals(totalCheckboxes, selectedBoxes, errorMessage);
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

        Assertions.assertEquals(expectedBoxes, selectedBoxes, errorMessage);
    }

    @Test
    public void check_previously_unchecked_input_works_correctly(){
        setUpPage();
        String SelectedErrorMessage = "Checkbox is not selected";
        String NotSelectedErrorMessage = "Checkbox is selected";
        WebElement box = cbp.checkboxes.get(1);

        Assertions.assertTrue(box.isSelected(), SelectedErrorMessage);
        box.click();

        Assertions.assertFalse(box.isSelected(), NotSelectedErrorMessage);
        box.click();

        Assertions.assertTrue(box.isSelected(), SelectedErrorMessage);
    }

    @Test
    public void uncheck_previously_checked_input_works_correctly(){
        setUpPage();
        String SelectedErrorMessage = "Checkbox is not selected";
        String NotSelectedErrorMessage = "Checkbox is selected";
        WebElement box = cbp.checkboxes.get(0);

        Assertions.assertFalse(box.isSelected(), NotSelectedErrorMessage);
        box.click();

        Assertions.assertTrue(box.isSelected(), SelectedErrorMessage);
        box.click();

        Assertions.assertFalse(box.isSelected(), NotSelectedErrorMessage);
    }

}