package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverRepository {

    public static final ThreadLocal<WebDriver> DRIVERS = new ThreadLocal<>();
    private static WebDriver webdriver;

    public DriverRepository() {
    }

    public static void downloadWebDriver(){
        WebDriverManager.chromedriver().setup();
    }
    public static void InstanceWebBrowser(){
        webdriver = new ChromeDriver();
        DRIVERS.set(webdriver);
    }

    public static void closeBrowser(){
        webdriver.quit();
    }
}
