package steps;

import org.testng.Assert;
import pages.EmptyCartPage;


public class EmptyCartPageBL {

    private EmptyCartPage emptycartpage;

    public EmptyCartPageBL(){
        emptycartpage = new EmptyCartPage();
    }

    public void yourCartIsEmpty(){
        String ExpectedMessage = "Your shopping cart is empty!";
        Assert.assertEquals(emptycartpage.getEmptyCartMessage().getText(),
                ExpectedMessage, "Incorrect Message Title");
    }
}
