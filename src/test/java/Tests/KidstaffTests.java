package Tests;

import PageObjects.KidstaffHomePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KidstaffTests extends TestInit {
    @Test
    public void checkKidstaffElements() {
        KidstaffHomePage kidstaffHomePage = new KidstaffHomePage(driver);
        openUrl("https://www.kidstaff.com.ua/");
        // перевірка наявності кнопок, полів через ассерт
        Assert.assertTrue(kidstaffHomePage.getLogoKs().isDisplayed());
        Assert.assertTrue(kidstaffHomePage.getSearchField().isDisplayed());
        Assert.assertTrue(kidstaffHomePage.getDetailSearch().isDisplayed());
        Assert.assertTrue(kidstaffHomePage.getIconProfile().isDisplayed());

        sleep(2);
        //приймемо кукі
        kidstaffHomePage.getBtnCoockies().click();
        sleep(4);
        //перевірка меню випадашки
        kidstaffHomePage.getMenu().click();
        sleep(2);
        kidstaffHomePage.getKidsCloth().click();
        sleep(2);
        kidstaffHomePage.getArrowReturnMenu().click();
    }

    @Test
    public void languageSwitch() {
        KidstaffHomePage kidstaffHomePage = new KidstaffHomePage(driver);
        //Actions action = new Actions(driver);

        openUrl("https://www.kidstaff.com.ua/");
// для кожного нового користувача до прийняття кукі перемикач мов
        kidstaffHomePage.getLanguageSwitcherRu().click();
        sleep(4);
        kidstaffHomePage.getLanguageSwitcherUa().click();
        //для кожного нового юзера з'являється кнопка прийняти кукі, кожен раз при запуску теста.
        kidstaffHomePage.getBtnCoockies().click();
               // Без прийняття кукі (клік на кнопку) тест (клік на світчер мови) падає.
        kidstaffHomePage.getLanguageSwitcher().click();
    }
    @Test
public void checkPopularBrands(){
        KidstaffHomePage kidstaffHomePage = new KidstaffHomePage(driver);
        openUrl("https://www.kidstaff.com.ua/");
        kidstaffHomePage.getBtnCoockies().click();

//        kidstaffHomePage.getPopularBrandsGeox().click();
//        kidstaffHomePage.getLogoKs().click();
//        kidstaffHomePage.getPopularBrandsCrocks().click();
//        kidstaffHomePage.getLogoKs().click();
//        kidstaffHomePage.getPopularBrandsEcco().click();
//        kidstaffHomePage.getLogoKs().click();
//        kidstaffHomePage.getPopularBrandsLCWaikiki().click();
//        kidstaffHomePage.goBack();

        //те саме, через цикл
        kidstaffHomePage.clickOnBrands();
    }
}

