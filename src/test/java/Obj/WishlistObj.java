package Obj;

import Holder.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishlistObj extends DriverHolder {

    public WishlistObj(WebDriver driver) {
        super(driver);
    }

    private String Wishlist = "//span[@class=\"wishlist-qty\"]";
    private String addToWishlistButton = "//input[@id='add-to-wishlist-button-2']";

    private String removeButton = "//input[@name='removefromcart']";

    private String addToCard = "//input[@name='addtocart']";

    private String updateWishlist = "//input[@name='updatecart']";

    private String addToCardButton = "//input[@name='addtocartbutton']";

    private String emailAFriend = "//input[@value='Email a friend']";

    private String recipientsNameField = "//input[@class='recipient-name']";

    private String recipientsEmailField = "//input[@class='recipient-email']";

    private String senderNameField = "//input[@class='recipient-name']";

    private String senderEmailField = "//input[@class='recipient-name']";

    public WebElement getWishlist() { return getElByXpath(Wishlist); }

    public WebElement getAddToWishlistButton() { return getElByXpath(addToWishlistButton); }

    public WebElement getRemoveButton() { return getElByXpath(removeButton); }

    public WebElement getAddToCard(){ return getElByXpath(addToCard); }

    public WebElement getUpdateWishlist(){ return getElByXpath(updateWishlist); }

    public WebElement getAddToCardButton(){ return getElByXpath(addToCardButton); }

    public WebElement getEmailAFriend(){ return getElByXpath(emailAFriend); }

    public WebElement getRecipientsNameField(){ return getElByXpath(recipientsNameField); }

    public WebElement getRecipientsEmailField(){ return getElByXpath(recipientsEmailField); }

    public WebElement getSenderNameField(){ return getElByXpath(senderNameField); }

    public WebElement getSenderEmailField(){ return getElByXpath(senderEmailField); }
}
