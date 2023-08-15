package testCs;

import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestConfigurations {
    SHAFT.GUI.WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver=new SHAFT.GUI.WebDriver();
// driver=new ChromeDriver();
// driver= DriverFactory.getDriver("Chrome",true);
// driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
