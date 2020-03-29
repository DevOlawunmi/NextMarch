package co.uk.next.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HoversPage extends BasePage{
    public HoversPage (WebDriver driver){
        this. driver = driver;
        PageFactory.initElements(driver, this);
    }
}
