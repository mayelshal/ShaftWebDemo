package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class SignUpPage {
    SHAFT.GUI.WebDriver driver;
    private final By AccountInformation =By.xpath("//div[@class='login-form']/h2/b");
    private final By newsletter = By.id("newsletter");
    private final By optin= By.id("optin");
    private final By title = By.cssSelector("input[id='id_gender2']");
    private final By password = By.id("password");
    private final By firstName = By.id("first_name");
    private final By lastName=By.id("last_name");
    private final By company = By.id("company");
    private final By address1 =   By.id("address1");
    private final By address2 =  By.id("address2");
    private final By state =  By.id("state");
    private final By city = By.id("city");
    private final By zipcode= By.id("zipcode");
    private final By mobileNumber=  By.id("mobile_number");
    private final By createAccount =   By.xpath("//button[@data-qa='create-account']");
    private final By Country = By.id("country");
    private final By Day = By.id("days");
    private final By Month = By.cssSelector("select[id='months']");
    private final By Year = By.cssSelector("select[id='years']");


    //Actions


    public SignUpPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public SignUpPage assertEnterAccountInformationTextVisibility(){
        //String accountInformationText =driver.element().getText(AccountInformation);

        driver.assertThat().element(AccountInformation).text().equals("ENTER ACCOUNT INFORMATION");
        return this;

    }


    public SignUpPage enterAccountInfo (String Password){

        driver.element().type(password,Password);
        driver.element().click(title);
        driver.element().click(newsletter);
        driver.element().click(optin);
        driver.element().select(Day,"2");
        driver.element().select(Month,"January");
        driver.element().select(Year,"1991");


        return this;

    }

    public SignUpPage setAddressInfo (String firstname,String lastname,String Company,String Address1,String Address2,String State,String City,String Zipcode,String MobileNumber){
        driver.element().type(firstName,firstname);
        driver.element().type(lastName,lastname);
        driver.element().type(company,Company);
        driver.element().type(address1,Address1);
        driver.element().type(address2,Address2);
        driver.element().select(Country,"Canada");
        driver.element().type(state,State);
        driver.element().type(city,City);
        driver.element().type(zipcode,Zipcode);
        driver.element().type(mobileNumber,MobileNumber);
        driver.element().click(createAccount);

        return this;

    }

}
