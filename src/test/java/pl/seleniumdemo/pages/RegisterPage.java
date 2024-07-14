package pl.seleniumdemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegisterPage {

    @FindBy(css = ".top-account" )
    protected WebElement searchAccount;

    @FindBy(id = "reg_email" )
    private WebElement idEmail;

    @FindBy(id = "reg_password" )
    private WebElement password;

    @FindBy(name = "register" )
    private WebElement registerButton;

    @FindBy(xpath = "//h1[text()='My account']")
    private WebElement pageHeader;

    @FindBy(xpath = "//strong[contains(text(),'test')]")
    private WebElement testText;


    public void accountRegister(String userEmail, String accPassword) {
        searchAccount.click();
        idEmail.sendKeys(userEmail);
        password.sendKeys(accPassword);
        registerButton.click();
    }


    public String pageText() {
        return pageHeader.getText();
    }

    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String accountText() {
        return testText.getText();
    }

}
