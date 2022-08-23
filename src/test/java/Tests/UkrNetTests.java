package Tests;

import PageObjects.UkrNetHomePage;
import org.openqa.selenium.By;
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
    }


}
