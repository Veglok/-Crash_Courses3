import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.ShoppingCartPageBL;

import static enums.URLs.BASE_URL;


public class TaxesTest extends BaseTest{
    @Test
    public void TaxesAndShippingTest () {
        new Navigation().NavigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL()
                .clickOnAddIphoneToCartBtn();
        ShoppingCartPageBL shoppingCartPageBL = mainPageBL.getHeaderPageBL()
                .clickOnCartButton()
                .collapseTaxes()
                .selectCountry()
                .selectRegion()
                .postCodeInput()
                .clickOnGetQuotesBtn()
                .closeShippingPopOut()
                .clickOnGetQuotesBtn()
                .checkInFlatRate()
                .applyShippingBtn();
        shoppingCartPageBL.successfulShippingMsg();
        shoppingCartPageBL.closePopOutWindow();

    }
}
