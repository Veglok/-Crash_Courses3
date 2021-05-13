import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.ShoppingCartPageBL;


import static enums.URLs.BASE_URL;

public class ContinueShoppingTest extends BaseTest {
    @Test
    public void ContinueShoppingBtnTest() {
        new Navigation().NavigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL()
                .clickOnAddIphoneToCartBtn();
        ShoppingCartPageBL shoppingCartPageBL = mainPageBL.getHeaderPageBL()
                .clickOnCartButton()
                .clickOnContinueShoppingBtn();
                mainPageBL.pageChecker();

    }
}
