package testNG;

import holders.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AddtoCartHelper;
import pageObjects.CheckCoutriesHelper;

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
        int i;
        do{
            i= addtoCartHelper.getRemoveFromCartChckbxs().size();
            addtoCartHelper.getRemoveFromCartChckbx().click();
            addtoCartHelper.getUpdCartBtn().click();
        }
        while (i==2);
        addtoCartHelper.getEmptyCart();
        addtoCartHelper.addPctoCart();
        addtoCartHelper.addBooktoCart();
        addtoCartHelper.goToShopCart();
        checkCoutriesHelper.uaCheck();
        addtoCartHelper.goToShopCart();
        checkCoutriesHelper.uaCheck();
        addtoCartHelper.goToShopCart();
        checkCoutriesHelper.cnCheck();
        addtoCartHelper.goToShopCart();
        Assert.assertEquals(checkCoutriesHelper.getTotalPriceAttributeInnerText(),"825.00");






    }

}
