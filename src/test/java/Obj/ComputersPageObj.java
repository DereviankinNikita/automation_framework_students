package Obj;

import Holder.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComputersPageObj extends DriverHolder {

    public ComputersPageObj(WebDriver driver){
        super(driver);
    }
    private String desktopsButton = "//*[@href='/desktops']";

    private String buildYourOwnComputerButton = "//*[@href='/build-your-own-computer']"; // bYOCB - next button in this computer page
    private String processorFieldChange = "//*[@id='product_attribute_16_5_4']";
    private String ramFieldChange ="//*[@id='product_attribute_16_6_5']";
    private String hddChange = "//*[@id='product_attribute_16_3_6_18']";
    private String osChange = "//*[@id='product_attribute_16_4_7_44']";
    private String softwareChange1 = "//*[@id='product_attribute_16_8_8_22']";
    private String softwareChange2 = "//*[@id='product_attribute_16_8_8_23']";
    private String softwareChange3 = "//*[@id='product_attribute_16_8_8_24']";

    private String buildYourOwnExpensiveComputer = "//*[@href='/build-your-own-expensive-computer-2']";
    private String processorChangeExp = "//*[@id='product_attribute_74_5_26_80']";
    private String ramChangeExp = "//*[@id='product_attribute_74_6_27_83']";
    private String hddChangeExp = "//*[@id='product_attribute_74_3_28_86']";
    private String softwareChangeExp1 = "//*[@id='product_attribute_74_8_29_88']";
    private String softwareChangeExp2 = "//*[@id='product_attribute_74_8_29_89']";
    private String softwareChangeExp3 = "//*[@id='product_attribute_74_8_29_90']";

    public WebElement getBuildYourOwnComputersButton(){return  getElsByXpath(buildYourOwnComputerButton).get(0);}
    public WebElement getProcessorFieldChange(){return  getElByXpath(processorFieldChange);}
    public WebElement getRAMFieldChange(){return getElByXpath(ramFieldChange);}
    public WebElement getHddChange(){return getElByXpath(hddChange);}
    public WebElement getOsChange(){return  getElByXpath(osChange);}
    public WebElement getSoftwareChange1(){return getElByXpath(softwareChange1);}
    public WebElement getSoftwareChange2(){return getElByXpath(softwareChange2);}
    public WebElement getSoftwareChange3(){return getElByXpath(softwareChange3);}
    public WebElement getDesktopsButton(){return  getElsByXpath(desktopsButton).get(0);} // temporarily not used

    public WebElement getBuildYourOwnExpensiveComputer(){return getElByXpath(buildYourOwnExpensiveComputer);}
    public WebElement getProcessorChangeExp(){return getElByXpath(processorChangeExp);}
    public WebElement getRamChangeExp(){return getElByXpath(ramChangeExp);}
    public WebElement getHddChangeExp(){return getElByXpath(hddChangeExp);}
    public WebElement getSoftwareExpChange1(){return getElByXpath(softwareChangeExp1);}
    public WebElement getSoftwareExpChange2(){return getElByXpath(softwareChangeExp2);}
    public WebElement getSoftwareExpChange3(){return getElByXpath(softwareChangeExp3);}





}
