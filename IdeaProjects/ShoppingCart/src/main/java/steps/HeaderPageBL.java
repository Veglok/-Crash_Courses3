package steps;
import pages.HeaderPage;

public class HeaderPageBL {
    private HeaderPage headerPage;

    public HeaderPageBL(){
    headerPage = new HeaderPage();
    }

    public HeaderPageBL clickOnCartButton() {
        headerPage.getShoppingCartButton().click();
        return this;
    }

}
