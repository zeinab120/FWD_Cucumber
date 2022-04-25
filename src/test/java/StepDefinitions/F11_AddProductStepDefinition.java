package StepDefinitions;

import Pages.F11_AddToShoppingCartPage;
import Pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.BrowserUtils;

public class F11_AddProductStepDefinition {


        F11_AddToShoppingCartPage cartProduct=Hooks.homeObject.ProductCart();

        @Given("Logged user could add First products to Shopping cart")
        public void Add_products_cart() {
            SearchPage searchObject=Hooks.homeObject.searchPage();
          cartProduct.ProductsToCart();
            BrowserUtils.waitFor(3);
        }
        @And("user add Second products to Shopping cart")
        public void add_products_to_Shopping_Cart() {
            cartProduct.ProductsToCart2();

        }
        @When("user click on cart button")
        public void products_to_Shopping_Cart() {
            cartProduct.cartPage();

        }
        @Then("The cart page should be opened")
        public void assertSuccess(){
            Assert.assertTrue(cartProduct.getresulttoaddtocart().contains("Shopping"));
        }
    }

