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

    @FindBy (className = "HeaderNavigation")
    private List <WebElement> departments;


    public void enterProductName(String productType){
        searchField.sendKeys(productType);
    }

    public SearchResultPage clickOnSearchButton(){
    searchButton.click();
        return new SearchResultPage(driver);
    }



    public void hoverOverDepartments(int index){
        Actions actions = new Actions(driver);
        //I'm not sure which of the action methods to select

    }

}
