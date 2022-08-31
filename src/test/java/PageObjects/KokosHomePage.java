package PageObjects;

import org.openqa.selenium.WebDriver;

public class KokosHomePage extends BasePage{
    public KokosHomePage(WebDriver driver) {
        super(driver);
    }

    public void goToKokos(){
        driver.get("https://kokos.com.ua/ua/");
    }
    public void getMenu(){
        waitElementToBeVisible("//div[@class='products-menu__title']//a[@href='/ua/mobile-phones/']").click();
    }
    public void getXiaomi(){
        waitElementToBeVisible("//li[@class='productsMenu-submenu-i ']//a[@href='/ua/xiaomi-phones/']").click();
    }
    public void getRealmeBtn(){
        waitElementToBeVisible("//li[@class='filterMenu-i']//a[@href='/ua/realme/']").click();
    }
    public void getSearchBtn(){
        waitElementToBeVisible("//input[@name='q']").sendKeys("Xiaomi Mi 11T Blue");
    }
    public void getSearchClick(){
        waitElementToBeVisible("//button[@class='search__button']").click();
    }
    public void getMobileBtn(){
        waitElementToBeVisible("//a[@title='Xiaomi 11T 8/128GB Celestial Blue (Global Version)']").click();
    }
    public void getPicture(){
        waitElementToBeVisible("//img[@alt='Xiaomi 11T (Global Version) 2 з 2']").click();
    }
    public void getBuy(){
        waitElementToBeVisible("//div[@class='product-order__block product-order__block--buy']//span[@class='btn-content']").click();
    }
    public void getOrder(){
        waitElementToBeVisible("//div[@class='cart-btnOrder']//a[@href='/ua/checkout/']").click();
    }
    public void getSamsungBtn(){
        waitElementToBeVisible("//li[@class='filterMenu-i']//a[@href='/ua/samsung-phones/']").click();
    }
    public void getGb(){
        waitElementToBeVisible("//a[@href='/ua/samsung-phones/filter/vstroennajaamjat1=5/']").click();
    }

    public void getMinBtn(){
        waitElementToBeVisible("//div[@class='filter-price-inputs']//input[@data-name='filter[price][min]']").click();
    }
    public void getMinClear(){
        waitElementToBeVisible("//div[@class='filter-price-inputs']//input[@data-name='filter[price][min]']").clear();
    }
    public void getMinSearch(){
        waitElementToBeVisible("//div[@class='filter-price-inputs']//input[@data-name='filter[price][min]']").sendKeys("1000");
    }
    public void getMaxBtn(){
        waitElementToBeVisible("//input[@data-name='filter[price][max]']").click();
    }
    public void getMaxClear(){
        waitElementToBeVisible("//input[@data-name='filter[price][max]']").clear();
    }
    public void getMaxSearch(){
        waitElementToBeVisible("//input[@data-name='filter[price][max]']").sendKeys("20000\n");
    }
    public void getSmallBtn2(){
        waitElementToBeVisible("//button[@class='btn __small']").click();
    }
    public void getSearchBtn2(){
        waitElementToBeVisible("//input[@name='q']").sendKeys("Навушники");
    }
    public void getSharkImg(){
        waitElementToBeVisible("//a[@title='Black Shark Lucifer T6 Black']").click();
    }
    public void getNameSearch(){
        waitElementToBeVisible("//div[@class='p-review-add__form-item']//input[@type='text']").sendKeys("Михайло Малашевський");
    }
    public void getEmailSearch(){
        waitElementToBeVisible("//div[@class='p-review-add__form-item']//input[@type='email']").sendKeys("misha333211@gmail.com");
    }
    public void getSMSSearch(){
        waitElementToBeVisible("//textarea[@name='form[text]']").sendKeys("Кокос");
    }
    public void getStarsBtn(){
        waitElementToBeVisible("//div[@title='5']").click();
    }
}

