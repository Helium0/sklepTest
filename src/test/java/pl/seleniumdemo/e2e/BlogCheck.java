package pl.seleniumdemo.e2e;

import org.testng.annotations.Test;
import pl.seleniumdemo.pages.BlogPage;
import pl.seleniumdemo.tests.BaseTest;

public class BlogCheck extends BaseTest {


    @Test
    public void blog() {
        BlogPage blogPage = new BlogPage(driver);
        blogPage.blogPost();
        blogPage.postsString();

    }
}
