package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public  HomePage(WebDriver driver) {

        super(driver);
    }

    private void ClickLink(String LinkText){
        driver.findElement(By.linkText(LinkText)).click();
    }
  //  private By RegisterLink= By.linkText("Register");
  //  private By loginLink = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
  By searchField = By.id("small-searchterms");

    public RegistrationPage openRegistrationPage() {
        ClickLink("Register");
        return new RegistrationPage(driver);
    }

    public F01_LoginPage openLoginPage(){
        ClickLink("Log in");
        return new F01_LoginPage(driver);
    }

    public ResetPasswordPage resetPasswordPage(){
        ClickLink("Forgot password?");
        return new ResetPasswordPage(driver);
    }

    public SearchPage searchPage(){
        clickButton(searchField);
        return new SearchPage(driver);
    }

    public SwitchCurrenciesPage ChangeCurrency(){
        return new SwitchCurrenciesPage(driver);
    }

    public SelectDifferentCategoriesPage differenceCategory(){
        return new SelectDifferentCategoriesPage(driver);
    }
    public F07_FilterWithColorPage Color(){
        return new F07_FilterWithColorPage(driver);
    }

    public F08_DifferentTagsPage Tags(){
        return new F08_DifferentTagsPage(driver);
    }
    public F09_ComparePage CompareCart(){
        return new F09_ComparePage(driver);
    }
    public F10_WishlistPage wishlist(){
        return new F10_WishlistPage(driver);

    }
    public F11_AddToShoppingCartPage ProductCart(){
        return new F11_AddToShoppingCartPage(driver);
    }

    public F12_CheckoutPage CheckOut(){
        return new F12_CheckoutPage(driver);
    }
}
