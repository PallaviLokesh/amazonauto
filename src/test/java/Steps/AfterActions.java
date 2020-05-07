package Steps;

import utils.MobileDriver;
import cucumber.api.java.After;

public class AfterActions {

    @After
    public void tearDown() {
        System.out.println("driver.quit()");
        MobileDriver.tearDownClose();
    }
}
