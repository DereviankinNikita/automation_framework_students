package holders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pageObjects.HomePageObj;
import pageObjects.HomePageObjHelper;

public class PageConstructors {
    protected WebDriver driver;
    protected Actions action ;

    //constructors

    protected HomePageObj homePageObj(){
        return new HomePageObj(driver);
    }
    protected HomePageObjHelper homePageObjHelper(){
        return new HomePageObjHelper(driver);
    }

}
