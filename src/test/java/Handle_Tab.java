import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.ArrayList;

public class Handle_Tab extends setup{
    @Test

    public void handleTab() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("tabButton")).click();
        Thread.sleep(3000);
        ArrayList<String> w = new ArrayList(driver.getWindowHandles());
//switch to open tab
        driver.switchTo().window(w.get(1));
        System.out.println("New tab title: " + driver.getTitle());
        String text = driver.findElement(By.id("sampleHeading")).getText();
        Assert.assertEquals(text,"This is a sample page");
        driver.close();
        driver.switchTo().window(w.get(0));

    }
}
