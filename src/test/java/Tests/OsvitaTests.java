package Tests;

import PageObjects.OsvitaSearchPage;
import org.testng.annotations.Test;

public class OsvitaTests extends TestInit {

    @Test
    public void CheckingTheSelectionOfFilters () {
        OsvitaSearchPage osvitaSearchPage = new OsvitaSearchPage(driver);
        osvitaSearchPage.openOsvita();
        osvitaSearchPage.chooseEducationLavel();
        osvitaSearchPage.basisOfAdmission();
        osvitaSearchPage.chooseFormOfEducation();
        sleep(3);
//        osvitaSearchPage.closeAdvertising();
        osvitaSearchPage.chooseRegion();
        osvitaSearchPage.chooseBranchOfKnowledge();
        osvitaSearchPage.chooseSpeciality();
        osvitaSearchPage.openCompetitiveSubjects();
        osvitaSearchPage.closeCompetitiveSubjects();
        osvitaSearchPage.clickSearchButton();}


    @Test
    public void Registration () {
        OsvitaSearchPage osvitaSearchPage = new OsvitaSearchPage(driver);
        osvitaSearchPage.openRegistrationPage();
        osvitaSearchPage.putEmail("12345");
        osvitaSearchPage.putPassword("124578");
        osvitaSearchPage.putPasswordAgain("124578");
        osvitaSearchPage.openFieldsForNMTresults();
        osvitaSearchPage.writeNMTnumber("123456");
        osvitaSearchPage.writeNMTpin("1222222");
        osvitaSearchPage.writeNMTYear();
        sleep(5);
        osvitaSearchPage.putSeries("15935");
        osvitaSearchPage.putEducationNumber("111111");
        osvitaSearchPage.clickRegisterButton();}
}

