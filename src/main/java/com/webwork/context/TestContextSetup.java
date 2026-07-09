package com.webwork.context;

import com.webwork.pages.PageObjectManager;
import com.webwork.utils.AutomationUtils;
import com.webwork.utils.GenericUtils;
import com.webwork.utils.PropertyFileUtils;
import com.webwork.utils.UtilsManager;
import com.webwork.utils.WebDriverManager;
import java.io.IOException;
import org.openqa.selenium.WebDriver;

public class TestContextSetup {
    public PropertyFileUtils propertyFileUtils;
    public WebDriver driver;
    public PageObjectManager pageObjectManager;
    public WebDriverManager webDriverManager;
    public UtilsManager utilsManager;

    public TestContextSetup() throws IOException {
        propertyFileUtils = new PropertyFileUtils();
        webDriverManager = new WebDriverManager(propertyFileUtils);
        driver = webDriverManager.getWebDriver();
        utilsManager = new UtilsManager(webDriverManager.getWebDriver());
        pageObjectManager = new PageObjectManager(webDriverManager.getWebDriver(),utilsManager);
    }

}
