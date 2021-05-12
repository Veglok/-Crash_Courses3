import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.ShoppingCartPageBL;

import static enums.URLs.BASE_URL;


public class GiftTest extends BaseTest {
    @Test
    public void ValidGiftInputTest () {
        new Navigation().NavigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL()
                .clickOnAddIphoneToCartBtn();
        ShoppingCartPageBL shoppingCartPageBL = mainPageBL.getHeaderPageBL()
                .clickOnCartButton()
                .collapseGiftCertificates()
                .validGiftInput()
                .clickOnApplyGiftBtn();
        shoppingCartPageBL.successfulGiftPopOutMessage();

    }

    @Test
    public void InvalidGiftInputTest() {
        new Navigation().NavigateToURL(BASE_URL.getValue());

        MainPageBL mainPageBL = new MainPageBL()
                .clickOnAddIphoneToCartBtn();
        ShoppingCartPageBL shoppingCartPageBL = mainPageBL.getHeaderPageBL()
                .clickOnCartButton()
                .collapseGiftCertificates()
                .inValidGiftInput()
                .clickOnApplyGiftBtn();
        shoppingCartPageBL.giftWarningMessage();

    }

}
