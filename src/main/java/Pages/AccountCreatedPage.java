package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;


public class AccountCreatedPage {
    private SHAFT.GUI.WebDriver driver;

    //Locators
    private final By continueButton = By.xpath("//a[@class='btn btn-primary']");

    //Actions

    public AccountCreatedPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public AccountCreatedPage assertAccountCreatedTextMsg(){
        By accountCreated = By.xpath("//div[@class='col-sm-9 col-sm-offset-1']/h2/b");
        //sa.assertEquals(driver.findElement(accountCreated).getText(),"ACCOUNT CREATED!");
        driver.assertThat().element(accountCreated).text().equals("ACCOUNT CREATED!");
        return this;

    }

    public AccountCreatedPage clickOnContinueButton(){
        //driver.findElement(continueButton).click();
        driver.element().click(continueButton);
        return this;
    }


}
