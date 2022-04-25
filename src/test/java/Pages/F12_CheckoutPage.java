package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class F12_CheckoutPage extends BasePage{
    public F12_CheckoutPage(WebDriver driver) {
        super(driver);
    }
F11_AddToShoppingCartPage Add_toCartObject= Hooks.homeObject.ProductCart();
    public void Add_products_toCart(){

Add_toCartObject.ProductsToCart();
Add_toCartObject.ProductsToCart2();
        driver.navigate().to("http://demo.nopcommerce.com" + "/cart");
    }
    public void CheckOut(){
        clickButton(By.id("termsofservice"));
        clickButton(By.id("checkout"));
    }
    public String Checkout_success(){
        return driver.findElement(By.tagName("h1")).getText();
    }


}
