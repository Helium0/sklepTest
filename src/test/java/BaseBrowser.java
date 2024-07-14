import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.time.Duration;

public class BaseBrowser {

    protected static WebDriver driver;

    public static WebDriver getDriver() {
        if(driver == null){
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.manage().window().maximize();
            driver.get("https://skleptest.pl/");
        }
        return driver;
    }
}
