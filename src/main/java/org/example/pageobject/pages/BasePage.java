package org.example.pageobject.pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class BasePage {
    protected WebDriver driver;
//    protected final String BASE_URL="https://cloud.google.com/";
    BasePage(WebDriver driver) {

        this.driver=driver;
        //PageFactory.initElements(driver, this);
    }

}
