package Obj;

import Holder.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageDemoWebShop extends DriverHolder {
    public HomePageDemoWebShop(WebDriver driver) {super(driver);
    }

    public WebElement getSearchFiled() {
        return  driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
    }

    public WebElement getButtonSearch() {
        return driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]"));
    }
}
