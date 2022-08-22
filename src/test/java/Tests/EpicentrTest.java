package Tests;

import PageObjects.EpicentrHomePage;
import org.testng.annotations.Test;

public class EpicentrTest extends TestInit{

    @Test
    public void testChangingCity () {
        EpicentrHomePage epicentrHomePage = new EpicentrHomePage(driver);
        epicentrHomePage.goToEpicentr();
        epicentrHomePage.anotherCity();
        epicentrHomePage.clickOnCurrentCity();
        epicentrHomePage.writeBrovaryCity();
        epicentrHomePage.chooseBrovaryCity();
        epicentrHomePage.openMap();
        epicentrHomePage.biggerScale();
        epicentrHomePage.smallerScale();
        epicentrHomePage.closeMap();
        epicentrHomePage.chooseEpicentrInCity();}


    @Test
    public void filterTesting() {
        EpicentrHomePage epicentrHomePage = new EpicentrHomePage(driver);
        epicentrHomePage.goToEpicentr();
        epicentrHomePage.laptopSeatcingInField();
        epicentrHomePage.gameLaptopsChoosing();
        epicentrHomePage.chooseAsus();
        epicentrHomePage.chooseHP();
//        epicentrHomePage.openFilter();
        epicentrHomePage.minPriceChange("20000");
        epicentrHomePage.maxPriceChange("100000");
//        epicentrHomePage.chooseDiagonal();
        epicentrHomePage.clearAllFilters();}


    @Test
    public void printChecks () {
        EpicentrHomePage epicentrHomePage = new EpicentrHomePage(driver);
        epicentrHomePage.goToEpicentr();
        epicentrHomePage.clickProfits();
        epicentrHomePage.clickHowToJoin();
        epicentrHomePage.clickQandA();
        epicentrHomePage.readOneAnswer();
        epicentrHomePage.clickRules();
        epicentrHomePage.writeEmail("1234567");
        epicentrHomePage.clickSubscribe();
        epicentrHomePage.clickOnInstagram();
    }
}
