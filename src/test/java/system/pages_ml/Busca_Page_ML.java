package system.pages_ml;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import system.helpers.Common_Methods;
import system.helpers.DriverManager;

public class Busca_Page_ML extends Common_Methods {

    public Busca_Page_ML() {
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();
    }

    By buscar_produto = By.cssSelector("#cb1-edit");
    By lupa = By.cssSelector("header > div > form > button");
    By texto_produto = By.cssSelector("#root-app > div > div.ui-search-main.ui-search-main--exhibitor.ui-search-main--only-products > section > ol:nth-child(2) > li:nth-child(2) > div > div > a > div > div.ui-search-item__group.ui-search-item__group--title > h2");


    public void busca_produto(String produto) throws InterruptedException {
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(buscar_produto)));
        send_keys(buscar_produto,produto);
    }

    public void clicar_lupa_pesquisa() {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(lupa)));
        click(lupa);
    }

    public String texto_produto(){
       return get_text(texto_produto);
    }
}

