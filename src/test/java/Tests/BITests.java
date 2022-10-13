package Tests;

import PageObjects.BIHomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class BITests extends TestInit {
    @Test
    public void checkNamesOfList() {
        BIHomePage biHomePage = new BIHomePage(driver);
        openUrl("https://bi.ua/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        ArrayList<String> listNames = new ArrayList<>();

        for (int i = 0; i < biHomePage.namesAllLinks().size(); i++) {
            listNames.add(biHomePage.namesAllLinks().get(i).getText());
        }
        System.out.println(listNames);

        for (int j = 0; j < biHomePage.namesAllLinks().size(); j++) {
            biHomePage.namesAllLinks().get(j).click();
            sleep(5);
            Assert.assertEquals(listNames.get(j), biHomePage.nameInsidePage().getText());
            driver.navigate().back();
        }
    }

    @Test
    public void shopCart() {
        BIHomePage biHomePage = new BIHomePage(driver);
        openUrl("https://bi.ua/");
        biHomePage.searchTextField().sendKeys("lol");
        biHomePage.searchBtn().click();
        biHomePage.chooseFirstLol().click();
        biHomePage.btnBuyFirstLol().click();
        biHomePage.makeOrder().click();
        biHomePage.addItem().click();
        sleep(2);
        biHomePage.deleteItem().click();
        sleep(2);
        biHomePage.logo().click();
    }

    @Test
    public void chooseGift() {
        BIHomePage biHomePage = new BIHomePage(driver);
        openUrl("https://bi.ua/");
        biHomePage.fieldAge();
        biHomePage.getAge();
        biHomePage.fieldCategories();
        biHomePage.getCategory();
        biHomePage.getBtnChoose();
        biHomePage.fieldSortBy();
        biHomePage.fieldSortByPopular();
        sleep(2);
        biHomePage.getMenuHumburger();
        sleep(2);
        biHomePage.getMenuBento();
        sleep(2);
        biHomePage.fieldSortByHighPrice();
        sleep(2);
        biHomePage.fieldSortByLowPrice();
        sleep(2);
        biHomePage.fieldSortByNew();
    }
}

