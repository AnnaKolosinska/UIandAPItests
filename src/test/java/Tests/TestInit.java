package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    WebDriver driver;
    @BeforeMethod
    public void setUp () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();}
}
