package TestCases.Userregistration;

import BaseTest.CommonTests;
import PageNames.UserRegistration;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import PageNames.LogIn;

public class TC1_UserRegistration extends CommonTests {

    @Test
    @Description //User Registration with Full Licence Type
    public void UserReg_TC1() {
        UserRegistration userRegistration = new UserRegistration(driver);
        LogIn logIn=new LogIn(driver);

        logIn.clickRegistrerButton();
        userRegistration.SelectTitle();
        userRegistration.enterFirstName(getFirstName());
        userRegistration.enterSurName(getSurName());
        userRegistration.enterPhone(randomNumber());
        userRegistration.SelectYear();
        userRegistration.SelectMonth();
        userRegistration.SelectDate();
        userRegistration.click_checkboxFull();
        userRegistration.SelectLicencePeriod();
        userRegistration.SelectOccupation();
        userRegistration.enterStreetAddress(getStreetName());
        userRegistration.enterCity(getCity());
        userRegistration.enterCountry(getCountry());
        userRegistration.enterPostalcode(getPostalCode());
        userRegistration.enterEmail(randomEmail());
        userRegistration.enterPassword();
        userRegistration.enterConfirmPassword();
        userRegistration.clickCreateButton();
    }
}
