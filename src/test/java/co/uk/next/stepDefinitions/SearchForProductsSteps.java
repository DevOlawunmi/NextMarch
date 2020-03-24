package co.uk.next.stepDefinitions;

import co.uk.next.pages.BasePage;
import co.uk.next.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class SearchForProductsSteps extends BasePage {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    @Given("I navigate to next.co.uk")
    public void i_navigate_to_next_co_uk() {
launchURL();
    }

    @When("I enter {string} in the search field")
    public void i_enter_in_the_search_field(String productType) {
homePage.enterProductName(productType);
    }

    @When("I click on the search button")
    public void i_click_on_the_search_button() {
homePage.clickOnSearchButton();
    }

    @Then("a list of {string} is displayed")
    public void a_list_of_is_displayed(String string) {

    }

    @Then("I click on one of the result links")
    public void i_click_on_one_of_the_result_links() {

    }


}
