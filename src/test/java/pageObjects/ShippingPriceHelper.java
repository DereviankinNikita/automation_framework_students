package pageObjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ShippingPriceHelper extends ShopCartObj{
    public ShippingPriceHelper(WebDriver driver) {
        super(driver);
    }

    public String getShippingPriceAttributeInnerText(int i) {
        return getShippingPrice().get(i).getAttribute(innerText);
    }
    public String[] split(int i) {
        String str = getShippingPriceAttributeInnerText(i);
        String[] number = str.split("\\(", 2);
        number = number[1].split("\\)");

        return number;
    }
    public void checkPrice(){
        for(int y = 0; y < 3; y++){


            Assert.assertTrue( Double.parseDouble(split(i)[0]) >Double.parseDouble("0.00"));

        }



    }
    }

