package TestNG;

import Holder.TestInit;
import Obj.WishlistHelper;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWishlist extends TestInit {

    @Test
    public void buttonAddToWishlist(){
        WishlistHelper wishlistHelper = new WishlistHelper(driver);
        //String expectedProduct = driver.findElement(By.xpath("//img[@src='http://demowebshop.tricentis.com/content/images/thumbs/0000015_25-virtual-gift-card_125.jpeg']")).getText();
        driver.findElement(By.xpath("//img[@src='http://demowebshop.tricentis.com/content/images/thumbs/0000015_25-virtual-gift-card_125.jpeg']")).click();
        wishlistHelper.clickRecipientsNameField();
        wishlistHelper.clickRecipientsEmailField();
        wishlistHelper.clickSenderNameField();
        wishlistHelper.clickSenderEmailField();
        wishlistHelper.getAddToWishlistButton();
        wishlistHelper.getWishlist();
    }
}
