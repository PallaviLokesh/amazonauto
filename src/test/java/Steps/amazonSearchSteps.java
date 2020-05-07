package Steps;

import java.util.List;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import page.actions.amazonSearchPageActions;
import page.locators.amazonSearchPageLocators;

public class amazonSearchSteps {

    amazonSearchPageActions amazonPageactions = new amazonSearchPageActions();
    amazonSearchPageLocators amazonPagelocators = new amazonSearchPageLocators();

    // home menu
    @Given("^I am on home Page$")
    public void I_am_on_home_Page() throws Throwable {
        System.out.println("==========================");
        System.out.println("Tap on More information about this dealer");

        boolean signin = amazonPageactions.homeMenuiconDis();
        if (signin == true) {
            System.out.println("The home menu icon is present");
        } else
            System.out.println("Element is not present");
    }

    // search text box
    @When("^I tap on search text box$")
    public void I_tap_on_search_text_box() throws Throwable {
        System.out.println("==========================");
        System.out.println("Tap on menu icon");

        boolean signin = amazonPageactions.searchTextBoxDis();
        if (signin == true) {
            System.out.println("The home menu icon is present");
            amazonPageactions.searchTextBoxClick();
        } else
            System.out.println("Element is not present");
    }


    @Then("^enter the search criteria$")
    public void enter_the_search_criteria(DataTable table) throws Throwable {
        List<String> data = table.asList(String.class);
        System.out.println("@And -- user enter the text: " + data.get(0));
        for (int i = 1; i < data.size(); i++) {
            String listingsID = data.get(i);
            System.out.println(listingsID);
            amazonPageactions.sendKeysTextSaerchBox(listingsID);
        }
    }

    @And("^I click on the item$")
    public void I_click_on_the_item() throws Throwable {

        amazonPagelocators.swipe();
        boolean signin = amazonPageactions.selectItemListedDis();
        if (signin == true) {
            System.out.println("The home menu icon is present");
            amazonPageactions.selectItemListed();
        } else
            System.out.println("Element is not present");
    }
}

