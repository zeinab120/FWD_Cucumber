package StepDefinitions;

import Pages.SelectDifferentCategoriesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F06_SelectDifferentCategoriesStepDefinition {
    SelectDifferentCategoriesPage SDCobject;

    @Given("logged user can hover on Random Category")
    public void hoverCategory(){
        SDCobject=Hooks.homeObject.differenceCategory();
    SDCobject.Select_Category();
    }

    @When("logged user could open sub-Category")
    public void select_sub_Category(){
        SDCobject.Select_SubCategory();
    }

   @Then("Products related selected category should display")
    public void assert_products(){

    }
}
