
package pageObjects;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPageObject extends DriverHolder {
    public CheckoutPageObject(WebDriver driver){
        super(driver);
    }

    private String buttonAgree = "//*[@id = 'termsofservice']";
    private String buttonCheckout = "//*[@id='checkout']";
    private String buttonSelectBillingAddress = "//*[@id=\"billing-address-select\"]";
    private String buttonNewAddress = "//*[@id=\"billing-address-select\"]/option[3]";
    private String buttonFirstName = "//*[@id='BillingNewAddress_FirstName']";
    private String buttonLastName = "//*[@id='BillingNewAddress_LastName']";
    private String buttonEmail = "//*[@id='BillingNewAddress_Email']";
    private String buttonCompany = "//*[@id='BillingNewAddress_Company']";
    private String buttonCountry = "//*[@id='BillingNewAddress_CountryId']";
    private String buttonSelectCountryUSA = "//*[@id=\"BillingNewAddress_CountryId\"]/option[2]";
    private String buttonSelectCountryCanada = "//*[@id=\"BillingNewAddress_CountryId\"]/option[3]";
    private String buttonSelectCountryUkraine = "//*[@id=\"BillingNewAddress_CountryId\"]/option[222]";
    private String buttonStateProvince = "//*[@id='BillingNewAddress_StateProvinceId']";
    private String buttonSelectStateUSA = "//*[@id=\"BillingNewAddress_StateProvinceId\"]/option[3]";
    private String buttonSelectProvinceCanada = "//*[@id=\"BillingNewAddress_StateProvinceId\"]/option[3]";
    private String buttonCity = "//*[@id='BillingNewAddress_City']";
    private String buttonAddress1 = "//*[@id='BillingNewAddress_Address1']";
    private String buttonAddress2 = "//*[@id='BillingNewAddress_Address2']";
    private String buttonPostalCode = "//*[@id='BillingNewAddress_ZipPostalCode']";
    private String buttonPhoneHumber = "//*[@id='BillingNewAddress_PhoneNumber']";
    private String buttonFaxNumber = "//*[@id='BillingNewAddress_FaxNumber']";
    private String buttonContinueNextStepNewAddress = "(//*[@class=\"button-1 new-address-next-step-button\"])";
    private String buttonPickUp = "//*[@id='PickUpInStore']";
    private String buttonContinueNextStepShippingAddress = "(//*[@class=\"button-1 new-address-next-step-button\"])";
    private String buttonShippingOptionGround = "//*[@id='shippingoption_0']";
    private String buttonShippingOptionNextDayAir = "//*[@id='shippingoption_1']";
    private String buttonShippingOption2ndDayAir = "//*[@id='shippingoption_2']";
    private String buttonContinueNextStepPaymentMethod = "(//*[@class=\"button-1 shipping-method-next-step-button\"])";
    private String buttonPaymentMethodCash = "//*[@id='paymentmethod_0']";
    private String buttonPaymentMethodCheck ="//*[@id='paymentmethod_1']";
    private String buttonPaymentMethodCreditCard ="//*[@id='paymentmethod_2']";
    private String buttonSelectCreditCard = "//*[@id='CreditCardType']";
    private String buttonCardholderName = "//*[@id='CardholderName']";
    private String buttonCardNumber = "//*[@id='CardNumber']";
    private String buttonExpirationDateMonth = "//*[@id='ExpireMonth']";
    private String buttonExpirationDateYear = "//*[@id='ExpireYear']";
    private String buttonCardCode = "//*[@id='CardCode']";
    private String buttonPaymentMethodPurchaseOrder ="//*[@id=''paymentmethod_3]";
    private String buttonPurchaseOrderNumber = "//*[@id='PurchaseOrderNumber']";
    private String buttonContinueNextStepPaymentInformation= "(//*[@class=\"button-1 payment-method-next-step-button\"])";
    private String buttonContinueNextStepConfirmOrder = "(//*[@class=\"button-1 payment-info-next-step-button\"])";
    private String buttonConfirmNextStepThankYouPage ="(//*[@class=\"button-1 confirm-order-next-step-button\"])";
    private String buttonContinueBackToHomePage ="(//*[@class=\"button-2 order-completed-continue-button\"])";
    public WebElement getButtonAgree(){return getElByXpath(buttonAgree);}
    public WebElement getButtonCheckout(){return getElByXpath(buttonCheckout);}
    public WebElement getButtonSelectBillingAddress(){return getElByXpath(buttonSelectBillingAddress);}
    public WebElement getButtonNewAddress(){return getElByXpath(buttonNewAddress);}
    public WebElement getButtonFirstName(){return getElByXpath(buttonFirstName);}
    public WebElement getButtonLastName(){return getElByXpath(buttonLastName);}
    public WebElement getButtonCompany(){return getElByXpath(buttonCompany);}
    public WebElement getButtonEmail(){return getElByXpath(buttonEmail);}
    public WebElement getButtonCountry(){return getElByXpath(buttonCountry);}
    public WebElement getButtonSelectCountryUSA(){return getElByXpath(buttonSelectCountryUSA);}
    public WebElement getButtonSelectCountryCanada(){return getElByXpath(buttonSelectCountryCanada);}
    public WebElement getButtonSelectCountryUkraine(){return getElByXpath(buttonSelectCountryUkraine);}
    public WebElement getButtonStateProvince(){return getElByXpath(buttonStateProvince);}
    public WebElement getButtonSelectStateUSA(){return getElByXpath(buttonSelectStateUSA);}
    public WebElement getButtonSelectProvinceCanada(){return getElByXpath(buttonSelectProvinceCanada);}
    public WebElement getButtonCity(){return getElByXpath(buttonCity);}
    public WebElement getButtonAddress1(){return getElByXpath(buttonAddress1);}
    public WebElement getButtonAddress2(){return getElByXpath(buttonAddress2);}
    public WebElement getButtonPostalCode(){return getElByXpath(buttonPostalCode);}
    public WebElement getButtonPhoneHumber(){return getElByXpath(buttonPhoneHumber);}
    public WebElement getButtonFaxNumber(){return getElByXpath(buttonFaxNumber);}
    public WebElement getButtonContinueNextStepNewAddress(){return getElsByXpath(buttonContinueNextStepNewAddress).get(0);}
    public WebElement getButtonPickUp(){return getElByXpath(buttonPickUp);}
    public WebElement getButtonContinueNextStepShippingAddress(){return getElsByXpath(buttonContinueNextStepShippingAddress).get(1);}
    public WebElement getButtonShippingOptionGround(){return getElByXpath(buttonShippingOptionGround);}
    public WebElement getButtonShippingOptionNextDayAir(){return getElByXpath(buttonShippingOptionNextDayAir);}
    public WebElement getButtonShippingOption2ndDayAir(){return getElByXpath(buttonShippingOption2ndDayAir);}
    public WebElement getButtonContinueNextStepPaymentMethod(){return getElByXpath(buttonContinueNextStepPaymentMethod);}
    public WebElement getButtonPaymentMethodCash(){return getElByXpath(buttonPaymentMethodCash);}
    public WebElement getButtonPaymentMethodCheck(){return getElByXpath(buttonPaymentMethodCheck);}
    public WebElement getButtonPaymentMethodCreditCard(){return getElByXpath(buttonPaymentMethodCreditCard);}
    public WebElement getButtonSelectCreditCard (){return getElByXpath(buttonSelectCreditCard );}
    public WebElement getButtonCardholderName(){return getElByXpath(buttonCardholderName);}
    public WebElement getButtonCardNumber(){return getElByXpath(buttonCardNumber);}
    public WebElement getButtonExpirationDateMonth(){return getElByXpath(buttonExpirationDateMonth);}
    public WebElement getButtonExpirationDateYear(){return getElByXpath(buttonExpirationDateYear);}
    public WebElement getButtonCardCode(){return getElByXpath(buttonCardCode);}
    public WebElement getButtonPaymentMethodPurchaseOrder(){return getElByXpath(buttonPaymentMethodPurchaseOrder);}
    public WebElement getButtonPurchaseOrderNumber(){return getElByXpath(buttonPurchaseOrderNumber);}
    public WebElement getContinueNextStepPaymentInformation(){return getElByXpath(buttonContinueNextStepPaymentInformation);}
    public WebElement getButtonContinueNextStepConfirmOrder(){return getElByXpath(buttonContinueNextStepConfirmOrder);}
    public WebElement getButtonConfirmNextStepThankYouPage(){return getElByXpath(buttonConfirmNextStepThankYouPage);}
    public WebElement getButtonContinueBackToHomePage(){return getElByXpath(buttonContinueBackToHomePage);}

}