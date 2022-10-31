package Tests;

import PageObjects.VansHomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VansTest extends TestInit {
    @Test
    public void favoriteSelection () {
        VansHomePage vansHomePage = new VansHomePage(driver);

        openUrl("https://www.vans.co.uk/");
       vansHomePage.allowAll().click();
        vansHomePage.scroll( 3800);
        sleep(4);
        //vansHomePage.popupClose().click();
        //sleep(4);
        vansHomePage.kidsGoods().click();
        vansHomePage.getAddToFavourites().forEach(WebElement::click);
        int numbersHearts = vansHomePage.getAddToFavourites().size();
        sleep(5);
        vansHomePage.getBtnAllFavorites().click();
        sleep(2);
        vansHomePage.scroll(5000);
        Assert.assertEquals(vansHomePage.getProductNames().size(), numbersHearts );
        driver.quit();
    }
}


