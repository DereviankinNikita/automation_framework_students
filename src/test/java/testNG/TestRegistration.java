package testNG;

import holders.TestInit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestRegistration extends TestInit {
    private String resultTrue ="Your registration completed";

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
        regPageHelper().setPass(pass);
        regPageHelper().RegBtnClick();
        Assert.assertEquals(regPageHelper().getResultAttributeInnerText(), resultTrue);
    }
    @DataProvider
    protected Object[][] getData(){
        Object[][] data = new Object[1][6];
        //smoke
        data[0][0]=regPageHelper().male;
        data[0][1]= homePageObj().randomStringSymbols(6);
        data[0][2]= homePageObj().randomStringSymbols(6);
        data[0][3]= regPageHelper().randomMail();
        data[0][4]= regPageHelper().randomPass();
        data[0][5]= resultTrue;
        //


        return  data ;
    }


}
