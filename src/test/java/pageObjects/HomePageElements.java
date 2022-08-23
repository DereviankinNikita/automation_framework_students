package pageObjects;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageElements extends DriverHolder {

    public HomePageElements(WebDriver driver) {
        super(driver);
    }

    private String subscribeButton = "//input[@id='newsletter-subscribe-button']";
    private String registerButton = "//*[@class='ico-register']";
    private String logButton = "//*[@class='ico-login']";
    private String account = "(//*[@class=\"account\"])[1]";


    public WebElement getSubscribeBtn()
    {
        return getElByXpath(subscribeButton);
    }
    public  WebElement getRegisterBtn(){return getElByXpath(registerButton);}
    public  WebElement getLogBtn(){return getElByXpath(logButton);}
    public WebElement getAccount(){
        return getElByXpath(account);
    }
}
