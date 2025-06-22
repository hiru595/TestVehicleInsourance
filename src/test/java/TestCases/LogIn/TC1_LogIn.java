package TestCases.LogIn;

import BaseTest.CommonTests;
import PageNames.LogIn;
import UtilityFiles.propertiesReader;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TC1_LogIn extends CommonTests {

    @Test
    @Description //Login with valid username and password
    public void Login_TC1(){
        LogIn logIn=new LogIn(driver);
        logIn.enterLogInEmail(propertiesReader.readKey("Validloginemail"));
        logIn.enterLogInPassword(propertiesReader.readKey("Validloginpassword"));
        logIn.clickLogInButton();
    }
}
