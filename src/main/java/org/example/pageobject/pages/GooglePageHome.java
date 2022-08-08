package org.example.pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.constants.Env.BASE_URL;

public class GooglePageHome extends BasePage{
    //private By devSiteSearch = By.className("devsite-search-form");
    //private By googleSearch = By.xpath("//input[@class='devsite-search-field devsite-search-query']");

@FindBy(className = "devsite-search-form")
private WebElement devSiteSearch;
@FindBy(xpath = "//input[@class='devsite-search-field devsite-search-query']")
private WebElement textForGoogleSearch;
    public GooglePageHome(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void openGoogleCloudPage(){

        driver.get(BASE_URL);
    }

    public void clickOnSearch(){
        //driver.findElement(devSiteSearch).click();
        devSiteSearch.click();
    }

    public void googleSearch(String keyForGoogleCloud) throws InterruptedException {

//        WebElement textForGoogleSearch = driver.findElement(googleSearch);
//        textForGoogleSearch.click();
//        textForGoogleSearch.sendKeys(keyForGoogleCloud);
//        textForGoogleSearch.sendKeys(Keys.ENTER);

        textForGoogleSearch.click();
        textForGoogleSearch.sendKeys(keyForGoogleCloud);
        textForGoogleSearch.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

    }

}
