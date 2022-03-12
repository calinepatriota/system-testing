package system.pages_ml;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import system.helpers.Common_Methods;
import system.helpers.DriverManager;

public class Instagram_Page_ML extends Common_Methods {

    public Instagram_Page_ML() {
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();
    }

    By titulo_mercado_livre = By.xpath("//section/div[1]/h2");

    public String titulo_mercado_livre() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(titulo_mercado_livre)));
        return get_text(titulo_mercado_livre);
    }
}

