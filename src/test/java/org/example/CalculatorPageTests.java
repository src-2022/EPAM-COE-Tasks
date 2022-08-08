package org.example;

import org.example.services.CalculatorModelCreator;
import org.example.services.TestDataCreator;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CalculatorPageTests extends BaseTests {
    @Test
    public void CalculatorPageTestDev() throws Exception {
        openPage.openGoogleCloudPage();
        // Assert.assertTrue(false);
        openPage.clickOnSearch();
        openPage.googleSearch("Google Cloud Platform Pricing Calculator");

        searchPage.searchAndGoToGoogleCloudPlatformPricingCalculatorPage();

//        calculatorPage.fillNumberOfInstancesField(
//                new CalculatorModelCreator().Model().getNumberOfInstancesField()
        calculatorPage.fillNumberOfInstancesField(new TestDataCreator().getCalculatorData().getNumberOfInstancesField());
        //calculatorPage.fillNumberOfInstancesField("4");
        calculatorPage.selectSeriesOfMachines();
        calculatorPage.selectMachineType();
        calculatorPage.selectAddGpusCheckBox();
        calculatorPage.selectGpuType();
        calculatorPage.selectNumberOfGPUs();
        calculatorPage.selectLocalSSD();
        calculatorPage.selectDataCentreLocation();
        calculatorPage.selectCommittedUsage();
        calculatorPage.clickAddToEstimateButton();

    }

    @Test
    public void checkInformationInVmClassString() {
        calculatorPage.checkInformationInVmClassIsRegular();
        //Assert.assertTrue(false);

    }

    @Test
    public void checkInformationInInstanceTypeString() throws Exception {
        calculatorPage.checkInformationInInstanceTypeIncludeN1Standard8();
       // String actualValue = calculatorPage.checkInformationInInstanceTypeIncludeN1Standard8();
       // System.out.println(actualValue);
        //String expectedValue = new CalculatorModelCreator().Model().getSelectMachineType();
        //System.out.println("Actual:" + actualValue + " ,Expected" + expectedValue);
        //Assert.assertTrue(actualValue.contains(expectedValue));
    }

    @Test
    public void checkRegion() {
        calculatorPage.checkRegionIsFrankfurt();
    }

    @Test
    public void checkLocalSsd() {
        calculatorPage.checkLocalSsdSpace2x375Gib();
    }

    @Test
    public void checkCommitmentTerm() {
        calculatorPage.checkCommitmentTermOneYear();
    }
}
