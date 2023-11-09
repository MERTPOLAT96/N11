package GUN05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class N11UyeOl extends BaseDriver {

    @Test
    public void test1(){

        driver.get("https://www.n11.com/");

        WebElement element= driver.findElement(By.linkText("Üye Ol"));
        element.click();

        WebElement element1=driver.findElement(By.xpath("//div[text()='Tamam']"));
        element1.click();

        Assert.assertTrue("url de kayıt yerindeyim doğru mu",driver.getCurrentUrl().contains("uye-ol"));


        WebElement name= driver.findElement(By.id("firstName"));
        name.sendKeys("AHMET");

        WebElement surname= driver.findElement(By.id("lastName"));
        surname.sendKeys("KAYA");

        WebElement email= driver.findElement(By.name("email"));
        email.sendKeys("ahmet123@gmail.com");

        WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.elementToBeClickable(By.name("phoneNumber")));

        WebElement telno= driver.findElement(By.name("phoneNumber"));
        telno.sendKeys("5557899987");

        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("12345");

        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement man=driver.findElement(By.xpath("(//div[@class='inputField genderInput'])[2]"));
        js.executeScript("arguments[0].click();", man);



        System.out.println("başarıyla kayıt olunmuştur");




        //WebElement telno= driver.findElement(By.name("phoneNumber"));
        //telno.sendKeys("5557899987");
    }
}
