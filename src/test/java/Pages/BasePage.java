package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected static WebDriver driver; // use in TCS
    //create constructor the same name of page without void
public BasePage(WebDriver driver){
    this.driver=driver;

}
    public static void SendTxtFields(By element ,String value){
        driver.findElement(element).sendKeys(value);
    }
    public  static void clickButton(By button)
    {
        driver.findElement(button).click();
    }

  /*  public  static void clickButton(WebElement button)
    {
      button.click();
    }*/
    }



