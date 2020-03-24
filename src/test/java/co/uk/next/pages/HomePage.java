package co.uk.next.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy (xpath = "/html/body/header/div/section/section[4]/form/input[1]")
    private WebElement searchField;

    @FindBy (css = ".SearchButton")
    private WebElement searchButton;


    public void enterProductName(String productType){
        searchField.sendKeys(productType);
    }

    public SearchResultPage clickOnSearchButton(){
    searchButton.click();
        return new SearchResultPage(driver);
    }
}
