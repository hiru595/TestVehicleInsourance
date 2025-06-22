package TestCases.RequestQuotation;

import BaseTest.CommonTests;
import PageNames.LogIn;
import PageNames.RequestQuotation;
import UtilityFiles.propertiesReader;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TC2_RequestQuotation extends CommonTests {

    @Test
    @Description// Breakdowncover ="European","WideScreen Repair"="No","Parking Location"="Street/Road"
    public void RequestQuotation_TC2(){
        LogIn logIn=new LogIn(driver);
        RequestQuotation requestQuotation=new RequestQuotation(driver);

        logIn.enterLogInEmail(propertiesReader.readKey("Validloginemail"));
        logIn.enterLogInPassword(propertiesReader.readKey("Validloginpassword"));
        logIn.clickLogInButton();
        requestQuotation.clickRequestQuotation_Tab();
        requestQuotation.selectBreakDownCover_European();
        requestQuotation.clickCheckbox_WidescreenrepairNo();
        requestQuotation.enterNumberOfAccidents(propertiesReader.readKey("NumberOfAccidents1"));
        requestQuotation.enterVechicleRegistration(randomVehicleNumber());
        requestQuotation.enterTotalMilage(randomMilage());
        requestQuotation.enterEstimatedValue(propertiesReader.readKey("EstimatedValue2"));
        requestQuotation.SelectParkingLocation_StreetRoad();
        requestQuotation.SelectPolicyStartingYear2();
        requestQuotation.SelectPolicyStartingMonth2();
        requestQuotation.SelectPolicyStartingDate2();
        requestQuotation.clickCalculatePremiumBtn();
        requestQuotation.getCalculatedPremiumInfo();
    }
}
