package co.uk.next.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class SearchResultPage extends BasePage {
    public SearchResultPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (tagName = "h1")
    private WebElement pageTitle;

    @FindBy (css = ".Item.Fashion")
    private List<WebElement> resultList;


    public void isSearchResultPageDisplayed(){
        Assert.assertTrue(pageTitle.isDisplayed());
    }

    public void isCorrectURLDisplayed(String productType){
        driver.getCurrentUrl().contains(productType.toLowerCase());
    }
//    public void isProductTypeDisplayed(String productType){
//       String title = pageTitle.getText();
//       Assert.assertTrue(title.contains(productType));
//    }

    public ProductDetailsPage clickOnAnyResult(){
        Random random = new Random();
        int clickedResult = random.nextInt(resultList.size()-1);

        resultList.get(clickedResult).click();
        return new ProductDetailsPage(driver);
    }
}
