package Holder;

import Holder.PageConstructors;
import Holder.Urls;
import Obj.HomePageObj;
import Obj.HomePageObjHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.time.Duration;

public class TestInit extends PageConstructors {
    protected WebDriver driver;
    protected Actions action ;

    @BeforeClass
    public void setupTest()
    {
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
    @AfterClass
    public void tearDown()
    {
        //driver.quit();
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
