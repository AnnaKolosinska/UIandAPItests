package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BIHomePage extends BasePage {

    public BIHomePage(WebDriver driver) {super(driver);}
    private static final String namesOfList = "//li[@class='fli']";
    private static final String nameInside = "//h1[@class='h1']";
    public List<WebElement> namesAllLinks() { return waitElementsToBeVisible(namesOfList);}
    public WebElement nameInsidePage() { return waitElementToBeVisible (nameInside);}
    public WebElement searchTextField(){return waitElementToBeVisible("//input[@placeholder='Що ви шукаєте?']");}
    public WebElement searchBtn(){return waitElementToBeVisible("//input[@type='submit'][@value='Пошук']");}
    public WebElement chooseFirstLol(){return waitElementToBeVisible(" (//span[@class='itemDes'])[1]");}
    public WebElement btnBuyFirstLol(){return waitElementToBeVisible(" //a[contains(@class,'btn48 fS20 btnB')]");}
    public WebElement makeOrder(){return waitElementToBeVisible(" //a[text()='Оформити замовлення']");}
    public WebElement addItem(){return waitElementToBeVisible("//i[@class='i-plus']");}
    public WebElement deleteItem(){return waitElementToBeVisible("//span[@class='i-delete']");}
    public WebElement logo(){return waitElementToBeVisible("//a[@class='logo']");}




}
