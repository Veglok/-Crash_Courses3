package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmptyCartPage extends BasePage{

    @FindBy (xpath = ".//*[@id = 'content']/p")
    private WebElement emptyCartMessage;

    public WebElement getEmptyCartMessage() {
        return emptyCartMessage;
    }
}
