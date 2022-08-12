package Obj;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputersPageHelper extends ComputersPageObj{

    public ComputersPageHelper(WebDriver driver){
        super(driver);
    }

public void buildYourOwnComputerClick(){
    getBuildYourOwnComputersButton().click();
}
    public void processorChange(){
        getProcessorFieldChange().click();
        Assert.assertTrue(getProcessorFieldChange().isEnabled());
        getProcessorFieldChange().sendKeys(Keys.ARROW_DOWN);
        getProcessorFieldChange().sendKeys(Keys.ENTER);

    }
    public void ramFieldChange(){
        getRAMFieldChange().click();
        Assert.assertTrue(getRAMFieldChange().isEnabled());
        getRAMFieldChange().sendKeys(Keys.ARROW_DOWN);
        getRAMFieldChange().sendKeys(Keys.ARROW_DOWN);
        getRAMFieldChange().sendKeys(Keys.ENTER);
    }
    public void hddChange(){
        getHddChange().click();
        Assert.assertTrue(getHddChange().isSelected());
        getHddChange().sendKeys(Keys.ARROW_DOWN);
        getHddChange().sendKeys(Keys.ENTER);
    }
    public void osChange(){
        getOsChange().click();
        Assert.assertTrue(getOsChange().isSelected());
        getOsChange().sendKeys(Keys.ARROW_DOWN);
        getOsChange().sendKeys(Keys.ENTER);
    }
    public void softwareChange(){
        getSoftwareChange1().click();
        Assert.assertFalse(getSoftwareChange1().isSelected()); //Need False because default status is "Selected" (true)
        getSoftwareChange2().click();
        Assert.assertTrue(getSoftwareChange2().isSelected());
        getSoftwareChange3().click();
        Assert.assertTrue(getSoftwareChange3().isSelected());
    }

// next build your own expensive computer
    public void buildYourOwnExpensiveComputer(){
        getBuildYourOwnExpensiveComputer().click();
    }

    public void processorExpChange(){
        getProcessorChangeExp().click();
        Assert.assertTrue(getProcessorChangeExp().isSelected());
        getProcessorChangeExp().sendKeys(Keys.ARROW_DOWN);
        getProcessorChangeExp().sendKeys(Keys.ENTER);
    }
    public void ramExpChange(){
        getRamChangeExp().click();
        Assert.assertTrue(getRamChangeExp().isSelected());
        getRamChangeExp().sendKeys(Keys.ARROW_DOWN);
        getRamChangeExp().sendKeys(Keys.ENTER);
    }
    public void hddExpChange(){
        getHddChangeExp().click();
        Assert.assertTrue(getHddChangeExp().isSelected());
        getHddChangeExp().sendKeys(Keys.ARROW_DOWN);
        getHddChangeExp().sendKeys(Keys.ENTER);
    }
    public void softwareExpChange(){
        getSoftwareExpChange1().click();
        Assert.assertTrue(getSoftwareExpChange1().isSelected());
        getSoftwareExpChange2().click();
        Assert.assertTrue(getSoftwareExpChange2().isSelected());
        getSoftwareExpChange3().click();
        Assert.assertTrue(getSoftwareExpChange3().isSelected());
    }

}
