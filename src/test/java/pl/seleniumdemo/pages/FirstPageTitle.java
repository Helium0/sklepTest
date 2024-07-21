package pl.seleniumdemo.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPageTitle {

    @FindBy(xpath = "//p[text()=' Just another web shop ']")
    private WebElement pageDescription;

    public FirstPageTitle(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public String getPageDescription() {
        return pageDescription.getText();
    }


}
