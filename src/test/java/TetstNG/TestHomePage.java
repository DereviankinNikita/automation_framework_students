package TetstNG;

import org.testng.annotations.Test;

public class TestHomePage extends TestInit {

    @Test
    public void check()
    {
        urls().gotoHome();
        homePageObjHelper().RegClick();
    }
}
