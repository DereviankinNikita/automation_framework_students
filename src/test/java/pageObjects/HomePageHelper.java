package pageObjects;

import org.openqa.selenium.WebDriver;

import java.time.Clock;

public class HomePageHelper extends HomePageElements {
    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

    public void regClick(){
        getRegisterBtn().click();
    }
}
