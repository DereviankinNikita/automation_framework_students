package pageObjects;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.SecureRandom;
import java.util.List;

public class ShopCartObj extends DriverHolder {
    public ShopCartObj(WebDriver driver) {super(driver);}

    public int i;
    private String itemHref = "//*[@class='product']/a[@href]";
    private String shopCartBtn = "//*[@href='/cart']";
    //cart el
    private String updCartBtn = "//*[@name='updatecart']";
    private String estimateShippingBtn = "//*[@name='estimateshipping']";
    private String chekoutBtn = "//*[@name='checkout']";
    private String termsofServiceChckbx = "//*[@name='termsofservice']";
    private String removeFromCartChckbx = "//*[@name='removefromcart']";
    private String countryLst = "//*[@id='CountryId']";
    private String addtoCartBtn = "//*[@value='Add to cart']";
    private String cartHref = "//*[@id='bar-notification']/p/a";
    private String zipField = "//*[@class='zip-input']";
    private String emptyCart = "//*[@class='active-step']";
    private String uSinList = "//*[@id='CountryId']/option[2]";
    private String cNinList = "//*[@id='CountryId']/option[46]";
    private String uAinList = "//*[@id='CountryId']/option[222]";
    private String messageError = "//*[@class='message']";
    private String continueBtn = "//*[@name='continueshopping']";
    private String couponBtn = "//*[@name='applydiscountcouponcode']";

    private String giftCardBtn = "//*[@name='applygiftcardcouponcode']";
    private String couponField = "//*[@name='discountcouponcode']";
    private String giftCardField = "//*[@name='giftcardcouponcode']";
    private String shippingPrice = "//*[@class='option-name']";
    private String qty = "(//*[contains(@name, 'itemquantity')])[2]";
    private String subTotal = "(//*[@class='product-subtotal'])[2]";
    private String productPrice = "//*[@class='product-price']";
    private String totalProductPrice = "//*[@class='product-price order-total']";


    protected String innerText = "innerText";

    private String totalPrice = "//*[@class='product-price order-total']";
    protected String stateList = "//*[@id='StateProvinceId']";

    private String stateFromList = "(//*[@id='StateProvinceId']//option)";
    private String emptyStateList = "//*[@id='StateProvinceId']//option[@value=0]";
    public List<WebElement> getStateFromList(){
        return  getElsByXpath(stateFromList);
    }


    public WebElement getShopCartBtn(){ return getElByXpath(shopCartBtn);}

    //geters
    public WebElement getUpdCartBtn() {
        return getElByXpath(updCartBtn);
    }
    public WebElement getContinueBtn(){return getElByXpath(continueBtn);}

    public WebElement getEstimateShippingBtn() {
        return getElByXpath(estimateShippingBtn);
    }

    public WebElement getChekoutBtn() {
        return getElByXpath(chekoutBtn);
    }

    public WebElement getTermsofServiceChckbx() {
        return getElByXpath(termsofServiceChckbx);
    }

    public WebElement getRemoveFromCartChckbx() {
        return getElByXpath(removeFromCartChckbx);
    }

    public WebElement getUSAinList(){return  getElByXpath(uSinList);}

    public WebElement getCNinList(){return getElByXpath(cNinList);}

    public WebElement getuAinList(){return  getElByXpath(uAinList);}
    public WebElement getCountryLst() {
        return getElByXpath(countryLst);
    }

    public WebElement getZipField(){return getElByXpath(zipField);}

    public WebElement getTotalPrice(){return  getElByXpath(totalPrice);}
    public  WebElement getQty(){return getElByXpath(qty);}
    public WebElement getSubTotal(){return getElByXpath(subTotal);}
    public List<WebElement> getProductPrice(){return getElsByXpath(productPrice);}

    public List<WebElement> getItemHref() {return getElsByXpath(itemHref);}

    public WebElement getCouponBtn(){return getElByXpath(couponBtn);}
    public WebElement getGiftCardBtn(){return getElByXpath(giftCardBtn);}
    public WebElement getErrorMessage(){return  getElByXpath(messageError);}
    public WebElement getCouponField(){return  getElByXpath(couponField);}
    public WebElement getGiftCardField(){return getElByXpath(giftCardField);}
    public List<WebElement> getShippingPrice(){return getElsByXpath(shippingPrice);}

    public WebElement getStateList(){return  getElByXpath(stateList);}
    //public WebElement getStateFrimList(){return getElByXpath(stateFromList);}
    public WebElement getEmptyStateList(){return getElByXpath(emptyStateList);}








    public String getCartHref(){
        return cartHref;
    }

    public WebElement getEmptyCart(){
        return  getElByXpath(emptyCart);
    }

    public List<WebElement> getAddtoCartBtn() {
        return getElsByXpath(addtoCartBtn);
    }

    public List<WebElement> getRemoveFromCartChckbxs() {
        return getElsByXpath(removeFromCartChckbx);
    }

    public DriverHolder waitForPageLoad() {
        return super.waitForPageLoad();
    }



//    public WebElement waitForElementClick(String element) {
//        return super.waitForElementClick(element);
//    }
}
