package PageObjects;

import org.openqa.selenium.WebDriver;

public class PravdaHomePage extends BasePage{
    public PravdaHomePage(WebDriver driver) {
        super(driver);
    }
    public void goToPravda(){
        driver.get("https://www.pravda.com.ua/");
    }
    public void getMenu(){
        waitElementToBeVisible("//a[@class='top_menu_link modal_menu_open menu-link menu-btn-1 h--left']").click();
    }
    public void getEuroBtn(){
        waitElementToBeVisible("//li[@class='top_menu_sp__item']//a[contains(text(),'Європейська правда')]").click();
    }
    public void getEngBtn(){
        waitElementToBeVisible("//a[@class='top_options__item top_options__item_lang']//span[contains(text(),'Eng')]").click();
    }
    public void getTankClick(){
        waitElementToBeVisible("//div[@class='article article_main']").click();
    }
    public void getSearchBtn(){
        waitElementToBeVisible("//span[@class='icon-search']").click();
    }
    public void getSearchUkraine(){
        waitElementToBeVisible("//input[@name='search']").sendKeys("Україна\n");
    }
    public void getUkrBtn(){
        waitElementToBeVisible("//a[@class='top_options__item top_options__item_lang']//span[contains(text(),'Укр')]").click();
    }
    public void getPicture(){
        waitElementToBeVisible("//div[@class='article article_story']//img[@src='https://img.eurointegration.com.ua/images/doc/c/c/cc5b1a3-erdogan-705_400x224.jpg']").isDisplayed();
    }
    public void getHuiloBtn(){
        waitElementToBeVisible("//div[@class='article_header']//a[contains(text(),'Путін програє інформаційну війну в Україні – британська розвідка')]").click();
    }
    public void getNews(){
        waitElementToBeVisible("//li[@class='top_menu__item']//a[contains(text(),'Новини')]").click();
    }
    public void getCalendar(){
        waitElementToBeVisible("//img[@class='ui-datepicker-trigger']").click();
    }
    public void getData(){
        waitElementToBeVisible("//td[@data-handler='selectDay']//a[text()='1']").click();
    }
    public void getGetmanBtn(){
        waitElementToBeVisible("//div[@class='article_header']//a[contains(text(),'Зеленський попросив')]").click();
    }
    public void getHistoryBtn(){
        waitElementToBeVisible("//li[@class='main_menu__item']//a[contains(text(),'Архів')]").click();
    }
    public void getYearBtn(){
        waitElementToBeVisible("//li[@class='year_menu_item']//a[contains(text(),'2000')]").click();
    }
    public void getAugust(){
        waitElementToBeVisible("//a[@href='/archives/date_24082000/']").isDisplayed();
    }
    public void getClubBtn(){
        waitElementToBeVisible("//a[@class='top_options_club']").click();
    }
    public void getClick1(){
        waitElementToBeVisible("//h3[contains(text(),'Як я можу користуватися перевагами учасника?')]").click();
    }
    public void getClick4(){
        waitElementToBeVisible("//h3[contains(text(),'Як ще я можу підтримати редакцію «Української правди»?')]").click();
    }
    public void getMyClub(){
        waitElementToBeVisible("//div[@class='top_options']").click();
    }
    public void getGoogleBtn(){
        waitElementToBeVisible("//a[@data-type='google']").click();
    }
    public void getSearchGoogle(){
        waitElementToBeVisible("//input[@id='identifierId']").sendKeys("misha333211@gmail.com\n");
    }

}
