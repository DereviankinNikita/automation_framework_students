package Obj;

import org.openqa.selenium.WebDriver;

public class FilterByPriceHelper extends FilterByPriceObj{

    public FilterByPriceHelper(WebDriver driver){
        super(driver);
    }

    public void clickAccessoriesPriseMin(){
        getButtonAccessoriesPriceRangeMin().click();
    }
    public void clickAccessoriesPriseMax(){
        getButtonAccessoriesPriceRangeMax().click();
    }



    public void clickRemoveFilter(){
        getButtonRemovePriceRangeFilter().click();
    }
}
