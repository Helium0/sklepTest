package pl.seleniumdemo.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pl.seleniumdemo.pages.FirstPageTitle;

public class FirstPageTitleTest extends BaseTest {


    @Test
    public void pageTest() {
        FirstPageTitle firstPage = new FirstPageTitle(driver);

        Assert.assertEquals(firstPage.getPageDescription(),"Just another web shop");
    }
}
