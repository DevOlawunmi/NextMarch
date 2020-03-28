package co.uk.next.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy (className = "SearchBox")
    private WebElement searchField;

    @FindBy (css = ".SearchButton")
    private WebElement searchButton;

    @FindBy (id = "navigationitem4-4fhxgrmf7ozvfm3jc6djcbuu")
    private WebElement deptTab;


    public void enterProductName(String productType){
        searchField.sendKeys(productType);
    }

    public SearchResultPage clickOnSearchButton(){
    searchButton.click();
        return new SearchResultPage(driver);
    }
public TabSearchResultPage clickOnDepartment(){
        deptTab.click();
        return new TabSearchResultPage(driver);
}
}
