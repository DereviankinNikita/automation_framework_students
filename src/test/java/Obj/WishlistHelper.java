package Obj;

import Holder.DriverHolder;
import org.openqa.selenium.WebDriver;

public class WishlistHelper extends WishlistObj {


    public WishlistHelper(WebDriver driver) {
        super(driver);
    }

    public void clickWishlist(){ getWishlist().click(); }

    public void clickOnAddToWishlist(){ getAddToWishlistButton().click(); }

    public void clickOnRemove(){ getRemoveButton().click(); }

    public void clickOnAddToCard(){ getAddToCard().click(); }

    public void clickOnUpdateWishlist(){ getUpdateWishlist(); }

    public void clickAddToCardButton(){ getAddToCardButton(); }

    public void clickEmailAFriend(){ getEmailAFriend().click(); }

    public void clickRecipientsNameField(){
        String RecipientsName = "Sasha";
        getRecipientsNameField().sendKeys(RecipientsName);
    }

    public void clickRecipientsEmailField(){
        String RecipientsEmail = "exemail@gmail.com";
        getRecipientsEmailField().sendKeys(RecipientsEmail);
    }

    public void clickSenderNameField(){
        String SenderName = "Andrey zhur";
        getSenderNameField().sendKeys(SenderName);
    }

    public void clickSenderEmailField(){
        String SenderEmail = "andreybood@meta.ua";
        getSenderEmailField().sendKeys(SenderEmail);
    }

}
