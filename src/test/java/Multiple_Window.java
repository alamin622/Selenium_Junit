import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

public class Multiple_Window extends setup{
    @Test
    public void multipleWindow(){
        driver.get("https://demoqa.com/browser-windows");

        //Thread.sleep(5000);
        //WebDriverWait wait = new WebDriverWait(driver, 30);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("windowButton")));
        driver.findElement(By.id(("windowButton"))).click();
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();

        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                String text= driver.findElement(By.id("sampleHeading")).getText();
                Assert.assertTrue(text.contains("This is a sample page"));
            }

        }
        driver.close();

    }
}
