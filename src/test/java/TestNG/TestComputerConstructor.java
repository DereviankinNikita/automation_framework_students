package TestNG;

import Holder.TestInit;
import Obj.CategoriesPageHelper;
import Obj.ComputersPageHelper;
import Obj.HomePageObjHelper;
import org.apache.commons.compress.harmony.pack200.PackingUtils;
import org.testng.annotations.Test;

public class TestComputerConstructor extends TestInit {
        @Test
    public void buildYourOwnComputer(){

        gotoHomePage();

            CategoriesPageHelper categoriesPageHelper = new CategoriesPageHelper(driver);
            categoriesPageHelper.clickSubcategoryDesktops();
            ComputersPageHelper computersPageHelper = new ComputersPageHelper(driver);
            computersPageHelper.buildYourOwnComputerClick();
            computersPageHelper.processorChange();
            computersPageHelper.ramFieldChange();
            computersPageHelper.hddChange();
            computersPageHelper.osChange();
            computersPageHelper.softwareChange();
    }
    @Test
    public void buildYourOwnExpensiveComputer(){

        gotoHomePage();

        CategoriesPageHelper categoriesPageHelper = new CategoriesPageHelper(driver);
        categoriesPageHelper.clickSubcategoryDesktops();
        ComputersPageHelper computersPageHelper = new ComputersPageHelper(driver);
        computersPageHelper.buildYourOwnExpensiveComputer();
        computersPageHelper.processorExpChange();
        computersPageHelper.ramExpChange();
        computersPageHelper.hddExpChange();
        computersPageHelper.softwareExpChange();
    }




}
