package steps;

import pages.BasePage;
import utils.DriverUtils;

public class StartingPageBL {

    public HeaderPageBL getHeaderPageBL() {
        return new HeaderPageBL();
    }

    public EmptyCartPageBL getEmptyCartPageBL() {
        return new EmptyCartPageBL();
    }

    public MainPageBL getMainPageBL() {
        return new MainPageBL();
    }

    public ShoppingCartPageBL getShoppingCartPageBL() {
        return new ShoppingCartPageBL();
    }

    public CheckoutPageBL getCheckoutPageBL() {
        return new CheckoutPageBL();
    }

    public OrderSuccessPageBL getOrderSuccessPageBL() {
        return new OrderSuccessPageBL();
    }

    public BasePage getBasePage() {
        return new BasePage();
    }

    public DriverUtils getDriverUtils() {
        return new DriverUtils();
    }


}
