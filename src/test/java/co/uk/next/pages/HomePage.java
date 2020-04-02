package co.uk.next.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy (className = "SearchBox")
    private WebElement searchField;

    @FindBy (css = ".SearchButton")
    private WebElement searchButton;

    @FindBy (id = "navigationitem4-ldxjlssjfos7o28xq8vhxujr")
    private WebElement girlsTab;
    @FindBy (id = "navigationitem3-bqmr2rt24pdki20bthg5af1gf")
    private WebElement bodySuit;


    public void enterProductName(String productType){
        searchField.sendKeys(productType);
    }

    public SearchResultPage clickOnSearchButton(){
    searchButton.click();
        return new SearchResultPage(driver);
    }



    public void hoverOverGirlsTab()
    {
        actions.moveToElement(girlsTab).build().perform();
            }
    public TabSearchResultPage clickOnBodySuit(){
        actions.click();
        return new TabSearchResultPage(driver);
    }
}
