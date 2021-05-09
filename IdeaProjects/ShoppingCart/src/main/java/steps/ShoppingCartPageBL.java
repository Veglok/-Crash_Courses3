package steps;

import datamodel.QuantityModel;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import pages.ShoppingCartPage;
import repository.ChangeQuantityRepository;


public class ShoppingCartPageBL {
    private ShoppingCartPage shoppingcartpage;

    public ShoppingCartPageBL(){
        shoppingcartpage = new ShoppingCartPage();
    }

    public ShoppingCartPageBL selectNewQuantity() {
        QuantityModel quantityModel = ChangeQuantityRepository.getQuantityModel();
        inputNewQuantity(quantityModel.getChangeQuantity());

        shoppingcartpage = new ShoppingCartPage();
                return this;
    }

    private void inputNewQuantity (String ChangeQuantity) {
        shoppingcartpage.getChangeQuantityInput().clear();
        shoppingcartpage.getChangeQuantityInput().sendKeys(ChangeQuantity);
    }

    public ShoppingCartPageBL clickOnChangeQuantityButton() {
        shoppingcartpage.getChangeQuantityButton().click();
        return new ShoppingCartPageBL();
    }

    public void successfulQuantityChangeMessage() {
        String Expected =  "Success: You have modified your shopping cart!" + "\n×";
        Assert.assertEquals(shoppingcartpage.getSuccessPopOutMessage()
                        .getText(), Expected, "Incorrect Message Title");
    }

    public void successfulQuantityChangeNum() {
        Assert.assertEquals(shoppingcartpage.getChangeQuantityInput(),
                shoppingcartpage.getChangeQuantityInput(),
                 "Incorrect Message Title");
    }

    public ShoppingCartPageBL closePopOutWindow() {
        shoppingcartpage.getClosePopOutWindow().click();
        return this;
    }


    public ShoppingCartPageBL clickOnContinueShoppingBtn() {
        shoppingcartpage.getContinueShoppingBtn().click();
        return this;
    }

    public void clickOnCheckoutBtn() {
        shoppingcartpage.getCheckoutBtn().click();
    }


    public ShoppingCartPageBL collapseCouponsTab() {
        shoppingcartpage.getCouponCollapseBtn().click();
        return this;
    }

    public void validCouponInput() {
        shoppingcartpage.getCouponInput().click();
        shoppingcartpage.getCouponInput().sendKeys("1111");
    }

    public void inValidCouponInput() {
        shoppingcartpage.getCouponInput().click();
        shoppingcartpage.getCouponInput().sendKeys("11");
    }

    public ShoppingCartPageBL clickOnApplyCouponBtn() {
        shoppingcartpage.getApplyCouponButton().click();
        return this;
    }

    public void successfulCouponPopOutMessage() {
        String Expected = "Success: Your coupon discount has been applied!" + "\n×";
        Assert.assertEquals(shoppingcartpage.getSuccessPopOutMessage()
        .getText(), Expected, "Incorrect Message");
    }

    public void couponWarningMessage() {
        String Expected = "Warning: Coupon is either invalid, expired or " +
                "reached its usage limit!" + "\n×";
        Assert.assertEquals(shoppingcartpage.getWarningPopOutMessage()
        .getText(), Expected, "Wrong Message");
    }


    public ShoppingCartPageBL collapseTaxes() {
        shoppingcartpage.getTaxesCollapseBtn().click();
        return this;
    }

    public ShoppingCartPageBL selectCountry() {
        shoppingcartpage.getDrpCountry().selectByValue("22");
        return this;
    }

    public ShoppingCartPageBL selectRegion() {
        shoppingcartpage.getRegionList().selectByValue("359");
        return this;
    }

    public void postCodeInput () {
        shoppingcartpage.getPostcodeInput().click();
        shoppingcartpage.getPostcodeInput().sendKeys(RandomStringUtils
                .randomNumeric(1,4));
    }

    public ShoppingCartPageBL clickOnGetQuotesBtn() {
        shoppingcartpage.getReceiveQuotesBtn().click();
        return this;
    }

    public ShoppingCartPageBL checkInFlatRate() {
        shoppingcartpage.getApplyShippingCheckBox().click();
        return this;
    }

    public ShoppingCartPageBL applyShippingBtn() {
        shoppingcartpage.getApplyShippingBtn().click();
        return this;
    }

    public void closeShippingPopOut () {
        shoppingcartpage.getCloseTaxesPopOut().click();
    }

    public void successfulShippingMsg() {
        String Expected = "Success: Your shipping estimate has been applied!" + "\n×";
        Assert.assertEquals(shoppingcartpage.getSuccessPopOutMessage()
                .getText(), Expected, "Incorrect Message");
    }


    public ShoppingCartPageBL collapseGiftCertificates() {
        shoppingcartpage.getGiftCertificateCollapseBtn().click();
        return this;
    }

    public void validGiftInput() {
        shoppingcartpage.getGiftCertificateInput().click();
        shoppingcartpage.getGiftCertificateInput().sendKeys("gift");
    }

    public void inValidGiftInput() {
        shoppingcartpage.getGiftCertificateInput().click();
        shoppingcartpage.getGiftCertificateInput().sendKeys("gif");
    }

    public ShoppingCartPageBL clickOnApplyGiftBtn() {
        shoppingcartpage.getApplyCertificateBtn().click();
        return this;
    }

    public void successfulGiftPopOutMessage() {
        String Expected = "Success: Your gift certificate discount has been applied!" + "\n×";
        Assert.assertEquals(shoppingcartpage.getSuccessPopOutMessage()
                .getText(), Expected, "Incorrect Message");
    }

    public void giftWarningMessage() {
        String Expected = "Warning: Gift Certificate is either invalid " +
                "or the balance has been used up!" + "\n×";
        Assert.assertEquals(shoppingcartpage.getWarningPopOutMessage()
                .getText(), Expected, "Wrong Message");
    }

}
