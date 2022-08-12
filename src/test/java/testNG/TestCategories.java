package testNG;

import holders.TestInit;
import pageObjects.CategoriesPageHelper;
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
    @Test
    public void buttonElectronics(){
        CategoriesPageHelper categoriesPageHelper = new CategoriesPageHelper(driver);
        categoriesPageHelper.clickCategoryElectronics();
        String actualStringElectronics = driver.findElement(By.xpath("//*[@class='page-title']")).getText();
        String expectedStingElectronics = "Electronics";
        assertTrue(actualStringElectronics.contains(expectedStingElectronics));
    }
    @Test
    public void buttonCameraPhoto(){
        CategoriesPageHelper categoriesPageHelper = new CategoriesPageHelper(driver);
        categoriesPageHelper.clickSubcategoryCameraPhoto();
        String actualStringCameraPhoto = driver.findElement(By.xpath("//*[@class='page-title']")).getText();
        String expectedStringCameraPhoto = "Camera, photo";
        assertTrue(actualStringCameraPhoto.contains(expectedStringCameraPhoto));
    }
    @Test
    public void buttonCellPhones(){
        CategoriesPageHelper categoriesPageHelper = new CategoriesPageHelper(driver);
        categoriesPageHelper.clickSubcategoryCellPhones();
        String actualStringCellPhones = driver.findElement(By.xpath("//*[@class='page-title']")).getText();
        String expectedStringCellPhones = "Cell phones";
        assertTrue(actualStringCellPhones.contains(expectedStringCellPhones));
    }
    @Test
    public void buttonApparelAndShoes(){
        CategoriesPageHelper categoriesPageHelper = new CategoriesPageHelper(driver);
        categoriesPageHelper.clickCategoryApparelEndShoes();
        String actualStringApparelAndShoes = driver.findElement(By.xpath("//*[@class='page-title']")).getText();
        String expectedStringApparelAndShoes = "Apparel & Shoes";
        assertTrue(actualStringApparelAndShoes.contains(expectedStringApparelAndShoes));
    }
    @Test
    public void buttonDigitalDownloads(){
        CategoriesPageHelper categoriesPageHelper = new CategoriesPageHelper(driver);
        categoriesPageHelper.clickDigitalDownloads();
        String actualStringDigitalDownloads = driver.findElement(By.xpath("//*[@class='page-title']")).getText();
        String expectedStingDigitalDownloads = "Digital downloads";
        assertTrue(actualStringDigitalDownloads.contains(expectedStingDigitalDownloads));
    }
    @Test
    public void buttonJewelry(){
        CategoriesPageHelper categoriesPageHelper = new CategoriesPageHelper(driver);
        categoriesPageHelper.clickJewelry();
        String actualStringJewelry = driver.findElement(By.xpath("//*[@class='page-title']")).getText();
        String expectedStringJewelry = "Jewelry";
        assertTrue(actualStringJewelry.contains(expectedStringJewelry));
        }
    @Test
    public void buttonGiftCards(){
        CategoriesPageHelper categoriesPageHelper = new CategoriesPageHelper(driver);
        categoriesPageHelper.clickGiftCards();
        String actualStringGiftCards = driver.findElement(By.xpath("//*[@class='page-title']")).getText();
        String expectedStringGiftCards = "Gift Cards";
        assertTrue(actualStringGiftCards.contains(expectedStringGiftCards));
    }

}
