package TestCases.RequestQuotation;

import BaseTest.CommonTests;
import PageNames.LogIn;
import PageNames.RequestQuotation;
import UtilityFiles.propertiesReader;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TC1_RequestQuotation extends CommonTests {

    @Test
    @Description // Breakdowncover ="At Home","WideScreen Repair"="Yes","Parking Location"="Public Place"
    public void RequestQuotation_TC1(){
        LogIn logIn=new LogIn(driver);
        RequestQuotation requestQuotation=new RequestQuotation(driver);

        logIn.enterLogInEmail(propertiesReader.readKey("Validloginemail"));
        logIn.enterLogInPassword(propertiesReader.readKey("Validloginpassword"));
        logIn.clickLogInButton();
        requestQuotation.clickRequestQuotation_Tab();
        requestQuotation.selectBreakDownCover_AtHome();
        requestQuotation.clickCheckbox_WidescreenRepairYes();
        requestQuotation.enterNumberOfAccidents(propertiesReader.readKey("NumberOfAccidents0"));
        requestQuotation.enterVechicleRegistration(randomVehicleNumber());
        requestQuotation.enterTotalMilage(randomMilage());
        requestQuotation.enterEstimatedValue(propertiesReader.readKey("EstimatedValue1"));
        requestQuotation.SelectParkingLocation_PublicPlace();
        requestQuotation.SelectPolicyStartingYear1();
        requestQuotation.SelectPolicyStartingMonth1();
        requestQuotation.SelectPolicyStartingDate1();
        requestQuotation.clickCalculatePremiumBtn();
        requestQuotation.getCalculatedPremiumInfo();
    }
}
