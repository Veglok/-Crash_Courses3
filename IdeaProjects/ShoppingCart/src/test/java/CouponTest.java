import navigation.Navigation;
import org.testng.annotations.Test;
import steps.HeaderPageBL;
import steps.MainPageBL;
import steps.ShoppingCartPageBL;
import steps.StartingPageBL;

import static enums.URLs.BASE_URL;

public class CouponTest extends BaseTest {
    @Test
    public void ValidCouponInputTest() {
        new Navigation().NavigateToURL(BASE_URL.getValue());
        StartingPageBL startingPageBL = new StartingPageBL();
        MainPageBL mainPageBL = startingPageBL.getMainPageBL();
        HeaderPageBL headerPageBL = startingPageBL.getHeaderPageBL();
        ShoppingCartPageBL shoppingCartPageBL = startingPageBL.getShoppingCartPageBL();
                mainPageBL.clickOnAddIphoneToCartBtn();
                headerPageBL.clickOnCartButton();
                shoppingCartPageBL.collapseCouponsTab();
                shoppingCartPageBL.validCouponInput();
                shoppingCartPageBL.clickOnApplyCouponBtn();
                shoppingCartPageBL.successfulCouponPopOutMessage();

    }

    @Test
    public void InvalidCouponMsgTest () {
        new Navigation().NavigateToURL(BASE_URL.getValue());
        StartingPageBL startingPageBL = new StartingPageBL();
        MainPageBL mainPageBL = startingPageBL.getMainPageBL();
        HeaderPageBL headerPageBL = startingPageBL.getHeaderPageBL();
        ShoppingCartPageBL shoppingCartPageBL = startingPageBL.getShoppingCartPageBL();
                mainPageBL.clickOnAddIphoneToCartBtn();
                headerPageBL.clickOnCartButton();
                shoppingCartPageBL.collapseCouponsTab();
                shoppingCartPageBL.inValidCouponInput();
                shoppingCartPageBL.clickOnApplyCouponBtn();
                shoppingCartPageBL.couponWarningMessage();

    }
}
