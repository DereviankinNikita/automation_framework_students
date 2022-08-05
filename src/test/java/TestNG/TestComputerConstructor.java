package TestNG;

import Holder.TestInit;
import Obj.HomePageObjHelper;

public class TestComputerConstructor extends TestInit {

    public void buildYourOwnComputer(){
        HomePageObjHelper homePageObjHelper = new HomePageObjHelper(driver);
        gotoHomePage();
        homePageObjHelper.clickComputersButton();




    }




}
