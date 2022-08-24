package Tests;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;

public class AutoRiaHomePage extends BasePage {
    public AutoRiaHomePage(WebDriver driver) {
        super(driver);
    }
    public void goToRia(){
        driver.get("https://auto.ria.com/uk/");
    }
    public void getCategories(){
        waitElementToBeVisible("//select[@id='categories']").click();
        waitElementToBeVisible("//option[@value='6']").click();
    }
    public void getMark(){
        waitElementToBeVisible("//label[@data-text='Марка']").click();
        waitElementToBeVisible("//li[@data-value='115'][1]").click();
    }
    public void getModel(){
        waitElementToBeVisible("//label[@data-text='Модель']").click();
        waitElementToBeVisible("//a[@class='item' and text()='XF 105']").click();
    }
    public void getRegion(){
        waitElementToBeVisible("//label[@data-text='Регіон']").click();
        waitElementToBeVisible("//ul[@class='unstyle scrollbar autocomplete-select']//a[contains(text(),'Київська обл')]").click();
    }
    public void getYear(){
        waitElementToBeVisible("//select[@id='yearFrom']").click();
        waitElementToBeVisible("//select[@id='yearFrom']//option[@value='2010']").click();
    }
    public void getPrice(){
        waitElementToBeVisible("//input[@name='price_do']").sendKeys("40000");
    }
    public void getEnter(){
        waitElementToBeVisible("//button[@type='submit']").click();
    }
    public void getCar(){
        waitElementToBeVisible("//span[text()='DAF XF 105 105.460']").click();
    }
}
