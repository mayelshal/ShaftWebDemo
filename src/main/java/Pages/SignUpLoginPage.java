package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class SignUpLoginPage {
    private SHAFT.GUI.WebDriver driver;


    //Locators
    private final By newUserSignUp = By.xpath("//div[@class='signup-form']/h2");
    private final By signUpName= By.cssSelector("input[data-qa='signup-name']");
    private final By signUpEmail= By.cssSelector("input[data-qa='signup-email']");
    private final By signupButton=By.cssSelector("button[data-qa='signup-button']");

    //Actions

    public SignUpLoginPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public SignUpLoginPage assertNewUserSignUpText(){
        String newUserText = driver.element().getText(newUserSignUp);

        driver.assertThat().element(newUserSignUp).text().equals(newUserText);

        return this;
    }
    public SignUpLoginPage Signup(String name,String email) {
      /*  driver.findElement(signUpName).sendKeys(name);
        driver.findElement(signUpEmail).sendKeys(email);
        driver.findElement(signupButton).click();*/
        driver.element().type(signUpName,name);
        driver.element().type(signUpEmail,email);
        driver.element().click(signupButton);
        return this;
    }

}
