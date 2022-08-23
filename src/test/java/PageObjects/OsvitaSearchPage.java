package PageObjects;

import org.openqa.selenium.WebDriver;

public class OsvitaSearchPage extends BasePage {
    public OsvitaSearchPage(WebDriver driver) {super(driver);}

    public void openOsvita() {driver.get("https://vstup.osvita.ua/spec/1-0-0/");}

//    public void closeAdvertising () {waitElementToBeVisible("//img[@src = 'images/close.png']").isDisplayed();}
    public void chooseEducationLavel () {
        waitElementToBeVisible("//span[@title = 'Бакалавр']").click();
        waitElementToBeVisible("//li[contains(text(), 'Бакалавр')]").click();}
    public void basisOfAdmission () {
        waitElementToBeVisible("//span[@title = '- Підстава вступу -']").click();
        waitElementToBeVisible("//li[contains(text(), 'Після 11 класу (ПЗСО)')]").click();}
    public void chooseFormOfEducation() {
        waitElementToBeVisible("//span[@title = '- Форма навчання -']").click();
        waitElementToBeVisible("//li[contains(text(), 'Денна')]").click();}
    public void chooseRegion (){
        waitElementToBeVisible("//span[@title = '- Регіон -']").click();
        waitElementToBeVisible("//li[contains(text(), 'Київ')]").click();
    }
    public void chooseBranchOfKnowledge () {
        waitElementToBeVisible("//span[@title = '- Галузь знань -']").click();
        waitElementToBeVisible("//li[contains(text(), 'Соціальні та поведінкові науки')]").click();}
    public void chooseSpeciality () {
        waitElementToBeVisible("//span[@title = '- Спеціальність -']").click();
        waitElementToBeVisible("//li[contains(text(), 'Економіка')]").click();}
    public void openCompetitiveSubjects() {waitElementToBeVisible("//span[@id = 'subjectslist']").click();}
    public void closeCompetitiveSubjects() {waitElementToBeVisible("//span[@id = 'subjectslist']").click();}
    public void clickSearchButton () {waitElementToBeVisible("//a[@id = 'submit']").click();}



    public void openRegistrationPage () {driver.get("https://cabinet.edbo.gov.ua/login/register");}
    public void putEmail (String email) {waitElementToBeVisible("//label[contains(text(), 'Логін (адреса електронної пошти) *')]/following-sibling::input").sendKeys(email);}
    public void putPassword (String password) {waitElementToBeVisible("//label[contains(text(), 'Пароль *')]/following-sibling::input").sendKeys(password);}
    public void putPasswordAgain (String passwordAgain) {waitElementToBeVisible("//label[contains(text(), 'Підтвердження паролю *')]/following-sibling::input").sendKeys(passwordAgain);}
    public void openFieldsForNMTresults () {waitElementToBeVisible("//*[contains(text(), '11 класів')]").click();}
    public void writeNMTnumber (String NMTnumber) {waitElementToBeVisible("//label[text() = 'Номер']/following-sibling::input").sendKeys(NMTnumber);}
    public void writeNMTpin (String NMTpin) {waitElementToBeVisible("//label[contains(text(), 'PIN-код')]/following-sibling::input").sendKeys(NMTpin);}
    public void writeNMTYear () {
        waitElementToBeVisible("//div[contains(@style, 'cursor: pointer; height: 100%; position: relative; width: 100%;')]").click();
        waitElementToBeVisible("//*[text() = '2022']/parent::div").click();}
    public void putSeries (String series) {waitElementToBeVisible("//label[contains(text(), 'Серія *')]/following-sibling::input").sendKeys(series);}
    public void putEducationNumber (String educationNumber) {waitElementToBeVisible("//label[contains(text(), 'Номер *')]/following-sibling::input").sendKeys(educationNumber);}
    public void clickRegisterButton () {waitElementToBeVisible("//span[contains(text(), 'Зареєструвати')]").click();}

}
