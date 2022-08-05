package pageObjects;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageElements extends DriverHolder {

    public HomePageElements(WebDriver driver) {
        super(driver);
    }

    private String SubscribeButton = "//input[@id='newsletter-subscribe-button']";
    private String RegisterButton = "//*[@class='ico-register']";
    private String LogButton = "//*[@class='ico-login']";


    public WebElement getSubscribeBtn()
    {
        return getElByXpath(SubscribeButton);
    }
    public  WebElement getRegisterBtn(){return getElByXpath(RegisterButton);}
    public  WebElement getLogBtn(){return getElByXpath(LogButton);}
}
