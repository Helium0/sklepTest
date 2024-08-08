import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class Cart extends BaseBrowser {


    @Test
    public void getShop() {
        driver = BaseBrowser.getDriver();
        List<WebElement> menuList2 = driver.findElements(By.xpath("//ul[@id='desktop-menu']/li"));
        menuList2.stream().filter(webElement -> webElement.getText().equals("MOST WANTED"))
                .forEach(webElement -> webElement.click());

//        driver.findElement(By.linkText("Most Wanted")).click();
//        driver.findElement(By.id("menu-item-128")).click();

//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertEquals(menuList2.size(), 6);
//        softAssert.assertEquals(menuList2.get(1), "MOST WANTED");
//        softAssert.assertEquals(menuList2.get(2), "CATEGORIES");
//
//
//
//
//        softAssert.assertAll();
    }
        @Test
        public void testok () {
            driver = BaseBrowser.getDriver();
            driver.findElement(By.id("menu-item-128")).click();
            driver.findElement(By.xpath("//h2[text()='Rocadi Jeans']")).click();
            WebElement el = driver.findElement(By.name("quantity"));
            el.click();
            el.clear();
            el.sendKeys("2");
            driver.findElement(By.name("add-to-cart")).click();
            driver.findElement(By.xpath("//a[text()='View cart']")).click();


        }

        @Test
        public void checkout() {
        driver = BaseBrowser.getDriver();
        WebElement element = driver.findElement(By.cssSelector("select"));
        Select select = new Select(element);
        select.selectByValue("volvo");
        }

        @Test
        public void website() {
        driver = BaseBrowser.getDriver();
        List <WebElement> elements = driver.findElements(By.xpath("//form/input[@type='radio']"));
//        List <String > stringEl = elements.stream().map(webElement -> webElement.getText()).collect(Collectors.toList());
//            System.out.println(stringEl.size());
//            System.out.println(stringEl.get(2));
            System.out.println(elements.size());
        }

    }








