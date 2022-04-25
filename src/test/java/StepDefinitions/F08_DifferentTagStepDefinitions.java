package StepDefinitions;

import Pages.F08_DifferentTagsPage;
import Pages.SelectDifferentCategoriesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class F08_DifferentTagStepDefinitions {
    SelectDifferentCategoriesPage So;
    F08_DifferentTagsPage tagsObject;

    @Given("logged user can select a popular tag")
    public void Select_tag(){
        So=Hooks.homeObject.differenceCategory();
        So.Select_Category();
        So.Select_SubCategory();
        tagsObject=Hooks.homeObject.Tags();
        tagsObject.Select_tags();
    }

    @When("logged user finds products")
    public void products(){

        Assert.assertTrue(tagsObject.Success().contains("'awesome'"));
    }


@Then("logged user could select a different tag")
  public void Select_another_tag(){

       tagsObject.Select_anotherTag();
    }

    @And("logged user finds another different products")
    public void successMess2(){
        Assert.assertTrue(tagsObject.Success2().contains("computer"));
    }
  }
