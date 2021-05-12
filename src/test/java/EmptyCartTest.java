import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.EmptyCartPageBL;

import static enums.URLs.BASE_URL;

public class EmptyCartTest extends BaseTest {
    @Test
    public void ClickOnEmptyCart() {
        new Navigation().NavigateToURL(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        EmptyCartPageBL emptyCartPageBL = mainPageBL.getHeaderPageBL()
                .clickOnEmptyCartButton();
                emptyCartPageBL.yourCartIsEmpty();








    }
}
