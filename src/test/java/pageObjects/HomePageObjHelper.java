package pageObjects;

import org.openqa.selenium.WebDriver;

public class HomePageObjHelper extends HomePageObj{
    public HomePageObjHelper(WebDriver driver) {
        super(driver);
    }
    public void regClick(){
        getRegisterBtn().click();
    }
}
