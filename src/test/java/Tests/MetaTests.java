package Tests;

import PageObjects.MetaHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MetaTests extends TestInit {

    @Test
    public void metaHomePageTest() {
        MetaHomePage metaHomePage = new MetaHomePage(driver);
        metaHomePage.goToMetaPage();
        metaHomePage.SwitchToNews();
        metaHomePage.SwitchToSport();
        metaHomePage.SwitchToShowbiz();
        Assert.assertTrue(metaHomePage.sideMenu().isDisplayed());
        Assert.assertTrue(metaHomePage.logo().isDisplayed());
        Assert.assertTrue(metaHomePage.searchImg().isDisplayed());
        Assert.assertTrue(metaHomePage.searchField().isDisplayed());
        Assert.assertTrue(metaHomePage.searchBtn().isDisplayed());}


    @Test
    public void metaTranslatorTest () {
        MetaHomePage metaHomePage = new MetaHomePage(driver);
        metaHomePage.goToTranslatorPage();
        metaHomePage.changeFirstLanguage();
        metaHomePage.changeSecondLanguage();
        metaHomePage.switchLanguages();
        metaHomePage.putTextInField("some text");
        metaHomePage.changeKindOfText();
        sleep(2);
        metaHomePage.openCloseKeyboard();
        metaHomePage.translateBtn();}

}
