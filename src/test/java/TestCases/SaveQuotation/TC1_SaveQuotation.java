package TestCases.SaveQuotation;

import BaseTest.CommonTests;
import PageNames.LogIn;
import PageNames.RequestQuotation;
import PageNames.SaveQuotation;
import UtilityFiles.propertiesReader;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_SaveQuotation extends CommonTests {

    @Test
    @Description //Verify page header and all text information
    public void SaveQuotation_TC1(){
        LogIn logIn=new LogIn(driver);
        RequestQuotation requestQuotation=new RequestQuotation(driver);
        SaveQuotation saveQuotation=new SaveQuotation(driver);

        logIn.enterLogInEmail(propertiesReader.readKey("Validloginemail"));
        logIn.enterLogInPassword(propertiesReader.readKey("Validloginpassword"));
        logIn.clickLogInButton();
        requestQuotation.clickRequestQuotation_Tab();
        requestQuotation.selectBreakDownCover_AtHome();
        requestQuotation.clickCheckbox_WidescreenRepairYes();
        requestQuotation.enterNumberOfAccidents(propertiesReader.readKey("NumberOfAccidents0"));
        requestQuotation.enterVechicleRegistration(randomVehicleNumber());
        requestQuotation.enterTotalMilage(randomMilage());
        requestQuotation.enterEstimatedValue(propertiesReader.readKey("EstimatedValue2"));
        requestQuotation.SelectParkingLocation_StreetRoad();
        requestQuotation.SelectPolicyStartingYear1();
        requestQuotation.SelectPolicyStartingMonth1();
        requestQuotation.SelectPolicyStartingDate1();
        requestQuotation.clickCalculatePremiumBtn();
        requestQuotation.clickSaveQuotationBtn();
        String PageHeader=saveQuotation.verifyPageHeader();
        String TextLine1=saveQuotation.verifyLine1Text();
        String TextLine2=saveQuotation.verifyLine2Text();
        String TextLine3=saveQuotation.verifyLine3Text();

        Assert.assertEquals(propertiesReader.readKey("SaveQuotationPageHeader"),PageHeader);
        Assert.assertEquals(propertiesReader.readKey("SaveQuotationLine1"),TextLine1);
        Assert.assertEquals(propertiesReader.readKey("SaveQuotationLine2"),TextLine2);
        Assert.assertEquals(propertiesReader.readKey("SaveQuotationLine3"),TextLine3);
    }
}
