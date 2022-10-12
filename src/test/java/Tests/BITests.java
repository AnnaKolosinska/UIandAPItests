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
        //
        ArrayList<String> listNames = new ArrayList<>();
        for (String name : listNames) {
            biHomePage.nameInsidePage().click();
            Assert.assertEquals(biHomePage.nameInsidePage().getText(), name);
        }


        /*for (int i = 0; i < biHomePage.namesAllLinks().size(); i++){
            listNames.add(biHomePage.namesAllLinks().get(i).getText());
            for (int j = 0; j <5; j++) {
                biHomePage.namesAllLinks().get(j).click();
                Assert.assertEquals(listNames.get(j), biHomePage.nameInsidePage().getText());
                driver.navigate().back();
            }
        }*/
    }
    }

