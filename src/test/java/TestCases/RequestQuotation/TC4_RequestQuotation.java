package TestCases.RequestQuotation;

import BaseTest.CommonTests;
import PageNames.LogIn;
import PageNames.RequestQuotation;
import UtilityFiles.propertiesReader;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TC4_RequestQuotation extends CommonTests {

    @Test
    @Description //Breakdowncover ="No cover","Parking Location"="Private Property"
    public void RequestQuotation_TC4(){
        LogIn logIn=new LogIn(driver);
        RequestQuotation requestQuotation=new RequestQuotation(driver);

        logIn.enterLogInEmail(propertiesReader.readKey("Validloginemail"));
        logIn.enterLogInPassword(propertiesReader.readKey("Validloginpassword"));
        logIn.clickLogInButton();
        requestQuotation.clickRequestQuotation_Tab();
        requestQuotation.selectBreakDownCover_NoCover();
        requestQuotation.clickCheckbox_WidescreenRepairYes();
        requestQuotation.enterNumberOfAccidents(propertiesReader.readKey("NumberOfAccidents2"));
        requestQuotation.enterVechicleRegistration(randomVehicleNumber());
        requestQuotation.enterTotalMilage(randomMilage());
        requestQuotation.enterEstimatedValue(propertiesReader.readKey("EstimatedValue3"));
        requestQuotation.SelectParkingLocation_PrivateProperty();
        requestQuotation.SelectPolicyStartingYear1();
        requestQuotation.SelectPolicyStartingMonth1();
        requestQuotation.SelectPolicyStartingDate1();
        requestQuotation.clickCalculatePremiumBtn();

        requestQuotation.getCalculatedPremiumInfo();
    }
}
