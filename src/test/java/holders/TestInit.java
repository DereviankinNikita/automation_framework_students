package holders;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageObjects.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.time.Duration;

public class TestInit {
    public WebDriver driver;
    public Actions action ;

    @BeforeMethod
    public void setupTest() {
        WebDriverManager.chromiumdriver().setup();
        driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        driver.manage().window().maximize();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        //Set implicit wait:
        //wait for WebElement
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //wait for loading page
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

        //wait for an asynchronous script to finish execution
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
    }
    //
    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

    //wait
    public void sleep(int s)
    {
        try {
            Thread.sleep(s*1000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
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
    //log
    protected LogPageElements logPageElements(){return new LogPageElements(driver);}
    protected LogPageHelper logPageHelper(){return new LogPageHelper(driver);}
}
