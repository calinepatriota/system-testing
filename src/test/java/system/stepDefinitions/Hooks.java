package system.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.Constants;
import system.helpers.DriverManager;

import java.io.IOException;

public class Hooks {

    WebDriver driver= DriverManager.getDriver();
    WebDriverWait wait = DriverManager.getDriverWait();


    public static Scenario scenario;

    @Before
    public void before(Scenario scenario) throws IOException, InterruptedException {
        Hooks.scenario = scenario;
        System.out.println(scenario.getSourceTagNames());
        System.out.println("Cenario: " + scenario.getName());
        driver = DriverManager.getDriver();
        wait = DriverManager.getDriverWait();
        driver.get(Constants.URL_ML);

    }

    @AfterStep
    public void afterStep(Scenario scenario) throws InterruptedException, IOException {

        try {
            scenario.log("Pagina atual:  " +  DriverManager.getDriver().getCurrentUrl());
            byte[] screenshot = ((TakesScreenshot)  DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
    }

    @After
    public void after(Scenario scenario) throws IOException {
        System.out.println("------------------------------");
        System.out.println(scenario.getName() + " - Status: " + scenario.getStatus());
        DriverManager.quitDriver();
    }
}
