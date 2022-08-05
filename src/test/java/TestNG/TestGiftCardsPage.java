package TestNG;

import Holder.TestInit;
import Obj.HomePageObjHelper;
import org.testng.annotations.Test;
@Test
public class TestGiftCardsPage extends TestInit {

    public void testGiftCardsPage() {
        HomePageObjHelper homePageObjHelper = new HomePageObjHelper(driver);
        gotoHomePage();
        homePageObjHelper.clickGiftCards();
    }

}
