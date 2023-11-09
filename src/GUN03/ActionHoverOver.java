package GUN03;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionHoverOver extends BaseDriver {

    @Test
    public void test1(){

        driver.get("https://www.n11.com/");

        WebElement link1= driver.findElement(By.linkText("Kitap, Müzik, Film, Oyun"));

        //WebElement link2= driver.findElement(By.linkText("Kitap"));

        Actions actions=new Actions(driver);

        actions.moveToElement(link1).build().perform();
        MyFunc.Bekle(2);
        //actions.moveToElement(link2).build().perform();


    }
}
