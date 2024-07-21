package pl.seleniumdemo.tests;

import org.testng.annotations.Test;
import pl.seleniumdemo.pages.CheckoutPage;

public class CheckoutPageTest extends BaseTest {


    @Test
    public void checkoutPageTest() {
        CheckoutPage checkoutPageTest = new CheckoutPage(driver);
        checkoutPageTest.checkoutForm();

    }

}
