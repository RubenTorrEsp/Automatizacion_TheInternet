import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FormAuthenticationTests extends _Common {

    FormAuthenticationPage fap;

    public void setUpPage() {
        base.navigateToByLink("Form Authentication");
        fap = new FormAuthenticationPage(driver);
    }

    @Test
    public void correct_login_works() {
        setUpPage();

        fap.userName.sendKeys(fap.correctUser);
        fap.password.sendKeys(fap.correctPass);
        base.click(fap.buton);

        String expectedFlashMessage = "You logged into a secure area!";
        String actualFlashMessage = fap.getFlashMessage();
        boolean checkFlashMessage = actualFlashMessage.contains(expectedFlashMessage);
        String expectedURL = "secure";
        String actualURL = driver.getCurrentUrl();
        boolean checkURL = actualURL.endsWith(expectedURL);

        assertTrue(checkURL);
        assertTrue(checkFlashMessage);
    }

    @Test
    public void incorrect_user_works() {
        setUpPage();

        fap.userName.sendKeys(fap.wrongUser);
        fap.password.sendKeys(fap.correctPass);
        base.click(fap.buton);

        String expectedFlashMessage = "Your username is invalid!";
        String actualFlashMessage = fap.getFlashMessage();
        boolean checkFlashMessage = actualFlashMessage.contains(expectedFlashMessage);
        String expectedURL = "login";
        String actualURL = driver.getCurrentUrl();
        boolean checkURL = actualURL.endsWith(expectedURL);

        assertTrue(checkURL);
        assertTrue(checkFlashMessage);
    }

    @Test
    public void incorrect_password_works() {
        setUpPage();

        fap.userName.sendKeys(fap.correctUser);
        fap.password.sendKeys(fap.wrongPass);
        base.click(fap.buton);

        String expectedFlashMessage = "Your password is invalid!";
        String actualFlashMessage = fap.getFlashMessage();
        boolean checkFlashMessage = actualFlashMessage.contains(expectedFlashMessage);
        String expectedURL = "login";
        String actualURL = driver.getCurrentUrl();
        boolean checkURL = actualURL.endsWith(expectedURL);

        assertTrue(checkURL);
        assertTrue(checkFlashMessage);
    }

}
