package StepDefinitions;

import Pages.F07_FilterWithColorPage;
import Pages.SelectDifferentCategoriesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class F07_FilterWithColorStepDefinition {
    SelectDifferentCategoriesPage S_categoryObject;
    F07_FilterWithColorPage filterColorObject;
    @Given("logged user selects Category and hover to open sub-Category")
    public void Select_category(){
        S_categoryObject=Hooks.homeObject.differenceCategory();
        S_categoryObject.Select_Category();
        S_categoryObject.Select_SubCategory();
    }
    @When("logged user can filter sub-Category with color")
    public void Filter_color(){
        filterColorObject=Hooks.homeObject.Color();
        filterColorObject.Filter_with_color();
    }

    @Then("logged user could find product with the selected color")
    public void Asset(){
       // Assert.assertEquals("adidas Consortium Campus 80s Running Shoes","adidas Consortium Campus 80s Running Shoes");
Assert.assertTrue(filterColorObject.Success().contains("Campus 80s"));
    }
}
