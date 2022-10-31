package PageObjects;

import Tests.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class KidstaffHomePage extends BasePage {
    public KidstaffHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogoKs() {
        return waitElementToBeVisible("//a[contains(text(),'Дошка оголошень Kidstaff')]");
    }

    public WebElement getIconProfile() {
        return waitElementToBeVisible("//i[@class='icon profile-noauth']");
    }

    public WebElement getMenu() {
        return
                waitElementToBeVisible("(//a[@aria-label = 'menu'])[2]");
    }

    public WebElement getKidsCloth() {
        return waitElementToBeVisible("(//span[text()='Дитячий гардероб'])[2] ");
    }

    public WebElement getArrowReturnMenu() {
        return waitElementToBeVisible("//div[@class='panel-block menu-header']//a[contains(@class,'icon menu-back')]");
    }

    public WebElement getSearchField() {
        return waitElementToBeVisible("//input[@class='input'] ");
    }

    public WebElement getDetailSearch() {
        return waitElementToBeVisible("//a[contains(text(),'Детальний пошук')]");
    }

    public WebElement getShoppingCart() {
        return waitElementToBeVisible("//button[@title='Кошик покупця']");
    }

    public WebElement getSovetchitsa() {
        return waitElementToBeVisible("//a[contains(text(),'Советчица')][@class='is-opacity-hover']");
    }

    public WebElement getLogin() {
        return waitElementToBeVisible("//a[text()='вхід']");
    }

    public WebElement getRegistration() {
        return waitElementToBeVisible("//a[text()='зареєструватися']");
    }

    public WebElement getLanguageSwitcherUa() {
        return waitElementToBeVisible("//a[contains(text(),'UA')]");
    }

    public WebElement getLanguageSwitcherRu() {
        return waitElementToBeVisible("//a[contains(text(),'ru')]");
    }

    public WebElement getLanguageSwitcher() {
        return waitElementToBeVisible("//a[@class='js-changelang']");
    }

    public WebElement getBtnCoockies() {
        return waitElementToBeVisible("//button[@id='js_set_gdpr_cookie']");
    }

    public WebElement getPopularBrandsGeox() {
        return waitElementToBeVisible("//a[@class='tag is-warning'][text()='Geox']");
    }

    public WebElement getPopularBrandsCrocs() {
        return waitElementToBeVisible("//div[@class='tags are-medium']/a[@class='tag is-warning'][text()='Crocs']");
    }

    public WebElement getPopularBrandsEcco() {
        return waitElementToBeVisible("//a[@class='tag is-warning'][text()='Ecco']");
    }

    public WebElement getPopularBrandsLCWaikiki() {
        return waitElementToBeVisible("//a[@class='tag is-warning'][text()='LC Waikiki']");
    }

    public void goBack() {
        driver.quit();
    }

    public List<WebElement> packOfBrands() {
        return waitElementsToBeVisible("//a[contains(@class, 'tag is-warning')]");
    }

    public WebElement getNamePageBrand() {
        return waitElementToBeVisible("//h1[@class='title is-size-4 is-size-5-mobile py-0 my-0']");
    }

    public WebElement getNameBrandGeox() {
        return waitElementToBeVisible("//div[@class='is-flex js-h1']/h1[contains(text(),'Geox')]");
    }

    public WebElement getNameBrandCrocks() {
        return waitElementToBeVisible("//div[@class='is-flex js-h1']/h1[contains(text(),'Crocks')]");
    }

    public WebElement getLogIn() {
        return waitElementToBeVisible("//a/i[@class='icon profile-noauth']");
    }
    public WebElement getFieldEmail(){return waitElementToBeVisible("//input[@type='email']");}
    public WebElement getFieldPass(){return waitElementToBeVisible("//input[@type='password']");}
    public WebElement getBtnEnter(){return waitElementToBeVisible("//input[@type='Submit']");}

    public void clickOnBrands() {
        //if we need use sleep
        //TestInit testInit = new TestInit();

        for (int i = 0; i < packOfBrands().size() - 1; i++) {
            scroll(1800);
            packOfBrands().get(i).click();
            // testInit.sleep(3);
            driver.navigate().back();
        }
    }

    public void scroll(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixels + ")", "");
    }

}

