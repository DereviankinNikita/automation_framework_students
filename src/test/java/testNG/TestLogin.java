package testNG;

import holders.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin extends TestInit {
    private String Result ="Test0808@gmail.com";
    //smoke
    @Test
    public void logCheck(){
        goToSite();
        homePageObjHelper().logClick();
        logPageHelper().setMailField(homePageObj().loginMail);
        logPageHelper().setPassField(homePageObj().loginPassword);
        logPageHelper().LogButtonClick();
        Assert.assertEquals(logPageHelper().getAccountAttributeInnerText(),Result);
    }

}
