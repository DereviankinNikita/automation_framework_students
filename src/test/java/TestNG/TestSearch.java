package testNG;

import Holder.TestInit;
import Obj.HomePageDemoWebShop;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch extends TestInit {

    @Test
    public void checkSearch(){
        HomePageDemoWebShop homePageDemoWebShop = new HomePageDemoWebShop(driver);
        urls().gotoHome();
        homePageDemoWebShop.getSearchFiled().sendKeys("Health Book");
        homePageDemoWebShop.getButtonSearch().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("search?q=Health+Book"));
    }
}
