package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage {

    @FindBy (xpath = ".//*[@value = 'register']")
    private WebElement registerNewAccCheck;

    @FindBy (xpath = ".//*[@value = 'guest']")
    private WebElement guestAccCheck;

    @FindBy (id = "button-account")
    private WebElement firstContinueBtn;

    @FindBy (name = "firstname")
    private WebElement firstNameInput;

    @FindBy (name = "lastname")
    private WebElement lastNameInput;

    @FindBy (id = "input-payment-email")
    private WebElement emailInput;

    @FindBy (name = "telephone")
    private WebElement telephoneInput;

    @FindBy (name = "address_1")
    private WebElement firstAddressInput;

    @FindBy (name = "city")
    private WebElement cityInput;

    @FindBy (name = "postcode")
    private WebElement postcodeInput;

    @FindBy (name = "country_id")
    private WebElement drpCountryList;

    @FindBy (name = "zone_id")
    private WebElement drpRegionList;

    @FindBy (id = "button-guest")
    private WebElement secondContinueBtn;

    @FindBy (id = "button-shipping-method")
    private WebElement thirdContinueBtn;

    @FindBy (name = "agree")
    private WebElement termsAgreementCheckIn;

    @FindBy (id = "button-payment-method")
    private WebElement fourthContinueBtn;

    @FindBy (id = "button-confirm")
    private WebElement confirmOrderBtn;


    public WebElement getRegisterNewAccCheck() {
        return registerNewAccCheck;
    }

    public WebElement getGuestAccCheck() {
        return guestAccCheck;
    }

    public WebElement getFirstContinueBtn() {
        return firstContinueBtn;
    }

    public WebElement getFirstNameInput() {
        return firstNameInput;
    }

    public WebElement getLastNameInput() {
        return lastNameInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getTelephoneInput() {
        return telephoneInput;
    }

    public WebElement getFirstAddressInput() {
        return firstAddressInput;
    }

    public WebElement getCityInput() {
        return cityInput;
    }

    public WebElement getPostcodeInput() {
        return postcodeInput;
    }

    public Select getDrpCountryList() {
        return new Select(drpCountryList);
    }

    public Select getDrpRegionList() {
        return new Select(drpRegionList);
    }

    public WebElement getSecondContinueBtn() {
        return secondContinueBtn;
    }

    public WebElement getThirdContinueBtn() {
        return thirdContinueBtn;
    }

    public WebElement getTermsAgreementCheckIn () {
        wait.until(ExpectedConditions.visibilityOf(termsAgreementCheckIn));
        return termsAgreementCheckIn;
    }

    public WebElement getFourthContinueBtn() {
        return fourthContinueBtn;
    }

    public WebElement getConfirmOrderBtn() {
        return confirmOrderBtn;
    }
}
