package TestNG;

import Holder.TestInit;
import org.testng.annotations.Test;

public class TestHomePage extends TestInit {

    @Test
    public void check()
    {
        urls().gotoHome();
        homePageObjHelper().regClick();
    }


}
