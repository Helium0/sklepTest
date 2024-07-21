package pl.seleniumdemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CheckoutPage  {


    private WebDriver driver;

    @FindBy(id = "billing_first_name")
    private WebElement billingFirstName;

    @FindBy(id = "billing_last_name")
    private WebElement billingLastName;

    @FindBy(id = "billing_country")
    private WebElement countrySelector;

    @FindBy(id = "billing_address_1")
    private WebElement billingAdress;

    @FindBy(id = "billing_postcode")
    private WebElement billingPostCode;

    @FindBy(id = "billing_city")
    private WebElement billingCity;

    @FindBy(id = "billing_phone")
    private WebElement billingPhone;

    @FindBy(id = "billing_email")
    private WebElement billingEmail;

    @FindBy(xpath = "//div[@id='payment']//li")
    private List<WebElement> paymentOptions;

    @FindBy(id = "place_order")
    private WebElement placeOrder;

    @FindBy(css = "#order_comments")
    private WebElement comment;

    @FindBy(id = "payment_method_cod")
    private WebElement cashDelivery;

    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    public void checkoutForm() {
        billingFirstName.sendKeys("Patryk");
        billingLastName.sendKeys("Tester");
        countrySelectorMethod();
        billingAdress.sendKeys("17 Kamienna");
        billingPostCode.sendKeys("666-666");
        billingCity.sendKeys("Warszawa");
        billingPhone.sendKeys("999-999-999");
        billingEmail.sendKeys("tester@gmail.com");
        comment.click();
        comment.sendKeys("PATRYK");
        paymentSelectorMethod();
        placeOrder.click();
    }

    private void countrySelectorMethod() {
        Select select = new Select(countrySelector);
        select.selectByVisibleText("Spain");
    }

    private void paymentSelectorMethod() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(cashDelivery)).click();




    }


}
