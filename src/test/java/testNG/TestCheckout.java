package testNG;

import holders.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AddtoCartHelper;
import pageObjects.CheckCoutriesHelper;
import pageObjects.CheckoutPageHelper;

public class TestCheckout extends TestInit {

    @Test
    public void CashOnDelivery(){
        goToSite();
        homePageObjHelper().logClick();
        logPageHelper().setMailField(homePageObj().loginMail);
        logPageHelper().setPassField(homePageObj().loginPassword);
        logPageHelper().LogButtonClick();
        Assert.assertEquals(logPageHelper().getAccountAttributeInnerText(),"Test0808@gmail.com");
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

        CheckoutPageHelper checkoutPageHelper = new CheckoutPageHelper(driver);
        checkoutPageHelper.clickButtonSelectBillingAddress();
        checkoutPageHelper.clickButtonNewAddress();
        checkoutPageHelper.clickButtonFirstName("Montgomery");
        checkoutPageHelper.clickButtonLastName("Mouselover");
        checkoutPageHelper.clickButtonCompany("Monty Star");
        checkoutPageHelper.clickButtonCountry();
        checkoutPageHelper.clickButtonSelectCountryUSA();
        checkoutPageHelper.clickButtonStateProvince();
        checkoutPageHelper.clickButtonSelectStateUSA();
        checkoutPageHelper.clickButtonCity("Pons");
        checkoutPageHelper.clickButtonAddress1("Sheva 33");
        checkoutPageHelper.clickButtonAddress2("Kugel 57");
        checkoutPageHelper.clickButtonPostalCode("75933");
        checkoutPageHelper.clickButtonPhoneNumber("+380935603560");
        checkoutPageHelper.clickButtonFaxNumber("35357753");
        checkoutPageHelper.clickButtonContinueNextStepNewAddress();
        checkoutPageHelper.clickButtonPickUp();
        checkoutPageHelper.clickButtonContinueNextShippingAddress();
        checkoutPageHelper.clickButtonPaymentMethodCash();
        checkoutPageHelper.clickButtonContinueNextStepPaymentInformation();
        checkoutPageHelper.clickButtonContinueNextStepConfirmOrder();
        checkoutPageHelper.clickButtonConfirmNextStepThankYouPage();
        checkoutPageHelper.clickButtonContinueBackToHomePage();

    }
}
