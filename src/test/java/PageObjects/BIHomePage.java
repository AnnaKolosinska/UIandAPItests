package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BIHomePage extends BasePage {

    public BIHomePage(WebDriver driver) {super(driver);}
    private static final String namesOfList = "//a[@class='flink']";
    private static final String nameInside = "//span[@class='ac'][@itemprop='name']";
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
    public void fieldAge(){ waitElementToBeVisible("//span[text()='Вік']").click();}
    public void getAge(){ waitElementToBeVisible("//li[text()='0-1 роки ']").click();}
    public void fieldCategories(){ waitElementToBeVisible("//span[text()='Усі категорії']").click();}
    public void getCategory(){ waitElementToBeVisible("//li[text()='Іграшки для малюків ']").click();}
    public void getBtnChoose(){ waitElementToBeVisible("//div[@class='p11']/input[@value='Застосувати']").click();}
    public void fieldSortBy(){ waitElementToBeVisible("//div[@class='sortSel']/div[@class='selectWr p11']").click();}
    public void fieldSortByPopular(){ waitElementToBeVisible("//span[text()='за популярністю'] ").click();}
    public void getMenuHumburger(){ waitElementToBeVisible("//span[contains(@class,'i-menu3')]").click();}
    public void getMenuBento(){ waitElementToBeVisible("//span[contains(@class,'i-rings')]").click();}
    public void fieldSortByHighPrice(){ waitElementToBeVisible("//li/span[text()='від дорогих до дешевих']").click();}
    public void fieldSortByLowPrice(){ waitElementToBeVisible("//span[text()='від дешевих до дорогих']").click();}
    public void fieldSortByNew(){ waitElementToBeVisible("//span[text()='по новизні']").click();}


















}
