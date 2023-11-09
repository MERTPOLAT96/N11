package GUN04;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;

public class RobotClass extends BaseDriver {

    @Test
    public void test1() throws AWTException {

        driver.get("https://www.n11.com");

        Robot rbt=new Robot();

        for (int i = 0; i <10 ; i++) {

            MyFunc.Bekle(2);

            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);

        }

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
    }

}
