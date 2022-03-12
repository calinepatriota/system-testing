package system.pages_ml;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import system.helpers.Common_Methods;
import system.helpers.DriverManager;

import java.util.List;

public class Home_Page_ML extends Common_Methods {

    public Home_Page_ML() {
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();
    }

    By botao_cep = By.cssSelector(".nav-header-cp-anchor");
    By label_cep = By.cssSelector("body > header > div > a.nav-header-cp-anchor");


    public void click_botao_cep() {
        clickJavaScriptExecutor(driver, driver.findElement(botao_cep));
    }

    public String get_text_cep(){
       String text= getTextJavaScriptExecutor(driver, label_cep);
        return text;
    }

}