package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class MenuPage {
    private SHAFT.GUI.WebDriver driver;

    //Locators
    private final By signupLogin = By.xpath("//a[@href='/login']");
    private final By deleteButton = By.xpath("//a[@href='/delete_account']");

    //actions


    public MenuPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public MenuPage clickOnSignUpLoginButton(){

        //driver.findElement(signupLogin).click();
        driver.element().click(signupLogin);
        return this;
    }


    public MenuPage assertLoggedInAsUserNameVisibility(){
        By logginIn = By.xpath("(//ul[@class ='nav navbar-nav']//a)[10]");
        //sa.assertEquals(driver.findElement(logginIn).getText(), "Logged in as May");
        driver.assertThat().element(logginIn).text().equals("Logged in as Ahmed");
        return this;
    }

    public MenuPage deleteAccount(){
        //driver.findElement(deleteButton).click();
        driver.element().click(deleteButton);
        return this;


    }
}
