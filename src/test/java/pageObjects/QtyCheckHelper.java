package pageObjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class QtyCheckHelper extends ShopCartObj{
    public QtyCheckHelper(WebDriver driver) {
        super(driver);
    }
    public String getSubTotalAttributeInnerText() {
        return getSubTotal().getAttribute(innerText);
    }
    public String getSubPriceAttributeInnerText(int i) {
        return getProductPrice().get(i).getAttribute(innerText);
        }

    public String getTotalPriceAttributeInnerText() {
        return getTotalPrice().getAttribute(innerText);
    }
    public void qtyCheck() {
        getQty().clear();
        getQty().sendKeys("2\n");
        Assert.assertEquals(Double.parseDouble(getSubTotalAttributeInnerText()), 20.00);
    }
    public void totalPrice() {
        for (i=0; i<=3; i++)
        {
            System.out.println(getSubPriceAttributeInnerText(i));

            Assert.assertTrue( Double.parseDouble(getSubPriceAttributeInnerText(i)) > Double.parseDouble("0.00"));
        }

    }
    public void summPrice(){

        Assert.assertEquals( (Double.parseDouble(getSubPriceAttributeInnerText(0)) +
                Double.parseDouble(getSubPriceAttributeInnerText(1)) +
                Double.parseDouble(getSubPriceAttributeInnerText(2))),
                Double.parseDouble(getTotalPriceAttributeInnerText()));

    }


}
