package steps;

import org.testng.Assert;
import pages.MainPage;

public class MainPageBL {
    private MainPage mainPage;

    public MainPageBL(){
        mainPage = new MainPage();
    }

    public MainPageBL clickOnAddIphoneToCartBtn() {
        mainPage.getAddIphoneToCart().click();
        return this;
    }

   public MainPageBL clickOnExpandingCartButton() {
        mainPage.getExpandingCartButton().click();
        return this;
   }
   public MainPageBL clickOnRemoveItemButton() {
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
