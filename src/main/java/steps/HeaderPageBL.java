package steps;
import pages.HeaderPage;

public class HeaderPageBL {
    private HeaderPage headerPage;

    public HeaderPageBL(){
    headerPage = new HeaderPage();
    }

//    public EmptyCartPageBL getEmptyCartPageBL() {
//        return new EmptyCartPageBL();
//    }

    public EmptyCartPageBL clickOnEmptyCartButton() {
        headerPage.getShoppingCartButton().click();
        return new EmptyCartPageBL();
    }

    public ShoppingCartPageBL clickOnCartButton() {
        headerPage.getShoppingCartButton().click();
        return new ShoppingCartPageBL();
    }

}
