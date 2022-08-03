package Obj;

import Holder.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObj extends DriverHolder {

    public HomePageObj(WebDriver driver) {
        super(driver);
    }

    private String SubscribeButton = "//input[@id='newsletter-subscribe-button']";


    public WebElement SubscribeBtn()
    {
        return getElByXpath(SubscribeButton);
    }
}
