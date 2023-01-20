import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DropdownTests extends _Common {

    DropdownPage ddp;

    public void setUpPage() {
        base.navigateToByLink("Dropdown");
        ddp = new DropdownPage(driver);
    }

    @Test
    public void check_title_is_correct() {
        setUpPage();
        String expectedTitle = "Dropdown List";
        String actualTitle = ddp.title.getText();
        String errorMessage = "Title is not correct";

        assertEquals(expectedTitle, actualTitle, errorMessage);
    }

    @Test
    public void test(){
        setUpPage();

        System.out.println(ddp.options.size());
    }
}
