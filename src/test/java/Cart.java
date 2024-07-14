import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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
}







