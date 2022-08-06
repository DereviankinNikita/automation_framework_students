package pageObjects;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    public class DemoHeaderElements extends DriverHolder {
        public DemoHeaderElements(WebDriver driver){
            super(driver);

        }
        private String headerRegister= "//*[@class='ico-register']";
        private String headerLogin= "//*[@class='ico-login']";
        private String headerShoppingCart= "//*[@id='topcartlink']/a";
        private String headerWishList= "//div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a";
        private String headerSearchBar= "//*[@id='small-searchterms']";
        private String headerSearchBtn= "//*[@type='submit']";


        public WebElement getHeaderRegister(){
            return getElementByXpath(headerRegister);
        }
        public WebElement getHeaderLogin(){
            return getElementsByXpath(headerLogin);
        }
        public WebElement getHeaderShoppingCart(){
            return getElementByXpath(headerShoppingCart);
        }
        public WebElement getHeaderWishList(){
            return getElementByXpath(headerWishList);
        }
        public WebElement getHeaderSearchBar(){
            return getElementByXpath(headerSearchBar);
        }
        public WebElement getHeaderSearchBtn(){
            return getElementByXpath(headerSearchBtn);
        }

    }

