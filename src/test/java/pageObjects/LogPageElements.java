package pageObjects;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogPageElements extends DriverHolder {
    public LogPageElements(WebDriver driver) {
        super(driver);
    }
    private String MailField = "//*[@id=\"Email\"]";
    private String PassField = "//*[@id=\"Password\"]";
    private String LogInButton = "//*[@class=\"button-1 login-button\"]";
    private String Account = "(//*[@class=\"account\"])[1]";

    public WebElement getMailField(){
        return getElByXpath(MailField);
    }
    public WebElement getPassField(){
        return getElByXpath(PassField);
    }
    public WebElement getLogInButton(){
        return getElByXpath(LogInButton);
    }
    public WebElement getAccount(){
        return getElByXpath(Account);
    }



}
