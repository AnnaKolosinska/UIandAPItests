package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UkrNetHomePage extends BasePage{
    public UkrNetHomePage(WebDriver driver) {super(driver);}

    public void goToUkrNet () {driver.get("https://www.ukr.net/");}
    public void clickOnCurrency () {waitElementToBeVisible("//li[@data-tab = 'currency']").click();}
    public void convertHryvnias (String amount){
        waitElementToBeVisible("//input[@id = 'grn']").sendKeys(amount);}
    public void clickOnFuel() {waitElementToBeVisible("//li[@data-tab = 'fuel']").click();}
    public void openA95Fuel () {waitElementToBeVisible("//li[@id = 'fuel-3']").click();}
    public void clickOnOrakul () {waitElementToBeVisible("//li[@data-tab = 'orakul']").click();}
    public void clickOnFilms () {waitElementToBeVisible("//li[@data-tab = 'afisha']").click();}
    public void changeCityToBrovary () {
        waitElementToBeVisible("//a[@class= 'city-link']").click();
        waitElementToBeVisible("//input[@class = 'city-input']").sendKeys("Бровари");
        waitElementToBeVisible("//a[@data-id= '35']").click();}
    public void clickOnLanguage () {waitElementToBeVisible("//section[@class = 'top-bar']").click();}


    public void openRegistrationPage () {driver.get("https://accounts.ukr.net/registration?client_id=9TFMHJACHt5KxBm2sQWS&lang=uk");}
    public void putNameOfBox (String boxName) {waitElementToBeVisible("//input[@id = 'id-login']").sendKeys(boxName);}
    public void writePassword (String password) {waitElementToBeVisible("//input[@id = 'id-password']").sendKeys(password);}
    public void repeatPassword (String secondPassword) {waitElementToBeVisible("//input[@id = 'id-password-repeat']").sendKeys(secondPassword);}
    public void writeName (String name) {waitElementToBeVisible("//input[@id = 'id-first-name']").sendKeys(name);}
    public void writeSurname (String surname) {waitElementToBeVisible("//input[@placeholder = 'Прізвище']").sendKeys(surname);}
    public void dateOfBirth () {
        waitElementToBeVisible("//input[@id = 'id-birth-day']").sendKeys("30");
        waitElementToBeVisible("//section[contains(@class, 'option-month')]").click();
        waitElementToBeVisible("//li[contains(text(), 'квітня')]").click();
        waitElementToBeVisible("//input[@placeholder = 'рік']").sendKeys("2002");}
    public void chooseSex () {waitElementToBeVisible("//input[@id = 'id-sex-f']/parent::div").click();}
    public void additionalEmail (String additionalEmail) {waitElementToBeVisible("//input[@id = 'id-email']").sendKeys(additionalEmail);}
    public void phoneNumber (String phoneNumber) {waitElementToBeVisible("//input[@id = 'id-mobile']").sendKeys(phoneNumber);}
    public void checkAgreement () {waitElementToBeVisible("//label[@for= 'id-confirm-privacy' and contains(@class, 'checkbox__imitator')]").click();}


    public WebElement Logo () {
        return waitElementToBeVisible("//div[contains(@class, 'header__logo')]");}
    public WebElement UkrainianLanguage () {
        return waitElementToBeVisible("//span[contains(text(), 'Українська')]");}
    public WebElement RussianLanguage () {
        return waitElementToBeVisible("//span[contains(text(), 'Русский')]");}
    public WebElement EnglishLanguage () {
        return waitElementToBeVisible("//span[contains(text(), 'English')]");}
    public WebElement SupportTitle () {
        return waitElementToBeVisible("//h4[contains(@class, 'footer__support-title')]");}
    public WebElement SupportEmail () {
        return waitElementToBeVisible("//li[contains(@class, 'footer__support-item_email')]");}
    public WebElement SupportPhone () {
        return waitElementToBeVisible("//li[contains(@class, 'footer__support-item_phone')]");}
    public WebElement SupportVodafone () {
        return waitElementToBeVisible("//li[contains(@class, 'footer__support-item_vodafone')]");}
    public WebElement SupportKiyvstar () {
        return waitElementToBeVisible("//li[contains(@class, 'footer__support-item_kiyvstar')]");}

}
