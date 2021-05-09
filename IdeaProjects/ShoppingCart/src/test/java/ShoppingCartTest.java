import navigation.Navigation;
import org.testng.annotations.Test;
import pages.BasePage;
import steps.*;
import utils.DriverUtils;


import static enums.URLs.BASE_URL;

public class ShoppingCartTest extends BaseTest{
    @Test
    public void ChangeQuantityTest() {
        new Navigation().NavigateToURL(BASE_URL.getValue());
        StartingPageBL startingPageBL = new StartingPageBL();
        MainPageBL mainPageBL = startingPageBL.getMainPageBL();
        HeaderPageBL headerPageBL = startingPageBL.getHeaderPageBL();
        ShoppingCartPageBL shoppingCartPageBL = startingPageBL.getShoppingCartPageBL();
                mainPageBL.clickOnAddIphoneToCartBtn();
                headerPageBL.clickOnCartButton();
                shoppingCartPageBL.selectNewQuantity();
                shoppingCartPageBL.clickOnChangeQuantityButton();
                shoppingCartPageBL.successfulQuantityChangeMessage();
                shoppingCartPageBL.closePopOutWindow();
                shoppingCartPageBL.successfulQuantityChangeNum();

    }
    @Test
    public void CheckoutTest() {
        new Navigation().NavigateToURL(BASE_URL.getValue());
        StartingPageBL startingPageBL = new StartingPageBL();
        MainPageBL mainPageBL = startingPageBL.getMainPageBL();
        BasePage basePage = startingPageBL.getBasePage();
        DriverUtils driverUtils = startingPageBL.getDriverUtils();
        ShoppingCartPageBL shoppingCartPageBL = startingPageBL.getShoppingCartPageBL();
        CheckoutPageBL checkoutPageBL = startingPageBL.getCheckoutPageBL();
        OrderSuccessPageBL orderSuccessPageBL = startingPageBL.getOrderSuccessPageBL();
                shoppingCartPageBL.clickOnCheckoutBtn();
                checkoutPageBL.selectGuestAccCheckIn();
                checkoutPageBL.clickOnFirstContinueBtn();
                checkoutPageBL.guestAccount();
                checkoutPageBL.selectFromLists();
                checkoutPageBL.clickOnSecondContinueBtn();
                checkoutPageBL.clickOnThirdContinueBtn();
                checkoutPageBL.checkTermsAgreement();
                checkoutPageBL.clickOnFourthContinueBtn();
                checkoutPageBL.clickOnConfirmOrderBtn();
                driverUtils.driverAlert();
                checkoutPageBL.clickOnConfirmOrderBtn();
                orderSuccessPageBL.successfulCheckout();
                orderSuccessPageBL.clickOnContinueBtn();
                mainPageBL.pageChecker();

    }
}
