package testNG;

import holders.TestInit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestLogin extends TestInit {
    private String positiveResult ="Test0808@gmail.com";
    private String negativeResult ="Login was unsuccessful";
    @Test(dataProvider = "getData")
    public void logCheck(String loginMail,String loginPassword,String result){
        goToSite();
        homePageObjHelper().logClick();
        logPageHelper().setMailField(loginMail);
        logPageHelper().setPassField(loginPassword);
        logPageHelper().LogButtonClick();
        if (result == positiveResult) {
            Assert.assertEquals(homePageObjHelper().getAccountAttributeInnerText(), result);
        }
        if (result == negativeResult) {
            Assert.assertTrue(logPageHelper().getValidationErrorAttributeInnerText().contains(result));
        }


    }
    @DataProvider
    protected Object[][] getData(){
        Object[][] data = new Object[3][3];
        //smoke
        data[0][0]=logPageHelper().loginMail;
        data[0][1]=logPageHelper().loginPassword;
        data[0][2]= positiveResult;
        //negativeMail
        data[1][0]=regPageHelper().randomMail();
        data[1][1]=logPageHelper().loginPassword;
        data[1][2]= negativeResult;
        //negativePass
        data[2][0]=logPageHelper().loginMail;
        data[2][1]=homePageObj().randomStringNumbers(6);
        data[2][2]= negativeResult;

        return  data ;
    }
}
