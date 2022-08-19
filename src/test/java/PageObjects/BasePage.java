package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    public WebDriver driver;
    public BasePage(WebDriver driver) {this.driver = driver;}

    public WebElement findElementByXpath(String locator){
        return driver.findElement(By.xpath(locator));
    }
}
