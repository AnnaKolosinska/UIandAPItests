package PageObjects;

import org.openqa.selenium.WebDriver;

public class EpicentrHomePage extends BasePage {
    public EpicentrHomePage(WebDriver driver) {super(driver);}

    public void goToEpicentr () {
        driver.get("https://epicentrk.ua/");
    }



}
