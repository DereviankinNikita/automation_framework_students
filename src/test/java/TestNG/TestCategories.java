package TestNG;

import Holder.TestInit;
import Obj.CategoriesPageHelper;
import Obj.HomePageObjHelper;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestCategories extends TestInit {
    @Test
    public void buttonBooks(){
        CategoriesPageHelper categoriesPageHelper = new CategoriesPageHelper(driver);
        categoriesPageHelper.clickCategoryBooks();
        String actualStringBooks = driver.findElement(By.xpath("//*[@class='page-title']")).getText();
        String expectedStringBooks = "Books";
        assertTrue(actualStringBooks.contains(expectedStringBooks));
    }

    @Test
    public void buttonComputers(){
        CategoriesPageHelper categoriesPageHelper = new CategoriesPageHelper(driver);
        categoriesPageHelper.clickCategoryComputers();
        String actualStringComputers = driver.findElement(By.xpath("//*[@class='page-title']")).getText();
        String expectedStringComputers = "Computers";
        assertTrue(actualStringComputers.contains(expectedStringComputers));
    }

    @Test
    public void buttonDesktops(){
        CategoriesPageHelper categoriesPageHelper = new CategoriesPageHelper(driver);
        categoriesPageHelper.clickSubcategoryDesktops();
        String actualStringDesktops = driver.findElement(By.xpath("//*[@class='page-title']")).getText();
        String expectedStringDesktops = "Desktops";
        assertTrue(actualStringDesktops.contains(expectedStringDesktops));
    }
    @Test
    public void buttonNotebooks(){
        CategoriesPageHelper categoriesPageHelper = new CategoriesPageHelper(driver);
        categoriesPageHelper.clickSubcategoryNotebooks();
        String actualStringNotebooks = driver.findElement(By.xpath("//*[@class='page-title']")).getText();
        String expectedStringNotebooks = "Notebooks";
        assertTrue(actualStringNotebooks.contains(expectedStringNotebooks));
    }
    @Test
    public void buttonAccessories(){
        gotoHomePage();
        CategoriesPageHelper categoriesPageHelper = new CategoriesPageHelper(driver);
        categoriesPageHelper.clickSubcategoryAccessories();
        String actualStringAccessories = driver.findElement(By.xpath("//*[@class='page-title']")).getText();
        String expectedStringAccessories = "Accessories";
        assertTrue(actualStringAccessories.contains(expectedStringAccessories));
    }
}
