package testNG;

import holders.TestInit;
import pageObjects.HomePageHelper;
import org.testng.annotations.Test;
@Test
public class TestGiftCardsPage extends TestInit {

    public void testGiftCardsPage() {
        HomePageHelper homePageHelper = new HomePageHelper(driver);
        gotoHomePage();
        //homePageHelper.clickGiftCards();
    }

}
