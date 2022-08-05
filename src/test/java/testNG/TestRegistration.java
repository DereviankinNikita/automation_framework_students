package testNG;

import holders.TestInit;
import org.testng.annotations.Test;

import java.time.Clock;

public class TestRegistration extends TestInit {
    @Test
    void regCheck(){
        goToSite();
        homePageObjHelper().regClick();
        regPageHelper().GenderChoose(regPageHelper().Male);

    }

}
