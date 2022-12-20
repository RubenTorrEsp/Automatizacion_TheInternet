import org.junit.Test;
import org.openqa.selenium.By;

import java.time.Duration;

public class AddRemoveTests extends _Common {

    @Test
    public void test() throws InterruptedException {
        base.navigateToByLink("Add/Remove Elements");
        Thread.sleep(Duration.ofSeconds(1));
        base.click(By.cssSelector("button"));
        Thread.sleep(Duration.ofSeconds(1));
        base.click(By.className("added-manually"));
    }
}

