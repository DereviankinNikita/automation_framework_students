package pageObjects;

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

    public void clickCameraPhotoPriceMin(){
        getButtonCameraPhotoPriceRangeMin().click();
    }
    public void clickCameraPhotoPriceMax(){
        getButtonCameraPhotoPriceRangeMax().click();
    }

    public void clickJewelryPriceMin(){
        getButtonJewelryPriceRangeMin().click();
    }
    public void clickJewelryPriceAverage(){
        getButtonJewelryPriceRangeAverage().click();
    }
    public void clickJewelryPriceMax(){
        getButtonJewelryPriceRangeMax().click();
    }

    public void clickBooksPriceMin(){
        getButtonBooksPriceRangeMin().click();
    }
    public void clickBooksPriceAverage(){
        getButtonBooksPriceRangeAverage().click();
    }
    public void clickBooksPriceMax(){
        getButtonBooksPriceRangeMax().click();
    }

    public void clickDesktopsPriceMin(){
        getButtonDesktopsPriceRangeMin().click();
    }
    public void clickDesktopsPriceAverage(){
        getButtonDesktopsPriceRangeAverage().click();
    }
    public void clickDesktopsPriceMax(){
        getButtonDesktopsPriceRangeMax().click();
    }



    public void clickRemoveFilter(){
        getButtonRemovePriceRangeFilter().click();
    }
}
