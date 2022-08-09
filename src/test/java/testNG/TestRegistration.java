package testNG;

import holders.TestInit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestRegistration extends TestInit {
    private String positiveResult ="Your registration completed";
    private String negativeResult =" ";

    @Test
    public void justStart(){
        goToSite();
    }
    @Test(dataProvider = "getData")
    public void regCheck(String gender, String firstname ,String lastName,String gmail,String pass ,String result) {
        goToSite();
        homePageObjHelper().regClick();
        regPageHelper().genderChoose(gender);
        regPageHelper().setFirstName(firstname);
        regPageHelper().setLastName(lastName);
        regPageHelper().setGmail(gmail);
        System.out.println(pass);
        regPageHelper().setPass(pass);
        regPageHelper().RegBtnClick();
        if (result == positiveResult) {
            Assert.assertEquals(regPageHelper().getResultTrueAttributeInnerText(), positiveResult);
        }
        if (result == negativeResult) {
            Assert.assertTrue(regPageHelper().getNegativeResult(negativeResult));
        }

    }
    @DataProvider
    protected Object[][] getData(){
        Object[][] data = new Object[6][6];
        //smoke
        data[0][0]= regPageHelper().male;
        data[0][1]= homePageObj().randomStringSymbols(6);
        data[0][2]= homePageObj().randomStringSymbols(6);
        data[0][3]= regPageHelper().randomMail();
        data[0][4]= regPageHelper().randomPass();
        data[0][5]= positiveResult;
        //negativePass
        data[1][0]=regPageHelper().male;
        data[1][1]= homePageObj().randomStringSymbols(6);
        data[1][2]= homePageObj().randomStringSymbols(6);
        data[1][3]= regPageHelper().randomMail();
        data[1][4]= "";
        negativeResult="Password is required";
        data[1][5]= negativeResult;
        //
        data[2][0]=regPageHelper().male;
        data[2][1]= "";
        data[2][2]= homePageObj().randomStringSymbols(6);
        data[2][3]= regPageHelper().randomMail();
        data[2][4]= regPageHelper().randomPass();
        negativeResult="First name is required";
        data[2][5]= negativeResult;
        //
        data[3][0]=regPageHelper().male;
        data[3][1]= homePageObj().randomStringSymbols(6);
        data[3][2]= "";
        data[3][3]= regPageHelper().randomMail();
        data[3][4]= regPageHelper().randomPass();
        negativeResult="Last name is required";
        data[3][5]= negativeResult;
        //
        data[4][0]=regPageHelper().male;
        data[4][1]= homePageObj().randomStringSymbols(6);
        data[4][2]= homePageObj().randomStringSymbols(6);
        data[4][3]= "";
        data[4][4]= regPageHelper().randomPass();
        negativeResult="Email is required";
        data[4][5]= negativeResult;
        //
        data[5][0]=regPageHelper().male;
        data[5][1]= homePageObj().randomStringSymbols(6);
        data[5][2]= homePageObj().randomStringSymbols(6);
        data[5][3]= homePageObj().randomStringSymbols(10);
        data[5][4]= regPageHelper().randomPass();
        negativeResult="Wrong email";
        data[5][5]= negativeResult;


        return  data ;
    }


}
