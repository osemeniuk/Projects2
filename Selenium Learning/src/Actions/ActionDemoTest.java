package Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.security.Key;

public class ActionDemoTest {
    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.gecko.driver", "/Users/oksanasemeniuk/Downloads/geckodriver");
    FirefoxDriver driver = new FirefoxDriver();
    driver.get("https://google.com");

    //locate the serch box element
        WebElement searchBox = driver.findElement(By.name("q"));
        Thread.sleep(500);

    // type search request
        searchBox.sendKeys("seleniumhq" + Keys.RETURN);
        Thread.sleep(10000);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
