package StepDefinitions;


import Pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Random;

public class F01_RegistrationStepDefinitions{
    RegistrationPage registrationObject;

    // Write Valid Email with Random Generator //
    static Random randomGenerator = new Random();
    static int number = randomGenerator.nextInt(1000);
    static String s = Integer.toString(number); //parse
    public static String userName = "Zeinab" + number;
    public static String userEmail = userName + "@gmail.com";
    protected static String password="123456";



    @Given("User navigates to registration page")
    public void Navigate_to_registration_page()
    {
        registrationObject=Hooks.homeObject.openRegistrationPage();
    }
        @When("user fill mandatory fields")
    public void Enter_mandatory_fields()
        {
        registrationObject.UserRegisteration(userName,"Mohamed",userEmail,password);

    }
    @And("Click on register button")
    public void Click_register()

    {
       registrationObject.Click_register_button();
    }
    @Then("User should be registered successfully")
    public void register_successfully() {
        String SuccessMessage = registrationObject.resRegisterSuccessMssg();
        Assert.assertEquals(SuccessMessage,"Your registration completed");
    }
        @And("user logout to login again")
    public void Logout_page(){

        registrationObject.RegisteredUserCanLogout();
    }

}
