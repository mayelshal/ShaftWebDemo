package testCs;

import Pages.*;
import org.testng.annotations.Test;
import testCs.TestConfigurations;

public class TestRegister extends TestConfigurations {

    @Test(description = "verify registration")
    public  void RegisterUser()
    {
        new HomePage(driver)
                .navigate("https://www.automationexercise.com/")
                .assertOnHomePageTitle();
        new MenuPage(driver)
                .clickOnSignUpLoginButton();
        new SignUpLoginPage(driver)
                .assertNewUserSignUpText()
                .Signup("Ahmed","ahmed111.m@gmail.com");
        new SignUpPage(driver).assertEnterAccountInformationTextVisibility()
                .enterAccountInfo("124@ss12")
                .setAddressInfo("ahmed","younes","darelhandsa","hadaykelahram","giza","egypt","cairo","1111","01004411707");
        new AccountCreatedPage(driver).assertAccountCreatedTextMsg()
                .clickOnContinueButton();
        new MenuPage(driver)
                .assertLoggedInAsUserNameVisibility();
        new MenuPage(driver)
                .deleteAccount();
        new HomePage(driver).assertThatAccountDeleted();

    }
}
