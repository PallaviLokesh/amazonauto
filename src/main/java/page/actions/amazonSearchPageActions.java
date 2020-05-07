package page.actions;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import page.locators.amazonSearchPageLocators;
import utils.MobileDriver;

public class amazonSearchPageActions {

    public static AndroidDriver<MobileElement> driver;

    amazonSearchPageLocators amazonPagelocators = new amazonSearchPageLocators();

    public amazonSearchPageActions() {
        this.amazonPagelocators = new amazonSearchPageLocators();
        PageFactory.initElements(new AppiumFieldDecorator(MobileDriver.getDriver()), amazonPagelocators);
    }

    // designMenu
    public boolean designMenuitemDis() {
        boolean a = false;
        try {
            a = amazonPagelocators.designMenuitem.isDisplayed();
            System.out.println("Element is displayed");
        } catch (NoSuchElementException e) {
            System.out.println("Element not displayed");
        }
        return a;
    }

    public void designMenuitemClick() {
        try {
            amazonPagelocators.designMenuitem.click();
            System.out.println("Element is clicked");
        } catch (NoSuchElementException e) {
            System.out.println("Element not clicked");
        }
    }

    // homeMenuicon
    public boolean homeMenuiconDis() {
        boolean a = false;
        try {
            a = amazonPagelocators.homeMenuicon.isDisplayed();
            System.out.println("Element is displayed");
        } catch (NoSuchElementException e) {
            System.out.println("Element not displayed");
        }
        return a;
    }

    public void homeMenuiconClick() {
        try {
            amazonPagelocators.homeMenuicon.click();
            System.out.println("Element is clicked");
        } catch (NoSuchElementException e) {
            System.out.println("Element not clicked");
        }
    }

    // searchTextBox
    public boolean searchTextBoxDis() {
        boolean a = false;
        try {
            a = amazonPagelocators.searchTextBox.isDisplayed();
            System.out.println("Element is displayed");
        } catch (NoSuchElementException e) {
            System.out.println("Element not displayed");
        }
        return a;
    }

    public void searchTextBoxClick() {
        try {
            amazonPagelocators.searchTextBox.click();
            System.out.println("Element is clicked");
        } catch (NoSuchElementException e) {
            System.out.println("Element not clicked");
        }
    }

    public void sendKeysTextSaerchBox(String text) {
        try {
            amazonPagelocators.searchTextBox.sendKeys(text);
            System.out.println("key typed");
        } catch (NoSuchElementException e) {
            System.out.println("Element not found for key typed");
        }
    }

    public boolean selectItemListedDis() {
        boolean a = false;
        try {
            amazonPagelocators.selectItem.isDisplayed();
            System.out.println("Displayed");
        }
        catch (NoSuchElementException e) {
            System.out.println("Not displayed");
        }
        return a;
    }

    public void selectItemListed() {
        try {
            amazonPagelocators.selectItem.click();
            System.out.println("Item clicked");
        }
        catch (NoSuchElementException e) {
            System.out.println("Element not Item clicked");
        }
    }

    // Navigate back
    public void NavigateBack() {
        MobileDriver.getDriver().navigate().back();
    }

}
