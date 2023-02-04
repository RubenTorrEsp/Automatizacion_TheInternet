import org.junit.jupiter.api.Test;

public class FormAuthenticationTests extends _Common {

    FormAuthenticationPage fap;

    public void setUpPage() {
        base.navigateToByLink("Form Authentication");
        fap = new FormAuthenticationPage(driver);
    }

    @Test
    public void test() {
        setUpPage();
    }

}
