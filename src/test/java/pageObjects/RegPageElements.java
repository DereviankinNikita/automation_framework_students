package pageObjects;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegPageElements extends DriverHolder {
    public RegPageElements(WebDriver driver) {
        super(driver);
    }
    //locators
    private String GenderMale = "//*[@id='gender-male']";
    private String GenderFemale = "//*[@id='gender-female']";
    private String FirstNameInput = "(//*[@class=\"text-box single-line\"])[1]";
    private String LastNameInput = "(//*[@class=\"text-box single-line\"])[2]";
    private String EmailInput = "(//*[@id=\"Email\"])";
    private String PassInput = "(//*[@class=\"text-box single-line password\"])[1]";
    private String PassConfirmInput = "(//*[@class=\"text-box single-line password\"])[2]";

    //Btn
    private String RegisterButton = "//*[@id=\"register-button\"]";
    //nextPage
    private String Result = "//*[@class=\"result\"]";

    //WebElements
    public WebElement getGMale(){return getElByXpath(GenderMale);}
    public WebElement getGFamale(){return  getElByXpath(GenderFemale);}
    public WebElement getLastNameField(){return getElByXpath(LastNameInput);}
    public WebElement getFirstNameField(){return getElByXpath(FirstNameInput);}
    public WebElement getEmailField(){return getElByXpath(EmailInput);}
    public WebElement getPassField(){return getElByXpath(PassInput);}
    public WebElement getPassConfField(){return getElByXpath(PassConfirmInput);}
    public WebElement getRegisterBtn(){return getElByXpath(RegisterButton);}
    //nextPage
    public WebElement getResult(){return getElByXpath(Result);}

}
