package testNG;

import holders.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AddtoCartHelper;
import pageObjects.CheckCoutriesHelper;
import pageObjects.GiftCardCouponHelper;
import pageObjects.ShippingPriceHelper;

public class TestShopCart extends TestInit {

    @Test
    public void smokeTest(){
        AddtoCartHelper addtoCartHelper = new AddtoCartHelper(driver);
        CheckCoutriesHelper checkCoutriesHelper = new CheckCoutriesHelper(driver);
        addtoCartHelper.goToHomePage();
        addtoCartHelper.getShopCartBtn().click();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "http://demowebshop.tricentis.com/cart" );
        addtoCartHelper.addPctoCart();
        addtoCartHelper.addBooktoCart();
        addtoCartHelper.goToShopCart();
        addtoCartHelper.deleteFromCart();
        addtoCartHelper.getEmptyCart();
        addtoCartHelper.addPctoCart();
        addtoCartHelper.addBooktoCart();
        addtoCartHelper.goToShopCart();
        checkCoutriesHelper.uaCheck();
        String urlua = driver.getCurrentUrl();
        Assert.assertEquals(urlua, "http://demowebshop.tricentis.com/login/checkoutasguest?returnUrl=%2Fcart");
        addtoCartHelper.goToShopCart();
        checkCoutriesHelper.usaCheck();
        String urlusa = driver.getCurrentUrl();
        Assert.assertEquals(urlusa, "http://demowebshop.tricentis.com/login/checkoutasguest?returnUrl=%2Fcart");
        addtoCartHelper.goToShopCart();
        checkCoutriesHelper.cnCheck();
        String urlcn = driver.getCurrentUrl();
        Assert.assertEquals(urlcn, "http://demowebshop.tricentis.com/login/checkoutasguest?returnUrl=%2Fcart" );
        addtoCartHelper.goToShopCart();
        Assert.assertTrue( Double.parseDouble(checkCoutriesHelper.getTotalPriceAttributeInnerText()) >Double.parseDouble("0.00"));
    }
    @Test
    public void reverseTest(){
        AddtoCartHelper addtoCartHelper = new AddtoCartHelper(driver);
        CheckCoutriesHelper checkCoutriesHelper = new CheckCoutriesHelper(driver);
        GiftCardCouponHelper giftCardCouponHelper = new GiftCardCouponHelper(driver);
        ShippingPriceHelper shippingPriceHelper = new ShippingPriceHelper(driver);
        addtoCartHelper.addPctoCart();
        addtoCartHelper.addBooktoCart();
        addtoCartHelper.goToShopCart();
        addtoCartHelper.getItemHref().get(0).click();
        String urlpc = driver.getCurrentUrl();
        Assert.assertEquals(urlpc, "http://demowebshop.tricentis.com/build-your-cheap-own-computer");
        addtoCartHelper.goToShopCart();
        addtoCartHelper.getItemHref().get(1).click();
        String urlbook = driver.getCurrentUrl();
        Assert.assertEquals(urlbook, "http://demowebshop.tricentis.com/computing-and-internet");
        addtoCartHelper.goToShopCart();
        addtoCartHelper.getCouponBtn().click();
        addtoCartHelper.getErrorMessage();
        addtoCartHelper.getGiftCardBtn();
        addtoCartHelper.getErrorMessage();
        giftCardCouponHelper.couponCheck();
        giftCardCouponHelper.giftCardCheck();
        addtoCartHelper.getCountryLst().click();
        addtoCartHelper.getUSAinList().click();

        checkCoutriesHelper.stateCheck();
        addtoCartHelper.getContinueBtn().click();
        String contShop = driver.getCurrentUrl();
        Assert.assertEquals(contShop, "http://demowebshop.tricentis.com/");
        addtoCartHelper.goToShopCart();
        addtoCartHelper.getZipField().sendKeys(addtoCartHelper.randomString(10));
        addtoCartHelper.getTermsofServiceChckbx().click();
        addtoCartHelper.getChekoutBtn().click();
        // addtoCartHelper.getErrorMessage(); bug
        addtoCartHelper.goToShopCart();
        addtoCartHelper.getStateList().click();
        addtoCartHelper.getEmptyStateList();
        addtoCartHelper.getEstimateShippingBtn().click();
        //shippingPriceHelper.checkPrice(); bug


    }

}
