package PageObjects;

import PageObjects.BasePage;
import Tests.TestInit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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

    public List<WebElement> listOfElements(){
        return waitElementsToBeVisible("//label[@class='text']");
    }
    public void checksMarks(){
        TestInit testInit = new TestInit();
        for (int i = 0; i < listOfElements().size();i++){
            listOfElements().get(i).click();
            testInit.sleep(2);
    }}
    public void chooseAutoMarks(){
        TestInit testInit = new TestInit();
        listOfElements().get(0).click();
        testInit.sleep(1);
        listOfElements().get(2).click();
        testInit.sleep(1);
        listOfElements().get(1).click();
    }
    public void getMoto(){
        waitElementToBeVisible("//a[@title='Мото']").click();
    }
    public void getCvadro(){
        waitElementToBeVisible("//a[@title='Квадроцикл спортивний']").click();
    }
    public void getMotoBtn(){
        waitElementToBeVisible("//a[@title='Мотоцикл']").click();
    }
    public void getSellAuto(){
        waitElementToBeVisible("//div[@class='areabar']//a[@id='addAutoButton']").click();
    }
    public void getType(){
        waitElementToBeVisible("//select[@name='categories.main.id']").click();
        waitElementToBeVisible("//select[@name='categories.main.id']//option[@value='7']").click();
    }
    public void getMarkAuto(){
        waitElementToBeVisible("//label[@for='brand.idAutocompleteInput-0']").click();
        waitElementToBeVisible("//li[@data-text='MAN']").click();
    }
    public void getYearAuto(){
        waitElementToBeVisible("//select[@id='year']").click();
        waitElementToBeVisible("//option[@value='2020']").click();
    }
    public void getBodyType(){
        waitElementToBeVisible("//select[@name='body.id']").click();
        waitElementToBeVisible("//option[@value='219']").click();
    }
    public WebElement getAutoMobiles(){
        return waitElementToBeVisible("//a[@class='item active']");
    }
    public WebElement getRealEstate(){
        return waitElementToBeVisible("//nav[@class='nav-head']//a[contains(text(),'Нерухомість')]");
    }
    public WebElement getAutoParts(){
        return waitElementToBeVisible("//nav[@class='nav-head']//a[contains(text(),'Автозапчастини')]");
    }
    public WebElement getHelpZSU(){
        return waitElementToBeVisible("//nav[@class='nav-head']//a[contains(text(),'Підтримати ЗСУ')]");
    }
    public WebElement getBY(){
        return waitElementToBeVisible("//a[@data-type='bu']");
    }
    public WebElement getNewCar(){
        return waitElementToBeVisible("//a[@data-type='new']");
    }
    public WebElement getNews(){
        return waitElementToBeVisible("//a[@data-type='news']");
    }
    public WebElement getAllForCar(){
        return waitElementToBeVisible("//a[@data-type='all_for_auto']");
    }
    public WebElement getFindLogo(){
        return waitElementToBeVisible("//a[@aria-label='AUTO.RIA']");
    }
    public WebElement getSignIn(){
        return waitElementToBeVisible("//span[contains(text(),'Увійти в кабінет')]");
    }


}
