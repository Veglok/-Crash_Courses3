import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;


import static enums.URLs.BASE_URL;

public class RemovingFromCartTest extends BaseTest {
    @Test
    public void clickOnCart() {
        new Navigation().NavigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL()
                .clickOnAddIphoneToCartBtn()
                .scroll()
                .clickOnExpandingCartButton()
                .clickOnRemoveItemButton()
                .clickOnExpandingCartButton();
                mainPageBL.yourCartIsEmptyExp();

    }
}
