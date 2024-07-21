package pl.seleniumdemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class BlogPage {

    WebDriver driver;

    @FindBy(id = "menu-item-163")
    private WebElement blogCategory;

    @FindBy(xpath = "//div[@id='recent-posts-2']//li")
    private List<WebElement> postsList;

    @FindBy(xpath = "//div[@class='tyche-blog-image']/img")
    private WebElement postImage;

    @FindBy(partialLinkText = "dare-try/#comments")
    private WebElement commentsLink;


    public BlogPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void blogPost() {
        blogCategory.click();
        postsList.stream().filter(webElement -> webElement.isDisplayed()).findFirst().get().click();

    }

    public void postsString() {
        List<String> eleString = postsList.stream().map(webElement -> webElement.getText()).collect(Collectors.toList());
        for (String e : eleString) {
            System.out.println(e);
        }
    }



}
