package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class F10_WishlistPage extends BasePage{
    public F10_WishlistPage(WebDriver driver) {
        super(driver);
    }

    By Product1=By.xpath("//a[text()=\"HTC One M8 Android L 5.0 Lollipop\"]");
    By wishProduct1= By.id("add-to-wishlist-button-18");
    By Product2=By.xpath("//a[@href=\"/htc-one-mini-blue\" and text()=\"HTC One Mini Blue\"]");
    By wishProduct2= By.id("add-to-wishlist-button-19");
   /// By WishLink = By.xpath("//p[@class=\"content\"]//a[@href=\"/wishlist\" and text()=\"wishlist\"]");
    private By successaddtowishlist=By.xpath("//*[@id=\"bar-notification\"]/div/p");
    private By wishHeader=By.tagName("h1");

    SearchPage searchObject;

    public void WishProd1() {
        // Add product_1 to Compare list //
        searchObject=new SearchPage(driver);
        searchObject.User_Search_productsName("Htc");
        searchObject.Click_searchBtn();
        searchObject.user_Could_find_relative_results();
        clickButton(Product1);
        clickButton(wishProduct1);

    }
    public void WishProd2() {
        // Add product_2 to Compare list //
        driver.findElement(Product2).click();
        // Assertion product_2 //
        clickButton(wishProduct2);
        driver.navigate().to("http://demo.nopcommerce.com" + "/wishlist");
    }

  /*  public void click_WishLink(){
        clickButton(WishLink);
    }*/

    public String getresultsuccessaddtowishlist(){
        return driver.findElement(wishHeader).getText();
    }
}
