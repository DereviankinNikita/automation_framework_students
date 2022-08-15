package pageObjects;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogPageElements extends DriverHolder {
    public LogPageElements(WebDriver driver) {
        super(driver);
    }
    private String mailField = "//*[@id=\"Email\"]";
    private String passField = "//*[@id=\"Password\"]";
    private String logInButton = "//*[@class=\"button-1 login-button\"]";
    //errors
    private String validationError = "//*[@class=\"validation-summary-errors\"]";



    public WebElement getMailField(){
        return getElByXpath(mailField);
    }
    public WebElement getPassField(){
        return getElByXpath(passField);
    }
    public WebElement getLogInButton(){
        return getElByXpath(logInButton);
    }
    //errors
    public WebElement getValidationError(){return getElByXpath(validationError);}




}
