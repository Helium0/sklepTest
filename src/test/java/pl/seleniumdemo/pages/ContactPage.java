package pl.seleniumdemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class ContactPage {

    WebDriver driver;

    @FindBy(xpath = "//input[@name='your-name']")
    private WebElement contactName;

    @FindBy(name = "your-email")
    private WebElement contactEmail;

    @FindBy(name = "your-subject")
    private WebElement contactSubject;

    @FindBy(name = "your-message")
    private WebElement contactMessage;

    @FindBy(xpath = "//input[@value='Send']")
    private WebElement contactSendButton;

    @FindBy(xpath = "//ul[@id='desktop-menu']/li")
    private List<WebElement> mainMenu;

    @FindBy(id = "menu-item-108")
    private WebElement contactUs;


    public ContactPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void getAboutUs() {
        contactUs.click();
    }


    public void sendMessage(String name, String email, String subject, String messageToSend) {
        contactName.sendKeys(name);
        contactEmail.sendKeys(email);
        contactSubject.sendKeys(subject);
        contactMessage.sendKeys(messageToSend);
        contactSendButton.click();
    }

    public void sendMessage() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        contactSendButton.click();
    }


}
