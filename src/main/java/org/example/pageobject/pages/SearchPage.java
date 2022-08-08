package org.example.pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage {
//    private By searchGooglePricingCalculatorPage = By.xpath("//b[text()='Google Cloud Pricing Calculator']");
@FindBy(xpath = "//b[text()='Google Cloud Pricing Calculator']")
private WebElement searchGooglePricingCalculatorPage;
    public SearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void searchAndGoToGoogleCloudPlatformPricingCalculatorPage() throws InterruptedException {
        //driver.findElement(searchGooglePricingCalculatorPage).click();
        searchGooglePricingCalculatorPage.click();
        Thread.sleep(5000);
    }

}
