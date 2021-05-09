package steps;

import org.testng.Assert;
import pages.OrderSuccessPage;

public class OrderSuccessPageBL {

    private OrderSuccessPage orderSuccessPage;

    public OrderSuccessPageBL() {
        orderSuccessPage = new OrderSuccessPage();
    }

    public void successfulCheckout() {
        String Expected = "Your order has been placed!";
        Assert.assertEquals(orderSuccessPage.getSuccessfulCheckoutMsg().getText(),
                Expected, "Wrong Message");
    }

    public void clickOnContinueBtn() {
        orderSuccessPage.getContinueBtn().click();
    }
}
