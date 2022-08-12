package TestNG;

import Holder.TestInit;
import Obj.HomePageObjHelper;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

@Test
public class TestGiftCardsPage extends TestInit {

    public void testGiftCardsPage() {
        HomePageObjHelper homePageObjHelper = new HomePageObjHelper(driver);
        gotoHomePage();
        homePageObjHelper.clickGiftCards();
        String virtualCards25 = driver.findElements(By.xpath("//*[@href='/25-virtual-gift-card']")).get(1).getText();
        assertTrue(virtualCards25.contains("$25 Virtual Gift Card"));
        String physicalCards50 = driver.findElements(By.xpath("//*[@href='/50-physical-gift-card']")).get(1).getText();
        assertTrue(physicalCards50.contains("$50 Physical Gift Card"));
    }

}
