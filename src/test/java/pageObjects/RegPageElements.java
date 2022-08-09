package pageObjects;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegPageElements extends DriverHolder {
    public RegPageElements(WebDriver driver) {
        super(driver);
    }
    //locators
    private String genderMale = "//*[@id='gender-male']";
    private String genderFemale = "//*[@id='gender-female']";
    private String firstNameInput = "(//*[@class=\"text-box single-line\"])[1]";
    private String lastNameInput = "(//*[@class=\"text-box single-line\"])[2]";
    private String emailInput = "(//*[@id=\"Email\"])";
    private String passInput = "(//*[@class=\"text-box single-line password\"])[1]";
    private String passConfirmInput = "(//*[@class=\"text-box single-line password\"])[2]";

    //Btn
    private String registerButton = "//*[@id=\"register-button\"]";
    //nextPage
    private String result = "//*[@class=\"result\"]";

    //WebElements
    public WebElement getGMale(){return getElByXpath(genderMale);}
    public WebElement getGFamale(){return  getElByXpath(genderFemale);}
    public WebElement getLastNameField(){return getElByXpath(lastNameInput);}
    public WebElement getFirstNameField(){return getElByXpath(firstNameInput);}
    public WebElement getEmailField(){return getElByXpath(emailInput);}
    public WebElement getPassField(){return getElByXpath(passInput);}
    public WebElement getPassConfField(){return getElByXpath(passConfirmInput);}
    public WebElement getRegisterBtn(){return getElByXpath(registerButton);}
    //nextPage
    public WebElement getResult(){return getElByXpath(result);}

}
