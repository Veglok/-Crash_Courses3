package steps;

import org.testng.Assert;
import pages.MainPage;
import utils.DriverUtils;

public class MainPageBL {
    private MainPage mainPage;

    public MainPageBL(){
        mainPage = new MainPage();
    }

    public HeaderPageBL getHeaderPageBL(){
        return new HeaderPageBL();
    }

    public MainPageBL clickOnAddIphoneToCartBtn() {
        mainPage.getAddIphoneToCart().click();
        return this;
    }

    public MainPageBL scroll() {
        new DriverUtils().scrollPage(mainPage.getExpandingCartButton());
        return this;
    }


    public MainPageBL clickOnExpandingCartButton(){
        new DriverUtils().clickOnWebElementsJS(mainPage.getExpandingCartButton());
        return this;
    }

    public MainPageBL clickOnRemoveItemButton(){
        mainPage.getRemoveFromCartButton().click();
        return this;
    }

    public void yourCartIsEmptyExp() {
        String ExpectedMessage = "Your shopping cart is empty!";
        Assert.assertEquals(mainPage.getEmptyCartMessageExp().getText(),
                ExpectedMessage, "Incorrect Message Title");
    }

    public void pageChecker() {
        Assert.assertTrue(mainPage.getTextFeatured().isDisplayed());
    }


}
