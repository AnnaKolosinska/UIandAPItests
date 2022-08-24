package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OLXHomePage extends BasePage{
    public OLXHomePage(WebDriver driver) {
        super(driver);
    }
    public void goToOLX(){
        driver.get("https://www.olx.ua/uk/");
    }
    public void getCar(){
        waitElementToBeVisible("//a[@data-id='1532']//span[@style='background-color: rgb(255, 86, 54);']").click();
    }
    public void getSearch(){
        waitElementToBeVisible("//input[@id='headerSearch']").sendKeys("Camry\n");
    }
    public void getCloseBtn(){
        waitElementToBeVisible("//button[@data-cy='dismiss-cookies-overlay']").click();
    }
    public void getCity(){
        waitElementToBeVisible("//input[@data-testid='location-search-input']").click();
    }
    public void getTernopil(){
        waitElementToBeVisible("//span[contains(text(),'Тернопільська область')]").click();
    }
    public void getTernopilBtn(){
        waitElementToBeVisible("//li[contains(text(),'Тернопіль')]").click();
    }
    public void getMaxPrice(){
        waitElementToBeVisible("//input[@name='range-to-input']").sendKeys("500000\n");
    }
    public void getBuyToyota(){
        waitElementToBeVisible("//h6[contains(text(),'Продаж авто (в розсрочку): Toyota Camry, Hyundai Sonata, KIA K5')]").click();
    }
    public void getSwipe(){
        waitElementToBeVisible("//button[@class='swiper-button-next']").click();
    }
    public void getSwipe2(){
        waitElementToBeVisible("//button[@class='swiper-button-next']").click();
    }
    public void goToCamry(){
        driver.get("https://www.olx.ua/d/uk/obyavlenie/prodazh-avto-v-rozsrochku-toyota-camry-hyundai-sonata-kia-k5-IDNtR5E.html");
    }
    public void getOlegBtn(){
        waitElementToBeVisible("//a[@data-testid='user-profile-link']//h4[contains(text(),'Олег')]").click();
    }
    public void getWork(){
        waitElementToBeVisible("//span[contains(text(),'Робота')]").click();
    }
    public void getLogo(){
        waitElementToBeVisible("//span[@class='css-13kyx88']").click();
    }
    public void getHouse(){
        waitElementToBeVisible("//div[@class='item']//span[contains(text(),'Нерухомість')]").click();
    }
    public void getRealty(){
        waitElementToBeVisible("//a[@data-id='1757']").click();
    }
    public void getFlat(){
        waitElementToBeVisible("//span[@class='link block category-name']//*[contains(text(),'Квартири')]").click();
    }
    public void getPhoto(){
        waitElementToBeVisible("//label[contains(text(),'Тільки з фото')]").click();
    }
    public void getDelivery(){
        waitElementToBeVisible("//*[contains(text(),'Товари з доставкою')]").click();
    }
    public void getWorkingNow(){
        waitElementToBeVisible("//label[contains(text(),'Працюємо зараз')]").click();
    }
    public WebElement getCloseBtn2(){
        return waitElementToBeVisible("//button[@data-cy='dismiss-cookies-overlay']");
    }
    public WebElement getSearch2(){
        return waitElementToBeVisible("//input[@id='search']");
    }
    public WebElement getCity2(){
        return waitElementToBeVisible("//input[@data-testid='location-search-input']");
    }
    public WebElement getSearchBtn2(){
        return waitElementToBeVisible("//button[@name='searchBtn']");
    }
    public WebElement getBack(){
        return waitElementToBeVisible("//button[@class='css-7a5mz7-BaseStyles']");
    }
    public WebElement getOleg(){
        return waitElementToBeVisible("//a[@data-testid='user-profile-link']//h4[contains(text(),'Олег')]");
    }
    public WebElement getWhatIs(){
        return waitElementToBeVisible("//p[contains(text(),'Що таке рейтинг?')]");
    }
    public WebElement getPicture2(){
        return waitElementToBeVisible("//img[@data-testid='swiper-image']");
    }
    public WebElement getPrice(){
        return waitElementToBeVisible("//h3[@class='css-okktvh-Text eu5v0x0']");
    }
    public WebElement getPrivate(){
        return waitElementToBeVisible("//span[contains(text(),'Приватна особа')]");
    }

}
