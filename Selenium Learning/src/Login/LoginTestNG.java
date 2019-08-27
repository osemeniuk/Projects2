package Login;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.CreateAccountPage;
import pageObjects.LoginPage;

@Test()
public class LoginTestNG {
    public String URL = "http://localhost:8000/#";
    public FirefoxDriver driver;

    @BeforeTest
    public void stup() {
        System.setProperty("webdriver.gecko.driver", "/Users/oksanasemeniuk/Downloads/geckodriver");
        driver = new FirefoxDriver();
        driver.get(URL);
    }

    @Test()
    public void testLodinSucceed() throws InterruptedException {
        //Positive case
        //Action
        LoginPage.userName(driver).sendKeys("registeredUser");
        LoginPage.password(driver).sendKeys("1234");
        LoginPage.submit(driver).click();
        Thread.sleep(5000);
        String message = LoginPage.message(driver).getText();
        String expectedMessage = "Welcome back,\n" + "registeredUser";
        Assert.assertEquals(message, expectedMessage);
    }

    @Test
    public void testLoginFail() throws InterruptedException {
        //Negative case
        //Action
        driver.get(URL);
        driver.navigate().refresh();
        LoginPage.userName(driver).sendKeys("otherUser");
        LoginPage.password(driver).sendKeys("1111");
        LoginPage.submit(driver).click();
        Thread.sleep(5000);
        String message = LoginPage.message(driver).getText();
        System.out.println(message);
        String expectedMessage = "Account not found. Please sign up by clicking the link below";
        Assert.assertEquals(message, expectedMessage);

        //Create account
        LoginPage.createAccountLink(driver).click();
        Thread.sleep(5000);
        String headerText = CreateAccountPage.header(driver).getText();
        System.out.println(headerText);
        String expectedHeader = "Create an Account";
        Assert.assertEquals(headerText, expectedHeader);
    }

    @AfterTest
    public void endSession() {
        driver.quit();
    }

}
