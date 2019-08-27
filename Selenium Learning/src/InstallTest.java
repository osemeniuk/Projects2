import org.openqa.selenium.firefox.FirefoxDriver;

public class InstallTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/oksanasemeniuk/Downloads/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.seleniumhq.org");
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        driver.quit();
    }
}
