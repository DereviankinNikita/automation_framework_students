package pageObjects;
import org.openqa.selenium.WebDriver;
public class LogPageHelper extends LogPageElements{
    public LogPageHelper(WebDriver driver) {
        super(driver);
    }
    public void setMailField(String keys){
        getMailField().sendKeys(keys);
    }
    public void setPassField(String pass){
        getPassField().sendKeys(pass);
    }
    public void LogButtonClick(){
        getLogInButton().click();
    }
    public String getAccountAttributeInnerText(){
        return getAccount().getAttribute(innerText);
    }
}
