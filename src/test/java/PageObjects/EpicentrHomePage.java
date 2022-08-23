package PageObjects;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class EpicentrHomePage extends BasePage {
    public EpicentrHomePage(WebDriver driver) {super(driver);}

    public void goToEpicentr () {
        driver.get("https://epicentrk.ua/");
    }
    public void anotherCity () {waitElementToBeVisible("//button[contains(text(), 'інший')]").click();}
    public void clickOnCurrentCity() {waitElementToBeVisible("//div[@data-test = 'search-open']").click();}
    public void writeBrovaryCity() {waitElementToBeVisible("//input[@data-test = 'search-city']").sendKeys("Бровари");}
    public void chooseBrovaryCity() {waitElementToBeVisible("//b[text() = 'Бровари']/parent::div").click();}
    public void openMap(){waitElementToBeVisible("//button[@class = '_ECtgF9']").click();}
    public void biggerScale() {waitElementToBeVisible("//a[@class = 'leaflet-control-zoom-in']").click();}
    public void smallerScale() {waitElementToBeVisible("//a[@class = 'leaflet-control-zoom-out']").click();}
    public void closeMap(){waitElementToBeVisible("//button[@class = '_ECtgF9']").click();}
    public void chooseEpicentrInCity() {waitElementToBeVisible("//button[@class = 'btn btn--small btn--white __x9hwM' ]").click();}



    public void laptopSeatcingInField() {waitElementToBeVisible("//input[@placeholder = 'Пошук']").sendKeys("ноутбук\n");}
    public void gameLaptopsChoosing() {waitElementToBeVisible("//a[@href = '/ua/shop/noutbuki/fs/klass-noutbuka-igrovoy/' and @class = 'shop-categories__item-title nc']").click();}
    public void chooseAsus() {waitElementToBeVisible("//div[@data-filter-name = 'Asus']").click();}
    public void chooseHP() {waitElementToBeVisible("//div[@data-filter-name = 'HP']").click();}
    public void openFilter() {waitElementToBeVisible("//div[contains(@class, 'borderHead__filter')]").click();}
    public void minPriceChange(String minPrice) {
        waitElementToBeVisible("//input[contains(@class, 'min-price')]").clear();
        waitElementToBeVisible("//input[contains(@class, 'min-price')]").sendKeys(minPrice);}
    public void maxPriceChange(String maxPrice) {
        waitElementToBeVisible("//input[contains(@class, 'max-price')]").clear();
        waitElementToBeVisible("//input[contains(@class, 'max-price')]").sendKeys(maxPrice);}
    public void chooseDiagonal () {waitElementToBeVisible("//input[@data-filter-name = '15']").click();}
    public void clearAllFilters() {waitElementToBeVisible("//div[contains(@class, 'uncheck-all')]").click();}




    public void clickProfits () {waitElementToBeVisible("//a[@title = 'Вигода']").click();}
    public void clickHowToJoin () {waitElementToBeVisible("//strong[contains(text(), 'Як приєднатись')]").click();}
    public void clickQandA () {waitElementToBeVisible("//strong[contains(text(), 'Питання та відповіді')]").click();}
    public void readOneAnswer () {waitElementToBeVisible("//*[contains(text(), 'Що таке програма лояльності ВИГОДА?')]").click();}
    public void clickRules () {waitElementToBeVisible("//strong[contains(text(), 'Правила програми')]").click();}
    public void writeEmail (String email) {waitElementToBeVisible("//input[@name = 'subscribe']").sendKeys(email);}
    public void clickSubscribe () {waitElementToBeVisible("//button[@tabindex= '200']").click();}
    public void clickOnInstagram () {waitElementToBeVisible("//a[@href= 'https://www.instagram.com/epicentr_ua/']").click();}

}
