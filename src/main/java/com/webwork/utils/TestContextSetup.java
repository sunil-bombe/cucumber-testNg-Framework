package com.webwork.utils;

import com.webwork.pages.PageObjectManager;
import org.openqa.selenium.WebDriver;

public class TestContextSetup {
    public WebDriver driver;
    public PageObjectManager pageObjectManager;
    public WebDriverManager webDriverManager;
    public GenericUtils genericUtils;

    public TestContextSetup() {
        webDriverManager = new WebDriverManager();
        driver = webDriverManager.getWebDriver();
        pageObjectManager = new PageObjectManager(webDriverManager.getWebDriver());
        genericUtils = new GenericUtils(driver);
    }

}
