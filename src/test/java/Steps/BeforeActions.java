package Steps;

import java.net.MalformedURLException;
import cucumber.api.java.Before;
import utils.MobileDriver;

public class BeforeActions {

    @Before
    public void setup() throws MalformedURLException {
        System.out.println("Launch the App-test");
        MobileDriver.installApp();

    }
}
