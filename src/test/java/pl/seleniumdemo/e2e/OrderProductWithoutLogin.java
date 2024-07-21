package pl.seleniumdemo.e2e;

import org.testng.annotations.Test;
import pl.seleniumdemo.pages.CheckoutPage;
import pl.seleniumdemo.pages.PlaceOrderPage;
import pl.seleniumdemo.tests.BaseTest;

public class OrderProductWithoutLogin extends BaseTest {

    @Test
    public void orderTest() {
        PlaceOrderPage placeOrder = new PlaceOrderPage(driver);
        placeOrder.getMostWantedProducts();
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.checkoutForm();




    }

}
