package co.uk.next.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TabSearchResultPage extends BasePage {
    public TabSearchResultPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (tagName = "h1")
    private WebElement pageTitle;

    public void isCorrectURLDisplayedForDeptSearch(String girls){
        driver.getCurrentUrl().contains(girls.toLowerCase());
    }
    public void isPageTitleDisplayed(){
        Assert.assertTrue(pageTitle.isDisplayed());
    }

}
