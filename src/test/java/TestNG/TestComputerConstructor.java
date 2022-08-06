package TestNG;

import Holder.TestInit;
import Obj.HomePageObjHelper;
import org.testng.annotations.Test;

public class TestComputerConstructor extends TestInit {
        @Test
    public void buildYourOwnComputer(){
        HomePageObjHelper homePageObjHelper = new HomePageObjHelper(driver);
        gotoHomePage();
        homePageObjHelper.clickComputersButton();




    }




}
