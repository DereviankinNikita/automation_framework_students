package TestNG;

import holders.TestInit;
import pageObjects.HomePageHelper;
import org.testng.annotations.Test;

public class TestHome extends TestInit {

    @Test
    public void check() {
        HomePageHelper homePageObjHelper = new HomePageHelper(driver);
        homePageObjHelper.goToHomePage();
    }
}
