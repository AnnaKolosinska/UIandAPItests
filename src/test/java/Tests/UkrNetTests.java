package Tests;

import PageObjects.UkrNetHomePage;
import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UkrNetTests extends TestInit{

    @Test
    public void sideMenuTest () {
        UkrNetHomePage ukrNetHomePage = new UkrNetHomePage(driver);
        ukrNetHomePage.goToUkrNet();
        ukrNetHomePage.clickOnCurrency();
        ukrNetHomePage.convertHryvnias("10");
        ukrNetHomePage.clickOnFuel();
        ukrNetHomePage.openA95Fuel();
        ukrNetHomePage.clickOnOrakul();
        ukrNetHomePage.clickOnFilms();
        ukrNetHomePage.clickOnLanguage();}

    @Test
    public void registrationOnUkrNet () {
        UkrNetHomePage ukrNetHomePage = new UkrNetHomePage(driver);
        ukrNetHomePage.openRegistrationPage();
        ukrNetHomePage.putNameOfBox("annaanna");
        ukrNetHomePage.writePassword("jdskugdsuk");
        ukrNetHomePage.repeatPassword("5eihrgfiekrig");
        ukrNetHomePage.writeName("anna");
        ukrNetHomePage.writeSurname("mnhuygyjg");
        ukrNetHomePage.dateOfBirth();
        ukrNetHomePage.chooseSex();
        ukrNetHomePage.additionalEmail("iehrferkgtg");
        ukrNetHomePage.phoneNumber("5265984");
        ukrNetHomePage.checkAgreement();}


    @Test
    public void checkElementsOnRegistrationPage () {
        UkrNetHomePage ukrNetHomePage = new UkrNetHomePage(driver);
        ukrNetHomePage.openRegistrationPage();
        Assert.assertTrue(ukrNetHomePage.Logo().isDisplayed());
        Assert.assertTrue(ukrNetHomePage.UkrainianLanguage().isDisplayed());
        Assert.assertTrue(ukrNetHomePage.RussianLanguage().isDisplayed());
        ukrNetHomePage.RussianLanguage().click();
        ukrNetHomePage.EnglishLanguage().click();
        ukrNetHomePage.UkrainianLanguage().click();
        Assert.assertTrue(ukrNetHomePage.EnglishLanguage().isDisplayed());
        Assert.assertTrue(ukrNetHomePage.SupportTitle().isDisplayed());
        Assert.assertTrue(ukrNetHomePage.SupportEmail().isDisplayed());
        Assert.assertTrue(ukrNetHomePage.SupportPhone().isDisplayed());
        Assert.assertTrue(ukrNetHomePage.SupportVodafone().isDisplayed());
        Assert.assertTrue(ukrNetHomePage.SupportKiyvstar().isDisplayed());}
}
