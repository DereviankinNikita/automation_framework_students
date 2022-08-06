package pageObjects;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoFooterElements extends DriverHolder {
       public DemoFooterElements(WebDriver driver) {
        super(driver);
    }
    private String footerSitemap= "//*/a[@href='/sitemap']";
    private String footerShipping= "//*/a[@href='/shipping-returns']";
    private String footerPrivacy= "//*/a[@href='/privacy-policy']";
    private String footerConditions= "//*/a[@href='/conditions-of-use']";
    private String footerAboutUs= "//*/a[@href='/about-us']";
    private String footerContactUs= "//*/a[@href='/contactus']";
    private String footerSearch= "//*/a[@href='/search']";
    private String footerNews= "//*/a[@href='/news']";
    private String footerBlog= "//*/a[@href='/blog']";
    private String footerRecentlyViewed= "//*/a[@href='/recentlyviewedproducts']";
    private String footerCompare= "//*/a[@href='/compareproducts']";
    private String footerNewProducts= "//*/a[@href='/newproducts']";
    private String footerMyAccount= "//*/a[@href='/customer/info']";
    private String footerOrders= "//*/a[@href='/customer/orders']";
    private String footerAddresses= "//*/a[@href='/customer/addresses']";
    private String footerShopCart= "//div[4]/div[2]/div[1]/div[3]/ul/li[4]/a";
    private String footerWishlist= "//div[4]/div[2]/div[1]/div[3]/ul/li[5]/a";
    private String footerFacebook= "//*/li[@class='facebook']/a";
    private String footerTwitter= "//*/li[@class='twitter']/a";
    private String footerRss= "//*/li[@class='rss']/a";
    private String footerYoutube= "//*/li[@class='youtube']/a";
    private String footerGoogleplus= "//*/li[@class='google-plus']/a";

    public WebElement getFooterSitemap(){
        return getElByXpath(footerSitemap);
    }
    public WebElement getFooterShipping(){
        return getElByXpath(footerShipping);
    }
    public WebElement getFooterPrivacy(){
        return getElByXpath(footerPrivacy);
    }
    public WebElement getFooterConditions(){
        return getElByXpath(footerConditions);
    }
    public WebElement getFooterAboutUs(){
        return getElByXpath(footerAboutUs);
    }
    public WebElement getFooterContactUs(){
        return getElByXpath(footerContactUs);
    }
    public WebElement getFooterSearch(){
        return getElByXpath(footerSearch);
    }
    public WebElement getFooterNews(){
        return getElByXpath(footerNews);
    }
    public WebElement getFooterBlog(){
        return getElByXpath(footerBlog);
    }
    public WebElement getFooterRecentlyViewed(){
        return getElByXpath(footerRecentlyViewed);
    }
    public WebElement getFooterCompare(){
        return getElByXpath(footerCompare);
    }
    public WebElement getFooterNewProducts(){
        return getElByXpath(footerNewProducts);
    }
    public WebElement getFooterMyAccount(){
        return getElByXpath(footerMyAccount);
    }
    public WebElement getFooterOrders(){
        return getElByXpath(footerOrders);
    }
    public WebElement getFooterAddresses(){
        return getElByXpath(footerAddresses);
    }
    public WebElement getFooterShopCart(){
        return getElByXpath(footerShopCart);
    }
    public WebElement getFooterWishlist(){
        return getElByXpath(footerWishlist);
    }
    public WebElement getFooterFacebook(){
        return getElByXpath(footerFacebook);
    }
    public WebElement getFooterTwitter(){
        return getElByXpath(footerTwitter);
    }
    public WebElement getFooterRss(){
        return getElByXpath(footerRss);
    }
    public WebElement getFooterYoutube(){
        return getElByXpath(footerYoutube);
    }
    public WebElement getFooterGoogleplus(){
        return getElByXpath(footerGoogleplus);
    }

}