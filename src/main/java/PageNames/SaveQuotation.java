package PageNames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SaveQuotation extends BasePage{
    public SaveQuotation (WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[contains(text(),'Request Quotation Save')]")
    private WebElement PageHeader_RequestQuotationSave;

    @FindBy(xpath = "//b[contains(text(),'You have saved this quotation!')]")
    private WebElement Txt_PageTextLine1;

    @FindBy(xpath = "//b[text()='Your identification number is :  ']")
    private WebElement Txt_PageTextLine2;

    @FindBy(xpath = "//b[text()='Please write it down for later retrieve']")
    private WebElement Txt_PageTextLine3;

    @FindBy(xpath = "//input[@type='submit' and @value='Home']")
    private WebElement Btn_Home;

    public String  verifyPageHeader(){
        return PageHeader_RequestQuotationSave.getText();
    }

    public String verifyLine1Text(){
        return Txt_PageTextLine1.getText();
    }

    public String verifyLine2Text(){
         return Txt_PageTextLine2.getText();
    }

    public String verifyLine3Text(){
         return Txt_PageTextLine3.getText();
    }

    public void clickHomeBtn(){
        WebElement element=wait.until(ExpectedConditions.visibilityOf(Btn_Home));
        element.click();
    }
}
