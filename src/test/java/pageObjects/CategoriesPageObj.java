package pageObjects;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoriesPageObj extends DriverHolder {
    public CategoriesPageObj (WebDriver driver){
        super(driver);
    }
    private String categoriesBooksButton = "//*[@href='/books']";
    private String categoriesComputersButton = "//*[@href='/computers']";
    private String subcategoryDesktopsButton = "//*[@href='/desktops']";
    private String subcategoryNotebooksButton = "//*[@href='/notebooks']";
    private String subcategoryAccessoriesButton = "//*[@href='/accessories']";
    private String categoriesElectronicsButton = "//*[@href='/electronics']";
    private String subcategoryCameraPhotoButton = "//*[@href='/camera-photo']";
    private String subcategoryCellPhonesButton = "//*[@href='/cell-phones']";
    private String categoriesApparelAndShoesButton = "//*[@href='/apparel-shoes']";
    private String categoriesDigitalDownloadsButton = "//*[@href='/digital-downloads']";
    private String categoriesJewelryButton = "//*[@href='/jewelry']";
    private String categoriesGiftCarts = "//*[@href='/gift-cards']";

    public WebElement getCategoriesBooksButton(){
        return getElsByXpath(categoriesBooksButton).get(2);
    }
    public WebElement getCategoriesComputersButton(){
        return getElsByXpath(categoriesComputersButton).get(2);
    }
    public WebElement getSubcategoriesDesktopsButton(){
        return getElsByXpath(subcategoryDesktopsButton).get(2);
    }
    public WebElement getSubcategoriesNotebooksButton(){
        return getElsByXpath(subcategoryNotebooksButton).get(2);
    }
    public WebElement getSubcategoriesAccessoriesButton(){
        return getElsByXpath(subcategoryAccessoriesButton).get(2);
    }
    public WebElement getCategoriesElectronicsButton(){
        return getElsByXpath(categoriesElectronicsButton).get(2);
    }
    public WebElement getSubcategoriesCameraPhotoButton(){
        return getElsByXpath(subcategoryCameraPhotoButton).get(2);
    }
    public WebElement getSubcategoriesCellPhoneButton(){
        return getElsByXpath(subcategoryCellPhonesButton).get(2);
    }
    public WebElement getCategoriesApparelAndShoesButton(){
        return getElsByXpath(categoriesApparelAndShoesButton).get(2);
    }
    public WebElement getCategoriesDigitalDownloadsButton(){
        return getElsByXpath(categoriesDigitalDownloadsButton).get(2);
    }
    public WebElement getCategoriesJewelryButton(){
        return getElsByXpath(categoriesJewelryButton).get(2);
    }
    public WebElement getCategoriesGiftCarts(){
        return getElsByXpath(categoriesGiftCarts).get(2);
    }
}
