package TestNG;

import Holder.TestInit;
import org.testng.annotations.Test;

public class TestRegPage extends TestInit {
    @Test
    void reg(){
        urls().gotoHome();
        homePageObjHelper().regClick();
    }

}
