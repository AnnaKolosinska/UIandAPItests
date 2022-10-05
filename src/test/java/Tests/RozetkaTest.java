package Tests;

import PageObjects.RozetkaHomePage;
import org.testng.annotations.Test;

public class RozetkaTest extends TestInit {
    @Test
    public void getRegistations(){
        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
        openUrl("https://rozetka.com.ua/");
        sleep(2);
        rozetkaHomePage.getLogIn();
        sleep(2);
        rozetkaHomePage.getBtnRegistation();
        sleep(2);
        rozetkaHomePage.putNameUser("Ліля");
        rozetkaHomePage.putSurNameUser("Тест");
        sleep(2);
        rozetkaHomePage.putPhoneNumberUser("506667722");
        sleep(7);
        rozetkaHomePage.putEmailField("test@test.ua");
        rozetkaHomePage.putPasswordField("Qwerty123Кен");
        rozetkaHomePage.tryRegistation();
    }


}
