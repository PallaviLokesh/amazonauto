package utils;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileDriver {

    public static AndroidDriver<MobileElement> Mobiledriver;
    static String URL;

    public static void installApp() throws MalformedURLException {

//        File classpathRoot = new File(System.getProperty("user.dir"));
//        File app = new File(classpathRoot, "/app/<placeholder>.apk"); //If the app is not installed

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("noReset", true);
        capabilities.setCapability(MobileCapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, true);
        capabilities.setCapability(MobileCapabilityType.VERSION, "1.6.5");
        capabilities.setCapability("browserName", "");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "2b64407d891c7ece");
        capabilities.setCapability("platformVersion", "9.0");
//      capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.amazon.mShop.android.shopping");
        capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
        capabilities.setCapability("browserstack.debug", true);
        capabilities.setCapability("autoAcceptAlerts", true);
        capabilities.setCapability("autoDismissAlerts", true);
        Mobiledriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        Mobiledriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static AndroidDriver<MobileElement> getDriver() {
        return Mobiledriver;
    }

    public static void tearDownClose() {
        if (Mobiledriver != null) {
            Mobiledriver.closeApp();
            System.out.println("driver.close()");

        }
    }

}
