package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class MainPage extends BasePage {


    @FindBy (xpath = "(//button[@type = 'button'])[10]")
    private WebElement addIphoneToCart;

    @FindBy (xpath = ".//*[@id = 'cart-total']")
    private WebElement expandingCartButton;

    @FindBy (xpath = ".//*[@title = 'Remove']")
    private WebElement removeFromCartButton;

    @FindBy (xpath = ".//*[@class = 'text-center']")
    private WebElement emptyCartMessageExp;


    @FindBy (xpath = ".//*[@id = 'content']/h3")
    private WebElement textFeatured;



    public WebElement getAddIphoneToCart(){
        wait.until(ExpectedConditions.visibilityOf(addIphoneToCart));
        return addIphoneToCart;
    }

    public WebElement getExpandingCartButton(){
        wait.until(ExpectedConditions.visibilityOf(expandingCartButton));
        return expandingCartButton;
    }

    public WebElement getRemoveFromCartButton(){
        wait.until(ExpectedConditions.visibilityOf(removeFromCartButton));
        return removeFromCartButton;
    }

    public WebElement getEmptyCartMessageExp() {
        wait.until(ExpectedConditions.visibilityOf(emptyCartMessageExp));
        return emptyCartMessageExp;
    }

    public WebElement getTextFeatured() {
        return textFeatured;
    }


}
