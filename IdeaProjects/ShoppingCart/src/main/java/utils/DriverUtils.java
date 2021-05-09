package utils;

import driver.DriverRepository;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class DriverUtils {

    private WebDriver driver;
    private WebDriverWait waitFor;

    public DriverUtils() {
        driver = DriverRepository.DRIVERS.get();
        waitFor = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }
    public void clickOnWebElementsJS(WebElement WebElement){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getJSExecutor().executeScript("arguments[0].click();", WebElement);
    }

    public void driverAlert() {
        waitFor.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }


    private JavascriptExecutor getJSExecutor(){
        return (JavascriptExecutor) driver;
    }

}
