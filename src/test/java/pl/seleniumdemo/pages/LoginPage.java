package pl.seleniumdemo.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class LoginPage extends RegisterPage {


    @FindBy(id = "username")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(name = "login")
    private WebElement loginButton;

    @FindBy(xpath = "//strong[text()='test@gmail.com']")
    private WebElement errorInfo;

    @FindBy(xpath = "//a[text()='Lost your password?']")
    private List<WebElement> lostPasswordElement;

    @FindBy(xpath = "//p[contains(text(),'You will receive a link to create a new password via email.')]")
    private WebElement resetPasswordText;



    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void logInUser(String userEmail, String userPassword) {
        searchAccount.click();
        email.sendKeys(userEmail);
        password.sendKeys(userPassword);
        loginButton.click();

    }

    public String getPageInfo() {
        return errorInfo.getText();

    }

    public int passwordNumbersCount() {
        int number = 0;
        for (WebElement element : lostPasswordElement) {
            if(element.getText().equals("Lost your password?")){
                number ++;
            }
        }
        return number;

    }

    public void lostPasswordAction() {


    }

    public void passwordText() {
        System.out.println(resetPasswordText.getText());
    }




}
