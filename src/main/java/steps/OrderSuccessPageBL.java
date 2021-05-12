package steps;

import org.testng.Assert;
import pages.OrderSuccessPage;

public class OrderSuccessPageBL {

    private OrderSuccessPage orderSuccessPage;

    public OrderSuccessPageBL() {
        orderSuccessPage = new OrderSuccessPage();
    }

    public OrderSuccessPageBL successfulCheckout() {
        String Expected = "Your order has been placed!";
        Assert.assertEquals(orderSuccessPage.getSuccessfulCheckoutMsg().getText(),
                Expected, "Wrong Message");
        return this;
    }

    public MainPageBL clickOnContinueBtn() {
        orderSuccessPage.getContinueBtn().click();
        return new MainPageBL();
    }
}
