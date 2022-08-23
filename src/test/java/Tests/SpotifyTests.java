package Tests;

import PageObjects.SpotifyHomePage;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SpotifyTests extends TestInit {

    @Test
    public void makeRegistration() {
        SpotifyHomePage spotifyHomePage = new SpotifyHomePage(driver);
        spotifyHomePage.goToSpotifyRegistrationPage();
        spotifyHomePage.putEmail("11111");
        spotifyHomePage.putEmailConfirmation("1111");
        spotifyHomePage.writePassword("123456");
        spotifyHomePage.putBirthdayDay("30");
        spotifyHomePage.chooseAprilMonth();
        spotifyHomePage.putYearOfBirth("2002");
        spotifyHomePage.chooseFemaleSex();
        spotifyHomePage.checkAllCheckboxes();
        spotifyHomePage.tryTpRegister();}

    @Test
    public void checkKalushPage () {
        SpotifyHomePage spotifyHomePage = new SpotifyHomePage(driver);
        spotifyHomePage.openKalushPage();
        spotifyHomePage.clickPlayBtn();
        spotifyHomePage.closeSuggestionToRegister();
        spotifyHomePage.seeAllPopularSongs();
        spotifyHomePage.closeExpandedList();
        sleep(3);
        spotifyHomePage.openSideMenu();
        spotifyHomePage.copySingerLink();}

    @Test
    public void spotifyMenuTest () {
        SpotifyHomePage spotifyHomePage = new SpotifyHomePage(driver);
        spotifyHomePage.openKalushPage();
        Assert.assertTrue(spotifyHomePage.logo().isDisplayed());
        Assert.assertTrue(spotifyHomePage.mainPage().isDisplayed());
        Assert.assertTrue(spotifyHomePage.searchBtn().isDisplayed());
        Assert.assertTrue(spotifyHomePage.collectionBtn().isDisplayed());
        Assert.assertTrue(spotifyHomePage.createPlaylistBtn().isDisplayed());
        Assert.assertTrue(spotifyHomePage.favoriteSongs().isDisplayed());
        spotifyHomePage.logo().click();
        spotifyHomePage.mainPage().click();
        spotifyHomePage.searchBtn().click();
        spotifyHomePage.collectionBtn().click();
        spotifyHomePage.createPlaylistBtn().click();
        spotifyHomePage.favoriteSongs().click();}
}