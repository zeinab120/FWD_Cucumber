package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    ////Find elements of registration page
    private By GenderRadioButton = By.id("gender-female");
    private By FirstNameTxtField = By.id("FirstName");
    private By LastNameTxtField = By.id("LastName");
    protected By EmailTxtField = By.id("Email");
    private By PasswordTxtField = By.id("Password");
    private By ConfirmPassword = By.id("ConfirmPassword");
    private By registerBtn = By.id("register-button");
    private By resRegisterSuccessMssg = By.className("result");
    private By logoutLink = By.className("ico-logout");


    public void UserRegisteration(String FirstName, String LastName, String Email, String Password) {
        clickButton(GenderRadioButton);
        SendTxtFields(FirstNameTxtField, FirstName);
        SendTxtFields(LastNameTxtField, LastName);
        SendTxtFields(EmailTxtField, Email);
        SendTxtFields(PasswordTxtField, Password);
        SendTxtFields(ConfirmPassword, Password);
    }

    public void Click_register_button() {
        clickButton(registerBtn);
    }

    public String resRegisterSuccessMssg() {

        return driver.findElement(resRegisterSuccessMssg).getText();
    }

    public void RegisteredUserCanLogout(){
        clickButton(logoutLink);

    }
}






