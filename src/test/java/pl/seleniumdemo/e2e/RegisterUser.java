package pl.seleniumdemo.e2e;

import org.testng.annotations.Test;
import pl.seleniumdemo.pages.RegisterPage;
import pl.seleniumdemo.tests.BaseTest;

public class RegisterUser extends BaseTest {

    @Test
    public void registerUserTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.accountRegister("tester@gmail.com", "testerautomat");
    }
}
