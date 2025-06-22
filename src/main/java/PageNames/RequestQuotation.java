package PageNames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class RequestQuotation extends BasePage{

    public RequestQuotation(WebDriver driver){
        super(driver);
    }

    //List of Webelements on the page.
    @FindBy (xpath = "//a[contains(text(),'Request Quotation')]")
    private WebElement Link_RequestQuotation;

    @FindBy (xpath = "//select[@name='breakdowncover']")
    private WebElement Dropdown_BreakdownCover;

    @FindBy (xpath = "//input[@name='windscreenrepair' and @value='Yes']")
    private WebElement Checkbox_WidescreenrepairYes;

    @FindBy (xpath = "//input[@name='windscreenrepair' and @value='No']")
    private WebElement Checkbox_WidescreenrepairNo;

    @FindBy (xpath = "//input[@id='quotation_incidents' or @name='incidents']")
    private WebElement Txt_NumberOfAccidentsLastYear;

    @FindBy (xpath = "//input[@name='registration' or @placeholder='Enter vehicle registration']")
    private WebElement Txt_Registration;

    @FindBy (xpath = "//input[@name='mileage' or @placeholder='Enter vehicle mileage']")
    private WebElement Txt_TotalMileage;

    @FindBy (xpath = "//h5//input[@name='value' or @id='quotation_vehicle_attributes_value']")
    private WebElement Txt_EstimatedValue;

    @FindBy (xpath = "//h5//select[@name='parkinglocation']")
    private WebElement Dropdown_ParkingLocation;

    @FindBy (xpath = "//h5//select[@name='year']")
    private WebElement Dropdown_StartingPolicyYear;

    @FindBy (xpath = "//h5//select[@name='month']")
    private WebElement Dropdown_StartingPolicyMonth;

    @FindBy (xpath = "//h5//select[@name='date']")
    private WebElement Dropdown_StartingPolicyDate;

    @FindBy (xpath = "//input[@value='Calculate Premium' and @type='button']")
    private WebElement Btn_CalculatePremium;

    @FindBy (xpath = "//input[@value='Reset form' and @type='reset']")
    private WebElement Btn_ResetForm;

    @FindBy (xpath = "//input[@value='Save Quotation' and @type='submit']")
    private WebElement Btn_SaveQuotation;

    @FindBy (xpath = "//p[@id='calculatedpremium']")
    private WebElement TxtatTop_PremiumCalcutaion;

    @FindBy (xpath = "//h2[contains(text(),'Request a quotation')]")
    private WebElement PageTitle_RequestaQuotation;

    public void clickRequestQuotation_Tab(){
        WebElement element=wait.until(ExpectedConditions.visibilityOf(Link_RequestQuotation));
        Link_RequestQuotation.click();
    }

    public void selectBreakDownCover_European(){
        WebElement element=wait.until(ExpectedConditions.visibilityOf(Dropdown_BreakdownCover));
        Select select=new Select(Dropdown_BreakdownCover);
        select.selectByVisibleText("European");
    }

    public void selectBreakDownCover_Roadside(){
        WebElement element=wait.until(ExpectedConditions.visibilityOf(Dropdown_BreakdownCover));
        Select select=new Select(Dropdown_BreakdownCover);
        select.selectByVisibleText("Roadside");
    }

    public void selectBreakDownCover_AtHome(){
        WebElement element=wait.until(ExpectedConditions.visibilityOf(Dropdown_BreakdownCover));
        Select select=new Select(Dropdown_BreakdownCover);
        select.selectByVisibleText("At home");
    }

    public void selectBreakDownCover_NoCover(){
        WebElement element=wait.until(ExpectedConditions.visibilityOf(Dropdown_BreakdownCover));
        Select select=new Select(Dropdown_BreakdownCover);
        select.selectByVisibleText("No cover");
    }

    public void clickCheckbox_WidescreenRepairYes(){
        if(!Checkbox_WidescreenrepairYes.isSelected()){
            Checkbox_WidescreenrepairYes.click();
        }
    }

    public void clickCheckbox_WidescreenrepairNo(){
        if(!Checkbox_WidescreenrepairNo.isSelected()){
            Checkbox_WidescreenrepairNo.click();
        }
    }

    public void enterNumberOfAccidents(String Accidents){
        Txt_NumberOfAccidentsLastYear.sendKeys(Accidents);
    }

    public void enterVechicleRegistration(String RegistrationNumber){
        Txt_Registration.sendKeys(RegistrationNumber);
    }

    public void enterTotalMilage(String Milage){
        Txt_TotalMileage.sendKeys(Milage);
    }

    public void enterEstimatedValue(String VehicleValue){
        Txt_EstimatedValue.sendKeys(VehicleValue);
    }

    public void SelectParkingLocation_PublicPlace(){
        Select select=new Select(Dropdown_ParkingLocation);
        select.selectByVisibleText("Public Place");
    }

    public void SelectParkingLocation_LockedGarage(){
        Select select=new Select(Dropdown_ParkingLocation);
        select.selectByVisibleText("Locked Garage");
    }

    public void SelectParkingLocation_StreetRoad(){
        Select select=new Select(Dropdown_ParkingLocation);
        select.selectByVisibleText("Street/Road");
    }

    public void SelectParkingLocation_PrivateProperty(){
        Select select=new Select(Dropdown_ParkingLocation);
        select.selectByVisibleText("Private Property");
    }

    public void SelectPolicyStartingYear1(){
        Select select=new Select(Dropdown_StartingPolicyYear);
        select.selectByVisibleText("2019");
    }

    public void SelectPolicyStartingMonth1(){
        Select select=new Select(Dropdown_StartingPolicyMonth);
        select.selectByVisibleText("April");
    }

    public void SelectPolicyStartingDate1(){
        Select select=new Select(Dropdown_StartingPolicyDate);
        select.selectByVisibleText("20");
    }

    public void SelectPolicyStartingYear2(){
        Select select=new Select(Dropdown_StartingPolicyYear);
        select.selectByVisibleText("2022");
    }

    public void SelectPolicyStartingMonth2(){
        Select select=new Select(Dropdown_StartingPolicyMonth);
        select.selectByVisibleText("July");
    }

    public void SelectPolicyStartingDate2(){
        Select select=new Select(Dropdown_StartingPolicyDate);
        select.selectByVisibleText("29");
    }
    public void SelectPolicyStartingYear3(){
        Select select=new Select(Dropdown_StartingPolicyYear);
        select.selectByVisibleText("2024");
    }

    public void SelectPolicyStartingMonth3(){
        Select select=new Select(Dropdown_StartingPolicyMonth);
        select.selectByVisibleText("December");
    }

    public void SelectPolicyStartingDate3(){
        Select select=new Select(Dropdown_StartingPolicyDate);
        select.selectByVisibleText("15");
    }

    public void clickCalculatePremiumBtn(){
        Btn_CalculatePremium.click();
    }

    public void clickResetFormBtn(){
        Btn_ResetForm.click();
    }

    public void clickSaveQuotationBtn(){
        Btn_SaveQuotation.click();
    }

    public void getCalculatedPremiumInfo(){
        String PremiumAmountInfo=TxtatTop_PremiumCalcutaion.getText();
        System.out.println("Premium Info: "+PremiumAmountInfo);
    }

}
