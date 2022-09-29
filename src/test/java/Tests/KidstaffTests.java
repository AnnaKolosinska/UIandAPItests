package Tests;

import PageObjects.KidstaffHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KidstaffTests extends TestInit {
          @Test
    public void checkKidstaffElements(){
              KidstaffHomePage kidstaffHomePage = new KidstaffHomePage(driver);
              kidstaffHomePage.runKidstaff();
//              kidstaffHomePage.getIconProfile();
//              kidstaffHomePage.getLogoKs();
//              kidstaffHomePage.getIconProfile();
//              kidstaffHomePage.getSearchField();
              Assert.assertTrue(kidstaffHomePage.getLogoKs().isDisplayed());
              Assert.assertTrue(kidstaffHomePage.getSearchField().isDisplayed());
              Assert.assertTrue(kidstaffHomePage.getDetailSearch().isDisplayed());
              Assert.assertTrue(kidstaffHomePage.getIconProfile().isDisplayed());

    }
}
