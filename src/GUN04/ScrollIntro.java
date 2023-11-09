package GUN04;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollIntro extends BaseDriver {

    @Test
    public void test1(){

        driver.get("https://www.n11.com");

        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,6000)");




        JavascriptExecutor js1=(JavascriptExecutor) driver;
        WebElement element= driver.findElement(By.linkText("Playstation 5"));

        js1.executeScript("arguments[0].click();",element);



    }
}
