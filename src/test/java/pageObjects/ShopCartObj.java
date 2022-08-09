package pageObjects;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShopCartObj extends DriverHolder {
    public ShopCartObj(WebDriver driver) {super(driver);}



    private String ShopCartBtn = "//*[@href='/cart']";
    //cart el
    private String UpdCartBtn = "//*[@name='updatecart']";
    private String EstimateShippingBtn = "//*[@name='estimateshipping']";
    private String ChekoutBtn = "//*[@name='checkout']";
    private String TermsofServiceChckbx = "//*[@name='termsofservice']";
    private String RemoveFromCartChckbx = "//*[@name='removefromcart']";
    private String CountryLst = "//*[@id='CountryId']";
    //home gj el
    private String AddtoCartBtn = "//*[@value='Add to cart']";
    private String CartHref = "//*[@id='bar-notification']/p/a";

    private String ZipField = "//*[@class='zip-input']";

    private String EmptyCart = "//*[@class='active-step']";

    private String USinList = "//*[@id='CountryId']/option[2]";
    private String CNinList = "//*[@id='CountryId']/option[46]";
    private String UAinList = "//*[@id='CountryId']/option[222]";

    protected String innerText = "innerText";

    private String TotalPrice = "//*[@class='product-price order-total']";


    public WebElement getShopCartBtn(){ return getElByXpath(ShopCartBtn);}

    //geters
    public WebElement getUpdCartBtn() {
        return getElByXpath(UpdCartBtn);
    }

    public WebElement getEstimateShippingBtn() {
        return getElByXpath(EstimateShippingBtn);
    }

    public WebElement getChekoutBtn() {
        return getElByXpath(ChekoutBtn);
    }

    public WebElement getTermsofServiceChckbx() {
        return getElByXpath(TermsofServiceChckbx);
    }

    public WebElement getRemoveFromCartChckbx() {
        return getElByXpath(RemoveFromCartChckbx);
    }

    public WebElement getUSAinList(){return  getElByXpath(USinList);}

    public WebElement getCNinList(){return getElByXpath(CNinList);}

    public WebElement getUAinList(){return  getElByXpath(UAinList);}
    public WebElement getCountryLst() {
        return getElByXpath(CountryLst);
    }

    public WebElement getZipField(){return getElByXpath(ZipField);}

    public WebElement getTotalPrice(){return  getElByXpath(TotalPrice);}



    public String getCartHref(){
        return CartHref;
    }

    public WebElement getEmptyCart(){
        return  getElByXpath(EmptyCart);
    }

    public List<WebElement> getAddtoCartBtn() {
        return getElsByXpath(AddtoCartBtn);
    }

    public List<WebElement> getRemoveFromCartChckbxs() {
        return getElsByXpath(RemoveFromCartChckbx);
    }

    public DriverHolder waitForPageLoad() {
        return super.waitForPageLoad();
    }




    public WebElement waitForElementClick(String element) {
        return super.waitForElementClick(element);
    }
}
