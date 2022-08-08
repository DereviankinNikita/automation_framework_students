package Obj;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
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
        getProcessorFieldChange().sendKeys(Keys.ARROW_DOWN);
        getProcessorFieldChange().sendKeys(Keys.ENTER);

    }
    public void ramFieldChange(){
        getRAMFieldChange().click();
        getRAMFieldChange().sendKeys(Keys.ARROW_DOWN);
        getRAMFieldChange().sendKeys(Keys.ARROW_DOWN);
        getRAMFieldChange().sendKeys(Keys.ENTER);
    }
    public void hddChange(){
        getHddChange().click();
        getHddChange().sendKeys(Keys.ARROW_DOWN);
        getHddChange().sendKeys(Keys.ENTER);
    }
    public void osChange(){
        getOsChange().click();
        getOsChange().sendKeys(Keys.ARROW_DOWN);
        getOsChange().sendKeys(Keys.ENTER);
    }
    public void softwareChange(){
        getSoftwareChange1().click();
        getSoftwareChange2().click();
        getSoftwareChange3().click();
    }

// next build your own expensive computer
    public void buildYourOwnExpensiveComputer(){
        getBuildYourOwnExpensiveComputer().click();
    }
    public void processorExpChange(){
        getProcessorChangeExp().click();
        getProcessorChangeExp().sendKeys(Keys.ARROW_DOWN);
        getProcessorChangeExp().sendKeys(Keys.ENTER);
    }
    public void ramExpChange(){
        getRamChangeExp().click();
        getRamChangeExp().sendKeys(Keys.ARROW_DOWN);
        getRamChangeExp().sendKeys(Keys.ENTER);
    }
    public void hddExpChange(){
        getHddChangeExp().click();
        getHddChangeExp().sendKeys(Keys.ARROW_DOWN);
        getHddChangeExp().sendKeys(Keys.ENTER);
    }
    public void softwareExpChange(){
        getSoftwareExpChange1().click();
        getSoftwareExpChange2().click();
        getSoftwareExpChange3().click();
    }

}
