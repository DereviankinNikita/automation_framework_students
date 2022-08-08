package testNG;

import holders.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin extends TestInit {
    @Test
    public void logCheck(){
        goToSite();
        homePageObjHelper().logClick();
        logPageHelper().setMailField(homePageObj().loginMail);
        logPageHelper().setPassField(homePageObj().loginPassword);
        logPageHelper().LogButtonClick();
        Assert.assertEquals(logPageHelper().getAccountAttributeInnerText(),"Test0808@gmail.com");

    }
}
