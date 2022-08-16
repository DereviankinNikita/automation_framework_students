package testNG;

import holders.TestInit;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AddtoCartHelper;
import pageObjects.CheckCoutriesHelper;
import pageObjects.CheckoutPageHelper;
import org.openqa.selenium.By;
import static org.testng.Assert.assertTrue;



public class TestCheckout extends TestInit {

    @Test
    public void CashOnDelivery() {
        goToSite();
        homePageObjHelper().logClick();
        logPageHelper().setMailField(homePageObj().loginMail);
        logPageHelper().setPassField(homePageObj().loginPassword);
        logPageHelper().LogButtonClick();
        AddtoCartHelper addtoCartHelper = new AddtoCartHelper(driver);
        CheckCoutriesHelper checkCoutriesHelper = new CheckCoutriesHelper(driver);
        addtoCartHelper.goToHomePage();
        addtoCartHelper.getShopCartBtn().click();
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

        sleep(1);
        String actualResult = driver.findElement(By.xpath("//*[@class='page-title']")).getText();
        String expectedResult = "Thank you";
        Assert.assertEquals(actualResult, expectedResult);

        /*sleep(3);
        String expectedUrl = "http://demowebshop.tricentis.com/checkout/completed/";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);*/


    }

    @Test
    public void MoneyOrderOrCheck() {
        goToSite();
        homePageObjHelper().logClick();
        logPageHelper().setMailField(homePageObj().loginMail);
        logPageHelper().setPassField(homePageObj().loginPassword);
        logPageHelper().LogButtonClick();
        AddtoCartHelper addtoCartHelper = new AddtoCartHelper(driver);
        CheckCoutriesHelper checkCoutriesHelper = new CheckCoutriesHelper(driver);
        addtoCartHelper.goToHomePage();
        addtoCartHelper.getShopCartBtn().click();
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
        checkoutPageHelper.clickButtonFirstName("Elisabet");
        checkoutPageHelper.clickButtonLastName("Parker");
        checkoutPageHelper.clickButtonCompany("GoldenRain");
        checkoutPageHelper.clickButtonCountry();
        checkoutPageHelper.clickButtonSelectCountryCanada();
        checkoutPageHelper.clickButtonStateProvince();
        checkoutPageHelper.clickButtonSelectProvinceCanada();
        checkoutPageHelper.clickButtonCity("Ottawa");
        checkoutPageHelper.clickButtonAddress1("Marcel 55");
        checkoutPageHelper.clickButtonAddress2("Kurana 59");
        checkoutPageHelper.clickButtonPostalCode("464930");
        checkoutPageHelper.clickButtonPhoneNumber("+380975403450");
        checkoutPageHelper.clickButtonFaxNumber("889944658");
        checkoutPageHelper.clickButtonContinueNextStepNewAddress();
        checkoutPageHelper.clickButtonPickUp();
        checkoutPageHelper.clickButtonContinueNextShippingAddress();
        checkoutPageHelper.clickButtonPaymentMethodCheck();
        checkoutPageHelper.clickButtonContinueNextStepPaymentInformation();
        checkoutPageHelper.clickButtonContinueNextStepConfirmOrder();
        checkoutPageHelper.clickButtonConfirmNextStepThankYouPage();

        sleep(1);
        String expectedUrl1 = "http://demowebshop.tricentis.com/checkout/completed/";
        String actualUrl1 = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl1, expectedUrl1);


    }

    @Test
    public void CreditCard() {
        goToSite();
        homePageObjHelper().logClick();
        logPageHelper().setMailField(homePageObj().loginMail);
        logPageHelper().setPassField(homePageObj().loginPassword);
        logPageHelper().LogButtonClick();
        AddtoCartHelper addtoCartHelper = new AddtoCartHelper(driver);
        CheckCoutriesHelper checkCoutriesHelper = new CheckCoutriesHelper(driver);
        addtoCartHelper.goToHomePage();
        addtoCartHelper.getShopCartBtn().click();
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
        checkoutPageHelper.clickButtonFirstName("Maria");
        checkoutPageHelper.clickButtonLastName("Golohvastenko");
        checkoutPageHelper.clickButtonCompany("Salo");
        checkoutPageHelper.clickButtonCountry();
        checkoutPageHelper.clickButtonSelectCountryCanada();
        checkoutPageHelper.clickButtonStateProvince();
        checkoutPageHelper.clickButtonSelectProvinceCanada();
        checkoutPageHelper.clickButtonCity("Ottawa");
        checkoutPageHelper.clickButtonAddress1("Marcel 55");
        checkoutPageHelper.clickButtonAddress2("Kurana 59");
        checkoutPageHelper.clickButtonPostalCode("464930");
        checkoutPageHelper.clickButtonPhoneNumber("+380975403450");
        checkoutPageHelper.clickButtonFaxNumber("889944658");
        checkoutPageHelper.clickButtonContinueNextStepNewAddress();
        checkoutPageHelper.clickButtonPickUp();
        checkoutPageHelper.clickButtonContinueNextShippingAddress();
        checkoutPageHelper.clickButtonPaymentMethodCreditCard();
        checkoutPageHelper.clickButtonContinueNextStepPaymentInformation();
        checkoutPageHelper.clickButtonSelectCreditCardType();
        checkoutPageHelper.clickButtonCardholderName("Maria Golohvastenko");
        checkoutPageHelper.clickButtonCardNumber("4557996745345789");
        checkoutPageHelper.clickButtonExpirationDateMonth();
        checkoutPageHelper.getButtonExpirationDateMonthSelect();
        checkoutPageHelper.clickButtonExpirationDateYear();
        checkoutPageHelper.clickButtonExpirationDateYearSelect();
        checkoutPageHelper.clickButtonCardCode("556");
        checkoutPageHelper.clickButtonContinueNextStepConfirmOrder();
        checkoutPageHelper.clickButtonConfirmNextStepThankYouPage();

        sleep(1);
        String actualResult2 = driver.findElement(By.xpath("//*[@class='page-title']")).getText();
        String expectedResult2 = "Thank you";
        Assert.assertEquals(actualResult2, expectedResult2);      //Blocked "Wrong card number"
    }

    @Test

    public void PurchaseOrder() {

        goToSite();
        homePageObjHelper().logClick();
        logPageHelper().setMailField(homePageObj().loginMail);
        logPageHelper().setPassField(homePageObj().loginPassword);
        logPageHelper().LogButtonClick();
        AddtoCartHelper addtoCartHelper = new AddtoCartHelper(driver);
        CheckCoutriesHelper checkCoutriesHelper = new CheckCoutriesHelper(driver);
        addtoCartHelper.goToHomePage();
        addtoCartHelper.getShopCartBtn().click();
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
        checkoutPageHelper.clickButtonFirstName("Elisabet");
        checkoutPageHelper.clickButtonLastName("Parker");
        checkoutPageHelper.clickButtonCompany("GoldenRain");
        checkoutPageHelper.clickButtonCountry();
        checkoutPageHelper.clickButtonSelectCountryCanada();
        checkoutPageHelper.clickButtonStateProvince();
        checkoutPageHelper.clickButtonSelectProvinceCanada();
        checkoutPageHelper.clickButtonCity("Ottawa");
        checkoutPageHelper.clickButtonAddress1("Marcel 55");
        checkoutPageHelper.clickButtonAddress2("Kurana 59");
        checkoutPageHelper.clickButtonPostalCode("464930");
        checkoutPageHelper.clickButtonPhoneNumber("+380975403450");
        checkoutPageHelper.clickButtonFaxNumber("889944658");
        checkoutPageHelper.clickButtonContinueNextStepNewAddress();
        checkoutPageHelper.clickButtonPickUp();
        checkoutPageHelper.clickButtonContinueNextShippingAddress();
        checkoutPageHelper.clickButtonPaymentMethodPurchaseOrder();
        checkoutPageHelper.clickButtonContinueNextStepPaymentInformation();
        checkoutPageHelper.clickButtonPurchaseOrderNumber("985749863");
        checkoutPageHelper.clickButtonContinueNextStepConfirmOrder();
        checkoutPageHelper.clickButtonConfirmNextStepThankYouPage();

        sleep(1);
        String expectedUrl3 = "http://demowebshop.tricentis.com/checkout/completed/";
        String actualUrl3 = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl3, expectedUrl3);

    }
}
