import navigation.Navigation;
import org.testng.annotations.Test;
import steps.HeaderPageBL;
import steps.StartingPageBL;
import steps.EmptyCartPageBL;

import static enums.URLs.BASE_URL;

public class EmptyCartTest extends BaseTest {
    @Test
    public void ClickOnEmptyCart() {
        new Navigation().NavigateToURL(BASE_URL.getValue());
        StartingPageBL startingPageBL = new StartingPageBL();
        HeaderPageBL headerPageBL = startingPageBL.getHeaderPageBL();
        EmptyCartPageBL emptyCartPageBL = startingPageBL.getEmptyCartPageBL();
                headerPageBL.clickOnCartButton();
                emptyCartPageBL.yourCartIsEmpty();




    }
}
