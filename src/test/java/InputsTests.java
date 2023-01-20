public class InputsTests extends _Common {

    InputsPage ip;

    public void setUoPage() {
        base.navigateToByLink("Inputs");
        ip = new InputsPage(driver);
    }



}
