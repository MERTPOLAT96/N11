package GUN01;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Test1 extends BaseDriver {

    @Test
    public void test1(){

        driver.get("https://www.n11.com/");

        driver.manage().deleteAllCookies();

        WebElement element1= driver.findElement(By.id("searchData"));
        element1.sendKeys("iphone15");

        WebElement element2= driver.findElement(By.cssSelector("[class='iconsSearch']"));
        element2.click();

        WebElement element3= driver.findElement(By.xpath("(//a[@title='Cep Telefonu'])[1]"));
        element3.click();

        JavascriptExecutor js1=(JavascriptExecutor) driver;
        WebElement elementhafıza= driver.findElement(By.xpath("//h2[text()='Dahili Hafıza']"));
        js1.executeScript("arguments[0].scrollIntoView(true)",elementhafıza);

        WebElement element4= driver.findElement(By.xpath("//span[text()='512 GB']"));
        element4.click();

        WebElement element5= driver.findElement(By.xpath("//h3[text()='Apple iPhone 15 Pro 512 GB (Apple Türkiye Garantili)']"));
        element5.click();

        WebElement element6= driver.findElement(By.xpath("(//button[text()='Sepete Ekle'])[1]"));
        element6.click();

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        Assert.assertTrue("url de sepete eklendimi", driver.getCurrentUrl().contains("iphone-15-pro-512-gb"));

        WebElement anasayfa= driver.findElement(By.xpath("//a[@title='hayat sana gelir']"));
        anasayfa.click();

        WebElement yazigonder= driver.findElement(By.id("searchData"));
        yazigonder.sendKeys("anakart");

        WebElement element21= driver.findElement(By.cssSelector("[class='iconsSearch']"));
        element21.click();

        WebElement tikla= driver.findElement(By.cssSelector("[title='Bilgisayar Bileşenleri']"));
        tikla.click();

        WebElement op=driver.findElement(By.xpath("//h3[text()='Gigabyte A520M K V2 AMD A520 5100 MHz (OC) DDR4 Soket AM4 mATX Anakart']"));
        op.click();


        WebElement ekle2=driver.findElement(By.xpath("(//button[text()='Sepete Ekle'])[1]"));
        ekle2.click();


        WebElement sepet=driver.findElement(By.cssSelector("[title='Sepetim']"));
        sepet.click();

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        Assert.assertTrue("url de geçiyormu",driver.getCurrentUrl().contains("sepetim"));


        //List<WebElement> ucretler=driver.findElements(By.xpath("//div[@class='priceArea']"));

        //double toplam=0;

        //for (WebElement e:ucretler) {
           // System.out.println("e.getText() = " + e.getText());

            //toplam=toplam+Double.parseDouble(e.getText());

       // }

        //System.out.println("toplam = " + toplam);


    }

}
