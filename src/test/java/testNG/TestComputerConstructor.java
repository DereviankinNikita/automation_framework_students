package testNG;

import holders.TestInit;
import pageObjects.CategoriesPageHelper;
import pageObjects.ComputersPageHelper;
import org.testng.annotations.Test;

public class TestComputerConstructor extends TestInit {
    @Test
    public void buildYourOwnComputer(){

        goToSite();

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

        goToSite();

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
