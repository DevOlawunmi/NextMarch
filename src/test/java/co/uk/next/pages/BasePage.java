package co.uk.next.pages;

import co.uk.next.commons.DriverLib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends DriverLib {
    public String BASE_URL = "https://www.next.co.uk/";
    public Select select;
    public Actions actions;

    public void launchURL(){
        driver.navigate().to(BASE_URL);
    }
//    public void selectElementByVisibleText(WebElement element, String text){
//        select = new Select(element);
//        select.selectByVisibleText(text);
//    }
//    public void selectElementByValue(WebElement element, String value){
//        select = new Select(element);
//        select.selectByValue(value);
//    }
//    public void selectElementByIndex(WebElement element, int index){
//        select = new Select(element);
//        select.selectByIndex(index);
//    }
    public void waitForElementToBeDisplayed(WebElement element){
        wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(element));

    }
    public void hoverOver(WebElement element){
        actions = new Actions(driver);
        actions.moveToElement(element).build().perform();

    }

}
