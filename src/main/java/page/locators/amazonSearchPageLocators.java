package page.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.MobileDriver;

public class amazonSearchPageLocators {

    @AndroidFindBy(id = "button_sign_in")
    public MobileElement signinbtn;

    @AndroidFindBy(id = "design_menu_item_text")
    public MobileElement designMenuitem;

    @AndroidFindBy(id = "home")
    public MobileElement homeMenuicon;

    @AndroidFindBy(id = "rs_search_src_text")
    public MobileElement searchTextBox;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView[71]")
    public MobileElement selectItem;

    public void swipe() {

        System.out.println("Swipe");
        Dimension dim = MobileDriver.Mobiledriver.manage().window().getSize();
        System.out.println(dim);
        int height = dim.getHeight();
        int width = dim.getWidth();
        int y = (int) (height * 0.25);
        int startx = (int) (width * 0.25);
        int endx = (int) (width * 0.35);
        MobileDriver.Mobiledriver.swipe(startx, y, endx, y, 500);
    }
}
