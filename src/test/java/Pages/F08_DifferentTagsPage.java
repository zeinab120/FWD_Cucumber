package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class F08_DifferentTagsPage extends BasePage{
    public F08_DifferentTagsPage(WebDriver driver) {
        super(driver);
    }

    By Tags= By.xpath("//a[text()=\"awesome\"]");
    By TagMess=By.tagName("h1");//Products tagged with 'awesome'
    By ComputerTag= By.xpath("//a[text()=\"computer\"]");
    By TagMess2=By.tagName("h1");

public void Select_tags(){
    clickButton(Tags);
}
public String Success(){
    return driver.findElement(TagMess).getText();
}
    public void Select_anotherTag(){
    clickButton(ComputerTag);
    }

    public String Success2(){
        return driver.findElement(TagMess2).getText();
    }
}


