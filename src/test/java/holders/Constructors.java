package holders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pageObjects.HomePageObj;
import pageObjects.HomePageObjHelper;

public class Constructors {
    protected WebDriver driver;
    protected Actions action ;

    public void goToSite(){
        driver.get(homePageObj().mainUrl);
    }
    //constructors

    protected HomePageObj homePageObj(){
        return new HomePageObj(driver);
    }
    protected HomePageObjHelper homePageObjHelper(){
        return new HomePageObjHelper(driver);
    }

}
