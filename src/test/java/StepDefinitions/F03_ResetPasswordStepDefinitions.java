package StepDefinitions;

import Pages.ResetPasswordPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.BrowserUtils;

public class F03_ResetPasswordStepDefinitions {
ResetPasswordPage resetObject;

    @Given("User navigates to reset page")
    public void User_opens_reset_page(){

        Hooks.homeObject.openLoginPage();
    }
    @When("Click on Forgot password")
    public void Click_forogtLink(){
        resetObject=Hooks.homeObject.resetPasswordPage();
    }
    @And("Enter registered email")
    public void Enter_register_email(){
        resetObject.ResetPassword(F01_RegistrationStepDefinitions.userEmail);
    }

    @And("Click on recover button")
    public void Click_recoverBtn(){
 resetObject.clickOnRecoverBtn();
    }

    @Then("User should be reset password and notification message displayed")
    public void Reset_Password_successfully(){
        Assert.assertTrue(resetObject.reset_password_successfully().contains("instructions"));
        resetObject.CloseResetSuccessMessage();
        BrowserUtils.waitFor(4);
    }

}
