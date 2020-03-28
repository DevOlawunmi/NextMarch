package co.uk.next.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TabSearchResultPage extends BasePage {
    public TabSearchResultPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
