package BaseTest;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import com.github.javafaker.Faker;

import java.time.Duration;

public class CommonTests {
    public WebDriver driver;
    public String browser;
    public String os;
    protected Faker faker;

    @BeforeMethod
    public void startBrowser(){
        driver=new ChromeDriver();
        faker=new Faker();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/insurance/v2/index.php");
    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        if (driver != null) {
            driver.quit();
        }
    }

    public String randomVehicleNumber(){
        String generatedString= RandomStringUtils.randomNumeric(4);
        return "GJ-01-"+generatedString;
    }

    public String randomMilage(){
        String generatedNumber=RandomStringUtils.randomNumeric(2);
        return "10"+generatedNumber;
    }

    public String randomNumber(){
        String generatedNumber=RandomStringUtils.randomNumeric(10);
        return generatedNumber;
    }

    public String randomAlphaNumeric(){
        String generatedaplhanumeric=RandomStringUtils.randomAlphanumeric(10);
        return generatedaplhanumeric;
    }

    public String randomEmail(){
        String generatedEmail=RandomStringUtils.randomAlphanumeric(10);
        return generatedEmail+"@fakemail.com";
    }

    public String getFirstName(){
        return faker.name().firstName();
    }

    public String getSurName(){
        return faker.name().lastName();
    }

    public String getStreetName(){
        return faker.address().streetName();
    }

    public String getCity(){
        return faker.address().city();
    }

    public String getCountry(){
        return faker.address().country();
    }

    public String getPostalCode() {
        return faker.address().zipCode();
    }
}
