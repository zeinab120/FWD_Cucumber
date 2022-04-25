package StepDefinitions;

import Pages.F01_LoginPage;
import Pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BrowserUtils;

import static StepDefinitions.Hooks.driver;
import static StepDefinitions.Hooks.homeObject;

public class F04_SearchStepDefinitions {
    SearchPage searchObject;
    F01_LoginPage loginObject;

    @Given("user navigates to login page")
    public void user_navigates_loginPage()
    {
        Hooks.homeObject.openLoginPage();
    }
    @And("user can login with valid email and valid password")
    public void Valid_credentials()
    {
        loginObject=new F01_LoginPage(driver);
        loginObject.User_Enters_validData(F01_RegistrationStepDefinitions.userEmail,F01_RegistrationStepDefinitions.password);
        loginObject.click_loginBtn();

    }
    @When("logged user clicks on search field")
    public void Enter_search_field()
    {
 homeObject.searchPage();
    }

    @And("logged user searches with name of product")
    public void enter_product_name(){
        searchObject=new SearchPage(driver);
  searchObject.User_Search_productsName("htc");
    }

    @Then("Click on search button")
    public void click_search_button()
        {
searchObject.Click_searchBtn();
        }

        @And("logged user could find relative results")
    public void relative_results(){

        searchObject.user_Could_find_relative_results();
            BrowserUtils.waitFor(3);
        }



}
