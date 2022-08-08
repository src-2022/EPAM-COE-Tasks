package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorPageSmokeTest extends BaseTests {

    @Test
    public void TestGooglePageLoaded() {
            Assert.assertTrue(smokePage.IsGoogleCloudPageTitleDisplayed());
        }

    @Test
    public void testCalculatorPageLoaded() throws InterruptedException {
        Assert.assertTrue(smokePage.IsCalculatorPageTitleDisplayed());

    }
//
//    @Test
//    public void TestPageTitleDisplayed() {
//
//    }
//
//    @Test
//    public void TestPageFooterAvailable() {
//
//    }
//
//    @Test
//    public void TestPageHeaderAvailable() {
//
//    }
//
//    @Test
//    public void IsAddGPUsAvailable() {
//
//    }
//
//    @Test
//    public void checkInformationInVmClassString() {
////        String actualValue=calculatorPage.checkInformationInVmClassIsRegular();
////        Assert.assertEquals(actualValue,new CalculatorModel().Model().);
//
//    }
//
////    @Test
////    public void checkInformationInInstanceTypeString() throws Exception {
////        String actualValue = calculatorPage.checkInformationInInstanceTypeIncludeN1Standard8();
////        String expectedValue = new CalculatorModel().Model().getSelectMachineType();
////        System.out.println("Actual:" + actualValue + " ,Expected" + expectedValue);
////
////        Assert.assertEquals(actualValue, expectedValue);
////    }

//    @Test
//    public void checkRegion() {
//        calculatorPage.checkRegionIsFrankfurt();
//    }
//
//    @Test
//    public void checkLocalSsd() {
//        calculatorPage.checkLocalSsdSpace2x375Gib();
//    }
//
//    @Test
//    public void checkCommitmentTerm() {
//        calculatorPage.checkCommitmentTermOneYear();
//    }


}
