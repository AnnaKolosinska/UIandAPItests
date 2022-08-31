package Tests;

import PageObjects.OLXHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOLX extends TestInit{

    @Test
    public void checkOLX(){
        OLXHomePage olxHomePage = new OLXHomePage(driver);
        olxHomePage.goToOLX();
        olxHomePage.getSearch();
        sleep(2);
        olxHomePage.getCloseBtn();
        olxHomePage.getCity();
        olxHomePage.getTernopil();
        olxHomePage.getTernopilBtn();
        olxHomePage.getMaxPrice();
        sleep(1);
        olxHomePage.getBuyToyota();
        olxHomePage.getSwipe();
        sleep(1);
        olxHomePage.getSwipe();
        driver.quit();
    }

    @Test
    public void OLXPrice(){
        OLXHomePage olxHomePage = new OLXHomePage(driver);
        olxHomePage.goToCamry();
        olxHomePage.getCloseBtn();
        olxHomePage.getOlegBtn();
        olxHomePage.getWork();
        sleep(1);
        olxHomePage.getLogo();
        olxHomePage.getHouse();
        sleep(1);
        olxHomePage.getRealty();
        olxHomePage.getFlat();
        olxHomePage.getPhoto();
        olxHomePage.getDelivery();
        olxHomePage.getWorkingNow();
        sleep(1);
        driver.quit();

    }
    @Test
    public void AssertCheck(){
        OLXHomePage olxHomePage = new OLXHomePage(driver);
        olxHomePage.goToCamry();
        Assert.assertTrue(olxHomePage.getCloseBtn2().isDisplayed());
        Assert.assertTrue(olxHomePage.getSearch2().isDisplayed());
        Assert.assertTrue(olxHomePage.getCity2().isDisplayed());
        Assert.assertTrue(olxHomePage.getSearchBtn2().isDisplayed());
        Assert.assertTrue(olxHomePage.getBack().isDisplayed());
        Assert.assertTrue(olxHomePage.getOleg().isDisplayed());
        Assert.assertTrue(olxHomePage.getWhatIs().isDisplayed());
        Assert.assertTrue(olxHomePage.getPicture2().isDisplayed());
        Assert.assertTrue(olxHomePage.getPrice().isDisplayed());
        Assert.assertTrue(olxHomePage.getPrivate().isDisplayed());

    }

}
