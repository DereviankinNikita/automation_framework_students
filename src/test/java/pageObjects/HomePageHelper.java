package pageObjects;

import org.openqa.selenium.WebDriver;

public class HomePageHelper extends HomePageElements {
    public HomePageHelper(WebDriver driver) {
        super(driver);
    }
    public void regClick(){
        getRegisterBtn().click();
    }
}
