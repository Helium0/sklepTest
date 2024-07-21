package pl.seleniumdemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;


public class PlaceOrderPage {

    @FindBy(xpath = "//ul[@id='desktop-menu']/li")
    private List<WebElement> mainMenu;

    @FindBy(xpath = "//h2[text()='Rocadi Jeans']")
    private WebElement product;

    @FindBy(css = ".top-cart")
    private WebElement cart;

    @FindBy(id = "menu-item-128")
    private WebElement mostWantedProducts;

    @FindBy(name = "quantity")
    private WebElement itemQuantity;

    @FindBy(css = ".single_add_to_cart_button")
    private WebElement addProductToCart;

    @FindBy(css = "a.arrow-up")
    private WebElement increaseQuantity;

    @FindBy(xpath = "//a[text()='View cart']")
    private WebElement viewCart;

    @FindBy(css = "a.checkout-button")
    private WebElement checkoutButton;


    public PlaceOrderPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public int categoriesNumber() {
        return mainMenu.size();
    }



    public void getMostWantedProducts() {
        mostWantedProducts.click();
        product.click();
        itemQuantity.click();
        itemQuantity.clear();
        itemQuantity.sendKeys("4");
        addProductToCart.click();
        viewCart.click();
        checkoutButton.click();

    }

    public String cartValue() {
        return cart.getText();
    }

}
