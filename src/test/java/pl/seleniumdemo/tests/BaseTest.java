package pl.seleniumdemo.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;


public class BaseTest {

    protected static WebDriver driver;


    @BeforeMethod
    public static void setup() {
    driver = new ChromeDriver();
    driver.get("https://skleptest.pl/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public static void tearDown() {
    driver.quit();
    }

}
