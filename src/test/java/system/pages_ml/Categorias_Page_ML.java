package system.pages_ml;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import system.helpers.Common_Methods;
import system.helpers.DriverManager;

public class Categorias_Page_ML extends Common_Methods {

    public Categorias_Page_ML() {
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();
    }

    By botao_categoria = By.cssSelector("div.nav-menu > ul > li:nth-child(2) > a");
    By botao_eletrodomesticos = By.cssSelector("ul > li:nth-child(2) > div > ul > li:nth-child(5) > a");
    By produto_exibido = By.cssSelector("div:nth-child(2) > section > section > div.dynamic-carousel__container--with-link > h2");


    public void clicar_botao_categoria() {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(botao_categoria)));
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(botao_categoria)).perform();
    }

    public void clicar_botao_eletrodomesticos() throws InterruptedException {
        Thread.sleep(8000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(botao_eletrodomesticos)));
        click(botao_eletrodomesticos);
    }

    public String produto_exibido(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(produto_exibido)));
        return get_text(produto_exibido);
    }

}