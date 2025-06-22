package TestCases.RequestQuotation;

import BaseTest.CommonTests;
import PageNames.LogIn;
import PageNames.RequestQuotation;
import UtilityFiles.propertiesReader;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TC5_RequestQuotation extends CommonTests {

    @Test
    @Description //Retrive Quotation. Reset form functionality
    public void RequestionQuotation_TC5(){
        LogIn logIn=new LogIn(driver);
        RequestQuotation requestQuotation=new RequestQuotation(driver);

        logIn.enterLogInEmail(propertiesReader.readKey("Validloginemail"));
        logIn.enterLogInPassword(propertiesReader.readKey("Validloginpassword"));
        logIn.clickLogInButton();
        requestQuotation.clickRequestQuotation_Tab();
        requestQuotation.selectBreakDownCover_Roadside();
        requestQuotation.clickCheckbox_WidescreenRepairYes();
        requestQuotation.enterNumberOfAccidents(propertiesReader.readKey("NumberOfAccidents2"));
        requestQuotation.enterVechicleRegistration(randomVehicleNumber());
        requestQuotation.enterTotalMilage(randomMilage());
        requestQuotation.enterEstimatedValue(propertiesReader.readKey("EstimatedValue3"));
        requestQuotation.SelectParkingLocation_LockedGarage();
        requestQuotation.SelectPolicyStartingYear3();
        requestQuotation.SelectPolicyStartingMonth3();
        requestQuotation.SelectPolicyStartingDate3();
        requestQuotation.clickResetFormBtn();
    }
}
