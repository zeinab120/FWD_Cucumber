package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver driver) {
        super(driver);
    }


    By ProductSearchTxtfield = By.id("small-searchterms");
    By searchButton = By.cssSelector("button[class=\"button-1 search-box-button\"]");
    By searchAssert = By.cssSelector("h2[class=\"product-title\"] a");
    //------------------------------------------------------------------------------//

  /*  public void Search_field()
    {
        // Locate search field and click on it //
        clickButton(searchField);
    }
*/
    public void User_Search_productsName(String productName)
        {
            // Search for a product //
            SendTxtFields(ProductSearchTxtfield, productName);
        }
        public void Click_searchBtn(){
        clickButton(searchButton);
        }
    public void user_Could_find_relative_results()
    {
        int count = driver.findElements(By.cssSelector
                ("h2[class=\"product-title\"] a")).size();
        ArrayList ProductList = new ArrayList<>();
        // findelements     [webelement0, webelement1]
        for (int x = 0; x < count ; x++) {
            System.out.println(driver.findElements(searchAssert).get(x).getText());
            ProductList.add(driver.findElements(searchAssert).get(x).getText());
            Assert.assertTrue(driver.findElements(searchAssert).get(x).getText().toUpperCase().contains("HTC"),
                    "Error Message: Product Not Found");
        }
        System.out.println(ProductList);
    }
}
