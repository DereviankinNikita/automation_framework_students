package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPageHelper extends CheckoutPageObject {
        public CheckoutPageHelper(WebDriver driver){
            super(driver);
        }

        public void clickButtonAgree() {
            getButtonAgree().click();}
        public void clickButtonCheckout() {
            getButtonCheckout().click();}
        public void clickButtonSelectBillingAddress() {
            getButtonSelectBillingAddress().click();}
        public void clickButtonNewAddress() {
            getButtonNewAddress().click();}
        public void clickButtonFirstName(String item) {
            getButtonFirstName().clear();
            getButtonFirstName().sendKeys(item);}
        public void clickButtonLastName(String item) {
            getButtonLastName().clear();
            getButtonLastName().sendKeys(item);}
        public void clickButtonEmail() {getButtonEmail().click();}
        public void clickButtonCompany(String item) {
            getButtonCompany().clear();
            getButtonCompany().sendKeys(item);}
        public void clickButtonCountry() {
            getButtonCountry().click();}
         public void clickButtonSelectCountryUSA(){
            getButtonSelectCountryUSA().click();}

        public void clickButtonSelectCountryCanada(){
            getButtonSelectCountryCanada().click();}
        public void clickButtonSelectCountryUkraine(){
            getButtonSelectCountryUkraine().click();}
        public void clickButtonStateProvince(){
            getButtonStateProvince().click();}
        public void clickButtonSelectStateUSA(){
            getButtonSelectStateUSA().click();}
        public void clickButtonSelectProvinceCanada(){
            getButtonSelectProvinceCanada().click();}
        public void clickButtonCity(String item) {
            getButtonCity().click();
            getButtonCity().clear();
            getButtonCity().sendKeys(item);}
        public void clickButtonAddress1(String item) {
            getButtonAddress1().clear();
            getButtonAddress1().sendKeys(item);}
        public void clickButtonAddress2(String item) {
            getButtonAddress2().clear();
            getButtonAddress2().sendKeys(item);}
        public void clickButtonPostalCode(String item) {
            getButtonPostalCode().clear();
            getButtonPostalCode().sendKeys(item);}
        public void clickButtonPhoneNumber(String item) {
            getButtonPhoneHumber().clear();
            getButtonPhoneHumber().sendKeys(item);}
        public void clickButtonFaxNumber(String item) {
            getButtonFaxNumber().clear();
            getButtonFaxNumber().sendKeys(item);}
        public void clickButtonContinueNextStepNewAddress() {
            getButtonContinueNextStepNewAddress().click();}
        public void clickButtonPickUp() {
            getButtonPickUp().click();}
        public void clickButtonContinueNextShippingAddress() {
            getButtonContinueNextStepShippingAddress().click();}
        public void clickButtonShippingOptionGround() {
            getButtonShippingOptionGround().click();}
        public void clickButtonShippingOptionNextDayAir() {
            getButtonShippingOptionNextDayAir().click();}
        public void clickButtonShippingOption2ndDayAir() {
            getButtonShippingOption2ndDayAir().click();}
        public void clickButtonContinueNextStepPaymentMethod() {
            getButtonContinueNextStepPaymentMethod().click();}
        public void clickButtonPaymentMethodCash() {
            getButtonPaymentMethodCash().click();}
        public void clickButtonPaymentMethodCheck() {
            getButtonPaymentMethodCheck().click();}
        public void clickButtonSelectCreditCard() {
            getButtonSelectCreditCard().click();}
        public void clickButtonSelectCreditCardType() {
            getButtonSelectCreditCardType().click();}
        public void clickButtonCardholderName(String item) {
            getButtonCardholderName().clear();
            getButtonCardholderName().sendKeys(item);}
        public void clickButtonCardNumber(String item) {
            getButtonCardNumber().clear();
            getButtonCardNumber().sendKeys(item);}
        public void clickButtonExpirationDateMonth() {
            getButtonExpirationDateMonth().click();}
        public void clickButtonExpirationDateMonthSelect(){
            getButtonExpirationDateMonthSelect();}
        public void clickButtonExpirationDateYear() {
            getButtonExpirationDateYear().click();}
        public void clickButtonExpirationDateYearSelect(){
            getButtonExpirationDateYearSelect().click();}

        public void clickButtonCardCode(String item) {
            getButtonCardCode().clear();
            getButtonCardCode().sendKeys(item);}
        public void clickButtonPaymentMethodPurchaseOrder() {
            getButtonPaymentMethodPurchaseOrder().click();}
        public void clickButtonPurchaseOrderNumber(String item) {
            getButtonPurchaseOrderNumber().clear();
            getButtonPurchaseOrderNumber().sendKeys(item);}
        public void clickButtonPaymentMethodCreditCard() {
            getButtonPaymentMethodCreditCard().click();}
        public void clickButtonContinueNextStepPaymentInformation() {
            getContinueNextStepPaymentInformation().click();}
        public void clickButtonContinueNextStepConfirmOrder() {
            getButtonContinueNextStepConfirmOrder().click();}
        public void clickButtonConfirmNextStepThankYouPage() {
            getButtonConfirmNextStepThankYouPage().click();}
        public void clickButtonContinueBackToHomePage() {
            getButtonContinueBackToHomePage().click();}

        public void assertTrue(){
            getResultLocator().getText();}
        }


