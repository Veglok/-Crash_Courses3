package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class ShoppingCartPage extends BasePage {

    @FindBy (xpath = "(//input[@class = 'form-control'])")
    private WebElement changeQuantityInput;

    @FindBy (xpath = "(//button[@type = 'submit'])")
    private WebElement changeQuantityButton;

    @FindBy (xpath = ".//*[@class = 'alert alert-success alert-dismissible']")
    private WebElement successPopOutMessage;

    @FindBy (xpath = ".//*[@class = 'alert alert-danger alert-dismissible']")
    private WebElement warningPopOutMessage;

    @FindBy (xpath = ".//button[@class = 'close']")
    private WebElement closePopOutWindow;


    @FindBy (xpath = "(.//*[@class = 'btn btn-default'])[1]")
    private WebElement continueShoppingBtn;

    @FindBy (linkText = "Checkout")
    private WebElement checkoutBtn;


    @FindBy (xpath = "(.//*[contains (@href, '#collapse-coupon')])")
    private WebElement couponCollapseBtn;

    @FindBy (name = "coupon")
    private WebElement couponInput;

    @FindBy (id = "button-coupon")
    private WebElement applyCouponButton;


    @FindBy (xpath = "(.//*[contains (@href, '#collapse-shipping')])")
    private WebElement taxesCollapseBtn;

    @FindBy (xpath = "//select[@id='input-country']")
    private WebElement drpCountry;

    @FindBy (name = "zone_id")
    private WebElement drpRegionList;

    @FindBy (name = "postcode")
    private WebElement postcodeInput;

    @FindBy (id = "button-quote")
    private WebElement receiveQuotesBtn;

    @FindBy (xpath = ".//*[@type = 'radio']")
    private WebElement applyShippingCheckBox;

    @FindBy (id = "button-shipping")
    private WebElement applyShippingBtn;

    @FindBy (xpath = "//button[contains(.,'Cancel')]")
    private WebElement closeTaxesPopOut;


    @FindBy (xpath = "(.//*[contains (@href, '#collapse-voucher')])")
    private WebElement giftCertificateCollapseBtn;

    @FindBy (name = "voucher")
    private WebElement giftCertificateInput;

    @FindBy (id = "button-voucher")
    private WebElement applyCertificateBtn;


    public WebElement getChangeQuantityInput() {
        wait.until(ExpectedConditions.visibilityOf(changeQuantityInput));
        return changeQuantityInput;
    }

    public WebElement getChangeQuantityButton() {
        wait.until(ExpectedConditions.visibilityOf(changeQuantityButton));
        return changeQuantityButton;
    }

    public WebElement getSuccessPopOutMessage() {
        return successPopOutMessage;
    }

    public WebElement getWarningPopOutMessage() {
        return warningPopOutMessage;
    }

    public WebElement getClosePopOutWindow() {
        wait.until(ExpectedConditions.visibilityOf(closePopOutWindow));
        return closePopOutWindow;
    }


    public WebElement getContinueShoppingBtn() {
        wait.until(ExpectedConditions.visibilityOf(continueShoppingBtn));
        return continueShoppingBtn;
    }

    public WebElement getCheckoutBtn() {
        wait.until(ExpectedConditions.visibilityOf(checkoutBtn));
        return checkoutBtn;
    }


    public WebElement getCouponCollapseBtn() {
        wait.until(ExpectedConditions.visibilityOf(couponCollapseBtn));
        return couponCollapseBtn;
    }
    public WebElement getCouponInput() {
        return couponInput;
    }

    public WebElement getApplyCouponButton() {
        wait.until(ExpectedConditions.visibilityOf(applyCouponButton));
        return applyCouponButton;
    }


    public WebElement getTaxesCollapseBtn() {
        wait.until(ExpectedConditions.visibilityOf(taxesCollapseBtn));
        return taxesCollapseBtn;
    }

    public Select getDrpCountry() {
        return new Select(drpCountry);
    }

    public Select getRegionList() {
        return new Select(drpRegionList);
    }

    public WebElement getPostcodeInput() {
        return postcodeInput;
    }

    public WebElement getReceiveQuotesBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(receiveQuotesBtn));
        return receiveQuotesBtn;
    }

    public WebElement getApplyShippingCheckBox() {
        wait.until(ExpectedConditions.visibilityOf(applyShippingCheckBox));
        return applyShippingCheckBox;
    }

    public WebElement getApplyShippingBtn() {
        return applyShippingBtn;
    }

    public WebElement getCloseTaxesPopOut() {
        return closeTaxesPopOut;
    }


    public WebElement getGiftCertificateCollapseBtn() {
        wait.until(ExpectedConditions.visibilityOf(giftCertificateCollapseBtn));
        return giftCertificateCollapseBtn;
    }

    public WebElement getGiftCertificateInput() {
        return giftCertificateInput;
    }

    public WebElement getApplyCertificateBtn() {
        wait.until(ExpectedConditions.visibilityOf(applyCertificateBtn));
        return applyCertificateBtn;
    }
}
