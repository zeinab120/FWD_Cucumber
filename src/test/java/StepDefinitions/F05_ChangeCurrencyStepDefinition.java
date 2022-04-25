package StepDefinitions;

import Pages.SwitchCurrenciesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.StepDefinition;
import org.testng.Assert;

//import static StepDefinitions.Hooks.driver;

public class F05_ChangeCurrencyStepDefinition {
 SwitchCurrenciesPage SwitchCurrencyObject;
    @Given("Open drop down list")
    public void OpenCurrency(){
        //SwitchCurrencyObject=new SwitchCurrenciesPage(driver);
        SwitchCurrencyObject=Hooks.homeObject.ChangeCurrency();
        SwitchCurrencyObject.OpenCurrency();
    }

    @When("Select currency")
    public void ChangeCurrency(){
        SwitchCurrencyObject.ChangeCurrency();
    }
    @Then("Products currency should be changed")
    public void assertChangeCurrency(){
        SwitchCurrencyObject.ChangedCurrencySuccessfully().contains("€");


    }

}
