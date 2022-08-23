package Tests;

import PageObjects.AmazonHomePage;
import org.testng.annotations.Test;

public class TestAmazon extends TestInit{

    @Test
    public void checkAmazon(){
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.goToAmazon();
        amazonHomePage.getAllWindow();
        amazonHomePage.getSmartHome();
        sleep(1);
        amazonHomePage.getNewDevices();
        amazonHomePage.getFree();
        amazonHomePage.getSony();
        amazonHomePage.getShare();
        amazonHomePage.getCopy();
        amazonHomePage.getSearchClick();
        amazonHomePage.getSearch();
        sleep(1);
        driver.quit();

    }
    @Test
    public void WTFAmazon(){
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.goToAmazon();
        amazonHomePage.getSignIn();
        amazonHomePage.getNewAccount();
        amazonHomePage.getName();
        amazonHomePage.getNumber();
        amazonHomePage.getPassword();
        amazonHomePage.getRePas();
        sleep(2);
        amazonHomePage.getLogo();
        sleep(1);
        driver.quit();

    }

    @Test
    public void AmazonPhone(){
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.goToAmazon();
        amazonHomePage.getCountry();
        amazonHomePage.getTableDown();
        amazonHomePage.getPolska();
        amazonHomePage.getCardsBtn();
        amazonHomePage.getBookMark();
        amazonHomePage.getTakePrice();
        amazonHomePage.getChristmas();
        amazonHomePage.getGift();
        amazonHomePage.getBuy();
        driver.quit();
//        amazonHomePage.getPolandWebsite();
//        amazonHomePage.getCloseKurva();
//        amazonHomePage.getCategoryDown();
//        amazonHomePage.getMusic();
//        amazonHomePage.getSearchClick();
//        amazonHomePage.getSearch2();



    }
}
