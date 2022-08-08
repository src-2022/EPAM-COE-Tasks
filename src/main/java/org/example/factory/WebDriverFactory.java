package org.example.factory;

import org.example.properties.converters.SupportedBrowserConverter;
import org.example.properties.holder.PropertyHolder;
import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
    private static WebDriver driver;

    public WebDriverFactory() {
    }

    public static WebDriver getWebDriver() {
//        String propertyValue = new PropertyHolder().readProperty("browser");
//        SupportedBrowsers browser = SupportedBrowserConverter.valueOfWebBrowser(propertyValue);
//
//        return browser.getWebDriver();
        driver = SupportedBrowserConverter.valueOfWebBrowser(
                        new PropertyHolder().readProperty("browser"))
                .getWebDriver();
        return driver;
    }
}
