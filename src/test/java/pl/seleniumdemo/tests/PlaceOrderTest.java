package pl.seleniumdemo.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pl.seleniumdemo.pages.PlaceOrder;

public class PlaceOrderTest extends BaseTest {

    @Test
    public void orderTest() {
        PlaceOrder placeOrder = new PlaceOrder(driver);
        System.out.println(placeOrder.categoriesNumber());
//        System.out.println(placeOrder.menuOrder());
        placeOrder.getProduct();


        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(placeOrder.categoriesNumber(), 6);
    }



}
