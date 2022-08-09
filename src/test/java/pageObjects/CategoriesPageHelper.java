package Obj;

import org.openqa.selenium.WebDriver;

public class CategoriesPageHelper extends CategoriesPageObj {

    public CategoriesPageHelper (WebDriver driver){
        super(driver);
    }

    public void clickCategoryBooks(){
        getCategoriesBooksButton().click();
    }
    public void clickCategoryComputers(){
        getCategoriesComputersButton().click();
    }
    public void clickSubcategoryDesktops(){
        getCategoriesComputersButton().click();
        getSubcategoriesDesktopsButton().click();
    }
    public void clickSubcategoryNotebooks(){
        getCategoriesComputersButton().click();
        getSubcategoriesNotebooksButton().click();
    }
    public void clickSubcategoryAccessories(){
        getCategoriesComputersButton().click();
        getSubcategoriesAccessoriesButton().click();
    }
    public void clickCategoryElectronics(){
        getCategoriesElectronicsButton().click();
    }
    public void clickSubcategoryCameraPhoto(){
        getCategoriesElectronicsButton().click();
        getSubcategoriesCameraPhotoButton().click();
    }
    public void clickSubcategoryCellPhones(){
        getCategoriesElectronicsButton().click();
        getSubcategoriesCellPhoneButton().click();
    }
    public void clickCategoryApparelEndShoes(){
        getCategoriesApparelAndShoesButton().click();
    }
    public void clickDigitalDownloads(){
        getCategoriesDigitalDownloadsButton().click();
    }
    public void clickJewelry(){
        getCategoriesJewelryButton().click();
    }
    public void clickGiftCards(){
        getCategoriesGiftCarts().click();
    }
}
