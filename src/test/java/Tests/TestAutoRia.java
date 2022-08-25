package Tests;

import PageObjects.AutoRiaHomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TestAutoRia extends TestInit{

    @Test
    public void TestRia(){
        AutoRiaHomePage autoRiaHomePage = new AutoRiaHomePage(driver);
        autoRiaHomePage.goToRia();
        autoRiaHomePage.getCategories();
        autoRiaHomePage.getMark();
        autoRiaHomePage.getModel();
        autoRiaHomePage.getRegion();
        autoRiaHomePage.getYear();
        autoRiaHomePage.getPrice();
        autoRiaHomePage.getEnter();
        autoRiaHomePage.getCar();
        sleep(2);
        driver.quit();
    }

    @Test
    public void checkAllBtn(){
        AutoRiaHomePage autoRiaHomePage = new AutoRiaHomePage(driver);
        JavascriptExecutor j = (JavascriptExecutor)driver;
        autoRiaHomePage.goToRia();
        j.executeScript("window.scrollBy(0,1000)");
        autoRiaHomePage.getMoto();
        autoRiaHomePage.getCvadro();
        autoRiaHomePage.chooseAutoMarks();
        autoRiaHomePage.getMotoBtn();
        autoRiaHomePage.getSellAuto();
        j.executeScript("window.scrollBy(0,500)");
        autoRiaHomePage.getType();
        sleep(1);
        autoRiaHomePage.getMarkAuto();
        autoRiaHomePage.getYearAuto();
        sleep(1);
        autoRiaHomePage.getBodyType();
        sleep(2);
        driver.quit();

    }
    @Test
    public void OLXassert(){
        AutoRiaHomePage autoRiaHomePage = new AutoRiaHomePage(driver);
        autoRiaHomePage.goToRia();
        autoRiaHomePage.getAutoMobiles().isDisplayed();
        autoRiaHomePage.getRealEstate().isDisplayed();
        autoRiaHomePage.getHelpZSU().isDisplayed();
        autoRiaHomePage.getBY().isDisplayed();
        autoRiaHomePage.getNewCar().isDisplayed();
        autoRiaHomePage.getNews().isDisplayed();
        autoRiaHomePage.getAllForCar().isDisplayed();
        autoRiaHomePage.getFindLogo().isDisplayed();
        autoRiaHomePage.getSignIn().isDisplayed();

    }
}
