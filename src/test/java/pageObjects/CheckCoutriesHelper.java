package pageObjects;

import org.openqa.selenium.WebDriver;

import java.time.Clock;

public class CheckCoutriesHelper extends ShopCartObj {
    public CheckCoutriesHelper(WebDriver driver) {
        super(driver);
    }


    public void usaCheck() {
        getCountryLst().click();
        getUSAinList().click();
        setZipRnd();
        getTermsofServiceChckbx().click();
        getChekoutBtn().click();
    }

    public void cnCheck() {
        getCountryLst().click();
        getCNinList().click();
        setZipRnd();
        getTermsofServiceChckbx().click();
        getChekoutBtn().click();

    }

    public void uaCheck() {
        getCountryLst().click();
        getuAinList().click();
        setZipRnd();
        getTermsofServiceChckbx().click();
        getChekoutBtn().click();
    }

    public String randomZip() {
        return Clock.systemUTC().instant().toString()
                .replaceAll("[^0-9]", "");
    }

    public void setZipRnd() {

        getZipField().sendKeys(randomZip());
    }

    public String getTotalPriceAttributeInnerText() {
        return getTotalPrice().getAttribute(innerText);
    }

    public void stateCheck() {

        for (int i=1; i<62; i++)
        {
            waitForElementClick(stateList);
            getStateList().click();
            waitForElementClick("(//*[@id='StateProvinceId']//option)["+i+"]");
            getStateFromList().get(i).click();
        }

    }
}
