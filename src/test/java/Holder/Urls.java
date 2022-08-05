package Holder;

import org.openqa.selenium.WebDriver;

public class Urls extends DriverHolder {

    public Urls(WebDriver driver) {
        super(driver);}
    public String website = "http://demowebshop.tricentis.com/";

    public void gotoHome()
    {
        driver.get(website);
    }
        //Я вообще не понимаю зачем это сдесь. удолите вообще этот класс. он нам ненужон


}
