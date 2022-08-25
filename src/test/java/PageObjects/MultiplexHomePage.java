package PageObjects;

import Tests.TestInit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MultiplexHomePage extends  BasePage {
    public MultiplexHomePage(WebDriver driver) {
        super(driver);}
    public void goToMultiplex() {
        driver.get("https://multiplex.ua/ru/cinema/kyiv/prospect#24082022");}
    public List<WebElement> packOfDates() {
        return waitElementsToBeVisible("//a[contains(@class, 'date')]");}

    public void clickOnDates() {
        TestInit testInit = new TestInit();
        for (int i = 0; i < packOfDates().size() - 1; i++) {
            packOfDates().get(i).click();
            testInit.sleep(2);}}

    public void openSideMenu () {waitElementToBeVisible("//img[contains(@class,'menu-btn')]").click();}
    public void changeLanguage () {waitElementToBeVisible("//a[@hreflang='uk']").click();}
    public void openListOfCities () {waitElementToBeVisible("//div[contains(@class, 'geo_select')]").click();}
    public void changeTRC () {waitElementToBeVisible("//span[contains(text(), 'Respublika Park IMAX')]").click();}
    public void closeCityMenu () {waitElementToBeVisible("//img[contains(@class, 'menu_close')]").click();}
    public void changeFormatTo3D () {waitElementToBeVisible("//li[@data-format = '3D']").click();}
    public void changeHall () {waitElementToBeVisible("//li[@data-format = 'Chill out']").click();}



    public void openPageWithFood () {waitElementToBeVisible("//a[contains(text(), 'Купити попкорн онлайн')]").click();}
    public void addingPopcorn () {waitElementToBeVisible("//div[@data-item-id = '1781']//div[contains(@class, 'btn-plus')]").click();}
    public void addingPepsi () {waitElementToBeVisible("//div[@data-item-id = '3470']//div[contains(@class, 'btn-plus')]").click();}
    public void clickBtnNext () {waitElementToBeVisible("//button[@id = 'btn-next']").click();}

    public static final String SPAN_TEXT = "//label[@data-payment-type = '%s']";
    public WebElement paymentMethodSelection (String option){
        return waitElementToBeVisible(String.format(SPAN_TEXT, option));}


    public void changePaymentMethod () {waitElementToBeVisible("//label[@data-payment-type = 'privatepay']").click();}


    public void putName (String name) {waitElementToBeVisible("//input[@id = 'ci_user_name']").sendKeys(name);}
    public void putPhoneNumber (String number) {waitElementToBeVisible("//input[@id = 'ci_user_phone']").sendKeys(number);}
    public void putEmail (String email) {waitElementToBeVisible("//input[@id = 'ci_user_email']").sendKeys(email);}
    public void checkAgreement () {waitElementToBeVisible("//div[@class = 'checkout-agreement']").click();}
    public void clickBtnNext2 () {waitElementToBeVisible("//button[contains(@class, 'btn-next')]").click();}





}