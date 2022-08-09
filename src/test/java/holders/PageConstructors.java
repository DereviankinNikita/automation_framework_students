package Holder;

import Obj.HomePageObj;
import Obj.HomePageObjHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class PageConstructors {
    protected WebDriver driver;
    protected Actions action ;
    //constructors
    protected Urls urls(){
        return new Urls(driver);
    }
    protected HomePageObj homePageObj(){
        return new HomePageObj(driver);
    }
    protected HomePageObjHelper homePageObjHelper(){
        return new HomePageObjHelper(driver);
    }
}
