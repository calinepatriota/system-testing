package system.pages_ml;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import system.helpers.Common_Methods;
import system.helpers.DriverManager;

public class CEP_Page_ML extends Common_Methods {

    public CEP_Page_ML() {
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();
    }

    By campo_cep = By.name("zipcode");
    By botao_usar_cep = By.cssSelector("#addressesForm > div > div > div > button");


    public void preencher_campo_cep(String cep) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(campo_cep)));
        send_keys(campo_cep,cep);
    }

    public void clicar_botao_usar_cep() {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(botao_usar_cep)));
        click(botao_usar_cep);
    }
}