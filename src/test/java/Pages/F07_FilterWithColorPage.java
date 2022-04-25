package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class F07_FilterWithColorPage extends BasePage{
    public F07_FilterWithColorPage(WebDriver driver) {
        super(driver);
    }

    By GreyColor = By.cssSelector("label[for=\"attribute-option-14\"]");
    public void Filter_with_color(){
     clickButton(GreyColor);
    }

    public String Success(){
        return driver.findElement(By.xpath("//a[text()='adidas Consortium Campus 80s Running Shoes']")).getText();
    }
}
