package GUN03;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionTusKontrolSendKeys extends BaseDriver {

    @Test
    public void test1(){

        driver.get("https://www.n11.com/");

        WebElement element= driver.findElement(By.id("searchData"));

        Actions actions=new Actions(driver);

        Action action=actions.moveToElement(element).click().keyDown(Keys.SHIFT)
                .sendKeys("ap").keyUp(Keys.SHIFT).sendKeys("ple").build();

        action.perform();


    }
}
