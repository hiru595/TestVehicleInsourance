package TestCases.Userregistration;

import BaseTest.CommonTests;
import PageNames.LogIn;
import PageNames.UserRegistration;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TC3_UserRegistration extends CommonTests {

    @Test
    @Description //Reset Form after filling all data.
    public void UserReg_TC3() {
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
        userRegistration.click_checkboxProvisional();
        userRegistration.SelectLicencePeriod();
        userRegistration.SelectOccupation();
        userRegistration.enterStreetAddress(getStreetName());
        userRegistration.enterCity(getCity());
        userRegistration.enterCountry(getCountry());
        userRegistration.enterPostalcode(getPostalCode());
        userRegistration.enterEmail(randomEmail());
        userRegistration.enterPassword();
        userRegistration.enterConfirmPassword();
        userRegistration.clickResetButton();
    }
}
