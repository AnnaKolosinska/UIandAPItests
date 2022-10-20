package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaHomePage extends BasePage {
    public RozetkaHomePage(WebDriver driver) {
        super(driver);}
        public void getLogIn(){ waitElementToBeVisible("//rz-user/button[contains(@class,'header__button')]").click();}
        public void getBtnRegistation(){ waitElementToBeVisible("//button[text()=' Зареєструватися ']").click();}
    public void putNameUser (String nameUser) {waitElementToBeVisible("//input[@formcontrolname='name']").sendKeys(nameUser);}
    public void putSurNameUser (String surNameUser) {waitElementToBeVisible("//input[@formcontrolname='surname']").sendKeys(surNameUser);}
    public void putPhoneNumberUser (String phoneNumberUser) {waitElementToBeVisible("//input[@formcontrolname='phone']").sendKeys(phoneNumberUser);}

    //input[@formcontrolname='surname']
        public void putEmailField (String eMail) {waitElementToBeVisible("//input[@formcontrolname='email']").sendKeys(eMail);}
     public void putPasswordField (String passWord) {
        waitElementToBeVisible("//input[@formcontrolname='password']").sendKeys(passWord);}
    public void tryRegistation(){ waitElementToBeVisible("//button[@type='submit']").click();}


    }


