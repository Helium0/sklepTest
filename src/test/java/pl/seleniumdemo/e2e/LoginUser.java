package pl.seleniumdemo.e2e;

import org.testng.annotations.Test;
import pl.seleniumdemo.pages.LoginPage;
import pl.seleniumdemo.tests.BaseTest;

public class LoginUser extends BaseTest {

    @Test
    public void loginUserOnPage() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.logInUser("tester@gmail.com", "testerautomat");

    }
}
