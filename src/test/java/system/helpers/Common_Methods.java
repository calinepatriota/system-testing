package system.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common_Methods {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public Common_Methods() {
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();
    }

    public void click(By element){
        driver.findElement(element).click();
    }

    public void send_keys(By element,String text){
        driver.findElement(element).sendKeys(text);
    }

    public String get_text(By element){
        return driver.findElement(element).getText();
    }

    public  void clickJavaScriptExecutor(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public String getTextJavaScriptExecutor(WebDriver driver,By element){
        String text = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerHTML;",driver.findElement(element));
        return text;
    }

    public void scrollElemento(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public  void scrollPage(WebDriver driver) {

        try {
            long lastHeight =  (Long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");

            while (true) {
                ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
                Thread.sleep(10000);

                long newHeight = (Long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");
                if (newHeight == lastHeight) {
                    break;
                }
                lastHeight = newHeight;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
