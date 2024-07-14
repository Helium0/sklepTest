package pl.seleniumdemo.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pl.seleniumdemo.pages.LoginPage;


public class AccountLoginTest extends BaseTest {

    @Test
    public void logInTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.logInUser("test@gmail.com", "testerautomat");


        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(loginPage.getPageInfo(), "test@gmail.com");
        softAssert.assertEquals(loginPage.passwordNumbersCount(), 2);

        softAssert.assertAll();

    }

    @Test
    public void lostPassword()  {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.logInUser("test@gmail.com", "testerautomat");
        loginPage.lostPasswordAction();
        loginPage.passwordText();



    }
}
