package LocatingWebElement;
import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;


public class WikiTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/oksanasemeniuk/Downloads/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();

        // visit wiki page
        driver.get("https://en.wikipedia.org");
        // find random article + click
        driver.findElement(By.cssSelector("#n-randompage")).click();
        Thread.sleep(5000);

        // print random page title
        System.out.println(driver.getTitle());

        // print first heading
        String firstHeading = driver.findElement(By.cssSelector(".firstHeading")).getText();
        System.out.println(firstHeading);

        // view page info
        driver.findElement(By.linkText("Page information")).click();
        Thread.sleep(5000);

        // new search
        driver.findElement(By.name("search")).sendKeys("Selenium(software)" + Keys.RETURN);
        Thread.sleep(5000);

        // /html/body/div[5]/div[2]/div[1]/a
        // Xpath logo click

        String xpath = "/html/body/div[5]/div[2]/div[1]/a";
        driver.findElement(By.xpath(xpath));
        Thread.sleep(5000);

        driver.quit();
    }
}
