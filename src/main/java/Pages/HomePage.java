package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;


public class HomePage {
    private SHAFT.GUI.WebDriver driver;


    //Locators
    private final By signupLogin = By.xpath("//a[@href='/login']");
    private final By deleteButton = By.xpath("//a[@href='/delete_account']");

    //Actions

    public HomePage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;

    }

    public HomePage navigate(String url){
        driver.browser().navigateToURL(url);
        return this;
    }
    public HomePage assertOnHomePageTitle() {
        String homepage=driver.getDriver().getTitle();
        //sa.assertEquals(homepage,"Automation Exercise");
        driver.assertThat().browser().title().equals("Automation Exercise");

        return this;

    }

    public HomePage assertThatAccountDeleted(){
        By accountDeleted =By.xpath("//div[@class='col-sm-9 col-sm-offset-1']/h2/b");
        //sa.assertEquals(driver.findElement(accountDeleted).getText(),"ACCOUNT DELETED!");
        driver.assertThat().element(accountDeleted).text().equals("ACCOUNT DELETED!");

        return this;
    }

}
