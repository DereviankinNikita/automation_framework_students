package Obj;

import org.openqa.selenium.WebDriver;

public class HomePageObjHelper extends HomePageObj{
    public HomePageObjHelper(WebDriver driver) {
        super(driver);
    }
    public void regClick(){
        RegisterBtn().click();
    }
    public void clickGiftCards(){
        giftCardsBtn().click();
    }

}
