package StepDefinitions;

import Pages.F09_ComparePage;
import Pages.F10_WishlistPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static StepDefinitions.Hooks.driver;

public class F10_WishlistStepDefinition {
     ;
    F10_WishlistPage wishObject=Hooks.homeObject.wishlist();
    @Given("Add product1")
    public void add_first_product() {
       // wishObject=new F10_WishlistPage(driver);
        wishObject.WishProd1();
    }

    @And("Add product2")
    public void add_second_product(){
        wishObject.WishProd2();
    }

    @When("click on wishlist click")
    public void wishLink(){
       // wishObject.click_WishLink();
    }

    @Then("logged user navigates to his Wishlist page")
    public void successWishList(){
        Assert.assertTrue(wishObject.getresultsuccessaddtowishlist().contains("Wishlist"));
    }

}
