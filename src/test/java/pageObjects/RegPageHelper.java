package pageObjects;

import org.openqa.selenium.WebDriver;

import java.time.Clock;

public class RegPageHelper extends RegPageElements {
    public RegPageHelper(WebDriver driver) {
        super(driver);
    }
    public String Male="Male";
    public String Female="Female";

    public void GenderChoose(String gender){
        if(gender =="Male"){
            getGMale().click();
        }
        if (gender =="Female"){
            getGFamale().click();
        }
    }
    public void setFirstNameRandomly(){
        getFirstNameField().sendKeys(randomString(6));
    }
    public void setLastNameRandomly(){
        getLastNameField().sendKeys(randomString(6));
    }
    //mail
    public String randomMail(){
        return Clock.systemUTC().instant().toString()
                .replaceAll("[^A-Za-zА-Яа-я0-9]", "")+"@gmail.com";
    }
    public void setGmailRandomly(){
        getEmailField().sendKeys(randomMail());
    }
    //pass
    public String setRandomPass(){
        return Clock.systemUTC().instant().toString()
                .replaceAll("[^0-9]", "");
    }
    public void setPassRandomly(){
        String pass = setRandomPass();
        getPassField().sendKeys(pass);
        getPassConfField().sendKeys(pass);
    }
    public void RegBtnClick(){
        getRegisterBtn().click();
    }
    public String getResultAttributeInnerText(){
        return getResult().getAttribute(innerText);
    }

}
