package system.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.Constants;
import system.helpers.DriverManager;

public class Hooks {

    WebDriver driver= DriverManager.getDriver();
    WebDriverWait wait = DriverManager.getDriverWait();

    @Before
    public void before(){
        driver = DriverManager.getDriver();
        wait = DriverManager.getDriverWait();
        driver.get(Constants.URL_ML);
    }

     @After
    public void  after(){
        DriverManager.quitDriver();
    }
}
