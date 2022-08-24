package PageObjects;

import Tests.TestInit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class MetaHomePage extends BasePage{
    public MetaHomePage(WebDriver driver) {super(driver);}

    public void goToMetaPage () {driver.get("https://meta.ua/uk/");}
    public void SwitchToNews () {waitElementToBeVisible("//li[@data-category = '1']").click();}
    public void SwitchToSport () {waitElementToBeVisible("//li[@data-category = '3']").click();}
    public void SwitchToShowbiz () {waitElementToBeVisible("//li[@data-category = '5']").click();}
    public WebElement sideMenu () {
        return waitElementToBeVisible("//div[contains(@class, 'menu_trigger')]");}
    public WebElement logo () {
        return waitElementToBeVisible("//a[@class = 'logo']");}
    public WebElement searchField () {
        return waitElementToBeVisible("//span[contains(@class, 'icon-search')]");}
    public WebElement searchImg () {
        return waitElementToBeVisible("//input[@name= 'q']");}
    public WebElement searchBtn () {
        return waitElementToBeVisible("//input[contains(@class, 'search-button')]");}



    public void goToTranslatorPage() {
        driver.get("https://meta.ua/uk/");
        waitElementToBeVisible("//a[contains(text(),'Переклад')]").click();}
    public void changeFirstLanguage () {
        waitElementToBeVisible("//select[@name = 'lang_from' ]").click();
        waitElementToBeVisible("//select[@name = 'lang_from' ]//child::option[@value = 'de']").click();}
    public void changeSecondLanguage () {
        waitElementToBeVisible("//select[@name = 'lang_to' ]").click();
        waitElementToBeVisible("//select[@name = 'lang_to' ]//child::option[@value = 'pl']").click();}
    public void switchLanguages() {waitElementToBeVisible("//a[contains(@class, 'metafont-rotate')]").click();}
    public void putTextInField (String textToTranslate) {waitElementToBeVisible("//textarea[@name = 'text_source' ]").sendKeys(textToTranslate);}
    public void changeKindOfText () {
        waitElementToBeVisible("//select[@name = 'dict']").click();
        waitElementToBeVisible("//option[@value = 'BZ']").click();}
    public void openCloseKeyboard () {
        waitElementToBeVisible("//label[contains(@class, 'search-kbd')]").click();
        waitElementToBeVisible("//label[contains(@class, 'close ')]").click();}
    public void translateBtn () {waitElementToBeVisible("//input[@type = 'submit']").click();}


//    public List<WebElement> listOfDates () {
//        return waitElementsToBeVisible("//li[contains(@class, 'swiper-slide')]");}
//
//    public void dateChecks () {
//        TestInit testInit = new TestInit();
//        for (int i = 0; i < listOfDates().size(); i++){
//            listOfDates().get(i).click();
//            testInit.sleep(2);
//        }


}


