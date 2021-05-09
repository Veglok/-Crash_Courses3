package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class OrderSuccessPage extends BasePage{

    @FindBy (xpath = ".//*[@id = 'content']/h1")
    private WebElement successfulCheckoutMsg;

    @FindBy (xpath = ".//*[@class = 'pull-right']")
    private WebElement continueBtn;


    public WebElement getSuccessfulCheckoutMsg() {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(successfulCheckoutMsg));
        return successfulCheckoutMsg;
    }

    public WebElement getContinueBtn() {
        wait.until(ExpectedConditions.visibilityOf(continueBtn));
        return continueBtn;
    }
}
