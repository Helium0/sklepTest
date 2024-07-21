package pl.seleniumdemo.e2e;

import org.testng.annotations.Test;
import pl.seleniumdemo.pages.ContactPage;
import pl.seleniumdemo.tests.BaseTest;

public class ContactUser extends BaseTest {

    @Test
    public void contact() {
        ContactPage contactPage = new ContactPage(driver);
        contactPage.getAboutUs();
        contactPage.sendMessage("Patryk", "tester@gmail.com", "Order", "Hello I have a problem with my order");

    }


}
