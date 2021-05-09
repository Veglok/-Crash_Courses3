package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.DriverUtils;

import java.util.concurrent.TimeUnit;


public class HeaderPage extends BasePage{
    private DriverUtils driverUtils;

    @FindBy (xpath = ".//*[@title = 'Shopping Cart']")
    private WebElement shoppingCartButton;


    public WebElement getShoppingCartButton(){
        wait.until(ExpectedConditions.visibilityOf(shoppingCartButton));
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        return shoppingCartButton;
    }

}
