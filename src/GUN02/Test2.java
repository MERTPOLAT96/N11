package GUN02;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test2 extends BaseDriver {

    @Test
    public void test1(){

        driver.get("https://www.n11.com/");

        WebElement element= driver.findElement(By.partialLinkText("Spor & Outdoor"));

        Actions actions=new Actions(driver);

        Action action=actions.moveToElement(element).click().build();

        System.out.println("aksiyonum hazırlandı");

        action.perform();


    }
}
