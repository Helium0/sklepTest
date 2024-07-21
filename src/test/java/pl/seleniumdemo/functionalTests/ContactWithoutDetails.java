package pl.seleniumdemo.functionalTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pl.seleniumdemo.pages.ContactPage;
import pl.seleniumdemo.tests.BaseTest;

import java.util.List;
import java.util.stream.Collectors;

public class ContactWithoutDetails extends BaseTest {

    @Test
    public void contactNoDetails() {
        ContactPage contactPage = new ContactPage(driver);
        contactPage.getAboutUs();
        contactPage.sendMessage();

        List<String> errors = driver.findElements(By.xpath("//span[text()='The field is required.']"))
              .stream().map(WebElement::getText).collect(Collectors.toList());

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(errors.contains("The field is required."));
        softAssert.assertEquals(errors.size(), 2);

        softAssert.assertAll();
    }
}
