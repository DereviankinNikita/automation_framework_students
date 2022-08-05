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
    public String randomMail(){
        return Clock.systemUTC().instant().toString()
                .replaceAll("[^A-Za-zА-Яа-я0-9]", "")+"@gmail.com";
    }

}
