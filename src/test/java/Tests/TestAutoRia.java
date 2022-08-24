package Tests;

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

    public void checkAllBtn(){
        AutoRiaHomePage autoRiaHomePage = new AutoRiaHomePage(driver);


    }
}
