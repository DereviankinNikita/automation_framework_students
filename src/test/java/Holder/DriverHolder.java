package Holder;

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

public class DriverHolder {
    WebDriver driver;
    Actions actions;
    Duration timeToWait = Duration.ofSeconds(15);


    public DriverHolder(WebDriver driver) {
        this.driver = driver;
    }
    protected WebElement getElByXpath(String xpath) {
        return (new WebDriverWait(driver, timeToWait)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))));
    }
    protected List<WebElement> getElsByXpath(String xpath) {
        return (new WebDriverWait(driver, timeToWait)
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))));
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



}
