import org.junit.jupiter.api.Test;

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


        assertEquals(expectedTitle, actualTitle, ddp.errorMessage);
    }

}
