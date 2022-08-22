package Tests;

import PageObjects.PravdaHomePage;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class TestPravda extends TestInit{

    @Test
    public void checkPravda(){
        PravdaHomePage pravdaHomePage = new PravdaHomePage(driver);
        pravdaHomePage.goToPravda();
        pravdaHomePage.getMenu();
        pravdaHomePage.getEuroBtn();
        pravdaHomePage.getEngBtn();
        pravdaHomePage.getTankClick();
        pravdaHomePage.getUkrBtn();
        pravdaHomePage.getSearchBtn();
        pravdaHomePage.getSearchUkraine();
        pravdaHomePage.getPicture();
        driver.quit();
    }
    @Test
    public void SeachPravda(){
        PravdaHomePage pravdaHomePage = new PravdaHomePage(driver);
        pravdaHomePage.goToPravda();
        pravdaHomePage.getHuiloBtn();
        pravdaHomePage.getMenu();
        pravdaHomePage.getNews();
        pravdaHomePage.getCalendar();
        pravdaHomePage.getData();
        pravdaHomePage.getGetmanBtn();
        driver.quit();

    }

    @Test
    public void PravdaInThePast(){
        PravdaHomePage pravdaHomePage = new PravdaHomePage(driver);

        pravdaHomePage.goToPravda();
        pravdaHomePage.getHistoryBtn();
        pravdaHomePage.getYearBtn();
        pravdaHomePage.getAugust();
        pravdaHomePage.getClubBtn();
        pravdaHomePage.getClick4();
        pravdaHomePage.getClick1();
        pravdaHomePage.getMyClub();
        pravdaHomePage.getGoogleBtn();
        pravdaHomePage.getSearchGoogle();
        sleep(1);
        driver.quit();

    }

}

