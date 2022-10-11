package PageObjects;

import Tests.TestInit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EbayHomePage extends BasePage {
    public EbayHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSectionFashion() {
        return waitElementToBeVisible("//li/a[text()='Fashion']");
    }

    public WebElement getSectionHealthBeauty() {
        return waitElementToBeVisible("//li/a[text()='Health & Beauty']");
    }

    public WebElement getSectionElectronics() {
        return waitElementToBeVisible("//li/a[text()='Electronics']");
    }

    public WebElement getSectionSaved() {
        return waitElementToBeVisible("//li/a[text()='Saved']");
    }

    public WebElement getSectionHomeGarden() {
        return waitElementToBeVisible("//li/a[text()='Home & Garden']");
    }

    public WebElement getSectionCollectibles() {
        return waitElementToBeVisible("//li/a[text()='Collectibles and Art']");
    }

    public WebElement getLogo() {
        return waitElementToBeVisible("//a[@id='gh-la']");
    }
    public WebElement getRowDown() {
        return waitElementToBeVisible("//button[contains(@class,'b-textlink--parent')]/span[text()='Women']");}
    public List<WebElement> accordionTextSections() {
        return waitElementsToBeVisible("//ul[@class='b-accordion-subtree']");}
    public WebElement allInWomen() { return waitElementToBeVisible("//a[text()='See all in Women']");}
    public WebElement womenAccessories() { return waitElementToBeVisible("//a[contains(text(),\"Women's Accessories\")]");}
    public WebElement womenShoes() { return waitElementToBeVisible("//a[text()=\"Women's Shoes\"]");}
    public WebElement womenBags() { return waitElementToBeVisible("//a[text()=\"Women's Bags & Handbags\"]");}
    public WebElement womenClothing() { return waitElementToBeVisible("//a[text()=\"Women's Clothing\"]");}
    public WebElement goToAllCategoty() { return waitElementToBeVisible("//button[text()='Shop by category']");}
    public WebElement goToCategoryCollectibles() { return waitElementToBeVisible(" //a[text()='Collectibles & art']");}

    public List<WebElement> packSubcategoryNames () {
        return waitElementsToBeVisible("//a[@class='b-textlink b-textlink--parent']");}

    public void clickOnSubcategories () {
        TestInit testInit = new TestInit();
        for (int i = 0; i < packSubcategoryNames().size()-1; i++) {
            packSubcategoryNames().get(i).click();
            testInit.sleep(3);
            driver.navigate().back();

        }
    }

    public List<WebElement> subcategoryNames(){ return waitElementsToBeVisible("//a[@class='b-textlink b-textlink--parent']");}
    public WebElement subcategoryNameInside () {return  waitElementToBeVisible("//h1[@class='b-pageheader']");}


}
