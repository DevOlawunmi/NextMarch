package co.uk.next.stepDefinitions;

import co.uk.next.pages.BasePage;
import co.uk.next.pages.HomePage;
import co.uk.next.pages.SearchResultPage;
import co.uk.next.pages.TabSearchResultPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class SearchDeptSteps extends BasePage {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    SearchResultPage searchResultPage = PageFactory.initElements(driver, SearchResultPage.class);
    TabSearchResultPage tabSearchResultPage = PageFactory.initElements(driver, TabSearchResultPage.class);

    @When("I click on a {string}")
    public void i_click_on_a(String girls)  {
//        if(department == "Girls")
//        {
//            homePage.hoverOverGirlsTab();
//        tabSearchResultPage =   homePage.clickOnBodySuit();
        tabSearchResultPage = homePage.clickOnGirlsTab();
        }



    @Then("a list of items in {string} is displayed")
    public void a_list_of_items_in_is_displayed(String girls) {
tabSearchResultPage.isCorrectURLDisplayedForDeptSearch(girls);
tabSearchResultPage.isPageTitleDisplayed();
    }
    @Then("I click on any of the results")
    public void i_click_on_any_of_the_results() {

    }

}
