package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpotifyHomePage extends BasePage{
    public SpotifyHomePage(WebDriver driver) {super(driver);}

    public void goToSpotifyRegistrationPage () {driver.get("https://www.spotify.com/ua-en/signup?forward_url=https%3A%2F%2Fopen.spotify.com%2F");}
    public void putEmail (String email) {waitElementToBeVisible("//input[@type = 'email' and @name = 'email']").sendKeys(email);}
    public void putEmailConfirmation (String secondEmail) {waitElementToBeVisible("//input[@type = 'email' and @name = 'confirm']").sendKeys(secondEmail);}
    public void writePassword (String password) {waitElementToBeVisible("//input[@type = 'password']").sendKeys(password);}
    public void putBirthdayDay (String day) {waitElementToBeVisible("//input[@id = 'day']").sendKeys(day);}
    public void chooseAprilMonth () {
        waitElementToBeVisible("//select[@id = 'month']").click();
        waitElementToBeVisible("//option[text() = 'Апрель']").click();}
    public void putYearOfBirth (String year) {waitElementToBeVisible("//input[@id = 'year']").sendKeys(year);}
    public void chooseFemaleSex (){waitElementToBeVisible("//label[@for = 'gender_option_female']").click();}
    public void checkAllCheckboxes () {
        waitElementToBeVisible("//label[@for= 'marketing-opt-checkbox']").click();
        waitElementToBeVisible("//label[@for= 'third-party-checkbox']").click();
        waitElementToBeVisible("//label[@for= 'terms-conditions-checkbox']").click();}
    public void tryTpRegister () {waitElementToBeVisible("//button[@type= 'submit']").click();}


    public void openKalushPage () {driver.get("https://open.spotify.com/artist/46rVVJwHWNS7C7MaWXd842");}
    public void clickPlayBtn () {waitElementToBeVisible("//button[contains(@class, 'kgFBvD')]").click();}
    public void closeSuggestionToRegister () {waitElementToBeVisible("//button[contains(text(), 'Закрыть')]").click();}
    public void seeAllPopularSongs () {waitElementToBeVisible("//div[contains(text(), 'Еще')]").click();}
    public void closeExpandedList () {waitElementToBeVisible("//div[contains(text(), 'Свернуть')]").click();}
    public void openSideMenu () {waitElementToBeVisible("//button[@aria-label = 'Открыть контекстное меню: KALUSH']").click();}
    public void copySingerLink () {
        waitElementToBeVisible("//span[contains(text(), 'Поделиться')]").click();
        waitElementToBeVisible("//span[contains(text(), 'Копировать ссылку на исполнителя')]").click();}

    public WebElement logo () {
        return waitElementToBeVisible("//a[contains(@class,'logo')]");}
    public WebElement mainPage () {
        return waitElementToBeVisible("//a[contains(@class, 'link-subtle') and @href = '/search']");}
    public WebElement searchBtn () {
        return waitElementToBeVisible("//a[@href = '/search']");}
    public WebElement collectionBtn() {
        return waitElementToBeVisible("//a[@href = '/collection']");}
    public WebElement createPlaylistBtn() {
        return waitElementToBeVisible("//button[@data-testid = 'create-playlist-button']");}
    public WebElement favoriteSongs() {
        return waitElementToBeVisible("//a[@href = '/collection/tracks']");}




}
