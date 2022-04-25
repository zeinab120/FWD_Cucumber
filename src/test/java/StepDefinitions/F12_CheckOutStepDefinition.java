package StepDefinitions;

import Pages.F12_CheckoutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class F12_CheckOutStepDefinition {
    F12_CheckoutPage CheckOutObject=Hooks.homeObject.CheckOut();



    @Given("Logged user could add products to Shopping cart")
    public void Add_products_to_cart(){
        CheckOutObject.Add_products_toCart();
    }

    @When("user click on checkout button")
    public void Click_CheckoutBtn(){
        CheckOutObject.CheckOut();
    }

    @Then("The checkout page should be opened")
    public void assert_success_checkout(){
        Assert.assertTrue(CheckOutObject.Checkout_success().contains("Checkout"));

    }
}

