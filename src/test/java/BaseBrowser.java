import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import java.time.Duration;

public class BaseBrowser {

    protected static WebDriver driver;

    public static WebDriver getDriver() {
        if(driver == null){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        }
        return driver;
    }

//    public static WebDriver getDriver() {
//        if(driver == null){
//            driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.get("https://skleptest.pl/checkout/");
//        }
//        return driver;
//    }


}
