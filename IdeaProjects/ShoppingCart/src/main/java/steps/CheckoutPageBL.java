package steps;

import datamodel.RandomInputModel;
import pages.CheckoutPage;
import repository.RandomInputRepository;
import utils.DriverUtils;


public class CheckoutPageBL {

    private CheckoutPage checkoutPage;
    private DriverUtils driverUtils;

    public CheckoutPageBL() {
        checkoutPage = new CheckoutPage();
    }

    public void selectGuestAccCheckIn() {
        checkoutPage.getGuestAccCheck().click();
    }

    public void clickOnFirstContinueBtn() {
        checkoutPage.getFirstContinueBtn().click();
    }

    public CheckoutPageBL guestAccount() {
        RandomInputModel randomInputModel = RandomInputRepository.getRandomInputModel();
        inputFirstName(randomInputModel.getFirstName());
        inputLastName(randomInputModel.getLastName());
        inputEmail(randomInputModel.getEmail());
        inputTelephone(randomInputModel.getTelephone());
        inputFirstAddress(randomInputModel.getFirstAddress());
        inputCity(randomInputModel.getCity());
        inputPostcode(randomInputModel.getPostcode());

        checkoutPage = new CheckoutPage();
                return this;

    }

    private void inputFirstName (String FirstName) {
        checkoutPage.getFirstNameInput().clear();
        checkoutPage.getFirstNameInput().sendKeys(FirstName);
    }

    private void inputLastName (String LastName) {
        checkoutPage.getLastNameInput().clear();
        checkoutPage.getLastNameInput().sendKeys(LastName);
    }

    private void inputEmail (String Email) {
        checkoutPage.getEmailInput().clear();
        checkoutPage.getEmailInput().sendKeys(Email);
    }

    private void inputTelephone (String Telephone) {
        checkoutPage.getTelephoneInput().clear();
        checkoutPage.getTelephoneInput().sendKeys(Telephone);
    }

    private void inputFirstAddress (String FirstAddress) {
        checkoutPage.getFirstAddressInput().clear();
        checkoutPage.getFirstAddressInput().sendKeys(FirstAddress);
    }

    private void inputCity (String City) {
        checkoutPage.getCityInput().clear();
        checkoutPage.getCityInput().sendKeys(City);
    }

    private void inputPostcode (String Postcode) {
        checkoutPage.getPostcodeInput().clear();
        checkoutPage.getPostcodeInput().sendKeys(Postcode);
    }

    public CheckoutPageBL selectFromLists () {
            checkoutPage.getDrpCountryList().selectByValue("220");
            checkoutPage.getDrpRegionList().selectByValue("3493");
            return this;
        }

    public void clickOnSecondContinueBtn () {
        checkoutPage.getSecondContinueBtn().click();
    }

    public void clickOnThirdContinueBtn () {
        checkoutPage.getThirdContinueBtn().click();
    }

    public void checkTermsAgreement () {
        checkoutPage.getTermsAgreementCheckIn().click();
    }

    public void clickOnFourthContinueBtn() {
        checkoutPage.getFourthContinueBtn().click();
    }

    public void clickOnConfirmOrderBtn() {
        checkoutPage.getConfirmOrderBtn().click();
    }

}
