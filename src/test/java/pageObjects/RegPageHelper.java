package pageObjects;

import org.openqa.selenium.WebDriver;

import java.time.Clock;

public class RegPageHelper extends RegPageElements {
    public RegPageHelper(WebDriver driver) {
        super(driver);
    }
    public String male ="Male";
    public String female ="Female";

    public void genderChoose(String gender){
        if(gender =="Male"){
            getGMale().click();
        }
        if (gender =="Female"){
            getGFamale().click();
        }
    }
    public void setFirstNameRandomly(){
        getFirstNameField().sendKeys(randomStringSymbols(6));
    }
    public void setFirstName(String name){
        getFirstNameField().sendKeys(name);
    }
    public void setLastNameRandomly(){
        getLastNameField().sendKeys(randomStringSymbols(6));
    }
    public void setLastName(String name){getLastNameField().sendKeys(name);}
    //mail
    public String randomMail(){
        return Clock.systemUTC().instant().toString()
                .replaceAll("[^A-Za-zА-Яа-я0-9]", "")+"@gmail.com";
    }
    public void setGmailRandomly(){
        getEmailField().sendKeys(randomMail());
    }
    public void setGmail(String gmail){getEmailField().sendKeys(gmail);}
    //pass
    public void setPass(String pass){
        getPassField().sendKeys(pass);
        getPassConfField().sendKeys(pass);
    }
    public String randomPass(){
        return Clock.systemUTC().instant().toString()
                .replaceAll("[^0-9]", "");
    }
    public void setPassRandomly(){
        String pass = randomPass();
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
