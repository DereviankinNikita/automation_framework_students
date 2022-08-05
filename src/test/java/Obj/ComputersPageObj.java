package Obj;

import Holder.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComputersPageObj extends DriverHolder {

    public ComputersPageObj(WebDriver driver){
        super(driver);
    }
    private String desktopsButton = "//*[@href='/desktops']";
    private String buildYourOwnComputerButton = "//*[@href='/build-your-own-computer']";



    public WebElement getDesktopsButton(){return  getElsByXpath(desktopsButton).get(0);}
    public WebElement getBuildYourOwnComputersButton(){return  getElsByXpath(buildYourOwnComputerButton).get(0);}





}
