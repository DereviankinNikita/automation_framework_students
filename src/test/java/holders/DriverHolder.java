package holders;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class DriverHolder extends VariablesForTests{

    protected WebDriver driver;
    protected Actions actions;
    Duration timeToWait = Duration.ofSeconds(15);


    public DriverHolder(WebDriver driver) {
        this.driver = driver;
        setConfigFromPropertyFile();
    }
    protected WebElement getElByXpath(String xpath) {
        return (new WebDriverWait(driver, timeToWait)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))));
    }
    protected List<WebElement> getElsByXpath(String xpath) {
        return (new WebDriverWait(driver, timeToWait)
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))));
    }
    public void goToSite(String site){
        driver.get(site);
    }

    //waits
    protected WebElement waitForElementClick(String element) {
        return ( new WebDriverWait(driver, timeToWait)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(element))));
    }
    protected WebElement waitForElementVisible(String element) {
        return ( new WebDriverWait(driver, timeToWait)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(element))));
    }
    void sleep(int s)
    {
        try {
            Thread.sleep(s*1000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    //js
    public void scrollToEl(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",element);
    }
    protected DriverHolder waitForPageLoad(){
        new WebDriverWait(driver, timeToWait).until((ExpectedCondition<Boolean>)
                wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
        return null;
    }
    public String randomString(int length) {

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = length;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }

    public DriverHolder goToHomePage(){
        driver.get(mainUrl);
        waitForPageLoad();
        return new DriverHolder(driver);
    }




}
