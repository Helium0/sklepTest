package pl.seleniumdemo.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPageTitle extends RegisterPage {

    @FindBy(xpath = "//p[text()=' Just another web shop ']")
    private WebElement pageDescription;

    public FirstPageTitle(WebDriver driver) {
        super(driver);
    }


    public String getPageDescription() {
        return pageDescription.getText();
    }


}
