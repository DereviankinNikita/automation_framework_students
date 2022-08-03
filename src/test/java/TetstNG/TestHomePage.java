package TetstNG;

import Holder.TestInit;
import Obj.HomePageObj;
import org.testng.annotations.Test;

public class TestHomePage extends TestInit {

    @Test
    public void check()
    {
        HomePageObj homePageObj = new HomePageObj(driver);
        gotoHome();
        homePageObj.SubscribeBtn().click();

    }
}
