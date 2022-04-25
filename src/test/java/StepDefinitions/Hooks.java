package StepDefinitions;
import Pages.HomePage;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.BrowserUtils;

public class Hooks {
    public static WebDriver driver;
    public static HomePage homeObject;

    @BeforeAll
    public static void user_opens_chrome_browser()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        BrowserUtils.waitFor(3);
        driver.manage().window().maximize();
        BrowserUtils.waitFor(3);
        driver.navigate().to("https://demo.nopcommerce.com/");
        homeObject =new HomePage(driver);


    }
   @AfterAll
    public static void CloseDriver(){
BrowserUtils.waitFor(3);
        driver.quit();
    }
}
