import navigation.Navigation;
import org.testng.annotations.Test;
import steps.*;


import static enums.URLs.BASE_URL;

public class ShoppingCartTest extends BaseTest{
    @Test
    public void shoppingCartTest() {
        new Navigation().NavigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL()
                .clickOnAddIphoneToCartBtn();
        ShoppingCartPageBL shoppingCartPageBL = mainPageBL.getHeaderPageBL()
                .clickOnCartButton()
                .selectNewQuantity()
                .clickOnChangeQuantityButton()
                .successfulQuantityChangeMessage();
        shoppingCartPageBL.closePopOutWindow();
        shoppingCartPageBL.successfulQuantityChangeNum();
        CheckoutPageBL checkoutPageBL = shoppingCartPageBL.clickOnCheckoutBtn()
                .selectGuestAccCheckIn()
                .clickOnFirstContinueBtn()
                .guestAccount()
                .selectFromLists()
                .clickOnSecondContinueBtn()
                .clickOnThirdContinueBtn()
                .checkTermsAgreement()
                .clickOnFourthContinueBtn();
        checkoutPageBL.clickOnConfirmOrderBtn();
        checkoutPageBL.dismissAlert();
        OrderSuccessPageBL orderSuccessPageBL = checkoutPageBL.secondConfirmationClick()
                .successfulCheckout();
        orderSuccessPageBL.clickOnContinueBtn();
        mainPageBL.pageChecker();

    }
}
