package TetstNG;

import holders.TestInit;
import PageObjects.HomePageObjHelper;
import org.testng.annotations.Test;

public class TestHomePage extends TestInit {

    @Test
    public void check() {
        HomePageObjHelper homePageObjHelper = new HomePageObjHelper(driver);
        homePageObjHelper.goToHomePage();
    }

    //женя не гей (я тоже)
}
