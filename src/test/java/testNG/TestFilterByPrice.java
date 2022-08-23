package testNG;

import holders.TestInit;
import pageObjects.CategoriesPageHelper;
import pageObjects.FilterByPriceHelper;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestFilterByPrice extends TestInit {
    @Test
    public void buttonFilterBooks(){
        goToSite();
        CategoriesPageHelper categoriesPageHelper = new CategoriesPageHelper(driver);
        categoriesPageHelper.clickCategoryBooks();
        FilterByPriceHelper filterByPriceHelper = new FilterByPriceHelper(driver);
        filterByPriceHelper.clickBooksPriceMin();
        String actualStringFilterButtonMin = driver.findElement(By.xpath("//*[@class = 'selected-price-range']")).getText();
        String expectedStringFilterButtonMin = "Under 25.00";
        assertTrue(actualStringFilterButtonMin.contains(expectedStringFilterButtonMin));
        filterByPriceHelper.clickRemoveFilter();
        filterByPriceHelper.clickBooksPriceAverage();
        String actualStringFilterButtonAccessories = driver.findElement(By.xpath("//*[@class = 'selected-price-range']")).getText();
        String expectedStringFilterButtonAccessories = "25.00 - 50.00";
        assertTrue(actualStringFilterButtonAccessories.contains(expectedStringFilterButtonAccessories));
        filterByPriceHelper.clickRemoveFilter();
        filterByPriceHelper.clickBooksPriceMax();
        String actualStringFilterMax = driver.findElement(By.xpath("//*[@class = 'selected-price-range']")).getText();
        String expectedStringFilterMax = "Over 50.00";
        assertTrue(actualStringFilterMax.contains(expectedStringFilterMax));
        filterByPriceHelper.clickRemoveFilter();
    }
    @Test
    public void buttonFilterAccessories(){
        goToSite();
        CategoriesPageHelper categoriesPageHelper = new CategoriesPageHelper(driver);
        categoriesPageHelper.clickSubcategoryAccessories();
        FilterByPriceHelper filterByPriceHelper = new FilterByPriceHelper(driver);
        filterByPriceHelper.clickAccessoriesPriseMin();
        String actualStringAccessoriesMin = driver.findElement(By.xpath("//*[@class = 'selected-price-range']")).getText();
        String expectedStringAccessoriesMin = "Under 100.00";
        assertTrue(actualStringAccessoriesMin.contains(expectedStringAccessoriesMin));
        filterByPriceHelper.clickRemoveFilter();
        filterByPriceHelper.clickAccessoriesPriseMax();
        String actualStingAccessoriesMax = driver.findElement(By.xpath("//*[@class = 'selected-price-range']")).getText();
        String expectedStringAccessoriesMax = "Over 100.00";
        assertTrue(actualStingAccessoriesMax.contains(expectedStringAccessoriesMax));
        filterByPriceHelper.clickRemoveFilter();
    }
    @Test
    public void buttonFilterCameraPhoto(){
        goToSite();
        CategoriesPageHelper categoriesPageHelper = new CategoriesPageHelper(driver);
        categoriesPageHelper.clickSubcategoryCameraPhoto();
        FilterByPriceHelper filterByPriceHelper = new FilterByPriceHelper(driver);
        filterByPriceHelper.clickCameraPhotoPriceMin();
        String actualStringCameraPhotoMin = driver.findElement(By.xpath("//*[@class = 'selected-price-range']")).getText();
        String expectedStringCameraPhotoMin = "Under 500.00";
        assertTrue(actualStringCameraPhotoMin.contains(expectedStringCameraPhotoMin));
        filterByPriceHelper.clickRemoveFilter();
        filterByPriceHelper.clickCameraPhotoPriceMax();
        String actualStringCameraPhotoMax = driver.findElement(By.xpath("//*[@class = 'selected-price-range']")).getText();
        String expectedStringCameraPhotoMax = "Over 500.00";
        assertTrue(actualStringCameraPhotoMax.contains(expectedStringCameraPhotoMax));
        filterByPriceHelper.clickRemoveFilter();
    }
    @Test
    public void buttonFilterJewelry(){
        goToSite();
        CategoriesPageHelper categoriesPageHelper = new CategoriesPageHelper(driver);
        categoriesPageHelper.clickJewelry();
        FilterByPriceHelper filterByPriceHelper = new FilterByPriceHelper(driver);
        filterByPriceHelper.clickJewelryPriceMin();
        String actualStringJewelryMin = driver.findElement(By.xpath("//*[@class = 'selected-price-range']")).getText();
        String expectedStringJewelryMin = "0.00 - 500.00";
        assertTrue(actualStringJewelryMin.contains(expectedStringJewelryMin));
        filterByPriceHelper.clickRemoveFilter();
        filterByPriceHelper.clickJewelryPriceAverage();
        String actualStringJewelryAverage = driver.findElement(By.xpath("//*[@class = 'selected-price-range']")).getText();
        String expectedStringJewelryAverage = "500.00 - 700.00";
        assertTrue(actualStringJewelryAverage.contains(expectedStringJewelryAverage));
        filterByPriceHelper.clickRemoveFilter();
        filterByPriceHelper.clickJewelryPriceMax();
        String actualStringJewelryMax = driver.findElement(By.xpath("//*[@class = 'selected-price-range']")).getText();
        String expectedStringJewelryMax = "700.00 - 3000.00";
        assertTrue(actualStringJewelryMax.contains(expectedStringJewelryMax));
        filterByPriceHelper.clickRemoveFilter();
    }
    @Test
    public void buttonFilterDesktops(){
        goToSite();
        CategoriesPageHelper categoriesPageHelper = new CategoriesPageHelper(driver);
        categoriesPageHelper.clickSubcategoryDesktops();
        FilterByPriceHelper filterByPriceHelper = new FilterByPriceHelper(driver);
        filterByPriceHelper.clickDesktopsPriceMin();
        String actualStringDesktopsMin = driver.findElement(By.xpath("//*[@class = 'selected-price-range']")).getText();
        String expectedStringDesktopsMin = "Under 1000.00";
        assertTrue(actualStringDesktopsMin.contains(expectedStringDesktopsMin));
        filterByPriceHelper.clickRemoveFilter();
        filterByPriceHelper.clickDesktopsPriceAverage();
        String actualStringDesktopsAverage = driver.findElement(By.xpath("//*[@class = 'selected-price-range']")).getText();
        String expectedStringDesktopsAverage = "1000.00 - 1200.00";
        assertTrue(actualStringDesktopsAverage.contains(expectedStringDesktopsAverage));
        filterByPriceHelper.clickRemoveFilter();
        filterByPriceHelper.clickDesktopsPriceMax();
        String actualStringDesktopMax = driver.findElement(By.xpath("//*[@class = 'selected-price-range']")).getText();
        String expectedStringDesktopMax = "Over 1200.00";
        assertTrue(actualStringDesktopMax.contains(expectedStringDesktopMax));
        filterByPriceHelper.clickRemoveFilter();
    }
}
