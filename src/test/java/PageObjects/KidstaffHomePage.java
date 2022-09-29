package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KidstaffHomePage extends BasePage {
 public KidstaffHomePage (WebDriver driver ){
     super(driver);}
    public void runKidstaff(){driver.get("https://www.kidstaff.com.ua/");
    }
    public WebElement getLogoKs(){
      return  waitElementToBeVisible("//a[contains(text(),'Дошка оголошень Kidstaff')]");}
    public WebElement getIconProfile(){ return waitElementToBeVisible("//i[@class='icon profile-noauth']");}
    public WebElement getMenu(){return
            waitElementToBeVisible("//a[@class='navbar-burger is-hidden-tablet dropdown-trigger js-cancel-default-burger']");}
    public WebElement getSearchField(){ return waitElementToBeVisible("//input[@class='input'] "); }
    public WebElement getDetailSearch(){return waitElementToBeVisible("//a[contains(text(),'Детальний пошук')]");}
    public WebElement getShoppingCart(){return waitElementToBeVisible("//button[@title='Кошик покупця']");}
    public WebElement getSovetchitsa(){return waitElementToBeVisible("//a[contains(text(),'Советчица')][@class='is-opacity-hover']");}
    public WebElement getLogin(){return waitElementToBeVisible("//a[text()='вхід']");}
    public WebElement getRegistration(){return waitElementToBeVisible("//a[text()='зареєструватися']");}
    public WebElement getLanguageSwitcher(){return waitElementToBeVisible("//a[@class='js-changelang']");}


}
