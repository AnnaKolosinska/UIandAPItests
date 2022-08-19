package Tests;

import PageObjects.EpicentrHomePage;
import org.testng.annotations.Test;

public class EpicentrTest extends TestInit{

    @Test
    public void testName () {
        EpicentrHomePage epicentrHomePage = new EpicentrHomePage(driver);
        epicentrHomePage.goToEpicentr();

    }
}
