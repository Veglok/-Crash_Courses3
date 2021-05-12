import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.ShoppingCartPageBL;

import static enums.URLs.BASE_URL;

public class CouponTest extends BaseTest {
    @Test
    public void ValidCouponInputTest() {
        new Navigation().NavigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL()
                .clickOnAddIphoneToCartBtn();
        ShoppingCartPageBL shoppingCartPageBL = mainPageBL.getHeaderPageBL()
                .clickOnCartButton()
                .collapseCouponsTab()
                .validCouponInput()
                .clickOnApplyCouponBtn();
                shoppingCartPageBL.successfulCouponPopOutMessage();

    }

    @Test
    public void InvalidCouponMsgTest () {
        new Navigation().NavigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL()
                .clickOnAddIphoneToCartBtn();
        ShoppingCartPageBL shoppingCartPageBL = mainPageBL.getHeaderPageBL()
                .clickOnCartButton()
                .collapseCouponsTab()
                .inValidCouponInput()
                .clickOnApplyCouponBtn();
        shoppingCartPageBL.couponWarningMessage();

    }
}
