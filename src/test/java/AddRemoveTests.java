import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class AddRemoveTests extends _Common {

    AddRemovePage arp;

    public void setUpPage() {
        base.navigateToByLink("Add/Remove Elements");
        arp = new AddRemovePage(driver);
    }

    @Test
    public void Add_Elements_Works() {
        setUpPage();

        int random = (int)(Math.random()*10+1);
        arp.addButtons(random);
        int addedButtons = driver.findElements(arp.deleteButton).size();

        String errorMessage = "The buttons have not been added correctly";
        assertEquals(errorMessage, random, addedButtons);
    }

    @Test
    public void Remove_Some_Elements_Works() {
        setUpPage();

        int randomAdd = (int)(Math.random()*10+1);
        int randomRemove = (int)(Math.random()*randomAdd);
        arp.addButtons(randomAdd);
        arp.removeButtons(randomRemove);
        int stayButtonsExpected = randomAdd - randomRemove;
        int stayButtonsActual = driver.findElements(arp.deleteButton).size();

        String errorMessage = "The buttons have not been added or removed correctly";
        assertEquals(errorMessage, stayButtonsExpected, stayButtonsActual);
    }

    @Test
    public void Remove_All_Elements_Works() {
        setUpPage();

        int random = (int)(Math.random()*10+1);
        arp.addButtons(random);
        arp.removeButtons(random);
        int buttons = driver.findElements(arp.deleteButton).size();

        String errorMessage = "The buttons have not been removed correctly";
        assertEquals(errorMessage, 0, buttons);
    }

}