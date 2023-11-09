package GUN04;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Scroll2 extends BaseDriver {

    @Test
    public void test1() throws IOException {

        driver.get("https://www.n11.com");

        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        MyFunc.Bekle(2);
        js.executeScript("window.scrollTo(0, 0);");

        TakesScreenshot ts=(TakesScreenshot) driver;

        File hafizadakihal=ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(hafizadakihal, new File("ekrangoruntuleri\\screenshot.png"));


    }
}
