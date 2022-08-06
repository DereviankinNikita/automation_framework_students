package Obj;

import Holder.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilterByPriceObj extends DriverHolder {

    public FilterByPriceObj(WebDriver driver){
        super(driver);
    }
    private String buttonBooksPriceRangeMin = "//*[@href = 'http://demowebshop.tricentis.com/books?price=-25']";
    private String buttonBooksPriceRangeAverage = "//*[@href = 'http://demowebshop.tricentis.com/books?price=25-50']";
    private String buttonBooksPriceRangeMax = "//*[@href = 'http://demowebshop.tricentis.com/books?price=50-']";

    private String buttonDesktopsPriceRangeMin = "//*[@href='http://demowebshop.tricentis.com/desktops?price=-1000']";
    private String buttonDesktopsPriceRangeAverage = "//*[@href='http://demowebshop.tricentis.com/desktops?price=1000-1200']";
    private String buttonDesktopsPriceRangeMax = "//*[@href='http://demowebshop.tricentis.com/desktops?price=1200-']";

    private String buttonAccessoriesPriceRangeMin = "//*[@href='http://demowebshop.tricentis.com/accessories?price=-100']";
    private String buttonAccessoriesPriceRangeMax = "//*[@href='http://demowebshop.tricentis.com/accessories?price=100-']";

    private String buttonCameraPhotoPriceRangeMin = "//*[@href='http://demowebshop.tricentis.com/camera-photo?price=-500']";
    private String buttonCameraPhotoPriceRangeMax = "//*[@href='http://demowebshop.tricentis.com/camera-photo?price=500-']";

    private String buttonJewelryPriceRangeMin = "//*[@href='http://demowebshop.tricentis.com/jewelry?price=0-500']";
    private String buttonJewelryPriceRangeAverage = "//*[@href='http://demowebshop.tricentis.com/jewelry?price=500-700']";
    private String buttonJewelryPriceRangeMax = "//*[@href='http://demowebshop.tricentis.com/jewelry?price=500-700']";

    private String buttonRemovePriceRangeFilter = "//*[@class='remove-price-range-filter']";

    public WebElement getButtonBooksPriceRangeMin(){
        return getElByXpath(buttonBooksPriceRangeMin);
    }
    public WebElement getButtonBooksPriceRangeAverage(){
        return getElByXpath(buttonBooksPriceRangeAverage);
    }
    public WebElement getButtonBooksPriceRangeMax(){
        return getElByXpath(buttonBooksPriceRangeMax);
    }

    public WebElement getButtonDesktopsPriceRangeMin(){
        return getElByXpath(buttonDesktopsPriceRangeMin);
    }
    public WebElement getButtonDesktopsPriceRangeAverage(){
        return getElByXpath(buttonDesktopsPriceRangeAverage);
    }
    public WebElement getButtonDesktopsPriceRangeMax(){
        return getElByXpath(buttonDesktopsPriceRangeMax)
    }

    public WebElement getButtonAccessoriesPriceRangeMin(){
        return getElByXpath(buttonAccessoriesPriceRangeMin);
    }
    public WebElement getButtonAccessoriesPriceRangeMax(){
        return getElByXpath(buttonAccessoriesPriceRangeMax);
    }

    public WebElement getButtonCameraPhotoPriceRangeMin(){
        return getElByXpath(buttonCameraPhotoPriceRangeMin);
    }
    public WebElement getButtonCameraPhotoPriceRangeMax(){
        return getElByXpath(buttonCameraPhotoPriceRangeMax);
    }

    public WebElement getButtonJewelryPriceRangeMin(){
        return getElByXpath(buttonJewelryPriceRangeMin);
    }
    public WebElement getButtonJewelryPriceRangeAverage(){
        return getElByXpath(buttonJewelryPriceRangeAverage);
    }
    public WebElement getButtonJewelryPriceRangeMax(){
        return getElByXpath(buttonJewelryPriceRangeMax);
    }

    public WebElement getButtonRemovePriceRangeFilter(){
        return getElByXpath(buttonRemovePriceRangeFilter);
    }



}
/*
    private String buttonPriceRangeMin = "";
    private String buttonPriceRangeAverage = "";
    private String buttonPriceRangeMax = "";*/
