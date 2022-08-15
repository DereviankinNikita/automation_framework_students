package pageObjects;

import org.openqa.selenium.WebDriver;

import java.time.Clock;

public class GiftCardCouponHelper extends ShopCartObj{
    public GiftCardCouponHelper(WebDriver driver) {
        super(driver);
    }

    public void couponCheck(){
        getCouponField().sendKeys(randomStringSymbols(20));
        getCouponBtn().click();
        getErrorMessage();
    }
    public void giftCardCheck(){
        getGiftCardField().sendKeys(randomStringSymbols(20));
        getGiftCardBtn().click();
        getErrorMessage();
    }
}
