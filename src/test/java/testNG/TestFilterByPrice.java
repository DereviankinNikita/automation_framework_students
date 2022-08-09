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
        gotoHomePage();
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
        assertTrue(actualStringFilterButtonAccessories.contains(expectedStringFilterButtonAccessories));
        filterByPriceHelper.clickRemoveFilter();
    }
    @Test
    public void buttonFilterAccessories(){
        gotoHomePage();
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
        String expectedStringAccessoriesMax = "";
        assertTrue(actualStingAccessoriesMax.contains(expectedStringAccessoriesMax));
        filterByPriceHelper.clickRemoveFilter();
    }
}
