package system.pages_ml;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import system.helpers.Common_Methods;
import system.helpers.DriverManager;

public class Rede_Social_Page_ML extends Common_Methods {

    public Rede_Social_Page_ML() {
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();
    }

    By link_mais_informacoes = By.cssSelector("body > div.nav-footer-access > label");
    By botao_instagram = By.cssSelector("body > div.nav-footer-access > div > div > div:nth-child(4) > ul > li:nth-child(3)");
    By botao_cookies = By.xpath("//button[contains(text(),'Entendi')]");

    public void click_link_informacoes() throws InterruptedException {
        scrollPage(driver);
        try {
            click(botao_cookies);
        } catch (Exception e){
        }

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(link_mais_informacoes)));
        click(link_mais_informacoes);
    }

    public void clicar_botao_instagram() throws InterruptedException {
        Thread.sleep(4000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(botao_instagram)));
        click(botao_instagram);
    }
}

