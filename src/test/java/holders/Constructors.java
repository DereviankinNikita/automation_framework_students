package holders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pageObjects.HomePageElements;
import pageObjects.HomePageHelper;

public class Constructors {
    protected WebDriver driver;
    protected Actions action ;

    public void goToSite(){
        driver.get(homePageObj().mainUrl);
    }
    //constructors

    protected HomePageElements homePageObj(){
        return new HomePageElements(driver);
    }
    protected HomePageHelper homePageObjHelper(){
        return new HomePageHelper(driver);
    }

}
