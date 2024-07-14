package pl.seleniumdemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.seleniumdemo.pages.RegisterPage;


public class AccountRegisterTest extends BaseTest {

    @Test
    public void accountTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.accountRegister("test@gmail.com", "testerautomat");
        System.out.println(registerPage.accountText());



        Assert.assertEquals(registerPage.pageText(),"MY ACCOUNT");
    }
}
