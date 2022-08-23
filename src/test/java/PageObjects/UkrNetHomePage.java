package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
    public void chooseSex () {waitElementToBeVisible("//input[@id = 'id-sex-f']").click();}
}
