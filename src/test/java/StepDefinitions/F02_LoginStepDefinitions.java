package StepDefinitions;

import Pages.F01_LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class F02_LoginStepDefinitions {
  F01_LoginPage loginObject;

    @Given("User navigates to login page")
    public void Navigate_login()
    {

      loginObject=Hooks.homeObject.openLoginPage();
    }
    @When("user enters valid username and password")
    public void Enter_valid_data()
    {
      loginObject.User_Enters_validData(F01_RegistrationStepDefinitions.userEmail,F01_RegistrationStepDefinitions.password);
    }
    @And("Click on login button")
    public void Click_login_button()

    {
       loginObject.click_loginBtn();

    }

    @Then("User should be login successfully")
    public void Login_successfully()
    {
      //Assert.assertEquals("https://demo.nopcommerce.com/",loginObject.login_successfully());
         loginObject.login_successfully();
    }


}
