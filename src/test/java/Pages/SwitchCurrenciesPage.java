package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SwitchCurrenciesPage extends BasePage{
    public SwitchCurrenciesPage(WebDriver driver) {
        super(driver);
    }

    private By CurrencyList=By.id("customerCurrency");
    private By  AssertChangeCurrency= By.xpath("//span[@class=\"price actual-price\"]");


    public void OpenCurrency(){
       clickButton(CurrencyList);
    }
    public void ChangeCurrency(){
        Select CurrencyLists =new Select(driver.findElement(By.id("customerCurrency")));
        CurrencyLists.selectByIndex(1);
    }

     public String ChangedCurrencySuccessfully(){
       return driver.findElement(AssertChangeCurrency).getText();

    }
}
