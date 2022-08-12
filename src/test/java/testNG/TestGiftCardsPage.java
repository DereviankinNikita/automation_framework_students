package TestNG;

import holders.TestInit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageObjects.HomePageHelper;

import static org.testng.Assert.assertTrue;

@Test
public class TestGiftCardsPage extends TestInit {

    public void testGiftCardsPage() {
        HomePageHelper homePageObjHelper = new HomePageHelper(driver);
        gotoHomePage();
        homePageObjHelper.giftCardsClick();
        String virtualCards25 = driver.findElements(By.xpath("//*[@href='/25-virtual-gift-card']")).get(1).getText();
        assertTrue(virtualCards25.contains("$25 Virtual Gift Card"));
        String physicalCards50 = driver.findElements(By.xpath("//*[@href='/50-physical-gift-card']")).get(1).getText();
        assertTrue(physicalCards50.contains("$50 Physical Gift Card"));
    }

}