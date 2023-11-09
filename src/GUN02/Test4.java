package GUN02;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test4 extends BaseDriver {

    @Test
    public void test1(){

        driver.get("https://www.n11.com/");

        WebElement element= driver.findElement(By.linkText("Elektronik"));

        Actions actions=new Actions(driver);
        Action action=actions.moveToElement(element).build();
        action.perform();

    }
}
