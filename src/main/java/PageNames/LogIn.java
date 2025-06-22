package PageNames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogIn extends BasePage{
    public LogIn(WebDriver driver){
        super(driver);
    }

    //Webelements
    @FindBy (xpath="//a[contains(text(),'Register')]") private WebElement Btn_Registration;
    @FindBy (xpath = "//input[@name='email' or @id='email']") private WebElement Txt_Email;
    @FindBy (xpath = "//input[@name='password' or @id='password']") private WebElement Txt_Password;
    @FindBy (xpath = "//input[@type='submit' or @value='Log in']") private WebElement Btn_LogIn;

    //Methods
    public void clickRegistrerButton(){
        WebElement element=wait.until(ExpectedConditions.visibilityOf(Btn_Registration));
        element.click();
    }

    public void enterLogInEmail(String loginemail){
        Txt_Email.sendKeys(loginemail);
    }

    public void enterLogInPassword(String loginpassword){
        Txt_Password.sendKeys(loginpassword);
    }

    public void clickLogInButton(){
        Btn_LogIn.click();
    }
}
