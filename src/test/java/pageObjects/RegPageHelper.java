package pageObjects;

import org.openqa.selenium.WebDriver;

public class RegPageHelper extends RegPageElements {
    public RegPageHelper(WebDriver driver) {
        super(driver);
    }
    public String Male="Male";
    public String Female="Female";

    public void GenderChoose(String gender){
        if(gender =="Male"){
            getGMale().click();
        }
        if (gender =="Female"){
            getGFamale().click();
        }
    }

}
