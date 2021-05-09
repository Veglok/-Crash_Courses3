import navigation.Navigation;
import org.testng.annotations.Test;
import steps.HeaderPageBL;
import steps.MainPageBL;
import steps.ShoppingCartPageBL;
import steps.StartingPageBL;

import static enums.URLs.BASE_URL;

public class TaxesTest extends BaseTest{
    @Test
    public void TaxesAndShippingTest () {
        new Navigation().NavigateToURL(BASE_URL.getValue());
        StartingPageBL startingPageBL = new StartingPageBL();
        MainPageBL mainPageBL = startingPageBL.getMainPageBL();
        HeaderPageBL headerPageBL = startingPageBL.getHeaderPageBL();
        ShoppingCartPageBL shoppingCartPageBL = startingPageBL.getShoppingCartPageBL();
                mainPageBL.clickOnAddIphoneToCartBtn();
                headerPageBL.clickOnCartButton();
                shoppingCartPageBL.collapseTaxes();
                shoppingCartPageBL.selectCountry();
                shoppingCartPageBL.selectRegion();
                shoppingCartPageBL.postCodeInput();
                shoppingCartPageBL.clickOnGetQuotesBtn();
                shoppingCartPageBL.closeShippingPopOut();
                shoppingCartPageBL.clickOnGetQuotesBtn();
                shoppingCartPageBL.checkInFlatRate();
                shoppingCartPageBL.applyShippingBtn();
                shoppingCartPageBL.successfulShippingMsg();
                shoppingCartPageBL.closePopOutWindow();
    }
}
