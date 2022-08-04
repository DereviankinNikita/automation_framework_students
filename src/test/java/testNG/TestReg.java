package testNG;

import holders.TestInit;
import org.testng.annotations.Test;

public class TestReg extends TestInit {
    @Test
    void reg(){
        goToSite();
        homePageObjHelper().regClick();
    }
}
