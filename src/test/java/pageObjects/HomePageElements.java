package Obj;

import Holder.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObj extends DriverHolder {

    public HomePageObj(WebDriver driver) {
        super(driver);
    }

    private String SubscribeButton = "//input[@id='newsletter-subscribe-button']";
    private String RegisterButton = "//*[@class='ico-register']";
    private String LogButton = "//*[@class='ico-login']";
    private String giftCardsButton = "//*[@href='/gift-cards']";
    private String computersButton = "//*[@href='/computers']";





    public WebElement getGiftCardsBtn(){return  getElsByXpath(giftCardsButton).get(0);}
    public WebElement getComputersButton(){return  getElsByXpath(computersButton).get(0);}
    public WebElement getSubscribeBtn() { return getElByXpath(SubscribeButton); }
    public  WebElement getRegisterBtn(){return getElByXpath(RegisterButton);}
    public  WebElement getLogBtn(){return getElByXpath(LogButton);}
}
