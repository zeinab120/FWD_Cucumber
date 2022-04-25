package StepDefinitions;

import Pages.F09_ComparePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.BrowserUtils;

public class F09_CompareStepDefinitions {
    F09_ComparePage CompareObject=Hooks.homeObject.CompareCart();


    @Given("logged user can add First Product to Compare list")
    public void add_First_Product_to_Compare_list() {
        // Add & Assert product_1 to Compare list using POM //
        CompareObject.compareProd1Ele();
        BrowserUtils.waitFor(3);
        System.out.println("First product has been added to your product comparison");
    }
    @And("logged user can add Second Product to Compare list")
    public void add_Second_Product_to_Compare_list() {
        // Add & Assert product_2 to Compare list using POM //
        CompareObject.compareProd2Ele();
        BrowserUtils.waitFor(3);
        System.out.println("Second product has been added to your product comparison");
    }

 @When("logged user navigates to Compare products list")
    public void Compare_Link(){
        CompareObject.compareLink();
 }

 @Then("logged user could compare between the selected products")
    public void Compare_results(){

 }


}