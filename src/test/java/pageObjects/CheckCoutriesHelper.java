package pageObjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.time.Clock;

public class CheckCoutriesHelper extends ShopCartObj{
    public CheckCoutriesHelper(WebDriver driver) {
        super(driver);
    }

    public void usaCheck(){
        getCountryLst().click();
        getUSAinList().click();
        setZipRnd();
        getZipField().sendKeys();
        getTermsofServiceChckbx().click();
        getChekoutBtn().click();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "http://demowebshop.tricentis.com/login/checkoutasguest?returnUrl=%2Fcart" );
    }

    public void cnCheck(){
        getCountryLst().click();
        getCNinList().click();
        setZipRnd();
        getTermsofServiceChckbx().click();
        getChekoutBtn().click();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "http://demowebshop.tricentis.com/login/checkoutasguest?returnUrl=%2Fcart" );

    }

    public void uaCheck(){
        getCountryLst().click();
        getUAinList().click();
        setZipRnd();
        getTermsofServiceChckbx().click();
        getChekoutBtn().click();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "http://demowebshop.tricentis.com/login/checkoutasguest?returnUrl=%2Fcart" );
    }

    public String randomZip(){
        return Clock.systemUTC().instant().toString()
                .replaceAll("[^0-9]", "");
    }

    public void setZipRnd(){

        getZipField().sendKeys(randomZip());
    }

    public String getTotalPriceAttributeInnerText(){return getTotalPrice().getAttribute(innerText);
    }



}
