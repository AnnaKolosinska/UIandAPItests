package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VansHomePage extends BasePage {
    public VansHomePage(WebDriver driver) { super(driver);}

    public WebElement allowAll() {
        return waitElementToBeVisible("//button[contains(@id,'onetrust-accept')]");}

    public WebElement popupClose() {
        return waitElementToBeVisible("//button[@class='popup-close']"); }

    public WebElement kidsGoods() {
        return waitElementToBeVisible("//span[text()='Kids']");}

    public void scroll(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixels + ")", "");
    }
    /* проскролити до кінця сторінки, 2 метод
    JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("window.scrollBy(0,document.body.scrollHeight)");*/

    public List<WebElement> getProductNames() {
        return waitElementsToBeVisible("//span[@class='product-block-name-wrapper']");}

    public List<WebElement> getAddToFavourites() {
        return waitElementsToBeVisible("//button[@aria-label='Add to Favourites']");}

    public WebElement getBtnAllFavorites() {
        return waitElementToBeVisible("//span[@class='icon icon-wishlist']");}

}


