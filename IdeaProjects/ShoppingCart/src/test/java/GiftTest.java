import navigation.Navigation;
import org.testng.annotations.Test;
import steps.HeaderPageBL;
import steps.MainPageBL;
import steps.ShoppingCartPageBL;
import steps.StartingPageBL;

import static enums.URLs.BASE_URL;

public class GiftTest extends BaseTest {
    @Test
    public void ValidGiftInputTest () {
        new Navigation().NavigateToURL(BASE_URL.getValue());
        StartingPageBL startingPageBL = new StartingPageBL();
        MainPageBL mainPageBL = startingPageBL.getMainPageBL();
        HeaderPageBL headerPageBL = startingPageBL.getHeaderPageBL();
        ShoppingCartPageBL shoppingCartPageBL = startingPageBL.getShoppingCartPageBL();
                mainPageBL.clickOnAddIphoneToCartBtn();
                headerPageBL.clickOnCartButton();
                shoppingCartPageBL.collapseGiftCertificates();
                shoppingCartPageBL.validGiftInput();
                shoppingCartPageBL.clickOnApplyGiftBtn();
                shoppingCartPageBL.successfulGiftPopOutMessage();

    }

    @Test
    public void InvalidGiftInputTest() {
        new Navigation().NavigateToURL(BASE_URL.getValue());
        StartingPageBL startingPageBL = new StartingPageBL();
        MainPageBL mainPageBL = startingPageBL.getMainPageBL();
        HeaderPageBL headerPageBL = startingPageBL.getHeaderPageBL();
        ShoppingCartPageBL shoppingCartPageBL = startingPageBL.getShoppingCartPageBL();
        mainPageBL.clickOnAddIphoneToCartBtn();
        headerPageBL.clickOnCartButton();
        shoppingCartPageBL.collapseGiftCertificates();
        shoppingCartPageBL.inValidGiftInput();
        shoppingCartPageBL.clickOnApplyGiftBtn();
        shoppingCartPageBL.giftWarningMessage();
    }

}
