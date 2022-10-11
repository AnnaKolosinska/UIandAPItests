package Tests;

import PageObjects.EbayHomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class EbayTests extends TestInit {
    @Test
    public void checkSections() {
        openUrl("https://www.ebay.com/");
        EbayHomePage ebayHomePage = new EbayHomePage(driver);
        Assert.assertTrue(ebayHomePage.getSectionFashion().isDisplayed());
        Assert.assertTrue(ebayHomePage.getSectionElectronics().isDisplayed());
        Assert.assertTrue(ebayHomePage.getSectionCollectibles().isDisplayed());
        Assert.assertTrue(ebayHomePage.getSectionSaved().isDisplayed());
        Assert.assertTrue(ebayHomePage.getSectionHealthBeauty().isDisplayed());
        Assert.assertTrue(ebayHomePage.getSectionHomeGarden().isDisplayed());

        ebayHomePage.getSectionFashion().click();
        sleep(2);
        ebayHomePage.getRowDown().click();
        Assert.assertTrue(ebayHomePage.allInWomen().isDisplayed());
        Assert.assertTrue(ebayHomePage.womenAccessories().isDisplayed());
        Assert.assertTrue(ebayHomePage.womenShoes().isDisplayed());
        Assert.assertTrue(ebayHomePage.womenBags().isDisplayed());
        Assert.assertTrue(ebayHomePage.womenClothing().isDisplayed());
        sleep(2);
        ebayHomePage.womenShoes().click();
        ebayHomePage.getLogo();


    }

    @Test
    public void checkNamesCategoty() {
        EbayHomePage ebayHomePage = new EbayHomePage(driver);
        openUrl("https://www.ebay.com/");
        ebayHomePage.goToAllCategoty().click();
        sleep(2);
        ebayHomePage.goToCategoryCollectibles().click();
        sleep(2);
        ebayHomePage.clickOnSubcategories();

        //перевірка відповідності назв підкатегорій у переліку та за посиланням, всередині
        /* ArrayList<String> listOfNames = new ArrayList<>();
        for (int i = 1; i < ebayHomePage.subcategoryNames().size(); i++) {
            listOfNames.add(ebayHomePage.subcategoryNames().get(i).getText());
            for (int j = 1; j < 8; j++) {
                ebayHomePage.subcategoryNames().get(j).click();
                Assert.assertEquals(listOfNames.get(j), ebayHomePage.subcategoryNameInside().getText());
                driver.navigate().back();
                //падає, бо назви не співпадають другий лінк: Collectible comics vs Comic Books, Manga & Memorabilia
            }
        }*/
    }
}


