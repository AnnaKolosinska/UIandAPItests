package PageObjects;

import org.openqa.selenium.WebDriver;

public class AmazonHomePage extends BasePage{
    public AmazonHomePage(WebDriver driver) {
        super(driver);
    }
    public void goToAmazon(){
        driver.get("https://www.amazon.com/");
    }
    public void getAllWindow(){
        waitElementToBeVisible("//a[@id='nav-hamburger-menu']").click();
    }
    public void getSmartHome(){
        waitElementToBeVisible("//a[@data-menu-id='7']").click();
    }
    public void getNewDevices(){
        waitElementToBeVisible("//a[contains(text(),'New Smart Devices')]").click();
    }
    public void getFree(){
        waitElementToBeVisible("//ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-medium']//span[@class='a-size-base a-color-base']").click();
    }
    public void getSony(){
        waitElementToBeVisible("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-4']//span[contains(text(),'Sony HT-A5000 5.1.2ch Dolby Atmos Sound')]").click();
    }
    public void getShare(){
        waitElementToBeVisible("//i[@title='Share']").click();
    }
    public void getCopy(){
        waitElementToBeVisible("//i[@title='Share']").click();
    }
    public void getSearchClick(){
        waitElementToBeVisible("//input[@id='twotabsearchtextbox']").click();
    }
    public void getSearch(){
        waitElementToBeVisible("//input[@id='twotabsearchtextbox']").sendKeys("https://a.co/d/320piI0\n");
    }
    public void getSignIn(){
        waitElementToBeVisible("//a[@id='nav-link-accountList']").click();
    }
    public void getNewAccount(){
        waitElementToBeVisible("//a[@id='createAccountSubmit']").click();
    }
    public void getName(){
        waitElementToBeVisible("//input[@id='ap_customer_name']").sendKeys("Michael");
    }
    public void getNumber(){
        waitElementToBeVisible("//input[@id='ap_email']").sendKeys("+380674955682");
    }
    public void getPassword(){
        waitElementToBeVisible("//input[@id='ap_password']").sendKeys("12345678mi");
    }
    public void getRePas(){
        waitElementToBeVisible("//input[@id='ap_password_check']").sendKeys("12345678mi");
    }
    public void getLogo(){
        waitElementToBeVisible("//i[@class='a-icon a-icon-logo']").click();
    }
    public void getCountry(){
        waitElementToBeVisible("//a[@id='icp-touch-link-country']").click();
    }
    public void getTableDown(){
        waitElementToBeVisible("//span[@id='icp-dropdown']").click();
    }
    public void getPolska(){
        waitElementToBeVisible("//li[@id='icp-dropdown-item-12']").click();
    }
    public void getPolandWebsite(){
        waitElementToBeVisible("//span[@id='icp-save-button']").click();
    }
    public void getCategoryDown(){
        waitElementToBeVisible("//span[@id='searchDropdownDescription']").click();
    }
    public void getMusic(){
        waitElementToBeVisible("//option[@value='search-alias=popular']").click();
    }
    public void getSearch2(){
        waitElementToBeVisible("//input[@id='twotabsearchtextbox']").sendKeys("ariana grande\n");
    }
    public void getCloseKurva(){
        waitElementToBeVisible("//span[@id='a-autoid-0']").isDisplayed();
    }
    public void getCardsBtn(){
        waitElementToBeVisible("//a[@data-csa-c-slot-id='nav_cs_3']").click();
    }
    public void getBookMark(){
        waitElementToBeVisible("//span[contains(text(),'Bookmark')]").click();
    }
    public void getTakePrice(){
        waitElementToBeVisible("//span[contains(text(),'$50 to $100')]").click();
    }
    public void getChristmas(){
        waitElementToBeVisible("//span[contains(text(),'Christmas')]").click();
    }
    public void getGift(){
        waitElementToBeVisible("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-1']").click();
    }
    public void getBuy(){
        waitElementToBeVisible("//input[@id='buy-now-button']").click();
    }
}
