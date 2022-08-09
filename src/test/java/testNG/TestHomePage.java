package testNG;

import holders.TestInit;
import org.testng.annotations.Test;

public class TestHomePage extends TestInit {

    @Test
    public void check()
    {
        goToSite();
        homePageObjHelper().regClick();
    }


}
