package PageNames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UserRegistration extends BasePage {

    public UserRegistration(WebDriver driver) {
        super(driver);
    }

    //WebElements
    @FindBy(xpath = "//h1[contains(text(),'Sign up as a new user')]")
    private WebElement PageHeader;
    @FindBy(xpath = "//select[@id='user_title' or @name='title']")
    private WebElement Dropdown_Title;
    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement Txt_Firstname;
    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement Txt_Surname;
    @FindBy(xpath = "//input[@name='phone']")
    private WebElement Txt_Phone;
    @FindBy(xpath = "//select[@name='year']")
    private WebElement Dropdown_Year;
    @FindBy(xpath = "//select[@name='month']")
    private WebElement Dropdown_Month;
    @FindBy(xpath = "//select[@name='date']")
    private WebElement Dropdown_Date;
    @FindBy(xpath = "//input[@name='licencetype' and @value='Full']")
    private WebElement Checkbox_Full;
    @FindBy(xpath = "//input[@name='licencetype' and @value='Provisional']")
    private WebElement Checkbox_Provisional;
    @FindBy(xpath = "//select[@name='licenceperiod']")
    private WebElement Dropdown_LicencePeriod;
    @FindBy(xpath = "//select[@name='occupation']")
    private WebElement Dropdown_Occupation;
    @FindBy(xpath = "//input[@name='street']")
    private WebElement Txt_AddressStreet;
    @FindBy(xpath = "//input[@name='city']")
    private WebElement Txt_City;
    @FindBy(xpath = "//input[@name='county']")
    private WebElement Txt_Country;
    @FindBy(xpath = "//input[@name='post_code']")
    private WebElement Txt_PostalCode;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement Txt_Email;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement Txt_Password;
    @FindBy(xpath = "//input[@name='c_password']")
    private WebElement Txt_ConfirmPassword;
    @FindBy(xpath = "//input[@type='reset' or @value='Reset']")
    private WebElement Btn_Reset;
    @FindBy(xpath = "//input[@name='submit' or @value='Create']")
    private WebElement Btn_Create;

    //Action methods
    public void SelectTitle() {
        Select select = new Select(Dropdown_Title);
        select.selectByVisibleText("Miss");
    }

    public void enterFirstName(String fname) {
        Txt_Firstname.sendKeys(fname);
    }

    public void enterSurName(String lname) {
        Txt_Surname.sendKeys(lname);
    }

    public void enterPhone(String phone) {
        Txt_Phone.sendKeys(phone);
    }

    public void SelectYear() {
        Select select = new Select(Dropdown_Year);
        select.selectByVisibleText("1995");
    }

    public void SelectMonth() {
        Select select = new Select(Dropdown_Month);
        select.selectByVisibleText("April");
    }

    public void SelectDate() {
        Select select = new Select(Dropdown_Date);
        select.selectByVisibleText("17");
    }

    public void click_checkboxFull() {
        Checkbox_Full.click();
    }

    public void click_checkboxProvisional() {
        Checkbox_Provisional.click();
    }

    public void SelectLicencePeriod() {
        Select select = new Select(Dropdown_LicencePeriod);
        select.selectByVisibleText("5");
    }

    public void SelectOccupation() {
        Select select = new Select(Dropdown_Occupation);
        select.selectByVisibleText("Writer");
    }

    public void enterStreetAddress(String address) {
        Txt_AddressStreet.sendKeys(address);
    }

    public void enterCity(String city) {
        Txt_City.sendKeys(city);
    }

    public void enterCountry(String country) {
        Txt_Country.sendKeys(country);
    }

    public void enterPostalcode(String postalcode) {
        Txt_PostalCode.sendKeys(postalcode);
    }

    public void enterEmail(String email) {
        Txt_Email.sendKeys(email);
    }

    public void enterPassword() {
        Txt_Password.sendKeys("Tender@123");
    }

    public void enterConfirmPassword() {
        Txt_ConfirmPassword.sendKeys("Tender@123");
    }

    public void clickCreateButton() {
        Btn_Create.click();
    }

    public void clickResetButton() {
        Btn_Reset.click();
    }
}
