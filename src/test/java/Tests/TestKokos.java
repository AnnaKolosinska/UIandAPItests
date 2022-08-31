package Tests;

import PageObjects.KokosHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestKokos extends TestInit{

    @Test
    public void getXiaomi() {
        KokosHomePage kokosHomePage = new KokosHomePage(driver);
        Actions actions = new Actions(driver);
        kokosHomePage.goToKokos();
        actions.moveToElement(kokosHomePage.waitElementToBeVisible("//div[@class='products-menu__title']//a[@href='/ua/mobile-phones/']")).build().perform();
        kokosHomePage.getXiaomi();
        kokosHomePage.getRealmeBtn();
        kokosHomePage.getSearchBtn();
        kokosHomePage.getSearchClick();
        kokosHomePage.getMobileBtn();
        kokosHomePage.getPicture();
        sleep(2);
        kokosHomePage.getBuy();
        kokosHomePage.getOrder();
        driver.quit();

    }

    @Test
    public void checkFilters(){
        KokosHomePage kokosHomePage = new KokosHomePage(driver);
        JavascriptExecutor j = (JavascriptExecutor)driver;
        kokosHomePage.goToKokos();
        kokosHomePage.getMenu();
        kokosHomePage.getSamsungBtn();
        j.executeScript("window.scrollBy(0,1200)");
        sleep(1);
        kokosHomePage.getMinBtn();
        kokosHomePage.getMinClear();
        kokosHomePage.getMinSearch();
        kokosHomePage.getSmallBtn2();
        driver.quit();

    }

    @Test
    public void WebSearch(){
        KokosHomePage kokosHomePage = new KokosHomePage(driver);
        kokosHomePage.goToKokos();
        kokosHomePage.getSearchBtn2();
        kokosHomePage.getSearchClick();
        kokosHomePage.getSharkImg();
        kokosHomePage.getNameSearch();
        kokosHomePage.getEmailSearch();
        kokosHomePage.getSMSSearch();
        kokosHomePage.getStarsBtn();
        sleep(1);
        driver.quit();
    }

}
