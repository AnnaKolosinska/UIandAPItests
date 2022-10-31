package Tests;

import PageObjects.KidstaffHomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class KidstaffTests extends TestInit {
    @Test
    public void checkKidstaffElements() {
        KidstaffHomePage kidstaffHomePage = new KidstaffHomePage(driver);
        openUrl("https://www.kidstaff.com.ua/");
        // перевірка наявності кнопок, полів через ассерт
        Assert.assertTrue(kidstaffHomePage.getSearchField().isDisplayed());
        Assert.assertTrue(kidstaffHomePage.getDetailSearch().isDisplayed());
        Assert.assertTrue(kidstaffHomePage.getIconProfile().isDisplayed());
        Assert.assertTrue(kidstaffHomePage.getSovetchitsa().isDisplayed());
        Assert.assertTrue(kidstaffHomePage.getShoppingCart().isDisplayed());
        Assert.assertTrue(kidstaffHomePage.getRegistration().isDisplayed());
        Assert.assertTrue(kidstaffHomePage.getLogin().isDisplayed());
        //приймемо кукі
        kidstaffHomePage.getBtnCoockies().click();
        //перевірка меню випадашки
        kidstaffHomePage.getMenu().click();
        kidstaffHomePage.getKidsCloth().click();
        kidstaffHomePage.getArrowReturnMenu().click();
        driver.quit();
    }

    @Test
    public void languageSwitch() {
        KidstaffHomePage kidstaffHomePage = new KidstaffHomePage(driver);
        //Actions action = new Actions(driver);

        openUrl("https://www.kidstaff.com.ua/");
        //для кожного нового користувача до прийняття кукі перемикач мов
        kidstaffHomePage.getLanguageSwitcherRu().click();
        kidstaffHomePage.getLanguageSwitcherUa().click();
        //для кожного нового юзера з'являється кнопка прийняти кукі, кожен раз при запуску теста.
        kidstaffHomePage.getBtnCoockies().click();
        // Без прийняття кукі (клік на кнопку) тест (клік на світчер мови) падає.
        kidstaffHomePage.getLanguageSwitcher().click();
        driver.quit();
    }

    @Test
    public void checkPopularBrands() {
        KidstaffHomePage kidstaffHomePage = new KidstaffHomePage(driver);
        openUrl("https://www.kidstaff.com.ua/");
        kidstaffHomePage.getBtnCoockies().click();
//Популярні бренди, перевірка кнопок
//внесли зміни scroll
        kidstaffHomePage.scroll(1800);
        String a = kidstaffHomePage.getPopularBrandsGeox().getText();
        kidstaffHomePage.getPopularBrandsGeox().click();
        Assert.assertTrue(kidstaffHomePage.getNamePageBrand().getText().contains(a));
        kidstaffHomePage.getLogoKs().click();
        kidstaffHomePage.scroll(1800);
        kidstaffHomePage.getPopularBrandsCrocs().click();
        kidstaffHomePage.getLogoKs().click();
        kidstaffHomePage.scroll(1800);
        kidstaffHomePage.getPopularBrandsEcco().click();
        kidstaffHomePage.getLogoKs().click();
        kidstaffHomePage.scroll(1800);
        kidstaffHomePage.getPopularBrandsLCWaikiki().click();
        kidstaffHomePage.goBack();
        driver.quit();
    }

    @Test
    public void checkByLoopPopularBrands() {
        KidstaffHomePage kidstaffHomePage = new KidstaffHomePage(driver);
        openUrl("https://www.kidstaff.com.ua/");
        kidstaffHomePage.getBtnCoockies().click();
        kidstaffHomePage.clickOnBrands();
        driver.quit();
    }

    @Test
    public void checkByLoopPopularBrandsTwo() {
        KidstaffHomePage kidstaffHomePage = new KidstaffHomePage(driver);
        openUrl("https://www.kidstaff.com.ua/");

        kidstaffHomePage.getBtnCoockies().click();
        ArrayList<String> listBrands = new ArrayList<>();
        for (int i = 0; i < kidstaffHomePage.packOfBrands().size(); i++) {
            listBrands.add(kidstaffHomePage.packOfBrands().get(i).getText());
        }
        System.out.println(listBrands);
        //перший цикл записує всі імена брендів у список (ArrayList)
        for (int j = 0; j < kidstaffHomePage.packOfBrands().size(); j++) {
            kidstaffHomePage.scroll(1800);
            kidstaffHomePage.packOfBrands().get(j).click();
            //другий цикл клікає на бренд, перевіряємо що на сторінці бренда є назва бренда як у каталозі на головній
            Assert.assertTrue(kidstaffHomePage.getNamePageBrand().getText().contains(listBrands.get(j)));
            driver.navigate().back();
            driver.quit();
        }
    }

    @Test(dataProvider = "LoginTestData")
    public void dataProvider(String email, String pass) {
        KidstaffHomePage kidstaffHomePage = new KidstaffHomePage(driver);
        openUrl("https://www.kidstaff.com.ua/");
        kidstaffHomePage.getLogIn().click();
        kidstaffHomePage.getFieldEmail().sendKeys(email);
        kidstaffHomePage.getFieldPass().sendKeys(pass);
        kidstaffHomePage.getBtnEnter().click();
        sleep(5);
        driver.quit();
    }

    @DataProvider(name = "LoginTestData")
    public Object[][] loginData() {
        Object[][] data = new Object[4][2];
        data[0][0] = "qwe@kidstaff.net";
        data[0][1] = "123";

        data[1][0] = "123";
        data[1][1] = "qwr";

        data[2][0] = "qwr";
        data[2][1] = "123";

        data[3][0] = "qwr";
        data[3][1] = "qwr";
        return  data;
    }
}


