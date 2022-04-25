package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class F11_AddToShoppingCartPage extends BasePage{
    public F11_AddToShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    By Product1=By.xpath("//a[text()=\"HTC One M8 Android L 5.0 Lollipop\"]");
    By Product2=By.xpath("//a[@href=\"/htc-one-mini-blue\" and text()=\"HTC One Mini Blue\"]");
    By addCartBtn= By.xpath("//button[@class=\"button-2 product-box-add-to-cart-button\" and text()=\"Add to cart\"]");
    By CartSuccess=By.tagName("h1");
    //------------------------------------------------------------------------------//
SearchPage searchObject;
    public void ProductsToCart()
    {
       searchObject= Hooks.homeObject.searchPage();
        searchObject.User_Search_productsName("Htc");
        searchObject.Click_searchBtn();
        searchObject.user_Could_find_relative_results();
        clickButton(Product1);
        clickButton(addCartBtn);
    }
    //------------------------------------------------------------------------------//

    public void ProductsToCart2()
    {
        driver.findElement(Product2).click();
        clickButton(addCartBtn);

    }

    public void cartPage(){
        driver.navigate().to("http://demo.nopcommerce.com" + "/cart");
    }
    public String getresulttoaddtocart(){
        return driver.findElement(CartSuccess).getText();
    }
}
