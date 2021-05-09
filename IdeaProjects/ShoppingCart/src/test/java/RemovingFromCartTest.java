import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.StartingPageBL;

import static enums.URLs.BASE_URL;

public class RemovingFromCartTest extends BaseTest {
    @Test
    public void ClickOnCart() {
        new Navigation().NavigateToURL(BASE_URL.getValue());
        StartingPageBL startingPageBL = new StartingPageBL();
        MainPageBL mainPageBL = startingPageBL.getMainPageBL();
                mainPageBL.clickOnAddIphoneToCartBtn();
                mainPageBL.clickOnExpandingCartButton();
                mainPageBL.clickOnRemoveItemButton();
                mainPageBL.clickOnExpandingCartButton();
                mainPageBL.yourCartIsEmptyExp();

    }

}
