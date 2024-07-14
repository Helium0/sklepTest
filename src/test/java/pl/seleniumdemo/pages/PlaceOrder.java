package pl.seleniumdemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class PlaceOrder extends RegisterPage {

    @FindBy(xpath = "//ul[@id='desktop-menu']/li")
    private List<WebElement> mainMenu;

    @FindBy(xpath = "//h2[text()='Rocadi Jeans']")
    private WebElement product;

    @FindBy(css = ".top-cart")
    private WebElement cart;


    public PlaceOrder(WebDriver driver){
        super(driver);
    }

    public int categoriesNumber() {
        return mainMenu.size();
    }

    public List<String> menuOrder() {
         return mainMenu.stream().map(webElement -> webElement.getText()).collect(Collectors.toList());

    }

    public void getProduct() {
        mainMenu.stream().filter(webElement -> webElement.getText().equals("MOST WANTED"))
                .forEach(WebElement::click);
        product.click();
        cart.click();

    }









}
