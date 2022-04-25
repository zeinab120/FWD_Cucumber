package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectDifferentCategoriesPage extends BasePage{
    public SelectDifferentCategoriesPage(WebDriver driver) {
        super(driver);
    }
By A_Category= By.xpath("//a[text()=\"Apparel \"]");
    By S_Category= By.cssSelector("a[href=\"/shoes\"]");
    private By Books_Category = By.cssSelector("a[href=\"/books\"]");
    Actions actions;

   public void Select_Category() {
       actions = new Actions(driver);
     //  clickButton(A_Category);

       }

    public void Select_SubCategory(){
        actions.moveToElement(driver.findElement(A_Category)).moveToElement(driver.findElement(S_Category)).click().build().perform();

    }
    }

  /*  public void products_related_category(){
        driver.findElement(By.tagName("h1"));
    }*/

