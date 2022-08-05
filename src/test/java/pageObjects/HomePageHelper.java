package pageObjects;

import org.openqa.selenium.WebDriver;

import java.time.Clock;

public class HomePageHelper extends HomePageElements {
    public HomePageHelper(WebDriver driver) {
        super(driver);
    }
    public String randomMail(){
        return Clock.systemUTC().instant().toString()
                .replaceAll("[^A-Za-zА-Яа-я0-9]", "")+"@gmail.com";
    }
    public void regClick(){
        getRegisterBtn().click();
    }
}
