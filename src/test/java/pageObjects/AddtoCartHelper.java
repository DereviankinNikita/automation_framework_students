package pageObjects;

import org.openqa.selenium.WebDriver;

public class AddtoCartHelper extends ShopCartObj{
    public AddtoCartHelper(WebDriver driver) {super(driver);}

    public void addPctoCart() {
        goToCheapPcPage();
        getAddtoCartBtn().get(0).click();
        //waitForElementClick("//*[@id='bar-notification']/p/a");
        waitForElementClick(getCartHref());

    }
    public void addBooktoCart() {
        goToBookPage();
        getAddtoCartBtn().get(0).click();
        //waitForElementClick("//*[@id='bar-notification']/p/a");
        waitForElementClick(getCartHref());
    }



}


