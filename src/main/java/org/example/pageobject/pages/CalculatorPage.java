package org.example.pageobject.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class CalculatorPage extends BasePage {
    //private By iframe1 = By.xpath("//iframe[contains(@name,'goog_')]");
    @FindBy(xpath = "//iframe[contains(@name,'goog_')]")
    private WebElement firstFrame;
    //private By instancesField = By.xpath("//md-input-container/child::input[@ng-model='listingCtrl.computeServer.quantity']");
    @FindBy(xpath = "//md-input-container/child::input[@ng-model='listingCtrl.computeServer.quantity']")
    private WebElement instancesField;
    //private By machineSeries = By.xpath("//md-select[@name='series']/parent::md-input-container");
    @FindBy(xpath = "//md-select[@name='series']/parent::md-input-container")
    private WebElement machineSeries;
    //private By machineModel = By.xpath("//md-option[@value='n1']");
    @FindBy(xpath = "//md-option[@value='n1']")
    private WebElement machineModel;
    //private By typeOfMachine = By.xpath("//label[text()='Machine type']/parent::md-input-container");
    @FindBy(xpath = "//label[text()='Machine type']/parent::md-input-container")
    private WebElement typeOfMachine;
    //private By typeCompute = By.xpath("//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']");
    @FindBy(xpath = "//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']")
    private WebElement typeCompute;
    //private By addGpuCheckBox = By.xpath("//md-checkbox[@aria-label='Add GPUs']");
    @FindBy(xpath = "//md-checkbox[@aria-label='Add GPUs']")
    private WebElement addGpuCheckBox;
    //private By numberOfGpus = By.xpath("//md-select[@placeholder='Number of GPUs']");
    @FindBy(xpath = "//md-select[@placeholder='Number of GPUs']")
    private WebElement numberOfGpus;
    //private By numberOfGpuModels = By.cssSelector("md-option[value='1'][class='ng-scope md-ink-ripple'][ng-disabled]");
    @FindBy(css = "md-option[value='1'][class='ng-scope md-ink-ripple'][ng-disabled]")
    private WebElement numberOfGpuModels;
    //private By gpuType = By.xpath("//md-select[@placeholder='GPU type']");
    @FindBy(xpath = "//md-select[@placeholder='GPU type']")
    private WebElement gpuType;
    //private By gpuTypeModel = By.xpath("//md-option[@value='NVIDIA_TESLA_V100']");
    @FindBy(xpath = "//md-option[@value='NVIDIA_TESLA_V100']")
    private WebElement gpuTypeModel;
    //private By localSSD = By.xpath("//md-select[@placeholder='Local SSD']");
    @FindBy(xpath = "//md-select[@placeholder='Local SSD']")
    private WebElement localSSD;
    //private By localSSDModel = By.xpath("//md-option[@ng-repeat='item in listingCtrl.dynamicSsd.computeServer'][@value='2']/div[@class='md-text ng-binding']");
    @FindBy(xpath = "//md-option[@ng-repeat='item in listingCtrl.dynamicSsd.computeServer'][@value='2']/div[@class='md-text ng-binding']")
    private WebElement localSSDModel;
    //private By dataCentreLoc = By.xpath("//md-select[@placeholder='Datacenter location']");
    @FindBy(xpath = "//md-select[@placeholder='Datacenter location']")
    private WebElement dataCentreLoc;
    //private By dataCentreLocFrankfurt = By.xpath("//md-option[@id='select_option_222']/div[@class='md-text ng-binding']");
    //@FindBy(xpath = "//md-option[@id='select_option_222']/div[@class='md-text ng-binding']")
    @FindBy(css = "md-select-menu[class='md-overflow']" +
            " md-option[value='europe-west3'][ng-repeat*='fullRegionList']")
    private WebElement dataCentreLocFrankfurt;
    //private By committedUsage = By.xpath("//md-select[@placeholder='Committed usage']");
    @FindBy(xpath = "//md-select[@placeholder='Committed usage']")
    private WebElement committedUsage;
    //private By committedUsageOneYear = By.cssSelector("div[class='md-select-menu-container md-active md-clickable'] md-option[value='1'][class='md-ink-ripple']");
    @FindBy(css = "div[class='md-select-menu-container md-active md-clickable'] md-option[value='1'][class='md-ink-ripple']")
    private WebElement committedUsageOneYear;
    //private By addEstimate = By.xpath("//button[@aria-label='Add to Estimate']");
    @FindBy(xpath = "//button[@aria-label='Add to Estimate']")
    private WebElement addEstimate;

    //For checking outputs
    private By informationInVmClassIsRegular = By.xpath("//div[contains (text(),'Provisioning model: Regular')]");
//    @FindBy(xpath = "//div[contains (text(),'Provisioning model: Regular')]")
//    private WebElement informationInVmClassIsRegular;
    private By informationInInstanceTypeIncludeN1Standard8 = By.xpath("//div[contains (text(),'Instance type: n1-standard-8')]");
//    @FindBy(xpath = "//div[contains (text(),'Instance type: n1-standard-8')]")
//    private WebElement informationInInstanceTypeIncludeN1Standard8;
    private By regionIsFrankfurt = By.xpath("//div[contains (text(),'Region: Frankfurt')]");
//    @FindBy(xpath = "//div[contains (text(),'Region: Frankfurt')]")
//    private WebElement regionIsFrankfurt;
    private By localSsdSpace2x375Gib = By.xpath("//div[contains (text(),'Local SSD: 2x375 GiB')]");
//    @FindBy(xpath = "//div[contains (text(),'Local SSD: 2x375 GiB')]")
//    private WebElement localSsdSpace2x375Gib;
    private By commitmentTermOneYear = By.xpath("//div[contains (text(),'Commitment term: 1 Year')]");
//    @FindBy(xpath = "//div[contains (text(),'Commitment term: 1 Year')]")
//    private WebElement commitmentTermOneYear;
    public CalculatorPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void fillNumberOfInstancesField(String keyValueNumberOfInstances) throws InterruptedException {

        //WebElement firstFrame = driver.findElement(iframe1);
        firstFrame.click();
        driver.switchTo().frame(firstFrame);
        driver.switchTo().frame("myFrame");
        Thread.sleep(20000);

        //driver.findElement(instancesField).sendKeys(keyValueNumberOfInstances);
        instancesField.sendKeys(keyValueNumberOfInstances);
        Thread.sleep(20000);
    }

    public void selectSeriesOfMachines() throws InterruptedException {
        machineSeries.click();
        Thread.sleep(20000);
        machineModel.click();

    }

    public void selectMachineType() throws InterruptedException {
        typeOfMachine.click();
        Thread.sleep(20000);
        typeCompute.click();
    }

    public void selectAddGpusCheckBox() throws InterruptedException {
        addGpuCheckBox.click();
        Thread.sleep(20000);

    }

    public void selectGpuType() throws InterruptedException {
        gpuType.click();
        gpuTypeModel.click();
        Thread.sleep(20000);
    }

    public void selectNumberOfGPUs() throws InterruptedException {
        numberOfGpus.click();
        Thread.sleep(20000);
        numberOfGpuModels.click();
        Thread.sleep(10000);
    }


    public void selectLocalSSD() throws InterruptedException {
        //driver.findElement(By.cssSelector("md-option[value='2'][ng-repeat*='supportedSsd']")).click();
        localSSD.click();
        Thread.sleep(10000);
        localSSDModel.click();
        Thread.sleep(10000);
    }

    public void selectDataCentreLocation() throws InterruptedException {
        dataCentreLoc.click();
        Thread.sleep(10000);
        dataCentreLocFrankfurt.click();
        Thread.sleep(10000);
    }

    public void selectCommittedUsage() throws InterruptedException {
        committedUsage.click();
        Thread.sleep(10000);
        //driver.findElement(By.xpath("//md-option[@id='select_option_151']/div[@class='md-text']")).click();
        committedUsageOneYear.click();
        Thread.sleep(10000);
    }

    public void clickAddToEstimateButton() {
        addEstimate.click();
    }


    //Checking-functions for Testing outputs

    public String checkInformationInVmClassIsRegular() {
        return driver.findElement(informationInVmClassIsRegular).getText();
    }

    public String  checkInformationInInstanceTypeIncludeN1Standard8() {
        return driver.findElement(informationInInstanceTypeIncludeN1Standard8).getText();
    }

    public void checkRegionIsFrankfurt() {
        driver.findElement(regionIsFrankfurt);
    }

    public void checkLocalSsdSpace2x375Gib() {
        driver.findElement(localSsdSpace2x375Gib);
    }

    public void checkCommitmentTermOneYear() {
        driver.findElement(commitmentTermOneYear);
    }

}
