package TestNG;

import Holder.TestInit;
import Obj.CategoriesPageHelper;
import Obj.FilterByPriceHelper;
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
    }
}
