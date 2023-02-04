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

        //System.out.println(fap.message);

        String expectedURL = "secure";
        boolean actualURL = driver.getCurrentUrl().endsWith(expectedURL);

        assertTrue(actualURL);
    }

    @Test
    public void incorrect_user_works() {
        setUpPage();

        fap.userName.sendKeys(fap.wrongUser);
        fap.password.sendKeys(fap.correctPass);
        base.click(fap.buton);

        //System.out.println(fap.message);

        String expectedURL = "login";
        boolean actualURL = driver.getCurrentUrl().endsWith(expectedURL);

        assertTrue(actualURL);
    }

    @Test
    public void incorrect_password_works() {
        setUpPage();

        fap.userName.sendKeys(fap.correctUser);
        fap.password.sendKeys(fap.wrongPass);
        base.click(fap.buton);

        //System.out.println(fap.message);

        String expectedURL = "login";
        boolean actualURL = driver.getCurrentUrl().endsWith(expectedURL);

        assertTrue(actualURL);
    }

}
