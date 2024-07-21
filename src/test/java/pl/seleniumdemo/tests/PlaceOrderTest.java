package pl.seleniumdemo.tests;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pl.seleniumdemo.pages.PlaceOrderPage;

public class PlaceOrderTest extends BaseTest {

    @Test
    public void addProductToCart() {
        PlaceOrderPage placeOrder = new PlaceOrderPage(driver);
        placeOrder.getMostWantedProducts();


        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(placeOrder.categoriesNumber(), 6);
        softAssert.assertEquals(placeOrder.cartValue(), " My Cart\t\t\t\t\t\t\t\t- zł 240.00\t\t\t\t\t\t\t");
    }

    @Test
    public void proceedToCheckout() {
        PlaceOrderPage placeOrder = new PlaceOrderPage(driver);
        placeOrder.getMostWantedProducts();



    }

}
