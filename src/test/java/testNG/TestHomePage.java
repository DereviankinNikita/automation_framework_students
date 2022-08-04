package testNG;

import holders.TestInit;
import pageObjects.HomePageObjHelper;
import org.testng.annotations.Test;

public class TestHomePage extends TestInit {

    @Test
    public void check() {
        HomePageObjHelper homePageObjHelper = new HomePageObjHelper(driver);
        homePageObjHelper.goToHomePage();
    }
}
