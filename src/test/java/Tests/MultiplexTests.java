package Tests;

import PageObjects.MetaHomePage;
import PageObjects.MultiplexHomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MultiplexTests extends TestInit{

    @Test
    public void datesAndSessions () {
        MultiplexHomePage multiplexHomePage = new MultiplexHomePage(driver);
        Actions actions = new Actions(driver);
        multiplexHomePage.goToMultiplex();
        multiplexHomePage.clickOnDates();
        multiplexHomePage.openSideMenu();
        multiplexHomePage.changeLanguage();
        multiplexHomePage.openListOfCities();
        sleep(3);
        multiplexHomePage.closeCityMenu();
        multiplexHomePage.changeHall();}

    @Test
    public void buyPopcornTest () {
        MultiplexHomePage multiplexHomePage = new MultiplexHomePage(driver);
        multiplexHomePage.goToMultiplex();
        multiplexHomePage.openSideMenu();
        multiplexHomePage.changeLanguage();
        multiplexHomePage.openSideMenu();
        multiplexHomePage.openPageWithFood();
        multiplexHomePage.addingPopcorn();
        JavascriptExecutor j = (JavascriptExecutor)driver;
        j.executeScript("window.scrollBy(0,1000)");
        multiplexHomePage.addingPepsi();
        multiplexHomePage.clickBtnNext();
        multiplexHomePage.paymentMethodSelection("liqpay").click();
        multiplexHomePage.paymentMethodSelection("privatepay").click();
        multiplexHomePage.paymentMethodSelection("masterpass").click();
//        multiplexHomePage.changePaymentMethod();
        multiplexHomePage.putName("anna");
        multiplexHomePage.putPhoneNumber("16158468");
        multiplexHomePage.putEmail("5sdfus5s45s");
//        multiplexHomePage.checkAgreement();
        multiplexHomePage.clickBtnNext2();}}
