package holders;

import pageObjects.HomePageElements;
import pageObjects.HomePageHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.time.Duration;

public class TestInit extends Constructors {
   public WebDriver driver;
    Actions action ;

    @BeforeClass
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
    @AfterClass
    void tearDown()
    {
        //driver.quit();
    }

    //wait
    void sleep(int s)
    {
        try {
            Thread.sleep(s*1000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    //constructors

    protected HomePageElements homePageObj(){
       return new HomePageElements(driver);
    }
    protected HomePageHelper homePageObjHelper(){
        return new HomePageHelper(driver);
    }
}