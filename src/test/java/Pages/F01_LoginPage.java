package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class F01_LoginPage extends BasePage{
    public F01_LoginPage(WebDriver driver) {
        super(driver);
    }

    private By EmailTxtField = By.id("Email");
    private By PasswordTxtField = By.id("Password");
    //private By loginBtn = By. className("button-1 login-button");
    private By loginBtn = By. xpath("//div[@class=\"buttons\"]//button[@type=\"submit\"]");
    //div[@class="buttons"]//button[@type="submit"]
    private By successLogin=By.xpath("//a[@href=\"/customer/info\"]");
    private By logoutLink = By.className("ico-logout");




    public void User_Enters_validData(String userEmail,String password)
    {
        SendTxtFields(EmailTxtField,userEmail);
        SendTxtFields(PasswordTxtField,password);
    }
    public void click_loginBtn(){

        clickButton(loginBtn);
    }

    public void login_successfully(){

        //return driver.getCurrentUrl();
        clickButton(logoutLink);
    }

  //  public void logOutUser(){

  //  }
}
