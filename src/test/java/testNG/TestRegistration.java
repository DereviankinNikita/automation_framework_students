package testNG;

import holders.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Clock;
import java.util.Random;

public class TestRegistration extends TestInit {
    private String ResultTrue="Your registration completed";

    @Test
    public void justStart(){
        goToSite();
    }
    //smoke
    @Test
    public void regCheck() {
        goToSite();
        homePageObjHelper().regClick();
        regPageHelper().GenderChoose(regPageHelper().Male);
        regPageHelper().setFirstNameRandomly();
        regPageHelper().setLastNameRandomly();
        regPageHelper().setGmailRandomly();
        regPageHelper().setPassRandomly();
        regPageHelper().RegBtnClick();
        Assert.assertEquals(regPageHelper().getResultAttributeInnerText(),ResultTrue);
    }


}
