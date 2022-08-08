package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.factory.WebDriverFactory;
import org.example.pageobject.pages.CalculatorPage;
import org.example.pageobject.pages.GooglePageHome;
import org.example.pageobject.pages.SearchPage;
import org.example.pageobject.pages.SmokePage;
import org.example.util.TestListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.*;

import static org.testng.Assert.assertTrue;
import static org.testng.ITestResult.FAILURE;


public class BaseTests {
    protected WebDriver driver;

    protected static GooglePageHome openPage;
    protected static SearchPage searchPage;
    protected static CalculatorPage calculatorPage;
    protected static SmokePage smokePage;

    @BeforeSuite
    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        driver = (new WebDriverFactory()).getWebDriver();
        driver.manage().window().maximize();

        openPage = new GooglePageHome(driver);
        searchPage = new SearchPage(driver);
        calculatorPage = new CalculatorPage(driver);
        smokePage = new SmokePage(driver);

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult iTestResult) {
        if(FAILURE==iTestResult.getStatus()) {
            new TestListener().saveScreenShot(driver);
        }

    }
   // @AfterTest
    public void closeDriver(){
        driver.close();
//         driver.quit();
    }

}
