package org.example.util;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.example.BaseTests;
import org.example.factory.WebDriverFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import static org.testng.ITestResult.FAILURE;

public class TestListener{
//Logger log = LogManager.getRootLogger();



    public void saveScreenShot(WebDriver driver) {
        //TakesScreenshot ts = (TakesScreenshot) WebDriverFactory.getWebDriver();
       TakesScreenshot ts = (TakesScreenshot) driver;
        try {

            FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File(".//TFolder/screenshots/" + getCurrentTimeAsString() + ".png"));
        } catch (WebDriverException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String getCurrentTimeAsString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
        return ZonedDateTime.now().format(formatter);
    }

//    public static void main(String[] args) {
//        new TestListener().saveScreenShot(WebDriverFactory.getWebDriver());
//    }

}
