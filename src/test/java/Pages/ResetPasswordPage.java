package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResetPasswordPage extends BasePage {
    public ResetPasswordPage(WebDriver driver) {

        super(driver);
    }
RegistrationPage registerObject;



    protected By EmailToRestPassword = By.id("Email");
    protected By RecoveryBtn = By.xpath("//button[@type=\"submit\" and text()=\"Recover\"]");
    public By ResetSuccessMsg =By.xpath("//p[@class='content']");
   // protected By ForgotPassword = By.linkText("ForgotPassword");
   private By closeResetMssg =By.xpath("//span[@class=\"close\"]");

 /*   public void clickOnForgotBtn(){
        clickButton(ForgotPassword);
    }*/
    public void ResetPassword(String Email){
        SendTxtFields(EmailToRestPassword,Email);

    }

    public void clickOnRecoverBtn(){
        clickButton(RecoveryBtn);
    }

    public String reset_password_successfully(){

        return driver.findElement(ResetSuccessMsg).getText();
    }
    public void CloseResetSuccessMessage(){
        clickButton(closeResetMssg);
    }
}