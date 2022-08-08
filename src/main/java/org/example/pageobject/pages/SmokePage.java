package org.example.pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.constants.Env.BASE_URL;
import static org.example.constants.Env.CALCUALTOR_PAGE_URL;

public class SmokePage extends BasePage{
    @FindBy(xpath = "//iframe[contains(@name,'goog_')]")
    WebElement firstFrame;
    @FindBy(xpath = "//h2[text()='Google Cloud Pricing Calculator']")
    WebElement calculatorPageTitle;

    public SmokePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
public Boolean IsGoogleCloudPageTitleDisplayed(){
        driver.get(BASE_URL);
        return driver.getTitle().contains("Google Cloud");
}
    public Boolean IsCalculatorPageTitleDisplayed() throws InterruptedException {
        driver.get(CALCUALTOR_PAGE_URL);
        firstFrame.click();
        driver.switchTo().frame(firstFrame);
        driver.switchTo().frame("myFrame");
        Thread.sleep(5000);
        System.out.println(calculatorPageTitle.isDisplayed());
        return calculatorPageTitle.isDisplayed();
    }


}
