package GUN02;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test3 extends BaseDriver {

    @Test
    public void test1(){ // çift click

        driver.get("https://www.n11.com/");

        WebElement element= driver.findElement(By.linkText("Kitap, Müzik, Film, Oyun"));

        Actions actions=new Actions(driver);
        Action action=actions.moveToElement(element).doubleClick().build();
        action.perform();
    }

    @Test
    public void test2(){ // right click

        driver.get("https://www.n11.com/");

        WebElement element= driver.findElement(By.linkText("Kitap, Müzik, Film, Oyun"));

        Actions actions2=new Actions(driver);
        Action action1=actions2.moveToElement(element).contextClick().build();
        action1.perform();
    }


}
