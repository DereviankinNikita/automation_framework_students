package holders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pageObjects.HomePageElements;
import pageObjects.HomePageHelper;
import pageObjects.RegPageElements;
import pageObjects.RegPageHelper;

public class Constructors {
    protected WebDriver driver;
    protected Actions action ;


    public void goToSite(){
        driver.get(regPageElements().mainUrl);
    }

    //constructors

    protected HomePageElements homePageObj(){
        return new HomePageElements(driver);
    }
    protected HomePageHelper homePageObjHelper(){
        return new HomePageHelper(driver);
    }
    //reg
    protected RegPageElements regPageElements(){
        return new RegPageElements(driver);
    }
    protected RegPageHelper regPageHelper(){
        return new RegPageHelper(driver);
    }

}
