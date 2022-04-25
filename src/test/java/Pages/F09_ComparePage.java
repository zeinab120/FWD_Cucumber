package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class F09_ComparePage extends BasePage {
    public F09_ComparePage(WebDriver driver) {
        super(driver);
    }


    //------------------------------------------------------------------------------//
    //By Product1=By.xpath("//a[text()=\"Samsung Series 9 NP900X4C Premium Ultrabook\"]");
    By Product1=By.xpath("//a[text()=\"HTC One M8 Android L 5.0 Lollipop\"]");
    By CompareBtn= By.xpath("//button[text()=\"Add to compare list\"]");
    By CompareLink = By.xpath("//a[text()=\"product comparison\"]");
    By compareProd1POM = By.xpath("//div[@class=\"item-grid\"]/div[1]/div[1]/div[2]/div[3]/div[2]/button[2]");
    By compareProd1AsserPOM = By.xpath("//p[@class=\"content\"]");
    By compareProd2POM = By.xpath("//div[@class=\"item-grid\"]/div[2]/div[1]/div[2]/div[3]/div[2]/button[2]");
    By compareProd2AsserPOM = By.xpath("//p[@class=\"content\"]");

    ;
    By compareCheckPOM = By.cssSelector("a[class=\"picture\"]");

SearchPage searchObject;
    //------------------------------------------------------------------------------//

    public void compareProd1Ele() {
        // Add product_1 to Compare list //
        searchObject=new SearchPage(driver);
        searchObject.User_Search_productsName("Htc");
        searchObject.Click_searchBtn();
        searchObject.user_Could_find_relative_results();
        clickButton(Product1);
        clickButton(CompareBtn);
        // Assertion product_1 //
       // Assert.assertTrue(driver.findElement(compareProd1AsserPOM).isDisplayed());
    }
    //------------------------------------------------------------------------------//

    public void compareProd2Ele() {
        // Add product_2 to Compare list //
        driver.findElement(compareProd2POM).click();
        // Assertion product_2 //
        Assert.assertTrue(driver.findElement(compareProd2AsserPOM).isDisplayed());
    }
    //------------------------------------------------------------------------------//


   public void compareLink() {
        // Go to Compare products list //
        clickButton(CompareLink);
    }
    public void compareCheckEle()
    {
        // Check Compare products table //
        int count = driver.findElements(compareCheckPOM).size();
        Assert.assertTrue(count > 0);

        for (int x = 0; x < count ; x++) {
            System.out.println(driver.findElements(compareCheckPOM).get(x).isDisplayed());
            Assert.assertTrue(driver.findElements(compareCheckPOM).get(x).isDisplayed());
        }
    }
}