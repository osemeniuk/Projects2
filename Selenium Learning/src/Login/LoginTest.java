package Login;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.CreateAccountPage;
import pageObjects.LoginPage;


public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/oksanasemeniuk/Downloads/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://localhost:8000/#");

        //Positive case
        //Action
        LoginPage.userName(driver).sendKeys("registeredUser");
        LoginPage.password(driver).sendKeys("1234");
        LoginPage.submit(driver).click();
        Thread.sleep(5000);
        String message = LoginPage.message(driver).getText();
        System.out.println(message);

        //Negative case
        driver.navigate().refresh();
        //Action
        LoginPage.userName(driver).sendKeys("otherUser");
        LoginPage.password(driver).sendKeys("1111");
        LoginPage.submit(driver).click();
        Thread.sleep(5000);
        String message2 = LoginPage.message(driver).getText();
        System.out.println(message2);

        //Create account

        LoginPage.createAccountLink(driver).click();
        Thread.sleep(5000);
        String headerText = CreateAccountPage.header(driver).getText();
        System.out.println(headerText);
        driver.quit();
    }
}
